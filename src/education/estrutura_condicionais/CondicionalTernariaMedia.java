package education.estrutura_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernariaMedia {
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

        String resultado = media >= 6 ? "aprovado" : "Reprovado";
        System.out.println(resultado);

    }
}
