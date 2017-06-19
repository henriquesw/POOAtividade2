package questao11;

public class StringUtils {
    
    public static String retiraVogais(String palavra) {
        palavra = palavra.replace("a", "");
        palavra = palavra.replace("e", "");
        palavra = palavra.replace("i", "");
        palavra = palavra.replace("o", "");
        palavra = palavra.replace("u", "");
        
        return palavra;
    }
    
}
