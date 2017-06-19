package questao4;

public class Tabela {
    
    private char tabela[][] = new char[3][3];
    
    Tabela(){
        this.tabela[0][0] = ' ';
        this.tabela[0][1] = ' ';
        this.tabela[0][2] = ' ';
        this.tabela[1][0] = ' ';
        this.tabela[1][1] = ' ';
        this.tabela[1][2] = ' ';
        this.tabela[2][0] = ' ';
        this.tabela[2][1] = ' ';
        this.tabela[2][2] = ' ';
    }
    
    public void jogaO(int i, int j){
        if(this.tabela[i][j] == ' ')
            this.tabela[i][j] = 'O';
        else
            System.out.println("Já possui marcação.");
        if(this.verifica()){
            System.out.println("Parabéns o O ganhou!");
        }
        System.out.println(this.toString());
    }
    
    public void jogaX(int i, int j){
        if(this.tabela[i][j] == ' ')
            this.tabela[i][j] = 'X';
        else
            System.out.println("Já possui marcação.");
        if(this.verifica()){
            System.out.println("Parabéns o X ganhou!");
        }
        System.out.println(this.toString());
    }
    
    public boolean verifica(){
        for(int i = 0; i < 3; i++){
            if(this.tabela[i][0] == this.tabela[i][1] && this.tabela[i][0] == this.tabela[i][2] && this.tabela[i][0] != ' ')
                return true;
            if(this.tabela[0][i] == this.tabela[1][i] && this.tabela[0][i] == this.tabela[2][i] && this.tabela[i][0] != ' ')
                return true;
        }
        if(this.tabela[0][0] == this.tabela[1][1] && this.tabela[0][0] == this.tabela[2][2] && this.tabela[0][0] != ' ')
            return true;
        if(this.tabela[0][2] == this.tabela[1][1] && this.tabela[0][2] == this.tabela[2][0] && this.tabela[0][2] != ' ')
            return true;
        
        return false;
    }
    
    public boolean verificaEmpate(){
        int teste = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(this.tabela[i][j] != ' '){
                    teste++;
                }
            }
        }
        if(teste == 9)
            return true;
        return false;
    }
    
    @Override
    public String toString(){
        return (this.tabela[0][0]+"|"+this.tabela[0][1]+"|"+this.tabela[0][2]+"\n-----\n"+this.tabela[1][0]+"|"+this.tabela[1][1]+"|"+this.tabela[1][2]+"\n-----\n"+this.tabela[2][0]+"|"+this.tabela[2][1]+"|"+this.tabela[2][2]+"\n______________________\n");
    }
    
}
