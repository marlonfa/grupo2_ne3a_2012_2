/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

/**
 *
 * @author marlon
 */
public enum ImovelTipoEnum {
    TIPO("Escolha um Tipo"),
    CASA("Casa"), 
    TERRENO("Terreno"), 
    PREDIO("Predio");
    
    private String tipo;
    private ImovelTipoEnum(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
}
