/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.imovel.ImovelAluguelEntity;
import model.imovel.ImovelEntity;
import model.imovel.ImovelStatusEnum;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author marlon
 */
public class AluguelDao extends AbstractDao<ImovelAluguelEntity>{
    
    public AluguelDao() {
        super(ImovelAluguelEntity.class);
    }
    
    private ImovelDao imovelDao = new ImovelDao();
    
    public void alugar(ImovelAluguelEntity aluguel, ImovelEntity imovel){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            session.buildLockRequest(LockOptions.UPGRADE).lock(imovel);
            imovel.setStatus(ImovelStatusEnum.ALUGADO);
            this.imovelDao.persist(session, imovel);
            super.persist(session, aluguel);
            System.out.println("PERSISTIU 2222222222222222");
        
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        
    }
}
