/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

/**
 *
 * @author marlon e eder
 */
public enum ImovelStatusEnum {
    SELECIONE("Selecione"),
    DISPONIVEL("Disponível"),
    ALUGADO("Alugado"), 
    ALUGANDO("Alugando"), 
    SUSPENDO("Suspenso"), 
    VENDIDO("Vendido");
    
    private String status;
    private ImovelStatusEnum(String status){
        this.status = status;
    }
    
    public String getStatusString(){
        return this.status;
    }
    
    public static String[] getStatus() {  
        String[] status = new String[ImovelStatusEnum.values().length];  
        for (ImovelStatusEnum statusEnum : ImovelStatusEnum.values()) {  
            status[statusEnum.ordinal()] = statusEnum.getStatusString();  
        }  
        return status ;  
    } 
    
    public static ImovelStatusEnum getEnum(String string){
        switch (string) {
            case "Selecione":
                return SELECIONE;
            case "Disponível":
                return DISPONIVEL;
            case "Alugado":
                return ALUGADO;
            case "Alugando":
                return ALUGANDO;
            case "Suspenso":
                return SUSPENDO;
            case "Vendido":
                return VENDIDO;
        }
        return null;
     }  
}
