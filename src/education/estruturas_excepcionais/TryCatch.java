package education.estruturas_excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        try {
            System.err.println("----------PROGRAMA PARA TESTES TRYCATCH----------");
        
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Informe o seu nome: ");
            String nome = scanner.next();

            System.out.print("Informe o seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Informe a sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Informe a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + "anos");
            System.out.println("Minha altura é de " + altura + " metros");

        } catch (InputMismatchException e) {
            System.out.println("ERRO - O campo idade deve ser numérico");
            System.out.println("ERRO - O campo altura deve ser numerico e separado por '.'");
        }
        
    }
}
