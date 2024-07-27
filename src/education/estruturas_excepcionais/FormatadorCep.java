package education.estruturas_excepcionais;

import java.util.Locale;
import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {

            System.out.print("Informe o CEP - somente números: ");
            String cepInput = scanner.nextLine();
            String cepFormatado = formatarCep(cepInput);
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcepcion e) {

            System.out.println("CEP invalido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExcepcion{
        if(cep.length() != 8){
            throw new CepInvalidoExcepcion();
        }
        return cep;
    }
}
