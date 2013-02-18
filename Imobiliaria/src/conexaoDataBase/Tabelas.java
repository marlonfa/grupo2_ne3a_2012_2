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
            String tabelaCliente = "CREATE TABLE IF NOT EXISTS Cliente("
                                + "id INT AUTO_INCREMENT, "
                                + "nome VARCHAR(60) NOT NULL, "
                                + "cpf VARCHAR(11) NOT NULL UNIQUE, "
                                + "rg VARCHAR(10) NOT NULL UNIQUE, "
                                + "data_nascimento DATE, "
                                + "telefone VARCHAR(10), "
                                + "celular VARCHAR(11), "
                                + "email VARCHAR(30), "
                                + "estado_civil VARCHAR(14), "
                                + "PRIMARY KEY(id))"
                                + "ENGINE = InnoDB;";
            
            st.executeUpdate(tabelaCliente);
            
            String tabelaImovel = "CREATE TABLE IF NOT EXISTS Imovel("
                                + "id INT AUTO_INCREMENT, "
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
                                + "FOREIGN KEY(cliente_nome) REFERENCES Cliente(nome)) "
                                + "ENGINE = InnoDB;";

            st.executeUpdate(tabelaImovel);
            
            String tabelaEndereco = "CREATE TABLE IF NOT EXISTS Cliente("
                                + "id INT AUTO_INCREMENT, "
                                + "id_cliente INT NOT NULL, "
                                + "cep VARCHAR(8) NOT NULL, "
                                + "uf VARCHAR(2), "
                                + "bairro VARCHAR(50) NOT NULL, "
                                + "rua VARCHAR(30), "
                                + "numero INT, "
                                + "PRIMARY KEY(id), "
                                + "FOREIGN KEY(id_cliente) REFERENCES Cliente(id)) "
                                + "ENGINE = InnoDB;";
            
            st.executeUpdate(tabelaEndereco);
       
            st.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

            
}
