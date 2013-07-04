/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.imovel.ImovelVendaEntity;

/**
 *
 * @author eder
 */
public class VendaDao extends AbstractDao<ImovelVendaEntity>{
    
    public VendaDao() {
        super(ImovelVendaEntity.class);
    }
}
