package util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author marlon e eder
 */
public class ConfigHibernateUtil {

    private File file;
    private Properties properties;
    private FileOutputStream fos;
    
    private String driver;
    private String url;
    private String username;
    private String password;
    private String showSQL;
    private String formatSQL;
    private String dialect;
    private String hdm2ddl;
    
   
    public void lerProperties() {

        file = new File("conf/hibernate.properties").getAbsoluteFile();
        properties = new Properties();

        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setDialect(this.properties.getProperty("hibernate.dialect"));
        this.setDriver(this.properties.getProperty("hibernate.connection.driver_class"));
        this.setUrl(this.properties.getProperty("hibernate.connection.url"));
        this.setUsername(this.properties.getProperty("hibernate.connection.username"));
        this.setPassword(this.properties.getProperty("hibernate.connection.password"));
        this.setShowSQL(this.properties.getProperty("hibernate.show_sql"));
        this.setFormatSQL(this.properties.getProperty("hibernate.format_sql"));
        this.setHdm2ddl(this.properties.getProperty("hibernate.hbm2ddl.auto"));
    }

    public void gravarProperties() {
        fos = null;
        
        this.properties.setProperty("hibernate.dialect", this.getDialect());
        this.properties.setProperty("hibernate.connection.driver_class", this.getDriver());
        this.properties.setProperty("hibernate.connection.url", this.getUrl());
        this.properties.setProperty("hibernate.connection.username", this.getUsername());
        this.properties.setProperty("hibernate.connection.password", this.getPassword());
        this.properties.setProperty("hibernate.show_sql", this.getShowSQL());
        this.properties.setProperty("hibernate.format_sql", this.getFormatSQL());
        this.properties.setProperty("hibernate.hbm2ddl.auto", this.getHdm2ddl());
        
        try {
            fos = new FileOutputStream(file);
            //grava os dados  no arquivo  
            properties.store(fos, "Configurações Alteradas:");
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShowSQL() {
        return showSQL;
    }

    public void setShowSQL(String showSQL) {
        this.showSQL = showSQL;
    }

    public String getFormatSQL() {
        return formatSQL;
    }

    public void setFormatSQL(String formatSQL) {
        this.formatSQL = formatSQL;
    }

    public String getHdm2ddl() {
        return hdm2ddl;
    }

    public void setHdm2ddl(String hdm2ddl) {
        this.hdm2ddl = hdm2ddl;
    }
}