package kata4v3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Servibyte
 */
public class MailListReader {
    public static ArrayList<String> read (String name) throws FileNotFoundException, IOException{
        ArrayList<String> mailList = new ArrayList<>();
        String mail;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(name)))) {
            while(((mail = reader.readLine()) != null)){
                if(mail.contains("@")) continue;
                mailList.add(mail);
            }
        }
        return mailList;


    }
   
}
