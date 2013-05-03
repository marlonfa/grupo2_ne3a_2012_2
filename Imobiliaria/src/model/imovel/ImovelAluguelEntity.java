/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.cliente.ClienteEntity;

/**
 *
 * @author marlon
 */
@Entity
@Table(name = "aluguel")
public class ImovelAluguelEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroContrato;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private ClienteEntity locatario;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private ImovelEntity imovel;
    
    @Temporal(TemporalType.DATE)
    private Date dataContrato;

    public Long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public ClienteEntity getLocatario() {
        return locatario;
    }

    public void setLocatario(ClienteEntity locatario) {
        this.locatario = locatario;
    }

    public ImovelEntity getImovel() {
        return imovel;
    }

    public void setImovel(ImovelEntity imovel) {
        this.imovel = imovel;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    @Override
    public String toString() {
        return "ImovelAlugarEntity{" + "numeroContrato=" + numeroContrato + ", locatario=" + locatario + ", imovel=" + imovel + ", dataContrato=" + dataContrato + '}';
    }
    
}
