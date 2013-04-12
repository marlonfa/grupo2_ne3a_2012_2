/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ClienteDao;
import java.util.ArrayList;
import java.util.List;
import model.cliente.ClienteEntity;
import model.cliente.ContatoEntity;
import model.endereco.EnderecoEntity;

/**
 *
 * @author marlon
 */
public class ClienteController {
    private ClienteDao clienteDao;
    private ClienteEntity cliente;
    private ContatoEntity contato;
    private EnderecoEntity endereco;    
    private static ClienteEntity clienteSelecionado;

    public ClienteController() {
        initObjects();
    }    
    
    private void initObjects(){
        this.clienteDao = new ClienteDao();
        this.cliente = new ClienteEntity();
        this.contato = new ContatoEntity();
        this.endereco = new EnderecoEntity();
    }

    public static ClienteEntity getClienteSelecionado() {
        return clienteSelecionado;
    }

    public static void setClienteSelecionado(ClienteEntity clienteSelecionado) {
        ClienteController.clienteSelecionado = clienteSelecionado;
    }

    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public ContatoEntity getContato() {
        return contato;
    }

    public EnderecoEntity getEndereco() {
        return endereco;
    }
   
    public void create(){
        ClienteController.setClienteSelecionado(this.cliente);
        this.clienteDao.persist(cliente);
        
    }
    
    public void delete(ClienteEntity cliente) throws RuntimeException{
        clienteDao.delete(cliente);
    }
    
    public List<ClienteEntity> findCpf(String parametro){
        return clienteDao.findFilter("cpf", parametro);
    }
    
    public List<ClienteEntity> findNome(String parametro){
        return clienteDao.findFilter("nome", parametro);
    }

    public List<ClienteEntity> findAll(){
        return this.clienteDao.findAll();
    }
    
    public void newEndereco(){
        this.endereco = new EnderecoEntity();
    }

}
