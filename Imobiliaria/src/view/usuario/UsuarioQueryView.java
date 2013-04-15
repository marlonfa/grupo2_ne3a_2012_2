/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.usuario;

import control.UsuarioController;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.usuario.UsuarioEntity;
import model.usuario.UsuarioTableModel;

/**
 *
 * @author eder
 */
public class UsuarioQueryView extends javax.swing.JDialog {

    private UsuarioController usuarioController;
    private List lista;
    private UsuarioTableModel usuarioTableModel;

    /**
     * Creates new form UsuarioQueryView
     */
    public UsuarioQueryView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setTitle("..::Tela de Visualização de Usuário::..");
        this.usuarioController = new UsuarioController();
        this.lista = new ArrayList();
        this.usuarioTableModel = new UsuarioTableModel();
        initComponents();
        this.jRBNome.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jTFValorPesquisa = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jRBNome = new javax.swing.JRadioButton();
        jRBLogin = new javax.swing.JRadioButton();
        jBView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa Cadastro de Usuários");

        jTFValorPesquisa.setToolTipText("Digite um Nome ou Login");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.setToolTipText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisa.setModel(getUsuarioTableModel());
        jScrollPane1.setViewportView(jTablePesquisa);

        jBExcluir.setText("Excluir");
        jBExcluir.setToolTipText("Excluir Cadastro");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.setToolTipText("Editar Cadastro");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBSair.setText("Fechar");
        jBSair.setToolTipText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        buttonGroup.add(jRBNome);
        jRBNome.setText("Nome:");
        jRBNome.setToolTipText("Pesquisar por Nome");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        buttonGroup.add(jRBLogin);
        jRBLogin.setText("Login");
        jRBLogin.setToolTipText("Pesquisar por Login");
        jRBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLoginActionPerformed(evt);
            }
        });

        jBView.setText("Visualizar");
        jBView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRBNome)
                        .addGap(17, 17, 17)
                        .addComponent(jRBLogin)
                        .addGap(18, 18, 18)
                        .addComponent(jTFValorPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBView)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBNome)
                    .addComponent(jRBLogin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFValorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public UsuarioTableModel getUsuarioTableModel() {
        this.usuarioTableModel = new UsuarioTableModel(usuarioController.getUsuarioDao().findAll());
        return usuarioTableModel;
    }
    
    private void refreshTable(){
        this.usuarioTableModel = new UsuarioTableModel(usuarioController.getUsuarioDao().findAll());
        jTablePesquisa.setModel(this.usuarioTableModel);
    }

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        if (jRBLogin.isSelected()) {
            this.lista = this.usuarioController.getUsuarioDao().filter("login", jTFValorPesquisa.getText());
        } else {
            this.lista = this.usuarioController.getUsuarioDao().filter("nome", jTFValorPesquisa.getText());
        }
        if (this.lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum Registro Encontrado");
        } else {
            this.usuarioTableModel = new UsuarioTableModel(lista);
            this.jTablePesquisa.setModel(usuarioTableModel);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        UsuarioEditView editView = new UsuarioEditView(new JFrame(), true);
        editView.setLocationRelativeTo(null);
        editView.setEdit(true);

        int row = this.jTablePesquisa.getSelectedRow();

        if (row >= 0) {
            this.usuarioController.setUsuario(this.usuarioTableModel.getUsuarioEntity(row));
        } else {
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Editar!");
        }
        editView.setValues(usuarioController);
        editView.setVisible(true);
        refreshTable();
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        int row = this.jTablePesquisa.getSelectedRow();

        if (row >= 0) {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir este Usuário? ", "Excluir Usuário", 2);
            if (opcao == 0) {
                try{
                    this.usuarioController.delete(this.usuarioTableModel.getUsuarioEntity(row));
                    JOptionPane.showMessageDialog(null, "Usuário Excluído com Sucesso!");
                }catch(RuntimeException ex){
                    JOptionPane.showMessageDialog(null,"Erro ao Excluir Usuário!","Erro",JOptionPane.ERROR_MESSAGE); 
                }                
                refreshTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma linha da Tabela para Excluir!");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jRBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLoginActionPerformed
    }//GEN-LAST:event_jRBLoginActionPerformed

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
    }//GEN-LAST:event_jRBNomeActionPerformed

    private void jBViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBViewActionPerformed
        // TODO add your handling code here:
        UsuarioView view = new UsuarioView(new Frame(), true);
        view.setLocationRelativeTo(null);

        int row = jTablePesquisa.getSelectedRow();
        this.usuarioController.setUsuario(this.usuarioTableModel.getUsuarioEntity(row));
        view.setValues(usuarioController);
        view.setVisible(true);
        this.refreshTable();
    }//GEN-LAST:event_jBViewActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBView;
    private javax.swing.JRadioButton jRBLogin;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFValorPesquisa;
    private javax.swing.JTable jTablePesquisa;
    // End of variables declaration//GEN-END:variables

    private void getUsuarioEntityByTable() throws NumberFormatException {
        int linha = this.jTablePesquisa.getSelectedRow();
        int coluna = Integer.parseInt(jTablePesquisa.getValueAt(linha, 0).toString());

        for (int i = 0; i < lista.size(); i++) {
            this.usuarioController.setUsuario((UsuarioEntity) lista.get(i));
            if (this.usuarioController.getUsuario().getId() == coluna) {
                break;
            }
        }
    }
}
