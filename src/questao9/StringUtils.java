package questao9;

public class StringUtils {
    
    public static String reverte(String palavra) {
        String aux = "";
        for(int i = palavra.length(); i > 0; i--) {
            aux = aux + palavra.charAt(i-1);
        }
        
        return aux;
    }
    
}
