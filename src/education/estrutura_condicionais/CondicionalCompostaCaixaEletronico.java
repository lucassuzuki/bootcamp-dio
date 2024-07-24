package education.estrutura_condicionais;

import java.util.Scanner;
import java.util.Locale;

public class CondicionalCompostaCaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o valor a ser sacado: R$");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque de R$" + valorSolicitado + " realizado");
            System.out.println("Seu saldo atual é de R$" + saldo);
        }
        else {
            System.out.println("Valor mencionado superior ao seu saldo atual");
        }
        scanner.close();

        
            
    }
}
