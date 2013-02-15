/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.cliente.ClienteEntidade;
import entidade.usuario.UsuarioEntidade;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eder
 */
public class ClienteDAO {
    
    public void adicionar(ClienteEntidade cliente) throws SQLException {
        PreparedStatement ps;
        Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliaria", "root", "root");
        String sql = "insert into Cliente values (?,?,?,?,?,?,?,?,?);";
        java.util.Date dt = cliente.getDataNascimento();
        java.sql.Date dataSQL = new Date(dt.getTime());
        
        ps = con.prepareStatement(sql);
        
        ps.setString(1, null);
        
        ps.setString(2, cliente.getNome());
        
        ps.setString(3, cliente.getCpf());
        
        ps.setString(4, cliente.getRg());
        
        ps.setDate(5, dataSQL);
        
        ps.setString(6, cliente.getTelefone());
        
        ps.setString(7, cliente.getCelular());
        
        ps.setString(8, cliente.getEmail());
        
        ps.setString(9, cliente.getEstadoCivil());
        
        ps.execute();
        
        sql = "select id from Cliente where cpf = " + "\"" + cliente.getCpf() + "\"";
        ResultSet rs = ps.executeQuery(sql);
        int idCliente = 0;
        while (rs.next()) {
            idCliente = rs.getInt("id");
        }
        sql = "insert into Endereco values(?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(sql);
        
        ps.setString(1, null);
        
        ps.setInt(2, idCliente);
        
        ps.setString(3, cliente.getEndereco().getCep());
        
        ps.setString(4, cliente.getEndereco().getEstado());
        
        ps.setString(5, cliente.getEndereco().getCidade());
        
        ps.setString(6, cliente.getEndereco().getBairro());
       
        ps.setString(7, cliente.getEndereco().getRua());
       
        ps.setInt(8, cliente.getEndereco().getNumero());
       
        ps.execute();
        
        rs.close();        
        ps.close();
        con.close();
    }

    public void alterar(ClienteEntidade cliente) throws SQLException {
        Connection con;
        PreparedStatement ps;
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliaria", "root", "root");
        
        
        
        
    }

    public List<ClienteEntidade> consultar(String nome) throws SQLException {
        List<ClienteEntidade> lista = new ArrayList<>();
//        
//        Connection con;
//        PreparedStatement ps;
//        
//        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliaria", "root", "root");
//        
//        String sql = "SELECT c.nome, e.cidade FROM Cliente c "
//                    +"INNER JOIN Endereco e ON e.id_cliente = c.id WHERE nome LIKE"
//                    +"\""+nome+"\";";
//        ps = con.prepareStatement(sql);       
//        ps.execute();
//        
//        ResultSet rs = ps.executeQuery(sql);
//        
//        while (rs.next()) {            
//            System.out.println(rs.getString("nome"));
//        }
        
        return lista;

    }

    public void remover(UsuarioEntidade cliente) {
    }
}
