/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.imovel.ImovelEntity;
import model.imovel.ImovelModalidadeEnum;
import model.imovel.ImovelStatusEnum;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author marlon e eder
 */
public class ImovelDao extends AbstractDao<ImovelEntity>{
    
    public ImovelDao() {
        super(ImovelEntity.class);
    }
    
    
    private Session session;
    
    public List<ImovelEntity> findImovelClienteAll(){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    createAlias("endereco", "en").
                    add(Restrictions.eqProperty("id", "en.id")).
                    addOrder(Order.desc("valor")).
                    setMaxResults(20).list();       
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        return list;
    }    
    
    public List<ImovelEntity> filterByModalidade(Enum modalidade){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    createAlias("endereco", "en").
                    add(Restrictions.eqProperty("id", "en.id")).
                    add(Restrictions.like("modalidade", modalidade)).
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
    
    public List<ImovelEntity> filterByStatus(Enum status){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    createAlias("endereco", "en").
                    add(Restrictions.eqProperty("id", "en.id")).
                    add(Restrictions.like("status", status)).
                    addOrder(Order.asc("endereco")).
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
    
    public List<ImovelEntity> filterByTipo(Enum tipo){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    createAlias("endereco", "en").
                    add(Restrictions.eqProperty("id", "en.id")).
                    add(Restrictions.like("tipo", tipo)).
                    addOrder(Order.asc("endereco")).
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
    
     public List<ImovelEntity> filterByStatusModalidade(){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    add(Restrictions.eq("modalidade", ImovelModalidadeEnum.ALUGUEL)).
                    add(Restrictions.and(Restrictions.eq("status", ImovelStatusEnum.DISPONIVEL))).           
                    addOrder(Order.asc("endereco")).
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
    
    public List<ImovelEntity> filterByEndereco(String endereco){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    add(Restrictions.like("endereco", "%"+endereco+"%")).
                    addOrder(Order.asc("endereco")).
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
    
}
