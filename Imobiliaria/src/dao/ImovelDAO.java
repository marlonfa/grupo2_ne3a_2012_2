package dao;

import conexaoDataBase.Conexao;
import entidade.imovel.ImovelCategoriaEntidade;
import entidade.imovel.ImovelChavesEntidade;
import entidade.imovel.ImovelEntidade;
import entidade.imovel.ImovelEspecEntidade;
import entidade.imovel.ImovelModalidadeEntidade;
import entidade.imovel.ImovelStatusEntidade;
import entidade.imovel.ImovelTipoEntidade;
import entidade.uf.EstadoEntidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ImovelDAO {
    private Conexao conexao;
    private Connection connection;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;  
    private List<ImovelEntidade> lista;
    
    
    public ImovelDAO() {
        this.conexao = new Conexao();
        this.connection = conexao.getConnection();
        
    }
    
    
    
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
    
    public void alterar(ImovelEntidade imovel){
        try{
            String query = "UPDATE imovel SET endereco = ?, bairro = ?, "
                        + "cidade = ?, cep = ?, uf = ?, tipo = ?, categoria = ?, "
                        + "modalidade = ?, status = ?, chaves = ?, valor = ?, descricao = ? "
                        + "WHERE id = ?";
            pst = connection.prepareStatement(query);
            pst.setString(1, imovel.getImovelEspec().getEndereco());
            pst.setString(2, imovel.getImovelEspec().getBairro());
            pst.setString(3, imovel.getImovelEspec().getCidade());
            pst.setString(4, imovel.getImovelEspec().getCep());
            pst.setString(5, imovel.getUf().toString());
            pst.setString(6, imovel.getTipo().toString());
            pst.setString(7, imovel.getCategoria().toString());
            pst.setString(8, imovel.getModalidade().toString());
            pst.setString(9, imovel.getStatus().toString());
            pst.setString(10, imovel.getChaves().toString());
            pst.setString(11, imovel.getValor().toString());
            pst.setString(12, imovel.getImovelEspec().getDescricao());
            pst.setLong(13, imovel.getId());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Imóvel Alterado com Sucesso!");
            pst.close();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
        
    }
    
    public void remover(ImovelEntidade imovel){
        try{
            String query = "DELETE FROM imovel WHERE id = ?";
            
            int i = JOptionPane.showConfirmDialog(null ,"Deseja Excluir este imóvel?",  
            "Excluir Imóvel",JOptionPane.YES_NO_OPTION);  
            if (i == JOptionPane.YES_OPTION ) { 
                pst = connection.prepareStatement(query);
                pst.setLong(1, imovel.getId());
                pst.execute();
            } else {  
              JOptionPane.showMessageDialog(null, "Operação cancelada!");
            }  
            pst.close();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    public List<ImovelEntidade> consultarPorEndereco(String consulta){
        try{
            pst = connection.prepareStatement("SELECT * FROM imovel WHERE endereco LIKE ?");
            pst.setString(1, "%"+consulta+"%");
            pst.execute();
            rs = pst.executeQuery();
            
            this.lista = new ArrayList<ImovelEntidade>();         
            
            while (rs.next()){
                ImovelEntidade imovel = new ImovelEntidade();
                imovel.setId(rs.getInt("id"));
                //imovel.setCliente(rs.getString("cliente"));
                imovel.setImovelEspec(new ImovelEspecEntidade(
                        rs.getString("endereco"), 
                        rs.getString("bairro"), 
                        rs.getString("cidade"), 
                        rs.getString("cep"), 
                        rs.getString("descricao")));                    
                imovel.setCategoria((ImovelCategoriaEntidade.valueOf(rs.getString("categoria"))));
                imovel.setModalidade((ImovelModalidadeEntidade.valueOf(rs.getString("modalidade"))));
                imovel.setStatus((ImovelStatusEntidade.valueOf(rs.getString("status"))));
                imovel.setChaves((ImovelChavesEntidade.valueOf(rs.getString("chaves"))));
                imovel.setValor(rs.getFloat("valor"));
                imovel.setUf((EstadoEntidade.valueOf(rs.getString("uf"))));
                imovel.setTipo((ImovelTipoEntidade.valueOf(rs.getString("tipo"))));
                this.lista.add(imovel);    
            }
            
                pst.close();     
                rs.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }return this.lista;     
    }
    
    public List<ImovelEntidade> consultarPorCidade(String consulta){
        try{
            pst = connection.prepareStatement("SELECT * FROM imovel WHERE cidade LIKE ?");
            pst.setString(1, "%"+consulta+"%");
            pst.execute();
            rs = pst.executeQuery();
            
            this.lista = new ArrayList<ImovelEntidade>();         
            
            while (rs.next()){
                ImovelEntidade imovel = new ImovelEntidade();
                imovel.setId(rs.getInt("id"));
                //imovel.setCliente(rs.getString("cliente"));
                imovel.setImovelEspec(new ImovelEspecEntidade(
                        rs.getString("endereco"), 
                        rs.getString("bairro"), 
                        rs.getString("cidade"), 
                        rs.getString("cep"), 
                        rs.getString("descricao")));                    
                imovel.setCategoria((ImovelCategoriaEntidade.valueOf(rs.getString("categoria"))));
                imovel.setModalidade((ImovelModalidadeEntidade.valueOf(rs.getString("modalidade"))));
                imovel.setStatus((ImovelStatusEntidade.valueOf(rs.getString("status"))));
                imovel.setChaves((ImovelChavesEntidade.valueOf(rs.getString("chaves"))));
                imovel.setValor(rs.getFloat("valor"));
                imovel.setUf((EstadoEntidade.valueOf(rs.getString("uf"))));
                imovel.setTipo((ImovelTipoEntidade.valueOf(rs.getString("tipo"))));
                this.lista.add(imovel);    
            }
            
                pst.close();     
                rs.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }return this.lista;     
    }
    
    public List<ImovelEntidade> todosRegistros(){
        try{
            String query = "SELECT * FROM imovel";
            st = connection.createStatement();
            rs = st.executeQuery(query);
            this.lista = new ArrayList<ImovelEntidade>();         
            
            while (rs.next()){
                ImovelEntidade imovel = new ImovelEntidade();
                imovel.setId(rs.getInt("id"));
                //imovel.setCliente(rs.getString("cliente"));
                imovel.setImovelEspec(new ImovelEspecEntidade(
                        rs.getString("endereco"), 
                        rs.getString("bairro"), 
                        rs.getString("cidade"), 
                        rs.getString("cep"), 
                        rs.getString("descricao")));                    
                imovel.setCategoria((ImovelCategoriaEntidade.valueOf(rs.getString("categoria"))));
                imovel.setModalidade((ImovelModalidadeEntidade.valueOf(rs.getString("modalidade"))));
                imovel.setStatus((ImovelStatusEntidade.valueOf(rs.getString("status"))));
                imovel.setChaves((ImovelChavesEntidade.valueOf(rs.getString("chaves"))));
                imovel.setValor(rs.getFloat("valor"));
                imovel.setUf((EstadoEntidade.valueOf(rs.getString("uf"))));
                imovel.setTipo((ImovelTipoEntidade.valueOf(rs.getString("tipo"))));
                this.lista.add(imovel);    
            }
                rs.close();
                st.close();     
                
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }return this.lista;             }

    public List<ImovelEntidade> getLista(){
        return this.lista;
    }
}
