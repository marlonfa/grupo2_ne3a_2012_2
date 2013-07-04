/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cliente;

/**
 *
 * @author marlon
 */
public enum EstadoCivilEnum {
    SELECIONE("Selecione"),
    SOLTEIRO("Solteiro(a)"),
    CASADO("Casado(a)"),
    VIUVO("Viúvo(a)"),
    DIVORCIADO("Divorciado(a)");
    
    private String estadoCivil;
    
    private EstadoCivilEnum(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
        
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    
    public static String[] getEstadosCivis() {  
        String[] estados = new String[EstadoCivilEnum.values().length];  
        for (EstadoCivilEnum estadoEnum : EstadoCivilEnum.values()) {  
            estados[estadoEnum.ordinal()] = estadoEnum.getEstadoCivil();  
        }  
        return estados ;  
    } 
    
    public static EstadoCivilEnum getEnum(String string){
        if(string == "Selecione"){
            return SELECIONE;
        }else if (string == "Solteiro(a)"){
            return SOLTEIRO;
        }else if (string == "Casado(a)"){
            return CASADO;
        }else if (string == "Divorciado(a)"){
            return DIVORCIADO;
        }
        return null;
     }   
}
