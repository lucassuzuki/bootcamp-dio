package education.estrutura_repeticao;

public class ExemploBreakeContinue {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i % 2 == 0){
                break;
                //continue;
            }
            System.out.println(i);
        }
    }
}
