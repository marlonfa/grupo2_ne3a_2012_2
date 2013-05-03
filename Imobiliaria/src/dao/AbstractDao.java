/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author marlon e eder
 */
public abstract class AbstractDao<T> {
    
    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    public void persist(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(session.beginTransaction() == null){
            session.beginTransaction();
        }
        try{
            persist(session, object);
            session.getTransaction().commit();
        }        
        catch(Exception e){
            System.out.println("Erro ao Persistir "+e);
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
    }
    
    public void persist(Session session, T object){
        session.saveOrUpdate(object);           
    }
      
    public void delete(T object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(session.beginTransaction() == null){
            session.beginTransaction();
        }
        try{
            session.beginTransaction();
            delete(session, object);
            session.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao Remover ERRO: "+ e);
            session.getTransaction().rollback();           
        }finally{
            session.close();
        }
    }   
    
    public void delete(Session session, T object){
        session.delete(object);
    }
        
    public List<T>findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<T>list = null;
        try{
            session.beginTransaction();
            list = session.createCriteria(entityClass).list();
            session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return list;
    }
}
