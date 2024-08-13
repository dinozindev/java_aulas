package aula20_Polimorfismo;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		System.out.println("Saldo: R$" + cc1.getSaldo());
		cc1.depositar(3000);
		System.out.println("Saldo: R$" + cc1.getSaldo());
		cc1.sacar(500);
		System.out.println("Saldo: R$" + cc1.getSaldo());
		
		System.out.println("\n=============================\n");
		
		ContaPoupanca cp1 = new ContaPoupanca();
		System.out.println("Saldo: R$" + cp1.getSaldo());
		cp1.depositar(1000);
		System.out.println("Saldo: R$" + cp1.getSaldo());
		cp1.sacar(500);
		System.out.println("Saldo: R$" + cp1.getSaldo());
		
		System.out.println("\n=============================\n");
		
		GeradorExtratos ge1 = new GeradorExtratos();
		System.out.println("Polimorfismo");
		ge1.geradorConta(cp1);
		ge1.geradorConta(cc1);
		
		cp1.imprimirExtrato();
		cc1.imprimirExtrato();
		
	}
}
