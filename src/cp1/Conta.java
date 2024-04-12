package cp1;

public class Conta {
	private String nome;
	private String numConta;
	private float saldo;
	
	public Conta(String nome, String numConta, float saldo) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(float deposito) {
		saldo+=deposito;
	}
	
	public void sacar(float saque) {
		if (saque < saldo) {
			saldo-=saque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void transferir(Conta contaDestino, float valor) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public static void main(String[] args) {
		Conta c1 = new Conta("Carlos", "123456", 6000);
		Conta c2 = new Conta("Fernando", "654321", 4000);
		
		System.out.println("Titular: " + c1.getNome());
		System.out.println("Número da conta: " + c1.getNumConta());
		System.out.println("Saldo: " + c1.getSaldo() + " reais");
		c1.depositar(4000);
		System.out.println("Saldo: " + c1.getSaldo() + " reais");
		c1.sacar(3000);
		System.out.println("Saldo: " + c1.getSaldo() + " reais");
		
		System.out.println("=============================");
		System.out.println("Titular: " + c2.getNome());
		System.out.println("Número da conta: " + c2.getNumConta());
		System.out.println("Saldo: " + c2.getSaldo() + " reais");
		c2.transferir(c1, 3000);
		System.out.println("Saldo Carlos: " + c1.getSaldo() + " reais");
		System.out.println("Saldo Fernando: " + c2.getSaldo() + " reais");
		
	}
	
 }
