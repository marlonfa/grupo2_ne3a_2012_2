/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AluguelDao;
import dao.ImovelDao;
import model.imovel.ImovelAluguelEntity;
import model.imovel.ImovelEntity;
import model.imovel.ImovelStatusEnum;
import org.hibernate.Session;

/**
 *
 * @author Marlon
 */
public class AluguelController {
    private ImovelDao imovelDao = new ImovelDao();
    private AluguelDao aluguelDao = new AluguelDao();
    
    public void alugar(Session session, ImovelAluguelEntity aluguel, ImovelEntity imovel) throws RuntimeException{
        try{
            imovel.setStatus(ImovelStatusEnum.ALUGADO);
            this.imovelDao.persist(session, imovel);
            aluguelDao.persist(session, aluguel);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        
    }
}
