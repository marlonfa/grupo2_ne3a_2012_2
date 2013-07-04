/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.imovel;

import control.ClienteController;
import control.ImovelController;
import java.awt.Color;
import java.awt.Frame;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.imovel.ImovelModalidadeEnum;
import model.imovel.ImovelStatusEnum;
import model.imovel.ImovelTipoEnum;
import model.endereco.EstadoEnum;
import util.FixedLengthDocumentUtil;
import util.MaskUtil;
/**
 *
 * @author marlon e eder
 */
public class ImovelEditView extends javax.swing.JDialog {

    private ImovelView imovelView;
    private ImovelController imovelController;
    private List<String> msgError;
    private MaskUtil mask;

    /**
     * Creates new form ImovelGUI
     */
    public ImovelEditView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setTitle("..::Tela de Cadastro e Edição de Imóvel::..");
        this.imovelController = new ImovelController();
        mask = new MaskUtil();
        initComponents();   
        applyMask();
    }
    
    private void applyMask(){     
        try {
            mask.maskCep(jFTCep);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Digitos inválidos.","Erro",JOptionPane.ERROR_MESSAGE); 
            Logger.getLogger(ImovelEditView.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private String formatString(String string){
        if (string.contains("-")){
            string = string.replaceAll("-", "");
            formatString(string);
        }if(string.contains("_")){
            string = string.replaceAll("\\_", "");
            formatString(string);
        }return string;
    }
    
    public void setFieldCliente(){
        if(ClienteController.getClienteSelecionado() != null){
            this.imovelController.getImovel().setCliente(ClienteController.getClienteSelecionado());
            jTFCliente.setText(this.imovelController.getImovel().getCliente().getNome());
        }        
    }
 
    private void setImovel() {

        this.imovelController.getEndereco().setLogradouro(jTFLogradouro.getText());
        this.imovelController.getEndereco().setNumero(Integer.parseInt(jTFNumero.getText()));
        this.imovelController.getEndereco().setComplemento(jTFComplemento.getText());
        this.imovelController.getEndereco().setBairro(jTFBairro.getText());
        this.imovelController.getEndereco().setMunicipio(jTFCidade.getText());
        this.imovelController.getEndereco().setUf(EstadoEnum.getEnum(jCBUf.getSelectedItem().toString()));
        this.imovelController.getEndereco().setCep(formatString(jFTCep.getText()));

        this.imovelController.getImovel().setDormitorio(Integer.parseInt(jLDormitorios.getText()));
        this.imovelController.getImovel().setModalidade(ImovelModalidadeEnum.getEnum(jCBModalidade.getSelectedItem().toString()));
        this.imovelController.getImovel().setTipo(ImovelTipoEnum.getEnum(jCBTipo.getSelectedItem().toString()));
        this.imovelController.getImovel().setStatus(ImovelStatusEnum.getEnum(jCBStatus.getSelectedItem().toString()));
        this.imovelController.getImovel().setValor(Float.parseFloat(jFTValor.getText()));
        this.imovelController.getImovel().setDescricao(jTADescricao.getText());
    }

    public void getImovel() {

        jTFCodigoImovel.setText(ImovelController.getImovelSelecionado().getId().toString());
        jTFCliente.setText(ImovelController.getImovelSelecionado().getCliente().getNome());
        jTFLogradouro.setText(ImovelController.getImovelSelecionado().getEndereco().getLogradouro());
        jTFNumero.setText(String.valueOf(ImovelController.getImovelSelecionado().getEndereco().getNumero()));
        jTFComplemento.setText(ImovelController.getImovelSelecionado().getEndereco().getComplemento());
        jTFBairro.setText(ImovelController.getImovelSelecionado().getEndereco().getBairro());
        jTFCidade.setText(ImovelController.getImovelSelecionado().getEndereco().getMunicipio());
        jCBUf.setSelectedItem(ImovelController.getImovelSelecionado().getEndereco().getUf());
        jFTCep.setText(ImovelController.getImovelSelecionado().getEndereco().getCep());

        jLDormitorios.setText(String.valueOf(ImovelController.getImovelSelecionado().getDormitorio()));
        jCBModalidade.setSelectedItem(ImovelController.getImovelSelecionado().getModalidade());
        jCBTipo.setSelectedItem(ImovelController.getImovelSelecionado().getTipo());
        jCBStatus.setSelectedItem(ImovelController.getImovelSelecionado().getStatus());
        jFTValor.setText(String.valueOf(ImovelController.getImovelSelecionado().getValor()));
        jTADescricao.setText(ImovelController.getImovelSelecionado().getDescricao());
        
        
        /*Passa o valor do ImovelSelecionado para um Imóvel que já foi instanciado
         Pois na hora de persistir ele persiste um Imóvel e não um ImóvelSelecionado 
         (Isso faz acontecer o UPDATE)*/
       this.imovelController.setImovel(ImovelController.getImovelSelecionado());
    }
    
    public boolean validation(){
        msgError = new ArrayList<>();
        if(jTFCliente.getText().length() <4){
            msgError.add("O Campo Cliente é Obrigatório. \n");
            jLCliente.setForeground(Color.red);
        }else {jLCliente.setForeground(Color.black);}
        
        if(jTFLogradouro.getText().length()<4 || jTFLogradouro.getText().contains(".")){
            msgError.add("O Campo Logradouro é Obrigatório e não pode haver abreviaturas. \n");
            jLLogradouro.setForeground(Color.red);
        }else {jLLogradouro.setForeground(Color.black);}
        
        if(jTFNumero.getText().length()<1){
            msgError.add("O Campo Número é Obrigatório. \n");
            jLNumero.setForeground(Color.red);
        }else {jLNumero.setForeground(Color.black);}
        
        if(jTFBairro.getText().length()<4 || jTFBairro.getText().contains(".")){
            msgError.add("O Campo Bairro é Obrigatório e não pode haver abreviaturas. \n");
            jLBairro.setForeground(Color.red);
        }else {jLBairro.setForeground(Color.black);}
        
        if(jTFCidade.getText().length() < 4|| jTFCidade.getText().contains(".")){
            msgError.add("O Campo Cidade é Obrigatório e não pode haver abreviaturas. \n");
            jLCidade.setForeground(Color.red);
        }else {jLCidade.setForeground(Color.black);}
        
        if(jCBUf.getSelectedItem().toString() == "Selecione"){
            msgError.add("Por Favor Selecione um Estado. \n");
            jLUf.setForeground(Color.red);
        }else {jLUf.setForeground(Color.black);}
        
        if(formatString(jFTCep.getText()).length()<8){
            msgError.add("O Campo CEP é Obrigatório. \n");
            jLCep.setForeground(Color.red);
        }else {jLCep.setForeground(Color.black);}
        
        if(jLDormitorios.getText().length()<1){
            msgError.add("O Campo Número de Dormitórios é Obrigatório. \n");
            jLNDormitorios.setForeground(Color.red);
        }else {jLNDormitorios.setForeground(Color.black);}
        
        if(jCBModalidade.getSelectedItem().toString() == "Selecione"){
            msgError.add("Por Favor Selecione uma Modalidade. \n");
            jLModalidade.setForeground(Color.red);
        }else {jLModalidade.setForeground(Color.black);}
        
        if(jCBTipo.getSelectedItem().toString() == "Selecione"){
            msgError.add("Por Favor Selecione um Tipo. \n");
            jLTipo.setForeground(Color.red);
        }else {jLTipo.setForeground(Color.black);}
        
        if(jCBStatus.getSelectedItem().toString() == "Selecione"){
            msgError.add("Por Favor Selecione um Status. \n");
            jLStatus.setForeground(Color.red);
        }else {jLStatus.setForeground(Color.black);}
        
        if(jFTValor.getText().length()<2){
            msgError.add("O Campo Valor é Obrigatório. \n");
            jLValor.setForeground(Color.red);
        }else {jLValor.setForeground(Color.black);}
        
        if(msgError.size() == 0){
            return true;
        }        
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFCliente = new javax.swing.JTextField();
        jTFLogradouro = new javax.swing.JTextField();
        jCBTipo = new javax.swing.JComboBox();
        jCBStatus = new javax.swing.JComboBox();
        jCBUf = new javax.swing.JComboBox();
        jCBModalidade = new javax.swing.JComboBox();
        jTFNumero = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jLDormitorios = new javax.swing.JTextField();
        jLValor = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jLNDormitorios = new javax.swing.JLabel();
        jLModalidade = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLCep = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLUf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jFTValor = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBOk = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTFCodigoImovel = new javax.swing.JTextField();
        jFTCep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTFCliente.setEditable(false);
        jTFCliente.setEnabled(false);
        jTFCliente.setName(""); // NOI18N

        jTFLogradouro.setDocument(new FixedLengthDocumentUtil(100));

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(ImovelTipoEnum.getTipos()));

        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel(ImovelStatusEnum.getStatus()));

        jCBUf.setModel(new javax.swing.DefaultComboBoxModel(EstadoEnum.getUfs()));

        jCBModalidade.setModel(new javax.swing.DefaultComboBoxModel(ImovelModalidadeEnum.getModalidades()));
        jCBModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBModalidadeActionPerformed(evt);
            }
        });

        jTFNumero.setDocument(new FixedLengthDocumentUtil(6));

        jTFComplemento.setDocument(new FixedLengthDocumentUtil(100));

        jTFBairro.setDocument(new FixedLengthDocumentUtil(70));

        jTFCidade.setDocument(new FixedLengthDocumentUtil(100));

        jLDormitorios.setDocument(new FixedLengthDocumentUtil(3));
        jLDormitorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLDormitoriosActionPerformed(evt);
            }
        });

        jLValor.setText("R$*");

        jLTipo.setText("Tipo*:");

        jLNDormitorios.setText("Núm. Dormitórios*: ");

        jLModalidade.setText("Modalidade*:");

        jLStatus.setText("Status:*");

        jLCliente.setText("Cliente*:");

        jLLogradouro.setText("Logradouro*:");

        jLNumero.setText("Número*:");

        jLabel9.setText("Complemento:");

        jLBairro.setText("Bairro*:");

        jLCidade.setText("Municipio*:");

        jLCep.setText("CEP*:");

        jLabel13.setText("Descrição:");

        jButton1.setText("Procurar");
        jButton1.setToolTipText("Procurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLUf.setText("UF*:");

        jTADescricao.setDocument(new FixedLengthDocumentUtil(300));
        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jScrollPane1.setViewportView(jTADescricao);

        jFTValor.setDocument(new FixedLengthDocumentUtil(9));

        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Endereço do Imóvel:");

        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Descrição do Imóvel:");

        jBOk.setText("Ok");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(1, 1, 1));
        jLabel18.setText("Código:");

        jTFCodigoImovel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel18)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLLogradouro)
                        .addGap(32, 32, 32)
                        .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLNumero)
                        .addGap(32, 32, 32)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNDormitorios)
                        .addGap(32, 32, 32)
                        .addComponent(jLDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLModalidade)
                        .addGap(32, 32, 32)
                        .addComponent(jCBModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(jLTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLStatus)
                        .addGap(32, 32, 32)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLValor)
                        .addGap(18, 18, 18)
                        .addComponent(jFTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLBairro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLCliente)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLCep))
                            .addComponent(jLCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLUf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBUf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFTCep, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(jBOk)
                        .addGap(18, 18, 18)
                        .addComponent(jBFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel18))
                    .addComponent(jTFCodigoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jTFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLLogradouro))
                    .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLNumero))
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLBairro))
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLUf)
                        .addComponent(jLCidade))
                    .addComponent(jCBUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCep)
                    .addComponent(jFTCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel17)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLNDormitorios))
                    .addComponent(jLDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLModalidade)
                            .addComponent(jLTipo))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLStatus)
                            .addComponent(jLValor))))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBOk)
                    .addComponent(jBFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        if(validation()){
             /*Seta os valores dos campos da tela para o objeto imovel e endereco.*/
            setImovel();
            this.imovelController.getImovel().setEndereco(this.imovelController.getEndereco());
            try {
                this.imovelController.create();
                JOptionPane.showMessageDialog(null, "Imóvel Cadastrado com Sucesso!");
                ImovelView view = new ImovelView(new Frame(), true);
                dispose();
                view.setLocationRelativeTo(null);
                view.setVisible(true);
            } catch (RuntimeException ex) {
                 JOptionPane.showMessageDialog(null,"Erro ao Criar Imóvel!","Erro",JOptionPane.ERROR_MESSAGE); 
            }            
        }else{
            JOptionPane.showMessageDialog(null, this.msgError);
        }  
       
    }//GEN-LAST:event_jBOkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClienteSelectView clienteConsulta = new ClienteSelectView(new Frame(), true);
        clienteConsulta.setLocationRelativeTo(null);
        clienteConsulta.setVisible(true);
        setFieldCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBModalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBModalidadeActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jLDormitoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLDormitoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLDormitoriosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBOk;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCBModalidade;
    private javax.swing.JComboBox jCBStatus;
    private javax.swing.JComboBox jCBTipo;
    private javax.swing.JComboBox jCBUf;
    private javax.swing.JFormattedTextField jFTCep;
    private javax.swing.JFormattedTextField jFTValor;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCep;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JTextField jLDormitorios;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLModalidade;
    private javax.swing.JLabel jLNDormitorios;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLUf;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCliente;
    private javax.swing.JTextField jTFCodigoImovel;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFLogradouro;
    private javax.swing.JTextField jTFNumero;
    // End of variables declaration//GEN-END:variables
}
