/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.imovel.ImovelAluguelEntity;

/**
 *
 * @author marlon
 */
public class AluguelDao extends AbstractDao<ImovelAluguelEntity>{
    
    public AluguelDao() {
        super(ImovelAluguelEntity.class);
    }
}
