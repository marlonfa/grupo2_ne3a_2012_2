/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.cliente.ClienteEntity;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author marlon
 */
public class ClienteDao extends AbstractDao<ClienteEntity>{
    
    public ClienteDao(){
        super(ClienteEntity.class);
    }
    
    private Session session;
    
    public List<ClienteEntity> filterByCpf(String cpf){
        List<ClienteEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ClienteEntity.class).                                
                    add(Restrictions.like("cpf", cpf+"%")).
                    addOrder(Order.asc("nome")).
                    list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        return list;
    }
    
    public List<ClienteEntity> filterByNome(String nome){
        List<ClienteEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ClienteEntity.class).                                
                    add(Restrictions.like("nome", "%"+nome+"%")).
                    addOrder(Order.asc("nome")).
                    list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        return list;
    }
    
    public boolean haveCpf(String cpf){
        List<ClienteEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ClienteEntity.class).                                
                    add(Restrictions.like("cpf", cpf)).
                    list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        if(list.size()>0){
            return true;
        }
        return false;
    }
}
