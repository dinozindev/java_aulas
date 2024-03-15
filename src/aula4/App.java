package aula4;

public class App {
	public static void main(String[] args) {
		
		// objeto criado a partir de um construtor default
		Pessoa p1 = new Pessoa(); 
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Nome: " + p1.getIdade());
		System.out.println("Nome: " + p1.getAltura());
		
		p1.setNome("Carlos");
		p1.setIdade(32);
		p1.setAltura(1.98f);
		
		System.out.println("=============================");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Nome: " + p1.getIdade());
		System.out.println("Nome: " + p1.getAltura());
		
		System.out.println("=============================");
		
		// objeto criado a partir de um construtor com 1 parametro
		
		Pessoa p2 = new Pessoa("Douglas");
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Nome: " + p2.getIdade());
		System.out.println("Nome: " + p2.getAltura());
		
		p2.setIdade(75);
		p2.setAltura(1.65f);
		
		System.out.println("=============================");
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Nome: " + p2.getIdade());
		System.out.println("Nome: " + p2.getAltura());
		
		System.out.println("=============================");
		
		// objeto criado a partir de um construtor com 3 parametros
		Pessoa p3 = new Pessoa("João", 65, 1.80f);
		
		System.out.println("Nome: " + p3.getNome());
		System.out.println("Nome: " + p3.getIdade());
		System.out.println("Nome: " + p3.getAltura());
	}
}
