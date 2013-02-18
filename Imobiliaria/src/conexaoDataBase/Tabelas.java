package conexaoDataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tabelas {
    private Conexao conexao = new Conexao();
    private Connection connection = conexao.getConnection(); 
    private Statement st;
    
    public void criarTabelas(){
        try{
            st = connection.createStatement();           
            String tabelaImovel = "CREATE TABLE IF NOT EXISTS imovel("
                                + "id LONG AUTO_INCREMENT, "
                                + "cliente_nome VARCHAR(50) NOT NULL, "
                                + "endereco VARCHAR(50) NOT NULL, "
                                + "bairro VARCHAR(50) NOT NULL, "
                                + "cidade VARCHAR(50) NOT NULL, "
                                + "cep VARCHAR(8) NOT NULL, "
                                + "uf VARCHAR(2) NOT NULL, "
                                + "tipo VARCHAR(25) NOT NULL, "
                                + "categoria VARCHAR(25) NOT NULL, "
                                + "modalidade VARCHAR(25) NOT NULL, "
                                + "status VARCHAR(25) NOT NULL, "
                                + "chaves VARCHAR(25) NOT NULL, "
                                + "valor FLOAT NOT NULL, "
                                + "descricao VARCHAR(300), "
                                + "PRIMARY KEY(id), "
                                + "FOREIGN KEY(cliente_nome) REFERENCES cliente(nome));";

            st.executeUpdate(tabelaImovel);
            st.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

            
}
