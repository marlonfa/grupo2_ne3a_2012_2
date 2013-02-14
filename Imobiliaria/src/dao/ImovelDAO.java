package dao;

import conexaoDataBase.Conexao;
import entidade.imovel.ImovelEntidade;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ImovelDAO {
    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    PreparedStatement pst;
    
    public void adicionar(ImovelEntidade imovel){
        
    }
    
    public void alterar(){
        
    }
    
    public void remover(){
        
    }
    
    public void consultar(){
        
    }
}
