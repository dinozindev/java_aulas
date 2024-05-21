package cp3;

//RM557886 - Eduardo Dias
//RM554424 - Lucas Kenji

import java.util.ArrayList;

public class Comanda {
	private ArrayList<ItemComanda> itens;
	
	public Comanda() {
		itens = new ArrayList<ItemComanda>();
	}
	
	public void registrarItem(ItemComanda item) {
		itens.add(item);
	}
	
	public float calcularValorTotal() {
		float valorTotal = 0;
		for (ItemComanda item: itens) {
			valorTotal+=item.calculaPreco();
		}
		return valorTotal;
	}
	
	public void imprimirComanda() {
		for (ItemComanda item: itens) {
			item.imprimirItem();
			System.out.println("--------------------------------");
		}
		System.out.println("Valor total: R$" + calcularValorTotal());
	}
 }
