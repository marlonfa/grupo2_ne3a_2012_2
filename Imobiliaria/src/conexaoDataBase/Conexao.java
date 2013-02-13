package conexaoDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection con = null;
    private String driver;    
    private String usuario;    
    private String senha;   
    private String endereco;

    public Conexao() {
        driver = "com.mysql.jdbc.Driver";
        usuario = "root";        
        senha = "root";       
        endereco = "jdbc:mysql://localhost/imobiliaria_db";
    }

    public Connection getConnection() {
        try {
            Class.forName(this.driver);
            con = DriverManager.getConnection(endereco, usuario, senha);
        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC/ODBC." + erro);
            return null;
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return null;
        } catch (Exception erro) {
            erro.getMessage();
            System.out.println("Nao foi possivel efetuar a conexao!");
            return null;
        }
        return con;
    }

}
