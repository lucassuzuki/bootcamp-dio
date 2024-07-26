package education.estrutura_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalEncadeadaMedia {
    public static void main(String[] args) {


        System.out.println("----------PROGRAMA PARA CALCULO DE MEDIA----------");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double terceiraNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media >= 6 && media < 10){
            System.out.println("Voce foi aprovado com " + media + " de media");
        } else if(media == 10){
            System.out.println("Voce foi aprovado com média maxima!");
        } else if(media > 10){
            System.out.println("Voce informou uma nota superior a 10, portanto media incorreta");
        } else{
            System.out.println("Voce foi Reprovado");
        }


    }
}
