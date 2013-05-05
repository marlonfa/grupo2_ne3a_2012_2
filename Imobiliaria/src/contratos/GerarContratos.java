/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contratos;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Marlon
 */
public class GerarContratos {
    private File file = null;
    
     public void gerarContratoLocacao(
             String nomeLocador, String estadoCivilLocador, 
             String rgLocador, String cpfLocador, 
             String nomeLocatario, String estadoCivilLocatario, 
             String rgLocatario, String cpfLocatario,
             String logradouro, 
             int numero, String bairro, 
             String cep, String cidade, 
             String estado, String dataLocacao, 
             String dataFimLocacao, Float valor) throws Exception{  
        
        this.file =  new File("src/contratos/contratoLocacao.jrxml").getAbsoluteFile();
        Map parametros = new HashMap();
        parametros.put("nomeLocador", nomeLocador); 
        parametros.put("estadoCivilLocador", estadoCivilLocador);
        parametros.put("rgLocador", rgLocador);
        parametros.put("cpfLocador", cpfLocador);
        parametros.put("nomeLocatario", nomeLocatario);
        parametros.put("estadoCivilLocatario", estadoCivilLocatario);
        parametros.put("rgLocatario", rgLocatario);
        parametros.put("cpfLocatario", cpfLocatario);
        parametros.put("logradouro", logradouro);
        parametros.put("numero", numero);
        parametros.put("bairro", bairro);
        parametros.put("cep", cep);
        parametros.put("cidade", cidade);
        parametros.put("estado", estado);
        parametros.put("dataLocacao", dataLocacao);
        parametros.put("dataFimLocacao", dataFimLocacao);
        parametros.put("valor", valor);

        showContrato(parametros, file);
    }  
     
     public void gerarContratoVenda(
             String nomeVendedor, String estadoCivilVendedor, 
             String rgVendedor, String cpfVendedor,
             String nomeComprador, String estadoCivilComprador, 
             String rgComprador, String cpfComprador, 
             String logradouro, int numero, 
             String bairro, String cep, 
             String cidade, String estado, 
             String dataVenda, Float valor) throws Exception{ 
         
            this.file =  new File("src/contratos/contratoVenda.jrxml").getAbsoluteFile();
            Map parametros = new HashMap();
            parametros.put("nomeVendedor", nomeVendedor);
            parametros.put("estadoCivilVendedor", estadoCivilVendedor);
            parametros.put("rgVendedor", rgVendedor);
            parametros.put("cpfVendedor", cpfVendedor);
            parametros.put("nomeComprador", nomeComprador); 
            parametros.put("estadoCivilComprador", estadoCivilComprador);
            parametros.put("rgComprador", rgComprador);
            parametros.put("cpfComprador", cpfComprador);
            parametros.put("logradouro", logradouro);
            parametros.put("numero", numero);
            parametros.put("bairro", bairro);
            parametros.put("cep", cep);
            parametros.put("cidade", cidade);
            parametros.put("estado", estado);
            parametros.put("dataLocacao", dataVenda);
            parametros.put("valor", valor);

            showContrato(parametros, file);
     }
     
     public void showContrato(Map parametros, File file) throws JRException, SQLException{
         JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Contrato", true);   
        viewer.setSize(800,600);   
        viewer.setLocationRelativeTo(null);   
        JasperDesign jd = JRXmlLoader.load(file);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, parametros, DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliaria_db","root","root"));
//        JasperViewer.viewReport(jp, false, new Locale("pt", "BR"));
        JasperViewer jrViewer = new JasperViewer(jp, true);   
        viewer.getContentPane().add((jrViewer).getContentPane());   
        viewer.setVisible(true); 
     }
}
