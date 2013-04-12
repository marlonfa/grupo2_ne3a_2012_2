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
    private static UsuarioEntity usuarioCurrent;

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

    public static UsuarioEntity getUsuarioCurrent(){
        return usuarioCurrent;
    }        

    public static void setUsuarioCurrent(UsuarioEntity usuarioCurrent) {
        UsuarioController.usuarioCurrent = usuarioCurrent;
    }
    
    public void create(UsuarioEntity usuario){
        this.usuarioDao.persist(usuario);
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.usuario);
        hash = 13 * hash + Objects.hashCode(this.usuarioDao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioController other = (UsuarioController) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }
}
