package aula17_ArrayListExemplo;

import aula17_ArrayListExemplo.gerenciador.Pedido;
import aula17_ArrayListExemplo.model.ItemPedido;
import aula17_ArrayListExemplo.model.Produto;

public class App {
	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "Camiseta", 49.99);
		Produto produto2 = new Produto(2, "Calça", 199.99);
		
		ItemPedido item1 = new ItemPedido(produto1, 2);
		ItemPedido item2 = new ItemPedido(produto2, 2);
		
		Pedido pedido = new Pedido(001);
		pedido.adicionarItem(item1);
		pedido.adicionarItem(item2);
		
		System.out.println("======================");
		System.out.println("Número do pedido: " + pedido.getNumero());
		System.out.println("Itens de pedido: ");
		for (ItemPedido item : pedido.getItens()) {
			System.out.println("Produto: " + item.getProduto().getNome());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("Subtotal: " + item.getSubtotal() + "\n");
		}
		System.out.println("Total: " + pedido.getValorTotal());
		
	}
}
