package questao5;

public class TesteString {

    public static void main(String[] args){
        
        StringUtils u = new StringUtils();

        String str = "Você é muito sã.";

        str = StringUtils.desacentua(str);
        
        System.out.println(str);

    }
}
