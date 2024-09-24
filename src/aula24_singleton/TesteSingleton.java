package aula24_singleton;

public class TesteSingleton {
	public static void main(String[] args) {
		// criando um objeto Singleton
		Singleton singleton = Singleton.getInstancia();
		Singleton singleton2 = Singleton.getInstancia();
		Singleton singleton3 = Singleton.getInstancia();
		
		// acesso pelo objeto
		System.out.println("Objeto <singleton>: " + singleton);
		System.out.println("Objeto <singleton2>: " + singleton2);
		System.out.println("Objeto <singleton3>: " + singleton3);
	}
}
