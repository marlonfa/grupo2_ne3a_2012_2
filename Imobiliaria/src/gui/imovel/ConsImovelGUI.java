package gui.imovel;

import dao.ImovelDAO;
import entidade.imovel.ImovelEntidade;
import entidade.imovel.ImovelTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsImovelGUI extends javax.swing.JFrame {  
    private String consultar;
    private ImovelDAO imovelDAO = new ImovelDAO();
    private ImovelTableModel tableModel;
    private ImovelEntidade imovel;
        
    public ConsImovelGUI() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public ImovelEntidade getImovel() {
        return imovel;
    }   
      
     private ImovelTableModel getTableModel() throws SQLException {               
        imovelDAO.todosRegistros();
        this.tableModel = new ImovelTableModel(this.imovelDAO.getLista());        
        return this.tableModel;
    }
     
     public void atualizarTabela() throws SQLException{
        imovelDAO.todosRegistros();
        this.tableModel = new ImovelTableModel(this.imovelDAO.getLista());  
        jTable1.setModel(tableModel);  
     }
     
     public void consultar() throws SQLException{
        this.consultar = jTFConsultar.getText();
        if(jRBEndereco.isSelected()){
            imovelDAO.consultarPorEndereco(consultar);
            this.tableModel = new ImovelTableModel(this.imovelDAO.getLista());  
            jTable1.setModel(tableModel);       
        }else if(jRBCidade.isSelected()){
            imovelDAO.consultarPorCidade(consultar);
            this.tableModel = new ImovelTableModel(this.imovelDAO.getLista());  
            jTable1.setModel(tableModel);  
        }else
            JOptionPane.showMessageDialog(null, "Por favor Selecione o Tipo de Pesquisa!");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws SQLException{

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTFConsultar = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jRBEndereco = new javax.swing.JRadioButton();
        jRBCidade = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Edit.png"))); // NOI18N
        jBEditar.setToolTipText("Editar");
        jBEditar.setBorderPainted(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Delete.png"))); // NOI18N
        jBExcluir.setToolTipText("Excluir Cadastro");
        jBExcluir.setBorderPainted(false);
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBConsultar.setText("Consultar");
        jBConsultar.setToolTipText("Troxa ta cego nao encontra nada");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBEndereco);
        jRBEndereco.setText("Consultar por Endereço");

        buttonGroup1.add(jRBCidade);
        jRBCidade.setText("Consultar por Cidade");

        jTable1.setModel(getTableModel());
        jScrollPane2.setViewportView(jTable1);

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/exit.png"))); // NOI18N
        jBSair.setToolTipText("Sair");
        jBSair.setBorderPainted(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jBExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jBSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCidade)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir)
                    .addComponent(jBEditar)
                    .addComponent(jBSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBEndereco)
                    .addComponent(jRBCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        try {        
            consultar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int row = jTable1.getSelectedRow();        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para editar!");
        }else{
            this.imovel = this.tableModel.getImovelEntidade(row);            
            EditImovelGUI editImovel = new EditImovelGUI();
            editImovel.imovel(imovel);
            editImovel.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jBEditarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int row = jTable1.getSelectedRow();        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Excluir!");
        }else{
            try {
                this.imovel = this.tableModel.getImovelEntidade(row);            
                imovelDAO.remover(imovel);
                atualizarTabela();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSair;
    private javax.swing.JRadioButton jRBCidade;
    private javax.swing.JRadioButton jRBEndereco;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFConsultar;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
