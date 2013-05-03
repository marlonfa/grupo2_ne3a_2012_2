/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.main;

import dao.ImovelDao;
import model.imovel.ImovelEntity;

/**
 *
 * @author marlon
 */
public class Teste {
    
    public static void main(String[] args) {
        ImovelDao dao = new ImovelDao();
        
        for(ImovelEntity imovel : dao.filterByStatusModalidade()){
            System.out.println(imovel.toString());
        }
    }
}
