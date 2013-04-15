/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author marlon e eder
 */
public class FixedLengthDocumentUtil extends PlainDocument {
    private int iMaxLength;

    public FixedLengthDocumentUtil(int maxlen)
    {
        super();
        iMaxLength = maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException
    {
        if (str == null)
            return;

        if (iMaxLength <= 0) // aceitara qualquer no. de caracteres
        {
            super.insertString(offset, str, attr);
            return;
        }

        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength) // se o comprimento final for menor...
            super.insertString(offset, str, attr); // ...aceita str
        else
        {
            if (getLength() == iMaxLength)
                return; // nada a fazer
            String newStr = str.substring(0, (iMaxLength - getLength()));

            super.insertString(offset, newStr, attr);
        }
    }
}
