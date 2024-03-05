package aula2;

public class TesteAluno {
	// metodo principal
	public static void main (String[] args) {
		// criacao do objeto aluno
		Aluno a1 = new Aluno();
		
		// settando as informacoes de cada atributo
		a1.setRM("RM123456");
		a1.setCpf("123.456.789-12");
		a1.setNome("Marcos");
		a1.telefone = "232341"; // atributo publico
		a1.setMediaGeral(8.9f);
		
		// imprimindo o valor dos atributos a partir dos getters
		System.out.print("RM: " + a1.getRM());
		System.out.print("CPF: " + a1.getCpf());
		System.out.print("Nome" + a1.getNome());
		System.out.print("Telefone: " + a1.telefone);
		System.out.print("Media geral: " + a1.getMediaGeral());
	}
}
