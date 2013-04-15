/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cliente;

import control.ClienteController;
import java.awt.Color;
import java.awt.Frame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.endereco.EnderecoEntity;

/**
 *
 * @author marlon
 */
public class ClienteView extends javax.swing.JDialog {

    /**
     * Creates new form ClienteView
     */
    private ClienteController clienteController;
   
    public ClienteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setTitle("..::Tela de Visualização de Cliente::..");
        initComponents();
        this.clienteController = new ClienteController();
        setLabel();
    }
    
    
    
    
    public void setLabel(){
        /*Coloca os valores do ClienteSelecionado para os Labels do Campo*/
        /*Dados do Cliente*/
            jLId.setText(ClienteController.getClienteSelecionado().getId().toString());
            jLId.setForeground(Color.blue);
            jLNome.setText(ClienteController.getClienteSelecionado().getNome());
            jLNome.setForeground(Color.blue);
            jLCpf.setText(ClienteController.getClienteSelecionado().getCpf().toString());
            jLCpf.setForeground(Color.blue);
            jLRg.setText(ClienteController.getClienteSelecionado().getRg().toString());
            jLRg.setForeground(Color.blue);
            
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                jLData.setText(format.format(ClienteController.getClienteSelecionado().getDataNascimento()));
            jLData.setForeground(Color.blue);
            jLEstadoCivil.setText(ClienteController.getClienteSelecionado().getEstadoCivil().toString());
            jLEstadoCivil.setForeground(Color.blue);

        /*Dados do Contato*/
            jLCelular.setText(ClienteController.getClienteSelecionado().getContato().getCelular().toString());
            jLCelular.setForeground(Color.blue);
            jLResidencial.setText(ClienteController.getClienteSelecionado().getContato().getFoneResidencial().toString());
            jLResidencial.setForeground(Color.blue);
            jLComercial.setText(ClienteController.getClienteSelecionado().getContato().getFoneComercial().toString());
            jLComercial.setForeground(Color.blue);
            jLFax.setText(ClienteController.getClienteSelecionado().getContato().getFax().toString());
            jLFax.setForeground(Color.blue);
            jLEmail.setText(ClienteController.getClienteSelecionado().getContato().getEmail());
            jLEmail.setForeground(Color.blue);
        
        int i = 1;
       for(EnderecoEntity endereco : ClienteController.getClienteSelecionado().getEnderecos()){
           if(i==1){
               setEndereco1(endereco);
           }else if(i==2){
               setEndereco2(endereco);
           }else{
               setEndereco3(endereco);
           }          
           i++;
       }
       
       
       
       
    }
    
    private void setEndereco1(EnderecoEntity endereco){
        jLCep1.setText(endereco.getCep());
        jLTipo1.setText(String.valueOf(endereco.getTipoLogradouro()));
        jLLogradouro1.setText(endereco.getLogradouro());
        jLNumero1.setText(String.valueOf(endereco.getNumero()));
        jLComplemento1.setText(endereco.getComplemento());
        jLBairro1.setText(endereco.getBairro());
        jLMunicipio1.setText(endereco.getMunicipio());
        jLUf1.setText(String.valueOf(endereco.getUf()));
        
        jLCep1.setForeground(Color.blue);
        jLTipo1.setForeground(Color.blue);
        jLLogradouro1.setForeground(Color.blue);
        jLNumero1.setForeground(Color.blue);
        jLComplemento1.setForeground(Color.blue);
        jLBairro1.setForeground(Color.blue);
        jLMunicipio1.setForeground(Color.blue);
        jLUf1.setForeground(Color.blue);
    }
    
    private void setEndereco2(EnderecoEntity endereco){
        jLCep2.setText(endereco.getCep());
        jLTipo2.setText(String.valueOf(endereco.getTipoLogradouro()));
        jLLogradouro2.setText(endereco.getLogradouro());
        jLNumero2.setText(String.valueOf(endereco.getNumero()));
        jLComplemento2.setText(endereco.getComplemento());
        jLBairro2.setText(endereco.getBairro());
        jLMunicipio2.setText(endereco.getMunicipio());
        jLUf2.setText(String.valueOf(endereco.getUf()));
        
        jLCep2.setForeground(Color.blue);
        jLTipo2.setForeground(Color.blue);
        jLLogradouro2.setForeground(Color.blue);
        jLNumero2.setForeground(Color.blue);
        jLComplemento2.setForeground(Color.blue);
        jLBairro2.setForeground(Color.blue);
        jLMunicipio2.setForeground(Color.blue);
        jLUf2.setForeground(Color.blue);
    }
    
    private void setEndereco3(EnderecoEntity endereco){
        jLCep3.setText(endereco.getCep());
        jLTipo3.setText(String.valueOf(endereco.getTipoLogradouro()));
        jLLogradouro3.setText(endereco.getLogradouro());
        jLNumero3.setText(String.valueOf(endereco.getNumero()));
        jLComplemento3.setText(endereco.getComplemento());
        jLBairro3.setText(endereco.getBairro());
        jLMunicipio3.setText(endereco.getMunicipio());
        jLUf3.setText(String.valueOf(endereco.getUf()));
        
        jLCep3.setForeground(Color.blue);
        jLTipo3.setForeground(Color.blue);
        jLLogradouro3.setForeground(Color.blue);
        jLNumero3.setForeground(Color.blue);
        jLComplemento3.setForeground(Color.blue);
        jLBairro3.setForeground(Color.blue);
        jLMunicipio3.setForeground(Color.blue);
        jLUf3.setForeground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        JP = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLCep1 = new javax.swing.JLabel();
        jLTipo1 = new javax.swing.JLabel();
        jLLogradouro1 = new javax.swing.JLabel();
        jLNumero1 = new javax.swing.JLabel();
        jLComplemento1 = new javax.swing.JLabel();
        jLBairro1 = new javax.swing.JLabel();
        jLMunicipio1 = new javax.swing.JLabel();
        jLUf1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLCep2 = new javax.swing.JLabel();
        jLTipo2 = new javax.swing.JLabel();
        jLLogradouro2 = new javax.swing.JLabel();
        jLNumero2 = new javax.swing.JLabel();
        jLComplemento2 = new javax.swing.JLabel();
        jLBairro2 = new javax.swing.JLabel();
        jLMunicipio2 = new javax.swing.JLabel();
        jLUf2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLCep3 = new javax.swing.JLabel();
        jLTipo3 = new javax.swing.JLabel();
        jLLogradouro3 = new javax.swing.JLabel();
        jLNumero3 = new javax.swing.JLabel();
        jLComplemento3 = new javax.swing.JLabel();
        jLBairro3 = new javax.swing.JLabel();
        jLMunicipio3 = new javax.swing.JLabel();
        jLUf3 = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLCpf = new javax.swing.JLabel();
        jLRg = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLEstadoCivil = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jLResidencial = new javax.swing.JLabel();
        jLComercial = new javax.swing.JLabel();
        jLFax = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Data de Nasc. :");

        jLabel5.setText("Estado Civil:");

        jLabel6.setText("Fax:");

        jLabel7.setText("Residencial:");

        jLabel8.setText("Comercial:");

        jLabel10.setText("Email:");

        jLabel11.setText("Celular:");

        jLabel19.setForeground(new java.awt.Color(47, 145, 249));
        jLabel19.setText("Dados Pessoais");

        jLabel20.setForeground(new java.awt.Color(47, 145, 249));
        jLabel20.setText("Contato");

        jLabel21.setForeground(new java.awt.Color(47, 145, 249));
        jLabel21.setText("Endereço");

        JP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPMouseClicked(evt);
            }
        });

        jLabel18.setText("Número:");

        jLabel13.setText("Bairro:");

        jLabel17.setText("Complemento:");

        jLabel22.setText("Município:");

        jLabel23.setText("UF:");

        jLabel9.setText("CEP:");

        jLCep1.setForeground(new java.awt.Color(255, 0, 0));
        jLCep1.setText("Sem Informação");

        jLTipo1.setForeground(new java.awt.Color(255, 0, 0));
        jLTipo1.setText("Sem Informação");

        jLLogradouro1.setForeground(new java.awt.Color(255, 0, 0));
        jLLogradouro1.setText("Sem Informação");

        jLNumero1.setForeground(new java.awt.Color(255, 0, 0));
        jLNumero1.setText("Sem Informação");

        jLComplemento1.setForeground(new java.awt.Color(255, 0, 0));
        jLComplemento1.setText("Sem Informação");

        jLBairro1.setForeground(new java.awt.Color(255, 0, 0));
        jLBairro1.setText("Sem Informação");

        jLMunicipio1.setForeground(new java.awt.Color(255, 0, 0));
        jLMunicipio1.setText("Sem Informação");

        jLUf1.setForeground(new java.awt.Color(255, 0, 0));
        jLUf1.setText("Sem Informação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTipo1)
                        .addGap(18, 18, 18)
                        .addComponent(jLLogradouro1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNumero1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jLComplemento1))
                            .addComponent(jLBairro1))))
                .addGap(0, 160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLMunicipio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLUf1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCep1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipo1)
                    .addComponent(jLLogradouro1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLNumero1)
                    .addComponent(jLabel17)
                    .addComponent(jLComplemento1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLBairro1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLMunicipio1)
                    .addComponent(jLabel23)
                    .addComponent(jLUf1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLCep1))
                .addGap(40, 40, 40))
        );

        JP.addTab("Endereço 01", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setText("Número:");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel55.setText("Bairro:");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel56.setText("Complemento:");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel57.setText("Município:");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel58.setText("UF:");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel59.setText("CEP:");
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLCep2.setText("Sem Informação");
        jPanel2.add(jLCep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLTipo2.setText("Sem Informação");
        jPanel2.add(jLTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLLogradouro2.setText("Sem Informação");
        jPanel2.add(jLLogradouro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLNumero2.setText("Sem Informação");
        jPanel2.add(jLNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLComplemento2.setText("Sem Informação");
        jPanel2.add(jLComplemento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLBairro2.setText("Sem Informação");
        jPanel2.add(jLBairro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLMunicipio2.setText("Sem Informação");
        jPanel2.add(jLMunicipio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLUf2.setText("Sem Informação");
        jPanel2.add(jLUf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        JP.addTab("Endereço 02", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setText("Número:");
        jPanel3.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel70.setText("Bairro:");
        jPanel3.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel71.setText("Complemento:");
        jPanel3.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel72.setText("Município:");
        jPanel3.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel73.setText("UF:");
        jPanel3.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel74.setText("CEP:");
        jPanel3.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLCep3.setText("Sem Informação");
        jPanel3.add(jLCep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLTipo3.setText("Sem Informação");
        jPanel3.add(jLTipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLLogradouro3.setText("Sem Informação");
        jPanel3.add(jLLogradouro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLNumero3.setText("Sem Informação");
        jPanel3.add(jLNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLComplemento3.setText("Sem Informação");
        jPanel3.add(jLComplemento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLBairro3.setText("Sem Informação");
        jPanel3.add(jLBairro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLMunicipio3.setText("Sem Informação");
        jPanel3.add(jLMunicipio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLUf3.setText("Sem Informação");
        jPanel3.add(jLUf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        JP.addTab("Endereço 03", jPanel3);

        jLNome.setForeground(new java.awt.Color(255, 0, 0));
        jLNome.setText("Sem Informação");

        jLCpf.setForeground(new java.awt.Color(255, 0, 0));
        jLCpf.setText("Sem Informação");

        jLRg.setForeground(new java.awt.Color(255, 0, 0));
        jLRg.setText("Sem Informação");

        jLData.setForeground(new java.awt.Color(255, 0, 0));
        jLData.setText("Sem Informação");

        jLEstadoCivil.setForeground(new java.awt.Color(255, 0, 0));
        jLEstadoCivil.setText("Sem Informação");

        jLCelular.setForeground(new java.awt.Color(255, 0, 0));
        jLCelular.setText("Sem Informação");

        jLResidencial.setForeground(new java.awt.Color(255, 0, 0));
        jLResidencial.setText("Sem Informação");

        jLComercial.setForeground(new java.awt.Color(255, 0, 0));
        jLComercial.setText("Sem Informação");

        jLFax.setForeground(new java.awt.Color(255, 0, 0));
        jLFax.setText("Sem Informação");

        jLEmail.setForeground(new java.awt.Color(255, 0, 0));
        jLEmail.setText("Sem Informação");

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jLabel14.setText("Código:");

        jLId.setForeground(new java.awt.Color(255, 0, 0));
        jLId.setText("Sem Informação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jBEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jBFechar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLComercial)
                                                    .addComponent(jLCelular))
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLFax))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLResidencial))))
                                            .addComponent(jLEmail)))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLId))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLEstadoCivil))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNome)
                                    .addComponent(jLCpf))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLRg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLData)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLId))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLCpf)
                    .addComponent(jLabel3)
                    .addComponent(jLRg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLData))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLEstadoCivil)))
                .addGap(24, 24, 24)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLCelular)
                    .addComponent(jLabel7)
                    .addComponent(jLResidencial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLComercial)
                    .addComponent(jLabel6)
                    .addComponent(jLFax))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLEmail))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFechar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMouseClicked

    }//GEN-LAST:event_JPMouseClicked

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        ClienteEditView clienteEditView = new ClienteEditView(new Frame(), true);
        dispose();
        clienteEditView.getCliente();
        clienteEditView.setLocationRelativeTo(null);
        clienteEditView.setVisible(true);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir o Cliente: " + ClienteController.getClienteSelecionado().getNome(), "Excluir Cliente", 2);
            if(opcao == 0){        
                try{
                    this.clienteController.delete(ClienteController.getClienteSelecionado());
                    JOptionPane.showMessageDialog(null, "Cliente Excluído com Sucesso!");
                    dispose();
                }catch (RuntimeException ex){
                     JOptionPane.showMessageDialog(null,"Erro ao Excluir Cliente!","Erro",JOptionPane.ERROR_MESSAGE);                 
                }             
            }
    }//GEN-LAST:event_jBExcluirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JP;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLBairro1;
    private javax.swing.JLabel jLBairro2;
    private javax.swing.JLabel jLBairro3;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCep1;
    private javax.swing.JLabel jLCep2;
    private javax.swing.JLabel jLCep3;
    private javax.swing.JLabel jLComercial;
    private javax.swing.JLabel jLComplemento1;
    private javax.swing.JLabel jLComplemento2;
    private javax.swing.JLabel jLComplemento3;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEstadoCivil;
    private javax.swing.JLabel jLFax;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLLogradouro1;
    private javax.swing.JLabel jLLogradouro2;
    private javax.swing.JLabel jLLogradouro3;
    private javax.swing.JLabel jLMunicipio1;
    private javax.swing.JLabel jLMunicipio2;
    private javax.swing.JLabel jLMunicipio3;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero1;
    private javax.swing.JLabel jLNumero2;
    private javax.swing.JLabel jLNumero3;
    private javax.swing.JLabel jLResidencial;
    private javax.swing.JLabel jLRg;
    private javax.swing.JLabel jLTipo1;
    private javax.swing.JLabel jLTipo2;
    private javax.swing.JLabel jLTipo3;
    private javax.swing.JLabel jLUf1;
    private javax.swing.JLabel jLUf2;
    private javax.swing.JLabel jLUf3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
