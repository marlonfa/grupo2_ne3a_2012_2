/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.imovel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.cliente.ClienteEntity;
import model.endereco.EstadoEnum;


/**
 *
 * @author marlon e eder
 */
public class ImovelTableModel extends AbstractTableModel{
    private List<ImovelEntity> linhas;
    private static final int ID = 0, CLIENTE = 1, LOGRADOURO = 2, NUMERO = 3, BAIRRO = 4, CIDADE = 5, UF = 6, 
                            NUMERODORMITORIO = 7, MODALIDADE = 8, TIPO = 9, STATUS = 10, VALOR = 11;

    private String[] colunas = new String[] { "Código", "Cliente", 
        "Logradouro", "Número", "Bairro", "Cidade", 
             "UF", "N Dorimitório", "Modalidade", "Tipo", "Status", "Valor"};


    public ImovelTableModel() {
        linhas = new ArrayList<ImovelEntity>();
    }

    public ImovelTableModel(List<ImovelEntity> lista) {
        this.linhas = new ArrayList<ImovelEntity>(lista);
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
    case CLIENTE:
        return String.class;
//    case DATA:
//        return Calendar.class;
    case LOGRADOURO:
        return String.class;
    case NUMERO:
        return String.class;
//    case COMPLEMENTO:
//        return String.class;
    case BAIRRO:
        return String.class;
    case CIDADE:
        return String.class;
    case UF:
        return String.class;
//    case CEP:
//        return String.class;
    case NUMERODORMITORIO:
        return String.class;
    case MODALIDADE:
        return String.class;
    case TIPO:
        return String.class;
    case STATUS:
        return String.class;
    case VALOR:
        return String.class;
//    case DESCRICAO:
//        return String.class;
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
        ImovelEntity imovel = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
            return imovel.getId();
        case CLIENTE:
            return imovel.getCliente().getNome();
    //    case DATA:
    //        return imovel.getData;
            case LOGRADOURO:
                return imovel.getEndereco().getLogradouro();
            case NUMERO:
                return imovel.getEndereco().getNumero();
//            case COMPLEMENTO:
//                return imovel.getEndereco().getComplemento();
            case BAIRRO:
                return imovel.getEndereco().getBairro();
            case CIDADE:
                return imovel.getEndereco().getMunicipio();            
            case UF:
                return imovel.getEndereco().getUf();
//            case CEP:
//                return imovel.getEndereco().getCep();
            case NUMERODORMITORIO:
                return imovel.getDormitorio();
            case MODALIDADE:
                return imovel.getModalidade();
            case TIPO:
                return imovel.getTipo();           
            case STATUS:
                return imovel.getStatus();
            case VALOR:
                return imovel.getValor();
//            case DESCRICAO:
//                return imovel.getDescricao();
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // Pega o Imovel referente a linha especificada.
        ImovelEntity imovel = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                imovel.setId((Long) aValue); break;
          case CLIENTE:
              imovel.setCliente((ClienteEntity) aValue); break; 
    //      case DATA:
    //          imovel.setCliente((Cliente) aValue); break; 
            case LOGRADOURO:
                imovel.getEndereco().setLogradouro((String) aValue); break;
            case NUMERO:
                imovel.getEndereco().setNumero((Integer) aValue); break;
             case BAIRRO:
                imovel.getEndereco().setBairro((String) aValue); break;
            case CIDADE:
                imovel.getEndereco().setMunicipio((String) aValue); break;
            case UF:
                imovel.getEndereco().setUf((EstadoEnum) aValue); break;
//            case CEP:
//                imovel.getEndereco().setCep((String) aValue); break;
            case NUMERODORMITORIO:
                imovel.setDormitorio((Integer) aValue); break;
            case MODALIDADE:
                imovel.setModalidade((ImovelModalidadeEnum) aValue); break;
            case TIPO:
                imovel.setTipo((ImovelTipoEnum) aValue); break;         
            case STATUS:
                imovel.setStatus((ImovelStatusEnum) aValue); break;
            case VALOR:
                imovel.setValor((Float) aValue); break;
//            case DESCRICAO:
//                imovel.setDescricao((String) aValue); break;        
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
     
        
    fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
}
    
    @Override
    public String getColumnName(int column){
        return this.colunas[column];
    }

    public ImovelEntity getImovelEntidade(int row){
        ImovelEntity imovel = linhas.get(row);       
        return imovel;
    }

   
}
