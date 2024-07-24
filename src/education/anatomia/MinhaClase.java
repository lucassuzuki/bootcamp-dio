package education.anatomia;
public class MinhaClase {
    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Suzuki";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
