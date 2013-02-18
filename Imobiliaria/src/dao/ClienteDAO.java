/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexaoDataBase.Conexao;
import entidade.cliente.ClienteEntidade;
import entidade.cliente.EnderecoEntidade;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eder
 */
public class ClienteDAO {

    Conexao c = new Conexao();
    Connection con;
    PreparedStatement ps;

    public void adicionar(ClienteEntidade cliente) {
        try {
            String sql = "insert into Cliente values (null,?,?,?,?,?,?,?,?);";
            java.util.Date dt = cliente.getDataNascimento();
            java.sql.Date dataSQL = new Date(dt.getTime());

            con = c.getConnection();

            con.setAutoCommit(false);

            ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getNome());

            ps.setString(2, cliente.getCpf());

            ps.setString(3, cliente.getRg());

            ps.setDate(4, dataSQL);

            ps.setString(5, cliente.getTelefone());

            ps.setString(6, cliente.getCelular());

            ps.setString(7, cliente.getEmail());

            ps.setString(8, cliente.getEstadoCivil());

            ps.execute();

            sql = "select id from Cliente where cpf = " + "\"" + cliente.getCpf() + "\"";

            ResultSet rs = ps.executeQuery(sql);

            int idCliente = 0;
            while (rs.next()) {
                idCliente = rs.getInt("id");
            }

            rs.close();

            sql = "insert into Endereco values(null,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);

            ps.setInt(1, idCliente);

            ps.setString(2, cliente.getEndereco().getCep());

            ps.setString(3, cliente.getEndereco().getEstado());

            ps.setString(4, cliente.getEndereco().getCidade());

            ps.setString(5, cliente.getEndereco().getBairro());

            ps.setString(6, cliente.getEndereco().getRua());

            ps.setInt(7, cliente.getEndereco().getNumero());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso");

            con.setAutoCommit(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex1) {
                    JOptionPane.showMessageDialog(null, ex1.getMessage());
                }
            }


        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void alterar(ClienteEntidade cliente) {
        try {
            String sql;

            sql = "update Cliente set nome = ?, cpf = ?, rg = ?, "
                    + "data_nascimento = ?, telefone = ?, celular = ?, "
                    + "email = ?, estado_civil = ? where id = ?;";


            java.util.Date dt = cliente.getDataNascimento();
            java.sql.Date dataSQL = new Date(dt.getTime());

            con = c.getConnection();

            con.setAutoCommit(false);

            ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getNome());

            ps.setString(2, cliente.getCpf());

            ps.setString(3, cliente.getRg());

            ps.setDate(4, dataSQL);

            ps.setString(5, cliente.getTelefone());

            ps.setString(6, cliente.getCelular());

            ps.setString(7, cliente.getEmail());

            ps.setString(8, cliente.getEstadoCivil());

            ps.setInt(9, cliente.getId());

            ps.execute();

            sql = "update Endereco set cep = ?, estado = ?, cidade = ?, "
                    + "bairro = ?, rua = ?, numero = ? "
                    + "where id = ?;";

            ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getEndereco().getCep());

            ps.setString(2, cliente.getEndereco().getEstado());

            ps.setString(3, cliente.getEndereco().getCidade());

            ps.setString(4, cliente.getEndereco().getBairro());

            ps.setString(5, cliente.getEndereco().getRua());

            ps.setInt(6, cliente.getEndereco().getNumero());

            ps.setInt(7, cliente.getEndereco().getId());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Cadastrado Alterado Com Sucesso");

            con.setAutoCommit(true);

        } catch (SQLException ex) {

            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex1) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }


        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

    }

    public List<ClienteEntidade> consultar(String nome) {
        try {
            con = c.getConnection();

            List<ClienteEntidade> lista = new ArrayList<>();

            ClienteEntidade cliente;
            EnderecoEntidade e;

            String sql = "SELECT * FROM Cliente c "
                    + "INNER JOIN Endereco e ON e.id_cliente = c.id WHERE nome LIKE"
                    + " \"%" + nome + "%\";";
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                cliente = new ClienteEntidade();
                e = new EnderecoEntidade();
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setRg(rs.getString("rg"));
                cliente.setDataNascimento(rs.getDate("data_nascimento"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setId(rs.getInt("id"));
                cliente.setEstadoCivil(rs.getString("estado_civil"));

                e.setCep(rs.getString("cep"));
                e.setEstado(rs.getString("estado"));
                e.setCidade(rs.getString("cidade"));
                e.setBairro(rs.getString("bairro"));
                e.setRua(rs.getString("rua"));
                e.setNumero(rs.getInt("numero"));
                e.setId(rs.getInt("id"));

                cliente.setEndereco(e);

                lista.add(cliente);
            }
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    public void remover(String idCliente) {
        try {
            con = c.getConnection();

            con.setAutoCommit(false);

            String sql = "select id from Endereco where id_cliente = " + idCliente;

            ps = con.prepareStatement(sql);
            ResultSet rs;
            rs = ps.executeQuery(sql);
            int idEndereco = 0;
            if (rs.first()) {
                idEndereco = rs.getInt("id");
            }
            sql = "delete from Endereco where id = " + idEndereco;
            ps.execute(sql);
            sql = "delete from Cliente where id = " + idCliente;
            ps.execute(sql);
            con.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(null, ex1.getMessage());
            }
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
