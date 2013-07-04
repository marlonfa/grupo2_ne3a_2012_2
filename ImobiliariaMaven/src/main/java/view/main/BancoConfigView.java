/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.main;

import util.ConfigHibernateUtil;

/**
 *
 * @author marlon e eder
 */
public class BancoConfigView extends javax.swing.JDialog {

    /**
     * Creates new form BancoConfigView
     */
    private ConfigHibernateUtil cfg;

    public BancoConfigView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.cfg = new ConfigHibernateUtil();
        lerArquivo();
    }

    private void lerArquivo() {
        this.cfg.lerProperties();

        jTFDriver.setText(this.cfg.getDriver());
        jTFHost.setText(this.cfg.getUrl());
        jTFUser.setText(this.cfg.getUsername());
        jTFSenha.setText(this.cfg.getPassword());
        jTFDialect.setText(this.cfg.getDialect());
        jTFHdm2ddl.setText(this.cfg.getHdm2ddl());

        if (this.cfg.getShowSQL().equals("true")) {
            jRBShow_Sim.setSelected(true);
        } else {
            jRBShow_Nao.setSelected(true);
        }
        if (this.cfg.getFormatSQL().equals("true")) {
            jRBFormat_Sim.setSelected(true);
        } else {
            jRBFormat_Nao.setSelected(true);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupShowSQL = new javax.swing.ButtonGroup();
        buttonGroupFormat = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTFHost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFDriver = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRBShow_Sim = new javax.swing.JRadioButton();
        jRBShow_Nao = new javax.swing.JRadioButton();
        jRBFormat_Sim = new javax.swing.JRadioButton();
        jRBFormat_Nao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTFDialect = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFHdm2ddl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Configurações do Banco de Dados");

        jLabel2.setText("Host:");

        jLabel4.setText("Usuário:");

        jLabel5.setText("Senha:");

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jLabel7.setText("Driver:");

        jLabel8.setText("Show SQL:");

        jLabel9.setText("Format SQL:");

        buttonGroupShowSQL.add(jRBShow_Sim);
        jRBShow_Sim.setText("Sim");

        buttonGroupShowSQL.add(jRBShow_Nao);
        jRBShow_Nao.setText("Não");

        buttonGroupFormat.add(jRBFormat_Sim);
        jRBFormat_Sim.setText("Sim");

        buttonGroupFormat.add(jRBFormat_Nao);
        jRBFormat_Nao.setText("Não");

        jLabel6.setText("Dialect");

        jLabel10.setText("Hdm2ddl:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRBFormat_Sim)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRBFormat_Nao)
                                    .addGap(202, 202, 202))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel6))
                                            .addGap(2, 2, 2)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFHdm2ddl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBSalvar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTFSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                                .addComponent(jTFUser, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTFHost, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTFDriver, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTFDialect))))
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRBShow_Sim)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRBShow_Nao))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFDialect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFHdm2ddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBShow_Sim)
                    .addComponent(jRBShow_Nao)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBFormat_Sim)
                        .addComponent(jRBFormat_Nao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jBSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
        cfg.setDriver(this.jTFDriver.getText());
        cfg.setUrl(this.jTFHost.getText());
        cfg.setUsername(this.jTFUser.getText());
        cfg.setPassword(this.jTFSenha.getText());
        cfg.setDialect(this.jTFDialect.getText());
        cfg.setHdm2ddl(this.jTFHdm2ddl.getText());
        
        if (this.jRBShow_Sim.isSelected()) {
            this.cfg.setShowSQL("true");
        } else {
            this.cfg.setShowSQL("false");
        }
        if (this.jRBFormat_Sim.isSelected()) {
            this.cfg.setFormatSQL("true");
        } else {
            this.cfg.setFormatSQL("false");
        }
        cfg.gravarProperties();
        dispose();
    }//GEN-LAST:event_jBSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFormat;
    private javax.swing.ButtonGroup buttonGroupShowSQL;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBFormat_Nao;
    private javax.swing.JRadioButton jRBFormat_Sim;
    private javax.swing.JRadioButton jRBShow_Nao;
    private javax.swing.JRadioButton jRBShow_Sim;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFDialect;
    private javax.swing.JTextField jTFDriver;
    private javax.swing.JTextField jTFHdm2ddl;
    private javax.swing.JTextField jTFHost;
    private javax.swing.JTextField jTFSenha;
    private javax.swing.JTextField jTFUser;
    // End of variables declaration//GEN-END:variables
}
