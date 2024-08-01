package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa lucas = new Pessoa("123", "lucas");
		
		lucas.setEndereco("Rua Dorothy");
		
		
		System.out.printf("nome: %s e cpf %s", lucas.getNome(), lucas.getCpf());
	}
}
