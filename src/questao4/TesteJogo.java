package questao4;

public class TesteJogo {
    
    public static void main(String[] args){
        
        Tabela tabuleiro = new Tabela();
        
        tabuleiro.jogaO(0, 0);
        tabuleiro.jogaX(1, 2);
        tabuleiro.jogaX(1, 2);
        tabuleiro.jogaO(0, 1);
        tabuleiro.jogaO(0, 2);
        
    }
    
}
