package aula15_arrayObjetos.model;

public class Contato {
	// atributos
	private String nome;
	private String telefone;
	
	// construtor
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// metodo auxiliar - toString()
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
	}
}
