package dao;

import conexaoDataBase.Conexao;
import entidade.imovel.ImovelEntidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ImovelDAO {
    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    PreparedStatement pst;
    
    public void adicionar(ImovelEntidade imovel){
        try{
                pst = connection.prepareStatement("INSERT INTO imovel VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");            
                pst.setString(1, "cliente");
                pst.setString(2, imovel.getImovelEspec().getEndereco());
                pst.setString(3, imovel.getImovelEspec().getBairro());
                pst.setString(4, imovel.getImovelEspec().getCidade());
                pst.setString(5, imovel.getImovelEspec().getCep());
                pst.setString(6, imovel.getUf().toString());
                pst.setString(7, imovel.getTipo().toString());
                pst.setString(8, imovel.getCategoria().toString());
                pst.setString(9, imovel.getModalidade().toString());
                pst.setString(10, imovel.getStatus().toString());
                pst.setString(11, imovel.getChaves().toString());
                pst.setFloat(12, imovel.getValor());
                pst.setString(13, imovel.getImovelEspec().getDescricao());  
                pst.execute();

                imovel = new ImovelEntidade();
                JOptionPane.showMessageDialog(null, "Imóvel Cadastrado com Sucesso!");                
                pst.close();
            }catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }   
    }
    
    public void alterar(){
        
    }
    
    public void remover(){
        
    }
    
    public void consultar(){
        
    }
}
