package aula19;

public class ColetorIngresso {
	private float valorTotal;
	
	public ColetorIngresso() {
		valorTotal = 0;
	}
	
	public float getValorTotal() {
		return this.valorTotal;
	}
	
	public void receber(Ingresso ingresso) {
		this.valorTotal+=ingresso.calcularValorTotal();
	}
}


