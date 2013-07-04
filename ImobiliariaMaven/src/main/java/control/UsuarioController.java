/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.UsuarioDao;
import java.util.Objects;
import model.usuario.UsuarioEntity;

/**
 *
 * @author eder
 */
public class UsuarioController {
    
    private UsuarioEntity usuario;
    private UsuarioDao usuarioDao;
//    private static UsuarioEntity usuarioCurrent;

    public UsuarioController() {
        this.usuario = new UsuarioEntity();
        this.usuarioDao = new UsuarioDao();
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    
    public void create(UsuarioEntity usuario)throws RuntimeException{
        this.usuarioDao.persist(usuario);
    }
    
    public void delete(UsuarioEntity usuario)throws RuntimeException{
        this.usuarioDao.delete(usuario);
    }
    
   
}
