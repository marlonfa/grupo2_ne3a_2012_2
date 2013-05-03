/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ImovelDao;
import dao.VendaDao;
import model.imovel.ImovelEntity;
import model.imovel.ImovelStatusEnum;
import model.imovel.ImovelVendaEntity;
import org.hibernate.Session;

/**
 *
 * @author eder
 */
public class VendaController {
    private ImovelDao imovelDao = new ImovelDao();
    private VendaDao vendaDao = new VendaDao();
    
    public void vender(Session session, ImovelVendaEntity venda, ImovelEntity imovel) throws RuntimeException{
        try{
            imovel.setStatus(ImovelStatusEnum.VENDIDO);
            this.imovelDao.persist(session, imovel);
            vendaDao.persist(session, venda);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        
    }
}
