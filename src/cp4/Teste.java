// Eduardo Guilherme Dias RM557886
// Lucas Kenji Kikuchi RM554424

package cp4;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		ProdutoFisico pf1 = new ProdutoFisico("Maionese", 120.00f, "Acompanhamento para almoço", 0.1f, 0.5f, "verde", "plástico");
		ProdutoFisico pf2 = new ProdutoFisico("Ketchup", 50.00f, "Acompanhamento para almoço", 0.5f, 1.0f, "vermelho", "plástico");
		ProdutoFisico pf3 = new ProdutoFisico("Mostarda", 50.00f, "Acompanhamento para almoço", 0.7f, 3.0f, "amarelo", "plástico");
		ProdutoDigital pd1 = new ProdutoDigital("Pequeno Príncipe", 450.00f, "Livro", 10f, 4.3f, ".pdf");
		ProdutoDigital pd2 = new ProdutoDigital("Curso de Java", 123.00f, "Vídeo de Java", 130.00f, 320.00f, ".mp4");
		ProdutoDigital pd3 = new ProdutoDigital("Curso de SQL", 43.00f, "Vídeo de SQL", 135.00f, 310.00f, ".mp4");
		
		CarrinhoCompras cc = new CarrinhoCompras();
		ArrayList<Produto> cc1 = cc.getCc();
		
		cc1.add(pf1);
		cc1.add(pf2);
		cc1.add(pf3);
		cc1.add(pd1);
		cc1.add(pd2);
		cc1.add(pd3);
		
		pf1.vender(cc1);
		
	}
	
	
	
}

