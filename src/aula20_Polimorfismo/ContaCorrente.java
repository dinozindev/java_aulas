package aula20_Polimorfismo;

import java.util.Date;

// a ContaCorrente herda a ContaImpl, que por sua vez herda a Interface
public class ContaCorrente extends ContaImpl implements Conta {
	
	private double saldo;
	private double taxaOperacional = 0.5;
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato da Conta Corrente ***");
		System.out.println("=================================");
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + new Date());
	}

	@Override
	public void depositar(double valor) {
		this.saldo+=valor;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo-=valor;
		
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}
}
