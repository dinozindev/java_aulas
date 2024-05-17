package aula17_ArrayListExemplo.model;

// produto q a empresa comercializa, n eh oq vc vende, eh o q esta na prateleira, oq vc esta disponibilizando

public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	// construtor
	public Produto(int id, String nome, double preco) {
		System.out.printf("*-* Produto %s foi Criado!", nome);
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	
	// getters e setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
