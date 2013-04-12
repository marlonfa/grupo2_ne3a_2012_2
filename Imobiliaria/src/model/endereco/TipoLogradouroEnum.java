/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.endereco;

/**
 *
 * @author eder
 */
public enum TipoLogradouroEnum {

    AEROPORTO("Aeroporto"),
    ALAMEDA("Alameda"),
    AREA("Área"),
    AVENIDA("Avenida"),
    CAMPO("Campo"),
    CHACARA("Chácara"),
    COLONIA("Colônia"),
    COMDOMINIO("Condomínio"),
    CONJUNTO("Conjunto"),
    DISTRITO("Distrito"), 
    ESPLANADA("Esplanada"),
    ESTACAO("Estação"),
    ESTRADA("Estrada"),
    FAVELA("Favela"),
    FAZENDA("Fazenda"), 
    FEIRA("Feira"),
    JARDIM("Jardim"),
    LADEIRA("Ladeira"),
    LAGO("Lago"),
    LAGOA("Lagoa"), 
    LARGO("Largo"),
    LOTEAMENTO("Loteamento"), 
    MORRO("Morro"),
    NUCLEO("Núcleo"),
    PARQUE("Parque"),
    PASSARELA("Passarela"),
    PATIO("Pátio"),
    PRACA("Praça"),
    QUADRA("Quadra"),
    RECANTO("Recanto"),
    RESIDENCIAL("Residencial"),
    RODOVIA("Rodovia"),
    RUA("Rua"),
    SETOR("Setor"),
    SITIO("Sítio"),
    TRAVESSIA("Travessa"),
    TRECHO("Trecho"),
    TREVO("Trevo"),
    VALE("Vale"),
    VEREDA("Vereda"),
    VIA("Via"),
    VIADUTO("Viaduto"),
    VIELA("Viela"),
    VILA("Vila");
    
    private String tipoLogradouro;

    private TipoLogradouroEnum(String tipo) {
        this.tipoLogradouro = tipo;
    }
    
    public String getTipoLogradouro(){
        return this.tipoLogradouro;
    }
}
