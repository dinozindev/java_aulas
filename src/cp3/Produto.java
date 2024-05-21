package cp3;

//RM557886 - Eduardo Dias
//RM554424 - Lucas Kenji

public class Produto {
	private int codigo;
	private String descricao;
	private float preco_unitario;
	
	public Produto() {
		
	}
	
	public Produto(int codigo, String descricao, float preco_unitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco_unitario = preco_unitario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
	public void imprimirDados() {
		System.out.println("Código do produto: " + codigo);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço Unitário: R$" + preco_unitario + "\n");
	}
	
	
}
