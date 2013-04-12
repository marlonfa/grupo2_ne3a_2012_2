/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ImovelDao;
import java.util.List;
import model.imovel.ImovelEnderecoEntity;
import model.imovel.ImovelEntity;

/**
 *
 * @author marlon
 */
public class ImovelController {
    
    private ImovelDao imovelDao;
    private ImovelEntity imovel;
    private ImovelEnderecoEntity endereco;
    private static ImovelEntity imovelCurrent;
    
    public ImovelController(){
        this.imovelDao = new ImovelDao();
        this.imovel = new ImovelEntity();
        this.endereco = new ImovelEnderecoEntity();
    }

    public ImovelEntity getImovel() {
        return imovel;
    }
   
    public ImovelEnderecoEntity getEndereco() {
        return endereco;
    }

    public static ImovelEntity getImovelCurrent() {
        return imovelCurrent;
    }

    public static void setImovelCurrent(ImovelEntity imovelCurrent) {
        ImovelController.imovelCurrent = imovelCurrent;
    }
    
   
        
    public void create(){
        imovelDao.persist(imovel);
        ImovelController.imovelCurrent = new ImovelEntity();
        ImovelController.imovelCurrent = this.imovel;
        this.imovel = new ImovelEntity();
        this.endereco = new ImovelEnderecoEntity();
    }
    
    public List<ImovelEntity> findAll(){
        List<ImovelEntity> imoveis;
        imoveis = imovelDao.findAll();
        return imoveis;
    }
}
