package kata4v3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Servibyte
 */
public class Histogram<T> {
    
    Map<T, Integer> histograma= new HashMap<>();
    
    public void increment(T clave){
        if (histograma.containsKey(clave)) histograma.put(clave, histograma.get(clave) + 1);
        else histograma.put(clave, 1);
    }

}
