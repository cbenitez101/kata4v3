package kata4v3;


import java.util.ArrayList;

/**
 *
 * @author Servibyte
 */
public class MailHistogramBuilder {

    
    public static Histogram build(ArrayList<String> mail) {
        Histogram histo = new Histogram();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomanin());
        }
        System.out.println(histo);
        return histo;
    }
}
