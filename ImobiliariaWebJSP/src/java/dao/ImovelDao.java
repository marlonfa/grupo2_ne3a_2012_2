/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.imovel.ImovelEntity;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author marlon e eder
 */
public class ImovelDao{
    
    private Session session;
    
    private List<ImovelEntity>findAll(){
        //Supostamente o getCurrentSession() é fechado depois de um commit
//        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        this.session = HibernateUtil.getSession();
        List<ImovelEntity>list = null;
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).list();
            this.session.getTransaction().commit();            
        }catch(Exception e){
            System.out.println("Erro ao Buscar "+e);
            this.session.getTransaction().rollback();
        }finally{
            this.session.close();
        }
        return list;
    }
    
    public List<ImovelEntity> getLista(){
        return findAll();
    }
    
}