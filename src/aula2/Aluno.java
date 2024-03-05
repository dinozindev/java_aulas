package aula2;

public class Aluno {
	// atributos da classe Aluno
	// <encapsulamento> <tipo> <nomeDoAtributo>
	private String rm;
	private String cpf;
	private String nome;
	public String telefone;
	private float mediaGeral;
	
	// metodos da classe
	// metodos getter e setter do rm
	public String getRM() {
		return this.rm;
	}
	
	public void setRM(String newRm) {
		this.rm = newRm;
	}
	
	// metodos cpf
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String newCpf) {
		this.cpf = newCpf;
	}
	
	// metodos nome
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	// metodos mediaGeral
	
	public float getMediaGeral() {
		return this.mediaGeral;
	}
	
	public void setMediaGeral(float newMediaGeral) {
		this.mediaGeral = newMediaGeral;
	}
}
