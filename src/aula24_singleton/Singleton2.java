package aula24_singleton;

public class Singleton2 {

	private static Singleton2 instancia = new Singleton2();
	
	// construtor privado
	private Singleton2() {
		System.out.println("Objeto Singleton CRIADO!");
	}
	
	public static Singleton2 getInstancia() {
		return instancia;
	}
}
