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
    
}
