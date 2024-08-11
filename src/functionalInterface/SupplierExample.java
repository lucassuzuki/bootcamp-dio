package functionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {

        List<String> listaSaudacao = Stream.generate(() ->"Olá seja bem vindo").limit(5).toList();

        listaSaudacao.forEach(System.out::println);
    }
}
