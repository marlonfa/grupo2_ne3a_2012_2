/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.usuario;

import control.UsuarioController;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.usuario.UsuarioEntity;
import util.FixedLengthDocumentUtil;

/**
 *
 * @author eder
 */
public class UsuarioEditView extends javax.swing.JDialog {

    /**
     * Creates new form UsuarioEditView
     */
    private UsuarioController usuarioController;
    private List lista;
    private boolean existeLogin;
    private boolean cadastro;
    private boolean edit;
    private Long idUsuario;

    public UsuarioEditView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.usuarioController = new UsuarioController();
        initComponents();
        jTFNome.requestFocus();
    }

    public boolean isExisteLogin() {
        return existeLogin;
    }

    public void setExisteLogin(boolean existeLogin) {
        this.existeLogin = existeLogin;
    }

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jLabelConfirmaSenha = new javax.swing.JLabel();
        jPFConfirmaSenha = new javax.swing.JPasswordField();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Cadastro de Usuário");

        jLabelNome.setText("Nome*:");
        jLabelNome.setToolTipText("Campo Obrigatório - Máximo 100 caracteres");

        jTFNome.setDocument(new FixedLengthDocumentUtil(100));

        jLabelLogin.setText("Login*:");
        jLabelLogin.setToolTipText("Campo Obrigatório - Máximo 10 caracteres");

        jTFLogin.setDocument(new FixedLengthDocumentUtil(10));

        jLabelSenha.setText("Senha*:");
        jLabelSenha.setToolTipText("Campo Obrigatório - Máximo 6 caracteres");

        jPFSenha.setDocument(new FixedLengthDocumentUtil(6));

        jLabelConfirmaSenha.setText("Confimar Senha*:");

        jPFConfirmaSenha.setDocument(new FixedLengthDocumentUtil(6));

        jBSalvar.setText("Ok");
        jBSalvar.setToolTipText("Ok");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Fechar");
        jBCancelar.setToolTipText("Cancelar Cadastro");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Código:");

        jLabel1.setText("*Campos Obrigatórios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabelConfirmaSenha)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSenha)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelNome)
                                            .addComponent(jLabelLogin))))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPFConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenha))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelConfirmaSenha)
                        .addComponent(jPFConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:

        this.lista = this.usuarioController.getUsuarioDao().findAll();

        List<String> listaErros = validar();

        showError(listaErros);

        this.setExisteLogin(false);

        existeLogin();

        if (listaErros.isEmpty()) {

            if (!this.jPFSenha.getText().equals(this.jPFConfirmaSenha.getText())) {
                JOptionPane.showMessageDialog(null, "Senha Inválida\nNão Confere!");
            } else if (!this.isExisteLogin() && !this.isEdit()) {
                this.usuarioController = new UsuarioController();
                setAttributes();
                try{
                    this.usuarioController.create(this.usuarioController.getUsuario());
                    this.setCadastro(true);
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
                }catch (RuntimeException ex){
                    JOptionPane.showMessageDialog(null,"Erro ao Criar Usuário!","Erro",JOptionPane.ERROR_MESSAGE); 
                }
                
            } else if (!this.isExisteLogin() && this.isEdit()) {
                setAttributes();
                this.usuarioController.getUsuarioDao().persist(this.usuarioController.getUsuario());
                this.setCadastro(true);
            }
            if (this.isCadastro()) {
                initUsuarioView();
            }
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void showError(List<String> l) {
        if (!l.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String s : l) {
                sb.append(s)
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    private void existeLogin() {
        for (int i = 0; i < this.lista.size(); i++) {
            this.usuarioController.setUsuario((UsuarioEntity) this.lista.get(i));
            if (this.usuarioController.getUsuario().getLogin().equals(jTFLogin.getText())) {
                if (this.isEdit() && this.getIdUsuario() == this.usuarioController.getUsuario().getId()) {
//                    this.setValido(true);
                    break;
                } else {
                    this.existeLogin = true;
//                    this.setValido(false);
                    JOptionPane.showMessageDialog(null, "Login Indisponível:\nJá Cadastrado no Sistema!");
                    break;
                }
            }
        }
    }
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        s1.append("Deseja Cancelar");
        s2.append("Cancelar ");
        
        if(this.isEdit()){
            s1.append(" Edição ");
            s2.append(" Edição ");
        }else{
            s1.append(" Cadastro ");
            s2.append(" Cadastro ");
        }
        s1.append("de Usuário?");
        s2.append("de Usuário");
        String msg = s1.toString();
        String log = s2.toString();
        
        int opcao = JOptionPane.showConfirmDialog(null, msg, log, 2);
        if (opcao == 0)
            dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private List<String> validar() {
        List<String> lista = new ArrayList<String>(3);

        if (this.jTFNome.getText().trim().equals("")
                || this.jTFNome.getText().length() < 3
                || this.jTFNome.getText().contains(".")
                || this.jTFNome.getText().length() > 100) {

            lista.add("O Campo Nome é Obrigatório e não pode haver abreviaturas. \n");
            this.jLabelNome.setForeground(Color.red);
        } else {
            this.jLabelNome.setForeground(Color.BLACK);
        }

        if (this.jTFLogin.getText().trim().equals("")
                || this.jTFLogin.getText().length() > 10) {

            lista.add("O Campo Login é Obrigatório. \n");
            this.jLabelLogin.setForeground(Color.red);
        } else {
            this.jLabelLogin.setForeground(Color.BLACK);
        }

        if (this.jPFSenha.getText().trim().equals("")
                || this.jPFSenha.getText().length() > 6
                || this.jPFConfirmaSenha.getText().equals("")) {

            lista.add("Senha Inválida. \n");
            this.jLabelSenha.setForeground(Color.red);
            this.jLabelConfirmaSenha.setForeground(Color.red);
        } else {
            this.jLabelSenha.setForeground(Color.BLACK);
        }
        return lista;
    }

    private void initUsuarioView() {
        UsuarioView view = new UsuarioView(new Frame(), true);
        dispose();
        view.setLocationRelativeTo(null);
        view.setValues(this.usuarioController);
        this.setCadastro(false);
        view.setVisible(true);
    }

    public void setValues(UsuarioController usuario) {
        this.usuarioController.setUsuario(usuario.getUsuario());

        jLCodigo.setText(this.usuarioController.getUsuario().getId().toString());

        jTFNome.setText(this.usuarioController.getUsuario().getNome());
        jTFLogin.setText(this.usuarioController.getUsuario().getLogin());
        jPFSenha.setText(this.usuarioController.getUsuario().getSenha());

        getValueId();
    }

    private void getValueId(){
        this.idUsuario = this.usuarioController.getUsuario().getId();
    }
    
    private void setAttributes() {
        this.usuarioController.getUsuario().setNome(jTFNome.getText());
        this.usuarioController.getUsuario().setLogin(jTFLogin.getText());
        this.usuarioController.getUsuario().setSenha(jPFSenha.getText());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelConfirmaSenha;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPFConfirmaSenha;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
