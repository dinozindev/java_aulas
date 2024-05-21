package cp3;

// RM557886 - Eduardo Dias
// RM554424 - Lucas Kenji

public class Teste {
	public static void main(String[] args) {
		Produto produto1 = new Produto(1000, "Banana", 5);
		Produto produto2 = new Produto(1001, "Club Social", 7);
		
		System.out.println("================================");
		System.out.println("*-* Imprimindo Produto 1 *-*\n");
		
		produto1.imprimirDados();
		
		System.out.println("================================");
		
		System.out.println("*-* Imprimindo Produto 2 *-*\n");
		
		produto2.imprimirDados();
		
		ItemComanda ic1 = new ItemComanda(produto1, 2);
		ItemComanda ic2 = new ItemComanda(produto2, 3);
		
		System.out.println("================================");
		
		System.out.println("*-* Imprimindo ItemComanda 1 *-*\n");
		
		ic1.calculaPreco();
		ic1.imprimirItem();
		
		System.out.println("================================");
		
		System.out.println("*-* Imprimindo ItemComanda 2 *-*\n");
		
		ic2.calculaPreco();
		ic2.imprimirItem();
		
		System.out.println("================================");
		
		Comanda c1 = new Comanda();
		c1.registrarItem(ic1);
		c1.registrarItem(ic2);
		
		System.out.println("*-* Imprimindo Comanda *-*\n");
		
		c1.calcularValorTotal();
		c1.imprimirComanda();
		
		System.out.println("================================");
		
		CatalogoProdutos catprod1 = new CatalogoProdutos();
		catprod1.cadastraProduto(produto1);
		catprod1.cadastraProduto(produto2);
		
		Produto produtoAchado = catprod1.buscaProduto(1000);
		System.out.println("*-* Produto Encontrado *-*\n");
		produtoAchado.imprimirDados();
		
		System.out.println("================================");
		
		catprod1.imprimirProdutos();
	}
}
