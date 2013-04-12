/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.usuario;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eder
 */

@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(length = 50)
    private String nome;
    
    @Column(length = 10)
    private String login;
    
    @Column(length = 16)
    private String senha;
    
//    private String confirmaSenha;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Long id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
//        this.confirmaSenha = confirmaSenha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public String getConfirmaSenha() {
//        return confirmaSenha;
//    }
//
//    public void setConfirmaSenha(String confirmaSenha) {
//        this.confirmaSenha = confirmaSenha;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.login);
        hash = 29 * hash + Objects.hashCode(this.senha);
//        hash = 29 * hash + Objects.hashCode(this.confirmaSenha);
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
        final UsuarioEntity other = (UsuarioEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
//        if (!Objects.equals(this.confirmaSenha, other.confirmaSenha)) {
//            return false;
//        }
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioEntity{" + "id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + '}';
    }
    
}
