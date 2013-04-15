/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.endereco;

/**
 *
 * @author marlon
 */
public enum TipoLogradouroEnum {

    SELECIONE("Selecione"),
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
    
    public static String[] getTiposLogradouros() {  
        String[] tipo = new String[TipoLogradouroEnum.values().length];  
        for (TipoLogradouroEnum tipoEnum : TipoLogradouroEnum.values()) {  
            tipo[tipoEnum.ordinal()] = tipoEnum.getTipoLogradouro();  
        }  
        return tipo ;  
    } 
    
    public static TipoLogradouroEnum getEnum(String string){
        switch (string) {
            case "Selecione":
                return SELECIONE;
            case "Aeroporto":
                return AEROPORTO;
            case "Alameda":
                return ALAMEDA;
            case "Área":
                return AREA;
            case "Avenida":
                return AVENIDA;
            case "Campo":
                return CAMPO;
            case "Chácara":
                return CHACARA;
            case "Colônia":
                return COLONIA;
            case "Condomínio":
                return COMDOMINIO;
            case "Conjunto":
                return CONJUNTO;
            case "Distrito":
                return DISTRITO;
            case "Esplanada":
                return ESPLANADA;
            case "Estação":
                return ESTACAO;
            case "Estrada":
                return ESTRADA;
            case "Favela":
                return FAVELA;
            case "Fazenda":
                return FAZENDA;
            case "Feira":
                return FEIRA;
            case "Jardim":
                return JARDIM;
            case "Ladeira":
                return LADEIRA;
            case "Lago":
                return LAGO;
            case "Lagoa":
                return LAGOA;
            case "Largo":
                return LARGO;
            case "Loteamento":
                return LOTEAMENTO;
            case "Morro":
                return MORRO;
            case "Núcleo":
                return NUCLEO;
            case "Parque":
                return PARQUE;
            case "Passarela":
                return PASSARELA;
            case "Pátio":
                return PATIO;
            case "Praça":
                return PRACA;
            case "Quadra":
                return QUADRA;
            case "Recanto":
                return RECANTO;
            case "Residencial":
                return RESIDENCIAL;
            case "Rodovia":
                return RODOVIA;
            case "Rua":
                return RUA;
            case "Setor":
                return SETOR;
            case "Sítio":
                return SITIO;
            case "Travessa":
                return TRAVESSIA;
            case "Trecho":
                return TRECHO;
            case "Trevo":
                return TREVO;
            case "Vale":
                return VALE;
            case "Vereda":
                return VEREDA;
            case "Via":
                return VIA;
            case "Viaduto":
                return VIADUTO;
            case "Viela":
                return VIELA;
            case "Vila":
                return VILA;
        }
        return null;
     }   
}

    