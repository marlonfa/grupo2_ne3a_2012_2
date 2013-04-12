/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.usuario.UsuarioEntity;

/**
 *
 * @author eder
 */
public class UsuarioDao extends AbstractDao<UsuarioEntity>{

    public UsuarioDao() {
        super(UsuarioEntity.class);
    }
}
