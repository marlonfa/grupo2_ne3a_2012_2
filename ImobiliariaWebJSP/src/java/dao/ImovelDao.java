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
public class ImovelDao{
    
    private Session session;
    
    private List<ImovelEntity>findAll(){
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
    
    private List<ImovelEntity> imovelParaAlugarList(){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSession();
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
    
    private List<ImovelEntity> imovelParaComprarList(){
        List<ImovelEntity> list = null;
        this.session = HibernateUtil.getSession();
        try{
            this.session.beginTransaction();
            list = this.session.createCriteria(ImovelEntity.class).                                
                    add(Restrictions.eq("modalidade", ImovelModalidadeEnum.VENDA)).
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
    
    public List<ImovelEntity> getAllList(){
        return findAll();
    }
    
    public List<ImovelEntity> getAlugarList(){
        return imovelParaAlugarList();
    }
    
    public List<ImovelEntity> getComprarList(){
        return imovelParaComprarList();
    }
}