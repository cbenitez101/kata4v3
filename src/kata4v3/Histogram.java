package kata4v3;

import java.util.HashMap;

/**
 *
 * @author Servibyte
 */
public class Histogram {
    
    HashMap<String, Integer> histograma= new HashMap<>();
    
    public void increment(String clave){
        if (histograma.containsKey(clave)) histograma.put(clave, histograma.get(clave) + 1);
        else histograma.put(clave, 1);
    }

}
