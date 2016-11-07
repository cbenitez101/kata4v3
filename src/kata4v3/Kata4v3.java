/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4v3;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Servibyte
 */
public class Kata4v3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String fileName = "emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histo = new HistogramDisplay();
        histo.execute();
    }
    
}
