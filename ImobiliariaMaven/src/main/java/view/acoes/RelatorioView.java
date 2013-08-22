/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.acoes;

import java.io.File;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MaskUtil;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import relatorios.GerarRelatorios;

/**
 *
 * @author eder
 */
public class RelatorioView extends javax.swing.JDialog {

    /**
     * Creates new form GerarRelatorio
     */
    private MaskUtil maskUtil;
    private GerarRelatorios relatorios;
    private Map mapa;
    private File file;

    public RelatorioView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        maskUtil = new MaskUtil();
        relatorios = new GerarRelatorios();
        applyMask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void applyMask() {
        try {
            maskUtil.maskData(jFTFDataInicial);
            maskUtil.maskData(jFTFDataFinal);
        } catch (ParseException ex) {
            Logger.getLogger(RelatorioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoRelatorio = new javax.swing.ButtonGroup();
        jRBLocar = new javax.swing.JRadioButton();
        jRBVenda = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLDataInicial = new javax.swing.JLabel();
        jLDataFinal = new javax.swing.JLabel();
        jBOk = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jCBRelatorioTotal = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jFTFDataInicial = new javax.swing.JFormattedTextField();
        jFTFDataFinal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroupTipoRelatorio.add(jRBLocar);
        jRBLocar.setSelected(true);
        jRBLocar.setText("Locação");
        jRBLocar.setToolTipText("Gerar Relatório de Locação");
        jRBLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLocarActionPerformed(evt);
            }
        });

        buttonGroupTipoRelatorio.add(jRBVenda);
        jRBVenda.setText("Venda");
        jRBVenda.setToolTipText("Gerar Relatório de Venda");

        jLabel1.setText("Gerar Relatório de:");

        jLDataInicial.setText("Data Inicial:");

        jLDataFinal.setText("Data Final:");

        jBOk.setText("Gerar");
        jBOk.setToolTipText("Gerar Relatório");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.setToolTipText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jCBRelatorioTotal.setText("Relatório Total");

        jLabel2.setText("FIltrar por Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBOk)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jRBLocar)
                                .addGap(18, 18, 18)
                                .addComponent(jRBVenda))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCBRelatorioTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLDataInicial)
                                    .addComponent(jLabel2))
                                .addGap(10, 10, 10)
                                .addComponent(jFTFDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLDataFinal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 134, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jRBLocar)
                    .addComponent(jRBVenda))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCBRelatorioTotal)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataInicial)
                    .addComponent(jLDataFinal)
                    .addComponent(jFTFDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBOk)
                    .addComponent(jBSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBLocarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        if(jCBRelatorioTotal.isSelected() || !jFTFDataFinal.getText().equals("__/__/____") || !jFTFDataInicial.getText().equals("__/__/____")){
            try {
                if (this.jRBLocar.isSelected()) {               
                    if (this.jCBRelatorioTotal.isSelected() && jFTFDataInicial.getText().equals("__/__/____") && jFTFDataFinal.getText().equals("__/__/____")) {
                        this.file =  new File("src/relatorios/locacao.jrxml").getAbsoluteFile();
                        this.relatorios.gerarRelatorioLocacao(this.file);
                    } else if (!this.jCBRelatorioTotal.isSelected()) {

                        getData();
                        this.file =  new File("src/relatorios/locacaoData.jrxml").getAbsoluteFile();
                        this.relatorios.gerarRelatorioLocacaoPorData(this.file, this.mapa);
                    }else{
                        JOptionPane.showMessageDialog(null, "Por favor, desmarque a opção Relatório Total");
                    }
                } else {

                    if (this.jCBRelatorioTotal.isSelected() && jFTFDataInicial.getText().equals("__/__/____") && jFTFDataFinal.getText().equals("__/__/____")) {
                        this.file =  new File("src/relatorios/venda.jrxml").getAbsoluteFile();
                        this.relatorios.gerarRelatorioLocacao(this.file);
                    } else if(!this.jCBRelatorioTotal.isSelected()){

                            getData();
                            this.file =  new File("src/relatorios/vendaData.jrxml").getAbsoluteFile();
                            this.relatorios.gerarRelatorioLocacaoPorData(this.file, this.mapa); 
                    }else{
                        JOptionPane.showMessageDialog(null, "Por favor, desmarque a opção Relatório Total");
                    }
            }
        } catch (Exception ex) {
            Logger.getLogger(RelatorioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor Selecione Relatório Total ou digite uma data Válida!");
        }
    }//GEN-LAST:event_jBOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoRelatorio;
    private javax.swing.JButton jBOk;
    private javax.swing.JButton jBSair;
    private javax.swing.JCheckBox jCBRelatorioTotal;
    private javax.swing.JFormattedTextField jFTFDataFinal;
    private javax.swing.JFormattedTextField jFTFDataInicial;
    private javax.swing.JLabel jLDataFinal;
    private javax.swing.JLabel jLDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBLocar;
    private javax.swing.JRadioButton jRBVenda;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void getData() {
       mapa = new HashMap();
       String inicial, finaly;
       String[] s1 = jFTFDataInicial.getText().split("/");
       inicial = s1[2] + "" + s1[1] + "" + s1[0];

       mapa.put("DATA_INICIAL", inicial);
       String[] s2 = jFTFDataFinal.getText().split("/");
       finaly = s2[2] + "" + s2[1] + "" + s2[0];

       mapa.put("DATA_FINAL", finaly);
   }
}