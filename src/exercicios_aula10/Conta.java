package exercicios_aula10;

public class Conta {
	private String nome;
	private String n_conta;
	private float saldo;
	
	public Conta(String nome, String n_conta, float saldo) {
		this.nome = nome;
		this.n_conta = n_conta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getN_conta() {
		return n_conta;
	}


	public void setN_conta(String n_conta) {
		this.n_conta = n_conta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public void depositar(float valorDeposito) {
		this.saldo+=valorDeposito;
	}
	
	public void sacar(float valorSaque) {
		this.saldo-=valorSaque;
	}
	
	public static void main(String[] args) {
		Conta conta = new Conta("Carlos", "13213", 20000);
		
		System.out.println(conta.getSaldo());
		conta.depositar(30000);
		System.out.println(conta.getSaldo());
		conta.sacar(25000);
		System.out.println(conta.getSaldo());
			
	}
}
