package aula17_ArrayListExemplo.model;

// item de produto --> representa a quantidade do produto disponivel
// como se fosse um carrinho --> seleciona o produto e qntd
// pegamos as informações do produto pelo objeto Produto

public class ItemPedido {
	
	// atributos
	private Produto produto;
	private int quantidade;
	
	// construtor
	public ItemPedido(Produto produto, int quantidade) {
		System.out.printf("ItemPedido criado: %s \n", produto.getNome());
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	// metodo operacional
	// retorna valor do produto * quantidade do produto comprado
	public double getSubtotal() {
		return produto.getPreco() * quantidade;
	}
	
	// getters e setters
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
		
}
