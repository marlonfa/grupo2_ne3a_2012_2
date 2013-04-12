/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.AbstractDao;
import model.imovel.ImovelEntity;

/**
 *
 * @author marlon
 */
public class ImovelDao extends AbstractDao<ImovelEntity>{
    
    public ImovelDao() {
        super(ImovelEntity.class);
    }
    
}
