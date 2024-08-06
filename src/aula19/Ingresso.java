package aula19;

public class Ingresso {
	private float valor;
	
	public Ingresso(float valor) {
		System.out.println("Ingresso Criado!");
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float calcularValorTotal() {
		return this.getValor();
	}
}


