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
 * @author marlon e eder
 */
public class ImovelController {
    
    private ImovelDao imovelDao;
    private ImovelEntity imovel;
    private ImovelEnderecoEntity endereco;
    private static ImovelEntity imovelSelecionado;
    
    public ImovelController(){
        this.imovelDao = new ImovelDao();
        this.imovel = new ImovelEntity();
        this.endereco = new ImovelEnderecoEntity();
    }

    public ImovelEntity getImovel() {
        return imovel;
    }

    public ImovelDao getImovelDao() {
        return imovelDao;
    }
    
    

    public void setImovel(ImovelEntity imovel) {
        this.imovel = imovel;
    }
      
    public ImovelEnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(ImovelEnderecoEntity endereco) {
        this.endereco = endereco;
    }
    
    

    public static ImovelEntity getImovelSelecionado() {
        return imovelSelecionado;
    }

    public static void setImovelSelecionado(ImovelEntity imovelSelecionado) {
        ImovelController.imovelSelecionado = imovelSelecionado;
    }

           
    public void create() throws RuntimeException {
        ImovelController.setImovelSelecionado(this.imovel);
        this.imovelDao.persist(imovel);        
    }
    
     public void delete(ImovelEntity imovel) throws RuntimeException{
        imovelDao.delete(imovel);
    }
     
     public List<ImovelEntity> findAll(){
        return this.imovelDao.findAll();
    }
     
     
     
     
    
}
