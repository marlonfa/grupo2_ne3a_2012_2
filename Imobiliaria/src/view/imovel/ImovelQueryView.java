/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.imovel;

import control.ImovelController;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.imovel.ImovelModalidadeEnum;
import model.imovel.ImovelTableModel;

/**
 *
 * @author marlon e eder
 */
public class ImovelQueryView extends javax.swing.JDialog {
    private ImovelTableModel imovelTableModel;
    private ImovelController imovelController;
    private ImovelView imovelView;
    private ImovelEditView imovelEditView;
    /**
     * Creates new form ImovelQueryView
     */
    public ImovelQueryView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setTitle("..::Tela de Consulta de Imóvel::..");
        this.imovelController = new ImovelController();
        initComponents();
        jRBAlugar.setSelected(true);
    }

    public ImovelTableModel getImovelTableModel() {
        this.imovelTableModel = new ImovelTableModel(imovelController.findAll());
        return imovelTableModel;
    }
    
    private void refreshTable(){
        this.imovelTableModel = new ImovelTableModel(imovelController.findAll());
        jTable1.setModel(this.imovelTableModel);
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBView = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBFiltrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRBAlugar = new javax.swing.JRadioButton();
        jRBVender = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(getImovelTableModel());
        jScrollPane1.setViewportView(jTable1);

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBView.setText("View");
        jBView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBViewActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBFiltrar.setText("Filtrar");
        jBFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiltrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar Por:");

        buttonGroup1.add(jRBAlugar);
        jRBAlugar.setText("Imóvel Para Alugar");
        jRBAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAlugarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBVender);
        jRBVender.setText("Imóvel Para Vender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBView)
                        .addGap(18, 18, 18)
                        .addComponent(jBFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBAlugar)
                                .addGap(18, 18, 18)
                                .addComponent(jRBVender)
                                .addGap(18, 18, 18)
                                .addComponent(jBFiltrar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBAlugar)
                    .addComponent(jRBVender)
                    .addComponent(jBFiltrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir)
                    .addComponent(jBView)
                    .addComponent(jBFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row >= 0){
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir este Imóvel? " , "Excluir Imóvel", 2);
            if(opcao == 0){
                try {
                    this.imovelController.delete(this.imovelTableModel.getImovelEntidade(row));
                    JOptionPane.showMessageDialog(null, "Imóvel Excluído com Sucesso!");
                } catch (RuntimeException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao Excluir Imóvel!","Erro",JOptionPane.ERROR_MESSAGE); 
                }
                refreshTable();
                JOptionPane.showMessageDialog(null, "Imóvel Excluído com Sucesso!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Excluir!");
        }
        
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int row = jTable1.getSelectedRow();
        if(row >= 0){
            ImovelController.setImovelSelecionado(this.imovelTableModel.getImovelEntidade(row));
            imovelEditView = new ImovelEditView(new Frame(), true);
            dispose();
            imovelEditView.getImovel();
            imovelEditView.setLocationRelativeTo(null);
            imovelEditView.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Editar!");
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBViewActionPerformed
        int row = jTable1.getSelectedRow();
        if(row >= 0){
            ImovelController.setImovelSelecionado(this.imovelTableModel.getImovelEntidade(row));
            imovelView = new ImovelView(new Frame(), true);
            dispose();
            imovelView.setLocationRelativeTo(null);
            imovelView.setVisible(true);            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Visualizar!");
        }
    }//GEN-LAST:event_jBViewActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jRBAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAlugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBAlugarActionPerformed

    private void jBFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiltrarActionPerformed
        if(jRBAlugar.isSelected()){            
            this.imovelTableModel = new ImovelTableModel(this.imovelController.getImovelDao().filterByModalidade(ImovelModalidadeEnum.ALUGUEL));  
            jTable1.setModel(this.imovelTableModel); 
        } else if (jRBVender.isSelected()){
            this.imovelTableModel = new ImovelTableModel(this.imovelController.getImovelDao().filterByModalidade(ImovelModalidadeEnum.VENDA));  
            jTable1.setModel(this.imovelTableModel); 
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma opção!");
        }
    }//GEN-LAST:event_jBFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jBView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBAlugar;
    private javax.swing.JRadioButton jRBVender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
