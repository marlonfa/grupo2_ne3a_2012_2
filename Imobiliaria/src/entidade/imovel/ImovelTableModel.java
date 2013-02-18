/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade.imovel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author marlon
 */
public class ImovelTableModel extends AbstractTableModel{
    private List<ImovelEntidade> linhas;
    private static final int ID = 0, //CLIENTE = 1, 
                            ENDERECO = 1, BAIRRO = 2,
                            CIDADE = 3, CEP = 4, UF = 5, TIPO = 6, 
                            CATEGORIA = 7, MODALIDADE = 8, STATUS = 9, 
                            CHAVES = 10, VALOR = 11, DESCRICAO = 12;

    private String[] colunas = new String[] { "Código", //"cliente", 
        "Endereço", 
        "Bairro", "Cidade", "CEP", "UF", "Tipo", "Categoria", "Modalidade", 
        "Status", "Chaves", "Valor", "Descrição" };


    public ImovelTableModel() {
        linhas = new ArrayList<ImovelEntidade>();
    }

    public ImovelTableModel(List<ImovelEntidade> lista) {
        this.linhas = new ArrayList<ImovelEntidade>(lista);
    } 
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

        
    @Override
    public Class<?> getColumnClass(int columnIndex) {
    switch (columnIndex) {
    case ID:
        return String.class;
//    case CLIENTE:
//        return String.class;
    case ENDERECO:
        return String.class;
    case BAIRRO:
        return String.class;
    case CIDADE:
        return String.class;
    case CEP:
        return String.class;
    case UF:
        return String.class;
    case TIPO:
        return String.class;
    case CATEGORIA:
        return String.class;
    case MODALIDADE:
        return String.class;
    case STATUS:
        return String.class;
    case CHAVES:
        return String.class;
    case VALOR:
        return String.class;
    case DESCRICAO:
        return String.class;
    default:
        throw new IndexOutOfBoundsException("columnIndex out of bounds");
    }
}
    //Celula Editavel
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    // Pega o Imovel referente a linha especificada.
        ImovelEntidade imovel = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
            return imovel.getId();
    //    case CLIENTE:
    //        return imovel.getCliente;
            case ENDERECO:
                return imovel.getImovelEspec().getEndereco();
            case BAIRRO:
                return imovel.getImovelEspec().getBairro();
            case CIDADE:
                return imovel.getImovelEspec().getCidade();
            case CEP:
                return imovel.getImovelEspec().getCep();
            case UF:
                return imovel.getUf();
            case TIPO:
                return imovel.getTipo();
            case CATEGORIA:
                return imovel.getCategoria();
            case MODALIDADE:
                return imovel.getModalidade();
            case STATUS:
                return imovel.getStatus();
            case CHAVES:
                return imovel.getChaves();
            case VALOR:
                return imovel.getValor();
            case DESCRICAO:
                return imovel.getImovelEspec().getDescricao();
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // Pega o Imovel referente a linha especificada.
        ImovelEntidade imovel = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                imovel.setId((Integer) aValue); break;
    //      case CLIENTE:
    //          imovel.setCliente((Cliente) aValue); break;            
            case ENDERECO:
                imovel.setId((Integer) aValue); break; 
             case BAIRRO:
                imovel.setId((Integer) aValue); break;
            case CIDADE:
                imovel.setId((Integer) aValue); break;
            case CEP:
                imovel.setId((Integer) aValue); break;
            case UF:
                imovel.setId((Integer) aValue); break;
            case TIPO:
                imovel.setId((Integer) aValue); break;
            case CATEGORIA:
                imovel.setId((Integer) aValue); break;
            case MODALIDADE:
                imovel.setId((Integer) aValue); break;
            case STATUS:
                imovel.setId((Integer) aValue); break;
            case CHAVES:
                imovel.setId((Integer) aValue); break;
            case VALOR:
                imovel.setId((Integer) aValue); break;
            case DESCRICAO:
                imovel.setId((Integer) aValue); break;           
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
     
        
    fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
}
    
    @Override
    public String getColumnName(int column){
        return this.colunas[column];
    }

    public ImovelEntidade getImovelEntidade(int row){
        ImovelEntidade imovel = linhas.get(row);       
        return imovel;
    }

   
}
