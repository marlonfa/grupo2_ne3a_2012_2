/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexaoDataBase.Conexao;
import entidade.usuario.UsuarioEntidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eder
 */
public class UsuarioDAO {

    Conexao c = new Conexao();
    Connection con;
    PreparedStatement ps;

    public void adicionar(UsuarioEntidade usuario) {

        String sql;
        boolean loginInvalido;

        con = c.getConnection();

        loginInvalido = verificaLogin(usuario.getLogin());

        if (!usuario.getSenha().equals(usuario.getConfirmaSenha())) {
            JOptionPane.showMessageDialog(null, "Senha não Confere");
        } else if (loginInvalido == true) {
            JOptionPane.showMessageDialog(null, "Login Indisponível. \nJá Cadastrado no Sistema");
        } else {
            sql = "insert into Usuario values (null,?,?,?,?);";
            try {
                con.setAutoCommit(false);
                
                ps = con.prepareStatement(sql);

                ps.setString(1, usuario.getNome());

                ps.setString(2, usuario.getLogin());

                ps.setString(3, usuario.getSenha());

                ps.setString(4, usuario.getConfirmaSenha());

                ps.execute();

                JOptionPane.showMessageDialog(null, "Usuário Cadastro com Sucesso");
                
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
    }

    public void alterar(UsuarioEntidade usuario) {
        try {
        con = c.getConnection();
        
        String sql;
        
        con.setAutoCommit(false);
        
        sql = "update Usuario set nome = ?, login = ?, senha = ?, confirma_senha = ?";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getConfirmaSenha());
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro Alterado Com Sucesso");
            
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

    public List<UsuarioEntidade> consultar(String busca) {
        List<UsuarioEntidade> lista = new ArrayList<>();
        try {
            UsuarioEntidade user;

            String sql;

            con = c.getConnection();

            sql = "select * from Usuario "
                    + "where login like \"%" + busca + "%\""
                    + " or nome like \"%" + busca + "%\";";

            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                user = new UsuarioEntidade();
                user.setId(rs.getLong("id"));
                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setConfirmaSenha(rs.getString("confirma_senha"));

                lista.add(user);
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

    public void remover(String idUsuario) {
        try {
//            String sql = "select id from Usuario where login = \"" + login+"\"";
con.setAutoCommit(false);
            con = c.getConnection();
            String sql = "delete from Usuario where id = "+idUsuario;
            
            ps = con.prepareStatement(sql);
            
            ps.execute(sql);
            
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

    private boolean verificaLogin(String login) {
        String sql = "select login from Usuario where login = \"" + login + "\"";
        try {
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(sql);

            if (rs.first()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
