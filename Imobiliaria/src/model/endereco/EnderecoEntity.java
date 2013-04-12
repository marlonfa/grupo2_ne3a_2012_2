/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.endereco;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eder
 */

@Entity
@Table(name = "endereco")
public class EnderecoEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(length = 5)
    private int numero;
    
    @Column(length = 50)
    private String bairro;
    
    @Column(length = 25)
    private String complemento;
    
    @Column(name = "logradouro")
    private String logradouro;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_logradouro")
    private TipoLogradouroEnum tipoLogradouro;
    
    @Column(name = "municipio")
    private String municipio;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "uf")
    private EstadoEnum uf;
    
    @Column(length = 8)
    private String cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public TipoLogradouroEnum getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouroEnum tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public EstadoEnum getUf() {
        return uf;
    }

    public void setUf(EstadoEnum uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + this.numero;
        hash = 37 * hash + Objects.hashCode(this.bairro);
        hash = 37 * hash + Objects.hashCode(this.complemento);
        hash = 37 * hash + Objects.hashCode(this.logradouro);
        hash = 37 * hash + (this.tipoLogradouro != null ? this.tipoLogradouro.hashCode() : 0);
        hash = 37 * hash + Objects.hashCode(this.municipio);
        hash = 37 * hash + (this.uf != null ? this.uf.hashCode() : 0);
        hash = 37 * hash + Objects.hashCode(this.cep);
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
        final EnderecoEntity other = (EnderecoEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (this.tipoLogradouro != other.tipoLogradouro) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (this.uf != other.uf) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EnderecoEntity{" + "id=" + id + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento + ", logradouro=" + logradouro + ", tipoLogradouro=" + tipoLogradouro + ", municipio=" + municipio + ", uf=" + uf + ", cep=" + cep + '}';
    }

     
    
}