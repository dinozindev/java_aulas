package aula24_singleton;

public class Singleton {
	private static Singleton instancia = null; // neste momento é null
	
	// construtor (privado) --> não é permitido criar objeto fora, classes externas não podem instanciar Singleton. O Singleton é criado pelo método público.
	private Singleton() {
		
	}
	
	// método público
	// caso a instância seja nula, isso significa que o objeto não foi criado ainda, criando uma instância. Caso contrário, retorna a instância existente.
	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
			System.out.println("Objeto Singleton CRIADO!");
		} else {
			System.out.println("Já existe um objeto Singleton criado.");
		}
		return instancia;
	}
}
