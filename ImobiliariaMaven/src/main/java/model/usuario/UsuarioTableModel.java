/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eder
 */
public class UsuarioTableModel extends AbstractTableModel {

    private List linha;
    private static final int ID = 0, NOME = 1, LOGIN = 2;
    private String[] colunas = {"Código", "Nome", "Login"};

    public UsuarioTableModel() {
        linha = new ArrayList();
    }

    public UsuarioTableModel(List lista) {
        this.linha = new ArrayList(lista);
    }

    @Override
    public int getRowCount() {
        return this.linha.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case ID:
                return String.class;
            case NOME:
                return String.class;
            case LOGIN:
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
        UsuarioEntity usuario = (UsuarioEntity) linha.get(rowIndex);

        switch (columnIndex) {
            case ID:
                return usuario.getId();
            case NOME:
                return usuario.getNome();
            case LOGIN:
                return usuario.getLogin();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Pega o Imovel referente a linha especificada.
        UsuarioEntity usuario = (UsuarioEntity) linha.get(rowIndex);

        switch (columnIndex) {
            case ID:
                usuario.setId((Long) aValue);
                break;
            case NOME:
                usuario.setNome(aValue.toString());
                break;
            case LOGIN:
                usuario.setLogin(aValue.toString());
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    public UsuarioEntity getUsuarioEntity(int row) {
        UsuarioEntity usuarioEntity = (UsuarioEntity) linha.get(row);
        return usuarioEntity;
    }
}
