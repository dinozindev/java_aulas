package cp3;

//RM557886 - Eduardo Dias
//RM554424 - Lucas Kenji

public class ItemComanda {
	private Produto produto;
	private int quantidade;
	
	public ItemComanda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public float calculaPreco() {
		return produto.getPreco_unitario() * quantidade;
	}
	
	public void imprimirItem() {
		produto.imprimirDados();
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Subtotal: R$" + calculaPreco() + "\n");
	}
	
}
