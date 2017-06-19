package questao7;

public class StringUtils {
    
    public static String replica(String palavra, int i) {
        
        String aux = "";
        
        for(int j = 0; j < i; j++) {
            aux = aux + palavra;
        }
        
        return aux;
    }
    
}
