/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.usuario;

import dao.UsuarioDAO;
import entidade.usuario.UsuarioEntidade;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1253980
 */
public class ConsUsuarioGUI extends javax.swing.JFrame {

    /**
     * Creates new form ConsUsuarioGUI
     */
    public ConsUsuarioGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEditar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jTFCampoPesquisa = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultadoConsulta = new javax.swing.JTable();
        jBExcluir = new javax.swing.JButton();
        jLNomeOU_Login = new javax.swing.JLabel();

        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Edit.png"))); // NOI18N
        jBEditar.setToolTipText("Editar");
        jBEditar.setBorderPainted(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/exit.png"))); // NOI18N
        jBSair.setToolTipText("Sair");
        jBSair.setBorderPainted(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.setToolTipText("Troxa ta cego nao encontra nada");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTResultadoConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTResultadoConsulta);

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/trash.png"))); // NOI18N
        jBExcluir.setToolTipText("Excluir");
        jBExcluir.setBorderPainted(false);
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLNomeOU_Login.setText("Nome do Cliente / Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jBPesquisar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNomeOU_Login)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEditar)
                    .addComponent(jBSair)
                    .addComponent(jBExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNomeOU_Login))
                    .addComponent(jBPesquisar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    UsuarioDAO user = new UsuarioDAO();
    List<UsuarioEntidade> lista;

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
        int i = jTResultadoConsulta.getSelectedRow();
        String login = jTResultadoConsulta.getValueAt(i, 1).toString();
        UsuarioEntidade cliente = new UsuarioEntidade();
        for (int j = 0; j < lista.size(); j++) {
            cliente = lista.get(i);
            if (cliente.getLogin().equals(login)) {
                break;
            }
        }
        EditUsuarioGUI edit = new EditUsuarioGUI();
        edit.recuperarUsuarioEntidade(cliente);
        edit.inserirCampos();
        edit.setVisible(true);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        int i = jTResultadoConsulta.getSelectedRow();
        String id = jTResultadoConsulta.getValueAt(i, 0).toString();
        user.remover(id);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // TODO add your handling code here:
        String[] columNames = {"id","Nome", "Login"};
        UsuarioEntidade usuarios;
        lista = user.consultar(jTFCampoPesquisa.getText().toString());
        jTResultadoConsulta.setModel(new DefaultTableModel(columNames, lista.size()));

        for (int i = 0; i < lista.size(); i++) {
            usuarios = lista.get(i);
            jTResultadoConsulta.setValueAt(usuarios.getId(), i, 0);
            jTResultadoConsulta.setValueAt(usuarios.getNome(), i, 1);
            jTResultadoConsulta.setValueAt(usuarios.getLogin(), i, 2);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLNomeOU_Login;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCampoPesquisa;
    private javax.swing.JTable jTResultadoConsulta;
    // End of variables declaration//GEN-END:variables
}