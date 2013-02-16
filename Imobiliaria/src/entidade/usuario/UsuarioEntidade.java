/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.usuario;

/**
 *
 * @author eder
 */
public class UsuarioEntidade{

   private String nome;
   private String login;
   private String senha;
   private String confirmaSenha;

    public UsuarioEntidade() {
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

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
}