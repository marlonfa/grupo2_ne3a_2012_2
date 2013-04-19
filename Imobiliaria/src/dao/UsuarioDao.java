/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.usuario.UsuarioEntity;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author eder
 */
public class UsuarioDao extends AbstractDao<UsuarioEntity>{

    private Session session;
    
    public UsuarioDao() {
        super(UsuarioEntity.class);
    }
    
    public List<UsuarioEntity> filter(String campo, String parametro){
        List<UsuarioEntity> list = null;
        this.session = HibernateUtil.getSessionFactory().openSession();        
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(UsuarioEntity.class).                                
                    add(Restrictions.like(campo, "%"+parametro+"%")).
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
}
