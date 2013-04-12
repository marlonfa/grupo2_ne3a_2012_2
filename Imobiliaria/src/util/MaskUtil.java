/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author marlon
 */
public class MaskUtil {
    
    public MaskFormatter maskData(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("##/##/####");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
    
    public MaskFormatter maskCpf(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("###.###.###-##");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
    
}
