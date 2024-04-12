package aula9;

public class Cliente {
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		System.out.println("*-* Cliente foi criado *-*");
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
