package enums;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.printf("Sigla: %s // Nome: %s", e.getNome(), e.getSigla());
		}
	}
}
