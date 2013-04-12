/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

/**
 *
 * @author marlon
 */
public enum ImovelModalidadeEnum {
    ALUGUEL("Aluguel"),
    VENDA("Venda");
    
    private String modalidade;    
    private ImovelModalidadeEnum(String modalidade){
        this.modalidade = modalidade;
    }
    
    public String getModalidade(){
        return this.modalidade;
    }    
}
