/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.acoes;

import contratos.GerarContratos;
import control.ClienteController;
import control.ImovelController;
import control.VendaController;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.cliente.ClienteEntity;
import model.imovel.ImovelEntity;
import model.imovel.ImovelVendaEntity;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author eder
 */
public class VenderImovelView extends javax.swing.JDialog {
    /**
     * Creates new form ImovelQueryView
     */
    private Session session;
    private ClienteEntity comprador;
    private ClienteEntity vendedor;
    private ImovelEntity imovel;
    public VenderImovelView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setTitle("..::Tela de Venda de Imóvel::..");
        initComponents();
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        jTFData.setText(getDataAtual());
    }
    
    public  String getDataAtual(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
        return formatador.format(new Date());
    }  
    
    public void setFieldCliente(){
        if(ClienteController.getClienteSelecionado() != null){
            jTFLocatarioNome.setText(ClienteController.getClienteSelecionado().getNome());
            jTFLocatarioCPF.setText(ClienteController.getClienteSelecionado().getCpf());
        }        
    }
    
    public void setFieldImovelLocador(){
        if(ImovelController.getImovelSelecionado() != null){
            jTFImovelLogradouro.setText(ImovelController.getImovelSelecionado().getEndereco().getLogradouro());
            jTFImovelNumero.setText(String.valueOf(ImovelController.getImovelSelecionado().getEndereco().getNumero()));
            jTFImovelCEP.setText(ImovelController.getImovelSelecionado().getEndereco().getCep());
            jTFImovelValor.setText(String.valueOf(ImovelController.getImovelSelecionado().getValor()));
            jTFLocadorNome.setText(ImovelController.getImovelSelecionado().getCliente().getNome());
            jTFLocadorCPF.setText(ImovelController.getImovelSelecionado().getCliente().getCpf());
        }        
    }
    
    private ClienteEntity getVendedor(){
        this.vendedor = ImovelController.getImovelSelecionado().getCliente();
        return vendedor;
    }
    
    private void gerarContrato() throws Exception{
        GerarContratos geraContrato = new GerarContratos();
        String dataVenda = jTFData.getText();
        geraContrato.gerarContratoVenda(
                this.vendedor.getNome(), this.vendedor.getEstadoCivil().toString().toLowerCase(), 
                this.vendedor.getRg(), this.vendedor.getCpf(), 
                this.comprador.getNome(), this.comprador.getEstadoCivil().toString().toLowerCase(), 
                this.comprador.getRg(), this.comprador.getCpf(), 
                this.imovel.getEndereco().getLogradouro(), 
                this.imovel.getEndereco().getNumero(), this.imovel.getEndereco().getBairro(), 
                this.imovel.getEndereco().getCep(), this.imovel.getEndereco().getMunicipio(), 
                this.imovel.getEndereco().getUf().toString(), dataVenda, 
                this.imovel.getValor());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBVender = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFLocatarioNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFImovelLogradouro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFLocatarioCPF = new javax.swing.JTextField();
        jTFImovelNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFLocadorNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTFImovelCEP = new javax.swing.JTextField();
        jTFImovelValor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFLocadorCPF = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBVender.setText("Vender");
        jBVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVenderActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jLabel2.setText("Comprador:");

        jTFLocatarioNome.setEditable(false);
        jTFLocatarioNome.setEnabled(false);

        jLabel3.setText("Imóvel:");

        jTFImovelLogradouro.setEditable(false);
        jTFImovelLogradouro.setEnabled(false);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Vendedor:");

        jLabel5.setText("Valor R$");

        jTFLocatarioCPF.setEditable(false);
        jTFLocatarioCPF.setEnabled(false);

        jTFImovelNumero.setEditable(false);
        jTFImovelNumero.setEnabled(false);

        jLabel1.setText("Data:");

        jTFLocadorNome.setEnabled(false);

        jLabel6.setText("Logradouro:");

        jLabel7.setText("Número:");

        jLabel8.setText("Nome:");

        jLabel9.setText("CPF:");

        jLabel10.setText("CEP:");

        jTFImovelCEP.setEditable(false);
        jTFImovelCEP.setEnabled(false);

        jTFImovelValor.setEditable(false);
        jTFImovelValor.setEnabled(false);

        jLabel11.setText("Nome:");

        jLabel12.setText("CPF:");

        jTFLocadorCPF.setEditable(false);
        jTFLocadorCPF.setEnabled(false);

        jTFData.setEditable(false);
        jTFData.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFImovelLogradouro)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTFImovelValor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jTFImovelNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFImovelCEP, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFLocadorNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFLocadorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFLocatarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFLocatarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBVender)
                                .addGap(18, 18, 18)
                                .addComponent(jBFechar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFLocatarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFLocatarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFImovelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFImovelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFImovelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFImovelValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(jTFLocadorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFLocadorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVender)
                    .addComponent(jBFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVenderActionPerformed
        this.comprador = ClienteController.getClienteSelecionado();
        this.imovel = ImovelController.getImovelSelecionado();
        VendaController vendaController = new VendaController();
        ImovelVendaEntity venda = new ImovelVendaEntity();
        venda.setDataContrato(new Date());
        venda.setImovel(ImovelController.getImovelSelecionado());
        venda.setComprador(ClienteController.getClienteSelecionado());
        venda.setVendedor(getVendedor());
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Vender este Imóvel? " , "Alugar Imóvel", 2);
            if(opcao == 0){
                try{
                    vendaController.vender(this.session, venda, ImovelController.getImovelSelecionado());
                    this.session.beginTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Imóvel Vendido com Sucesso!");
                    dispose();
                    try{
                       gerarContrato(); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Erro ao gerar Contrato!","Erro",JOptionPane.ERROR_MESSAGE); 
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Erro ao Vender o Imóvel!","Erro",JOptionPane.ERROR_MESSAGE); 
                    this.session.beginTransaction().rollback();
                }finally{
                    this.session.close();
                }
            }
    }//GEN-LAST:event_jBVenderActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        this.session.beginTransaction().rollback();
        this.session.close();
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClienteSelectView clienteConsulta = new ClienteSelectView(new Frame(), true);
        clienteConsulta.setLocationRelativeTo(null);
        clienteConsulta.setVisible(true);
        setFieldCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ImovelVendaSelectView imovelConsulta = new ImovelVendaSelectView(new Frame(), true);
        imovelConsulta.setLocationRelativeTo(null);
        imovelConsulta.setVisible(true);
        //Trava o imóvel que foi selecionado na tela de ImovelConsulta
        if(ImovelController.getImovelSelecionado() != null){
            this.session.buildLockRequest(LockOptions.UPGRADE).lock(ImovelController.getImovelSelecionado());
        }
        setFieldImovelLocador();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBVender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFImovelCEP;
    private javax.swing.JTextField jTFImovelLogradouro;
    private javax.swing.JTextField jTFImovelNumero;
    private javax.swing.JTextField jTFImovelValor;
    private javax.swing.JTextField jTFLocadorCPF;
    private javax.swing.JTextField jTFLocadorNome;
    private javax.swing.JTextField jTFLocatarioCPF;
    private javax.swing.JTextField jTFLocatarioNome;
    // End of variables declaration//GEN-END:variables
}
