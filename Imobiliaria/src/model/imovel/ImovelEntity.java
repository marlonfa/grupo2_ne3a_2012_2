/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import model.cliente.ClienteEntity;


/**
 *
 * @author marlon
 */
@Entity
@Table(name = "imovel")
public class ImovelEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;    
    
    @Transient
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar data;
    
    @Column(name = "valor", length = 9)
    private Float  valor;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo") 
    private ImovelTipoEnum tipo;
    
    @Column(name = "dormitorio", length = 3)
    private int dormitorio;
    
    @Lob
    @Column(name = "imagem")
    private byte[] imagem;
    
    @OneToOne(cascade = CascadeType.ALL)
    private ImovelEnderecoEntity endereco;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "modalidade") 
    private ImovelModalidadeEnum modalidade; 
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ImovelStatusEnum status;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Transient
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente") 
    private ClienteEntity cliente;   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public ImovelTipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(ImovelTipoEnum tipo) {
        this.tipo = tipo;
    }

    public int getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(int dormitorio) {
        this.dormitorio = dormitorio;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public ImovelEnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(ImovelEnderecoEntity endereco) {
        this.endereco = endereco;
    }

    public ImovelModalidadeEnum getModalidade() {
        return modalidade;
    }

    public void setModalidade(ImovelModalidadeEnum modalidade) {
        this.modalidade = modalidade;
    }

    public ImovelStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ImovelStatusEnum status) {
        this.status = status;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.data);
        hash = 23 * hash + Objects.hashCode(this.valor);
        hash = 23 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        hash = 23 * hash + this.dormitorio;
        hash = 23 * hash + Arrays.hashCode(this.imagem);
        hash = 23 * hash + Objects.hashCode(this.endereco);
        hash = 23 * hash + (this.modalidade != null ? this.modalidade.hashCode() : 0);
        hash = 23 * hash + (this.status != null ? this.status.hashCode() : 0);
        hash = 23 * hash + Objects.hashCode(this.descricao);
        hash = 23 * hash + Objects.hashCode(this.cliente);
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
        final ImovelEntity other = (ImovelEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (this.dormitorio != other.dormitorio) {
            return false;
        }
        if (!Arrays.equals(this.imagem, other.imagem)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (this.modalidade != other.modalidade) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImovelEntity{" + "id=" + id + ", data=" + data + ", valor=" + valor + ", tipo=" + tipo + ", dormitorio=" + dormitorio + ", imagem=" + imagem + ", endereco=" + endereco + ", modalidade=" + modalidade + ", status=" + status + ", descricao=" + descricao + ", cliente=" + cliente + '}';
    }
    
    

    
    
    
 
}
