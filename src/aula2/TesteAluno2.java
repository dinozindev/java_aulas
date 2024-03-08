package aula2;

public class TesteAluno2 {
	public static void main (String[] args) {
		// chamando o Construtor parametrizado.
		Aluno a2 = new Aluno("RM123123", "123.321.543-09", "Josue", 4);
		System.out.println("Rm: " + a2.getRM());
		System.out.println("CPF: " + a2.getCpf());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Media Geral: " + a2.getMediaGeral());
	}
}
