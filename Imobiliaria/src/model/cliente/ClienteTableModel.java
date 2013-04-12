/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author marlon
 */
public class ClienteTableModel extends AbstractTableModel{
    private List<ClienteEntity> linhas;
    private static final int ID = 0, NOME = 1, RG = 2, CPF = 3, CELULAR = 4, EMAIL = 5;

    private String[] colunas = new String[] { "Código", "Nome", "RG", "CPF", "Celular", "e-mail"}; 
    
    public ClienteTableModel() {
        linhas = new ArrayList<ClienteEntity>();
    }

    public ClienteTableModel(List<ClienteEntity> lista) {
        this.linhas = new ArrayList<ClienteEntity>(lista);
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
    case NOME:
        return String.class;
    case RG:
        return String.class;
    case CPF:
        return String.class;
    case CELULAR:
        return String.class;
    case EMAIL:
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
    // Pega o Cliente referente a linha especificada.
        ClienteEntity cliente = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                return cliente.getId();
            case NOME:
                return cliente.getNome();
            case RG:
                return cliente.getRg();                
            case CPF:
                return cliente.getCpf();
            case CELULAR:
                return cliente.getContato().getCelular();
            case EMAIL:
                return cliente.getContato().getEmail();
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // Pega o Cliente referente a linha especificada.
        ClienteEntity cliente = linhas.get(rowIndex);

        switch (columnIndex) {
            case ID:
                cliente.setId((Long) aValue); break;            
            case NOME:
                cliente.setNome(aValue.toString()); break; 
             case RG:
                cliente.setRg(aValue.toString()); break;
            case CPF:
                cliente.setCpf(aValue.toString()); break;
            case CELULAR:
                cliente.getContato().setCelular(aValue.toString()); break; 
            case EMAIL:
                cliente.getContato().setEmail(aValue.toString()); break; 
            default:                
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
     
        
    fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
}
    
    @Override
    public String getColumnName(int column){
        return this.colunas[column];
    }

    public ClienteEntity getClienteEntity(int row){
        ClienteEntity cliente = linhas.get(row);       
        return cliente;
    }

}