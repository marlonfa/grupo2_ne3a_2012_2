/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import java.awt.HeadlessException;
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
 * @author eder
 */
public class GerarRelatorios {

    public void gerarRelatorioLocacao(File file) throws Exception {
        porData(file, null);
    }

    public void gerarRelatorioLocacaoPorData(File file, Map mapa) throws Exception {
        porData(file, mapa);
    }
    
    public void gerarRelatorioVenda(File file) throws Exception {
        porData(file, null);
    }

    public void gerarRelatorioVendaPorData(File file, Map mapa) throws Exception {
        porData(file, mapa);
    }

    private void porData(File file, Map mapa) throws HeadlessException, JRException, SQLException {
        JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", true);
        viewer.setSize(800, 600);
        viewer.setLocationRelativeTo(null);
        JasperDesign jd = JRXmlLoader.load(file);
        JasperReport jr = JasperCompileManager.compileReport(jd);
        JasperPrint jp = JasperFillManager.fillReport(jr, mapa, DriverManager.getConnection("jdbc:mysql://localhost:3306/imobiliaria_db", "root", "root"));
//        JasperViewer.viewReport(jp, false, new Locale("pt", "BR"));
        JasperViewer jrViewer = new JasperViewer(jp, true);
        viewer.getContentPane().add((jrViewer).getContentPane());
        viewer.setVisible(true);
    }
}
