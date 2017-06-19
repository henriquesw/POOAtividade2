package questao1;

import java.util.Random;

public class Dado {
    private int numeroDeLados = 6;
    
    public int rodar(){
        
        Random random = new Random();
        return random.nextInt((6 - 1) + 1) + 1;
                
    }
    
}
