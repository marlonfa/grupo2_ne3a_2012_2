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
    private Session session;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    public void persist(T object){
        //Supostamente o getCurrentSession() é fechado depois de um commit
//        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.session = HibernateUtil.getSessionFactory().openSession();
        try{
            this.session.beginTransaction();
            this.session.saveOrUpdate(object);
            this.session.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao Persistir "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
    }
      
    public void delete(T object) {
        //Supostamente o getCurrentSession() é fechado depois de um commit
//        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.session = HibernateUtil.getSessionFactory().openSession();
        try{
            this.session.beginTransaction();
            this.session.delete(object);
            this.session.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Erro ao Remover ERRO: "+ e);
            this.session.getTransaction().rollback();           
        }finally{
            this.session.close();
        }
    }   
        
    public List<T>findAll(){
        //Supostamente o getCurrentSession() é fechado depois de um commit
//        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.session = HibernateUtil.getSessionFactory().openSession();
        List<T>list = null;
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(entityClass).list();
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
