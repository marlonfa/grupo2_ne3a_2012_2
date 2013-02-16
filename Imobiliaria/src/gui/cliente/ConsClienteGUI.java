/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cliente;

import entidade.cliente.ClienteEntidade;
import dao.ClienteDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eder
 */
public class ConsClienteGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditClienteGUI
     */
    public ConsClienteGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jBpesquisar = new javax.swing.JButton();
        jTFCampoPesquisa = new javax.swing.JTextField();
        jBSair = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultadoConsulta = new javax.swing.JTable();

        setTitle("Pesquisar Cadastro de Cliente");

        jBpesquisar.setText("Pesquisar");
        jBpesquisar.setToolTipText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        jTFCampoPesquisa.setToolTipText("Informe um Nome");

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/exit.png"))); // NOI18N
        jBSair.setToolTipText("Sair");
        jBSair.setBorderPainted(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
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

        jTResultadoConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTResultadoConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBpesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBEditar)
                                .addGap(14, 14, 14)
                                .addComponent(jBSair)))
                        .addGap(114, 194, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEditar)
                    .addComponent(jBSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ClienteDAO c = new ClienteDAO();
    List<ClienteEntidade> lista;
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        // TODO add your handling code here:
        String[] columNames = {"Nome", "Cpf", "Cidade"};
        ClienteEntidade cliente;
        List<ClienteEntidade> lista = c.consultar(jTFCampoPesquisa.getText().toString());
        jTResultadoConsulta.setModel(new DefaultTableModel(columNames, lista.size()));
        for (int i = 0; i < lista.size(); i++) {
            cliente = lista.get(i);
            jTResultadoConsulta.setValueAt(cliente.getNome(), i, 0);
            jTResultadoConsulta.setValueAt(cliente.getCpf(), i, 1);
            jTResultadoConsulta.setValueAt(cliente.getEndereco().getCidade(), i, 2);
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
        new EditClienteGUI().setVisible(true);
        int i = jTResultadoConsulta.getSelectedRow();
        String cpf = jTResultadoConsulta.getValueAt(i, 1).toString();
        ClienteEntidade cliente = null;
        for (int j = 0; j < lista.size(); j++) {
            cliente = lista.get(i);
            if (cliente.getCpf().equals(cpf)) {
                break;
            }
        }
        EditClienteGUI edit = new EditClienteGUI();
        edit.recuperarClienteEntidade(cliente);
        edit.setVisible(true);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBSairActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCampoPesquisa;
    private javax.swing.JTable jTResultadoConsulta;
    // End of variables declaration//GEN-END:variables
}
