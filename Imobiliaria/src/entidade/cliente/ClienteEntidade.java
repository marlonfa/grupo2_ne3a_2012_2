/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.cliente;

import java.util.Date;

/**
 *
 * @author eder
 */
public class ClienteEntidade {

    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String telefone;
    private String celular;
    private String email;
    private String estadoCivil;
    private int id;
    
    private EnderecoEntidade endereco;

    public ClienteEntidade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoEntidade getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntidade endereco) {
        this.endereco = endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}