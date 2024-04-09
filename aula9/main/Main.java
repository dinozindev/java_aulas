package aula9.main;

import aula9.Cliente;
import aula9.Conta;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Carlos", "123.456.789-10");
		
		Conta conta = new Conta("12345-1", c1);
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Saldo: " + conta.getSaldo());
		conta.depositar(1000);
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
