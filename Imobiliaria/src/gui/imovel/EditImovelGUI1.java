package gui.imovel;

import dao.ImovelDAO;
import entidade.imovel.ImovelCategoriaEntidade;
import entidade.imovel.ImovelChavesEntidade;
import entidade.imovel.ImovelEntidade;
import entidade.imovel.ImovelEspecEntidade;
import entidade.imovel.ImovelModalidadeEntidade;
import entidade.imovel.ImovelStatusEntidade;
import entidade.imovel.ImovelTipoEntidade;
import entidade.uf.EstadoEntidade;

public class EditImovelGUI1 extends javax.swing.JFrame {
    private ImovelDAO imovelDao;
    private boolean desabilitado = true;
    private ImovelEntidade imovelEntidade = new ImovelEntidade();
    
    public EditImovelGUI1() {
        super.setSize(1000, 1000);
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }
    
    public void imovel(ImovelEntidade imovel){
        this.imovelEntidade = imovel;
        //jCCliente.setSelectedItem(imovel.getCliente);
        jTFEndereco.setText(imovel.getImovelEspec().getEndereco());
        jTFBairro.setText(imovel.getImovelEspec().getBairro());
        jTFCidade.setText(imovel.getImovelEspec().getCidade());
        jTFCep.setText(imovel.getImovelEspec().getCep());
        jCUf.setSelectedItem(imovel.getUf());
        jCTipo.setSelectedItem(imovel.getTipo());
        jCCategoria.setSelectedItem(imovel.getCategoria());
        jCModalidade.setSelectedItem(imovel.getModalidade());
        JCStatus.setSelectedItem(imovel.getStatus());
        jCChaves.setSelectedItem(imovel.getChaves());
        jTFValor.setText(imovel.getValor().toString());
        jTADescricao.setText(imovel.getImovelEspec().getDescricao());
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCCliente = new javax.swing.JComboBox();
        jLCliente = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLDescricao = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jLChaves = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        JCStatus = new javax.swing.JComboBox();
        jCChaves = new javax.swing.JComboBox();
        jTFValor = new javax.swing.JTextField();
        jLEndereco = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLCep = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jLModalidade = new javax.swing.JLabel();
        jCModalidade = new javax.swing.JComboBox();
        jCCategoria = new javax.swing.JComboBox();
        jCTipo = new javax.swing.JComboBox();
        jTFCep = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFEndereco = new javax.swing.JTextField();
        jCUf = new javax.swing.JComboBox();
        jLUf = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Imóvel");
        setResizable(false);

        jCCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCCliente.setToolTipText("Escolha na Lista o Nome do Dono do Imóvel");

        jLCliente.setText("Cliente:");

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/exit.png"))); // NOI18N
        jBSair.setToolTipText("Sair");
        jBSair.setBorderPainted(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Stop.png"))); // NOI18N
        jBCancelar.setToolTipText("Cancelar");
        jBCancelar.setBorderPainted(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/Floppy.png"))); // NOI18N
        jBSalvar.setToolTipText("Salvar");
        jBSalvar.setBorderPainted(false);
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jScrollPane1.setViewportView(jTADescricao);

        jLDescricao.setText("Descrição:");

        jLValor.setText("Valor R$");

        jLChaves.setText("Chaves:");

        jLStatus.setText("Status:");

        JCStatus.setModel(new javax.swing.DefaultComboBoxModel(this.imovelEntidade.getStatus().values()));

        jCChaves.setModel(new javax.swing.DefaultComboBoxModel(this.imovelEntidade.getChaves().values()));

        jLEndereco.setText("Endereço:");

        jLBairro.setText("Bairro:");

        jLCidade.setText("Cidade:");

        jLCep.setText("CEP:");

        jLTipo.setText("Tipo:");

        jLCategoria.setText("Categoria:");

        jLModalidade.setText("Modalidade:");

        jCModalidade.setModel(new javax.swing.DefaultComboBoxModel(this.imovelEntidade.getModalidade().values()));

        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel(this.imovelEntidade.getCategoria().values()));

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel(this.imovelEntidade.getTipo().values()));

        jTFCep.setToolTipText("Digite Aqui o CEP do Imóvel");
        jTFCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCepActionPerformed(evt);
            }
        });

        jTFCidade.setToolTipText("Digite Aqui a Cidade do Imóvel");
        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });

        jTFBairro.setToolTipText("Digite Aqui o Bairro do Imóvel");
        jTFBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroActionPerformed(evt);
            }
        });

        jTFEndereco.setToolTipText("Digite Aqui o Endereço do Imóvel");
        jTFEndereco.setName(""); // NOI18N
        jTFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnderecoActionPerformed(evt);
            }
        });

        jCUf.setModel(new javax.swing.DefaultComboBoxModel(this.imovelEntidade.getUf().values()));
        jCUf.setToolTipText("Escolha na Lista o Estado do Imóvel");

        jLUf.setText("UF:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSair))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEndereco)
                                    .addComponent(jLBairro)
                                    .addComponent(jLCidade)
                                    .addComponent(jLCep)
                                    .addComponent(jLTipo)
                                    .addComponent(jLCategoria)
                                    .addComponent(jLModalidade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(jLUf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFEndereco)
                                            .addComponent(jTFCidade)
                                            .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jCTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCModalidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLStatus)
                                            .addComponent(jLChaves)
                                            .addComponent(jLValor))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLDescricao)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSair)
                    .addComponent(jBCancelar)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCliente)
                            .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLStatus)
                                    .addComponent(JCStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLChaves)
                                    .addComponent(jCChaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLValor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLEndereco)
                                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBairro))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCep))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLUf)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCategoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLModalidade)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void jTFBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroActionPerformed

    private void jTFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnderecoActionPerformed

    private void jTFCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCepActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        //String cliente = (String) jCCliente.getSelectedItem();
        this.imovelEntidade.setImovelEspec(new ImovelEspecEntidade(jTFEndereco.getText(), jTFBairro.getText(), jTFCidade.getText(), jTFCep.getText(), jTADescricao.getText()));
        this.imovelEntidade.setCategoria((ImovelCategoriaEntidade) jCCategoria.getSelectedItem());
        this.imovelEntidade.setModalidade((ImovelModalidadeEntidade) jCModalidade.getSelectedItem());
        this.imovelEntidade.setStatus((ImovelStatusEntidade) JCStatus.getSelectedItem());
        this.imovelEntidade.setChaves((ImovelChavesEntidade) jCChaves.getSelectedItem());
        this.imovelEntidade.setValor(Float.parseFloat(jTFValor.getText()));
        this.imovelEntidade.setUf((EstadoEntidade) jCUf.getSelectedItem());
        this.imovelEntidade.setTipo((ImovelTipoEntidade) jCTipo.getSelectedItem()); 
        imovelDao = new ImovelDAO();
        imovelDao.alterar(this.imovelEntidade); 
        ConsImovelGUI consImovel = new ConsImovelGUI();
        consImovel.atualizarTabela();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
       
    }//GEN-LAST:event_jBCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCStatus;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox jCCategoria;
    private javax.swing.JComboBox jCChaves;
    private javax.swing.JComboBox jCCliente;
    private javax.swing.JComboBox jCModalidade;
    private javax.swing.JComboBox jCTipo;
    private javax.swing.JComboBox jCUf;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCep;
    private javax.swing.JLabel jLChaves;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLModalidade;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLUf;
    private javax.swing.JLabel jLValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCep;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
