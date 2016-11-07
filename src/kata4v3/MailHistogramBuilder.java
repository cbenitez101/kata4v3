package kata4v3;


import java.util.ArrayList;
import kata4v3.Histogram;

/**
 *
 * @author Servibyte
 */
public class MailHistogramBuilder {

    
    public static Histogram build(ArrayList<String> mail) {
        Histogram histo = new Histogram();
        for (int mail1 = 0; mail1 < mail.length(); mail1++) {
            histo.increment(new Mail(mail1).getDomanin());
        }
        return histo;
    }
}
