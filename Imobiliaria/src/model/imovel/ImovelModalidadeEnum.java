/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

/**
 *
 * @author marlon e eder
 */
public enum ImovelModalidadeEnum {
    SELECIONE("Selecione"),
    ALUGUEL("Aluguel"),
    VENDA("Venda");
    
    private String modalidade;    
    
    private ImovelModalidadeEnum(String modalidade){
        this.modalidade = modalidade;
    }
    
    
    public String getModalidade(){
        return this.modalidade;
    }  
    
    public static String[] getModalidades() {  
        String[] modalidade = new String[ImovelModalidadeEnum.values().length];  
        for (ImovelModalidadeEnum modalidadeEnum : ImovelModalidadeEnum.values()) {  
            modalidade[modalidadeEnum.ordinal()] = modalidadeEnum.getModalidade();  
        }  
        return modalidade ;  
    } 
    
    public static ImovelModalidadeEnum getEnum(String string){
        if(string == "Selecione"){
            return SELECIONE;
        }else if (string == "Aluguel"){
            return ALUGUEL;
        }else if (string == "Venda"){
            return VENDA;
        }
        return null;
     }  
  
}
