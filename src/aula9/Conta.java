package aula9;

public class Conta {
	private String numeroConta;
	private double saldo;
	private Cliente cliente; // atributo para associar a conta a um cliente
	
	public Conta(String numeroConta, Cliente cliente) {
		System.out.println("*-* Conta aberta *-*");
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = 0.0;
	}
	
	public void depositar(double valor) {
		System.out.println("*-* Depositar *-*");
		if (valor > 0) {
			this.saldo+=valor;
		} else {
			System.out.println("Erro: Valor de depósito deve ser positivo.");
		}
	}
	
	public void sacar(double valor) {
		System.out.println("*-* Sacar *-*");
		if (valor <= this.saldo && valor > 0) {
			this.saldo-=valor;
		} else {
			System.out.println("Erro: Valor de saque deve ser menor ou igual ao valor do saldo.");
		}
	}
	
	public double getSaldo() {
		System.out.println("*-* Obter Saldo *-*");
		return this.saldo;
	}
}
