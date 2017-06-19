package questao2;

public class Carta {
    
    private int carta;
    private int naipe;
    
    Carta(int carta, int naipe) {
        this.carta = carta;
        this.naipe = naipe;
    }
    
    @Override
    public String toString(){
        
        String numero = "";
        String naipe = "";
        
        switch (this.carta){
            case 1:
                numero = "ás";
                break;
            case 2:
                numero = "dois";
                break;
            case 3:
                numero = "três";
                break;
            case 4:
                numero = "quatro";
                break;
            case 5:
                numero = "cinco";
                break;
            case 6:
                numero = "seis";
                break;
            case 7:
                numero = "sete";
                break;
            case 8:
                numero = "oito";
                break;
            case 9:
                numero = "nove";
                break;
            case 10:
                numero = "dez";
                break;
            case 11:
                numero = "valete";
                break;
            case 12:
                numero = "rainha";
                break;
            case 13:
                numero = "rei";
                break;
        }
        
        switch (this.naipe){
            case 1:
                naipe = "ouros";
                break;
            case 2:
                naipe = "paus";
                break;
            case 3:
                naipe = "copas";
                break;
            case 4:
                naipe = "espadas";
                break;
        }
        
        return ("A carta é " + numero + " de " + naipe);
    }
    
}
