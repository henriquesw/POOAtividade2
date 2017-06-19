package questao5;

public class StringUtils {
    
    public static String desacentua(String palavra) {
        
        char arrayChar[] = new char[100];
        arrayChar = palavra.toCharArray();
        
        for(int i = 0; i < palavra.length(); i++){
            switch(palavra.charAt(i)){
                case 'á':
                    arrayChar[i] = 'a';
                    break;
                case 'à':
                    arrayChar[i] = 'a';
                    break;
                case 'ã':
                    arrayChar[i] = 'a';
                    break;
                case 'é':
                    arrayChar[i] = 'e';
                    break;
                case 'ê':
                    arrayChar[i] = 'e';
                    break;
                case 'õ':
                    arrayChar[i] = 'o';
                    break;
                case 'ó':
                    arrayChar[i] = 'o';
                    break;
                case 'ô':
                    arrayChar[i] = 'o';
                    break;
                case 'ç':
                    arrayChar[i] = 'c';
                    break;
                case 'Á':
                    arrayChar[i] = 'A';
                    break;
                case 'À':
                    arrayChar[i] = 'A';
                    break;
                case 'Ã':
                    arrayChar[i] = 'A';
                    break;
                case 'É':
                    arrayChar[i] = 'E';
                    break;
                case 'Ê':
                    arrayChar[i] = 'E';
                    break;
                case 'Õ':
                    arrayChar[i] = 'O';
                    break;
                case 'Ó':
                    arrayChar[i] = 'O';
                    break;
                case 'Ô':
                    arrayChar[i] = 'O';
                    break;
                case 'Ç':
                    arrayChar[i] = 'C';
                    break;
            }
        }
        
        palavra = String.valueOf(arrayChar);
        
        return palavra;
    }
    
}
