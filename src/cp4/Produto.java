// Eduardo Guilherme Dias RM557886
// Lucas Kenji Kikuchi RM554424

package cp4;

public abstract class Produto {
	private String nome;
	private float preco;
	private String descricao;
	
	public Produto() {
		
	}

	public Produto(String nome, float preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract float calcularValorTotal();

	public abstract String obterDetalhes();
	
}
