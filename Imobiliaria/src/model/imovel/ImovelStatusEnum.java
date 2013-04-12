/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

/**
 *
 * @author marlon
 */
public enum ImovelStatusEnum {
    ALUGADO("Alugado"), 
    ALUGANDO("Alugando"), 
    SUSPENSO("Suspenso"), 
    VENDIDO("Vendido");
    
    private String status;
    private ImovelStatusEnum(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return this.status;
    }
}
