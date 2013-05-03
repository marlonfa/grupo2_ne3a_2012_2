/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

/**
 *
 * @author marlon e eder
 */
public enum ImovelTipoEnum {
    SELECIONE("Selecione"),
    CASA("Casa"), 
    TERRENO("Terreno"), 
    PREDIO("Prédio");
    
    private String tipo;
    private ImovelTipoEnum(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public static String[] getTipos() {  
        String[] tipo = new String[ImovelTipoEnum.values().length];  
        for (ImovelTipoEnum tipoEnum : ImovelTipoEnum.values()) {  
            tipo[tipoEnum.ordinal()] = tipoEnum.getTipo();  
        }  
        return tipo ;  
    } 
    
    public static ImovelTipoEnum getEnum(String string){
        switch (string) {
            case "Selecione":
                return SELECIONE;
            case "Casa":
                return CASA;
            case "Terreno":
                return TERRENO;
            case "Prédio":
                return PREDIO;
        }
        return null;
     }  
       
}
