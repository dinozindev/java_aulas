package aula20_Polimorfismo;

// essa classe não pode ser instanciada, apenas herdada
public abstract class ContaImpl {
	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void imprimirExtrato();
}
