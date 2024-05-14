package exercicios_aula10;


public class Contador {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void zerarContador() {
		this.valor = 0;
	}
	
	public void incrementarContador() {
		this.valor++;
	}
	
	public void imprimirContador() {
		System.out.println("Contador: " + getValor());
	}
	
	public static void main(String[] args) {
		Contador contador = new Contador();
		
		contador.imprimirContador();
		contador.incrementarContador();
		contador.imprimirContador();
		contador.incrementarContador();
		contador.incrementarContador();
		contador.incrementarContador();
		contador.imprimirContador();
		contador.zerarContador();
		contador.imprimirContador();
	}
}
