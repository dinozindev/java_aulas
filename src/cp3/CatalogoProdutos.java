package cp3;

//RM557886 - Eduardo Dias
//RM554424 - Lucas Kenji

import java.util.ArrayList;

public class CatalogoProdutos {
	private ArrayList<Produto> produtos;
	
	public CatalogoProdutos() {
		produtos = new ArrayList<Produto>();
	}
	
	public void cadastraProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public Produto buscaProduto(int codigo) {
		Produto produtoEncontrado = new Produto();
		for (Produto produto: produtos) {
			if (produto.getCodigo() == codigo) {
				produtoEncontrado = produto;
				break;
			} else {
				continue;
			}
		}
		return produtoEncontrado;
	}
	
	public void imprimirProdutos() {
		System.out.println("*-* Catálogo de Produtos *-*\n");
		for (Produto produto: produtos) {
			System.out.println("--------------------------------\n");
			produto.imprimirDados();
		}
	}
	
 }
