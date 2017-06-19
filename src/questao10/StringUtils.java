package questao10;

public class StringUtils {
    
    public static int quantasVezes(String palavra, String silaba) {
        
        int comprimentoSilaba = silaba.length();
        int comprimentoPalavra = palavra.length();
        int contador = 0; 
        
        for(int i = 0; i < comprimentoPalavra + 1 - comprimentoSilaba; i++) {
            int cont = 0;
            for(int j = i; j < i + comprimentoSilaba; j++){
                if(palavra.charAt(j) == silaba.charAt(cont)) {
                    cont++;
                }
            }
            if(cont == comprimentoSilaba){ 
                contador++;
            }
        }
        
        return contador;
        
    }
    
}
