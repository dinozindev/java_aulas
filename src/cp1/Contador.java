package cp1;

public class Contador {
	private int cont;
	
	public Contador() {
		this.cont = 0;
	}
	
	public void incrementarContador() {
		this.cont++;
	}
	
	public void decrementarContador() {
		this.cont--;
	}
	
	public void zerarContador() {
		this.cont = 0;
	}
	
	public int retornarContador() {
		return this.cont;
	}
	
	// testando a classe
	public static void main(String[] args) {
		Contador contador = new Contador();
		
		System.out.println("Contador: " + contador.retornarContador());
		contador.incrementarContador();
		System.out.println("Contador: " + contador.retornarContador());
		contador.incrementarContador();
		contador.incrementarContador();
		contador.incrementarContador();
		contador.incrementarContador();
		System.out.println("Contador: " + contador.retornarContador());
		contador.decrementarContador();
		System.out.println("Contador: " + contador.retornarContador());
		contador.zerarContador();
		System.out.println("Contador: " + contador.retornarContador());
		
	} 
}
