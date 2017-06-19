package questao8;

public class StringUtils {
    
    public static int conta(String palavra, char c) {
        
        int contador = 0;
        
        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i) == c) {
                contador++;
            }
        }
        
        return contador;
    }
    
}
