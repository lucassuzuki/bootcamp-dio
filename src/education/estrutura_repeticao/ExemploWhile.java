package education.estrutura_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        Double mesada = 50.0;
        while (mesada > 0) {
           Double valorDoce = valorAleatorio();
           if(valorDoce>mesada){
            valorDoce = mesada;
           }
           System.out.println("Doce do valor: R$" + valorDoce + " Adicionado ao carrinho");
           
           mesada = mesada - valorDoce;
           System.out.println("Ainda resta: R$ " + mesada);
        }

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
