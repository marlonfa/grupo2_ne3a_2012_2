/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fearsoft.imobiliaria;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import view.cliente.ClienteEditView;
/**
 *
 * @author marlon
 */
public class Testes {
//    private ClienteEditView cliente;
//    
//    @Before
//    public void setUp(){
//        this.cliente = new ClienteEditView(null, true);
//    }
    
    @Test
    public void testCpf(){
        ClienteEditView cliente = new ClienteEditView(null, true);
        Assert.assertTrue(cliente.isCPF("36693829848"));
    }
    
    @Test
    public void testCpfFalso(){
        ClienteEditView cliente = new ClienteEditView(null, true);
        Assert.assertFalse(cliente.isCPF("12345678901"));
    }
    
    @Test
    public void testEmail(){
        ClienteEditView cliente = new ClienteEditView(null, true);
        Assert.assertTrue(cliente.isEmail("contato@fearsoft.com"));
    }
    
    @Test
    public void testEmailFalso(){
        ClienteEditView cliente = new ClienteEditView(null, true);
        Assert.assertFalse(cliente.isEmail("a@.com"));
    }
    
    
}