package exercicio1;

public class Vendedor {
	private String nome;
	private int codigo;
	private float preco;
	private int qntd_vendida;
	
	public Vendedor(String nome, int codigo, float preco, int qntd_vendida) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.qntd_vendida = qntd_vendida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQntd_vendida() {
		return qntd_vendida;
	}

	public void setQntd_vendida(int qntd_vendida) {
		this.qntd_vendida = qntd_vendida;
	}
	
	
}
