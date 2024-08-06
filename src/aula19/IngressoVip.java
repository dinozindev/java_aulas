package aula19;

public class IngressoVip extends Ingresso {
	private float valorAdicional;
	
	public IngressoVip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
		System.out.println("Ingresso VIP criado!");
		
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public float calcularValorTotal() {
		return super.getValor() + this.getValorAdicional();
	}
}
