/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.cliente.ClienteEntity;

/**
 *
 * @author marlon
 */
public class ClienteDao extends AbstractDao<ClienteEntity>{
    
    public ClienteDao(){
        super(ClienteEntity.class);
    }
}
