package questao3;

public class Calculadora {

    private String equacao;

    public void setEquacao(String equacao) {
        this.equacao = equacao;
    }
    
    public String calcular(){
        
        double resultado = 0;
        int tamanho = equacao.length();
        
        char[] arrayEquacao = equacao.toCharArray();
        
        for(int i = 0; i < tamanho; i++){
            if(arrayEquacao[i]!='0'&&arrayEquacao[i]!='1'&&arrayEquacao[i]!='2'&&arrayEquacao[i]!='3'&&arrayEquacao[i]!='4'&&arrayEquacao[i]!='5'&&arrayEquacao[i]!='6'&&arrayEquacao[i]!='7'&&arrayEquacao[i]!='8'&&arrayEquacao[i]!='9'&&arrayEquacao[i]!='+'&&arrayEquacao[i]!='-'&&arrayEquacao[i]!='*'&&arrayEquacao[i]!='/'&&arrayEquacao[i]!='.'){
                return "Erro";
            }
        }
        
        for(int i = 0; i < tamanho; i++){
            switch(arrayEquacao[i]){
                case '+':
                    resultado = soma(isolaNumero1(arrayEquacao, i), isolaNumero2(arrayEquacao, i, tamanho));
                    break;
                case '-':
                    resultado = subtrai(isolaNumero1(arrayEquacao, i), isolaNumero2(arrayEquacao, i, tamanho));
                    break;
                case '*':
                    resultado = multiplica(isolaNumero1(arrayEquacao, i), isolaNumero2(arrayEquacao, i, tamanho));
                    break;
                case '/':
                    resultado = divide(isolaNumero1(arrayEquacao, i), isolaNumero2(arrayEquacao, i, tamanho));
                    break;
            }
        }
        
        return ""+resultado;
    }
    
    private double isolaNumero1(char[] equacao, int position){
        char[] numeroChar = new char[position];
        
        for(int i = 0; i < position; i++){
            numeroChar[i] = equacao[i];
        }
        String numero = String.valueOf(numeroChar);
        return Double.parseDouble(numero);
    }
    
    private double isolaNumero2(char[] equacao, int position, int max){
        char[] numeroChar = new char[max-position-1];
        int j = 0;
        for(int i = position+1; i < max; i++){
            numeroChar[j] = equacao[i];
            j++;
        }
        String numero = String.valueOf(numeroChar);
        return Double.parseDouble(numero);
    }
    
    private double soma(double n1, double n2){
        return n1+n2;
    }
    
    private double subtrai(double n1, double n2){
        return n1-n2;
    }
    
    private double multiplica(double n1, double n2){
        return n1*n2;
    }
    
    private double divide(double n1, double n2){
        return n1/n2;
    }
}
