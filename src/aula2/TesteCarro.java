package aula2;

public class TesteCarro {
	public static void main(String[] args) {
		// criando um objeto Carro
		Carro c1 = new Carro("Mercedes", "AMG-GTR", 2021);
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getAno());
	}
}
