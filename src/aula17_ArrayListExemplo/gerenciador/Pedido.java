package aula17_ArrayListExemplo.gerenciador;

import java.util.ArrayList;
import java.util.List;

import aula17_ArrayListExemplo.model.ItemPedido;

public class Pedido {
	// atributos
	private int numero_pedido;
	private List<ItemPedido> itens;
	
	// construtor
	public Pedido(int numero_pedido) {
		this.numero_pedido = numero_pedido;
		itens = new ArrayList<ItemPedido>();
	}
	
	public int getNumero() {
		return this.numero_pedido;
	}
	
	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}
	
	// por padrao, o .remove() retorna um boolean. Se conseguiu remover, retorna true, caso contrario retorna false.
	public boolean removerItem(ItemPedido item) {
		return itens.remove(item);
	}
	
	// retorna a lista de itens
	public List<ItemPedido> getItens() {
		return itens;
	}
	
	// itera sobre todo o array de itens, pegando o subtotal de cada item, e adicionando ao valor total.
	public double getValorTotal() {
		double valorTotal = 0;
		for(ItemPedido item : itens) {
			valorTotal += item.getSubtotal();
		}	
		return valorTotal;
	}
	
	
}
