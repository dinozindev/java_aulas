package exercicio_lista1;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Carlos", 53, "Masculino");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Sexo: " + p1.getSexo());
	}
}
