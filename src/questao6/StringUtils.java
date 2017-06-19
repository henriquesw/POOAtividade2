package questao6;

public class StringUtils {
    
    public static String alinhaDireita(String palavra, int i){
        
        for(int j = palavra.length(); j < i; j++) {
            palavra = palavra + " ";
        }
        
        return palavra;
    }
            
    public static String alinhaEsquerda(String palavra, int i) {
        
        for(int j = palavra.length(); j < i; j++) {
            palavra = " " + palavra;
        }
        
        return palavra;
    }
    
}
