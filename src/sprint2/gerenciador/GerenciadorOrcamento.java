package sprint2.gerenciador;

import sprint2.model.Orcamento;

public class GerenciadorOrcamento {
	private Orcamento orcamento;
	
	public GerenciadorOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	public void gerarOrcamento() {
		double total = orcamento.getServico().getPreco() + orcamento.getPeca().getPrecoPeca();
		orcamento.setValor_total(total);
	}
	
	public void imprimirOrcamento() {
		System.out.println("\n*-* ORÇAMENTO *-*\n");
		System.out.println("Serviço: " + orcamento.getServico().getDescricao() + ": R$" + orcamento.getServico().getPreco());
		System.out.println("Peça: " + orcamento.getPeca().getNomePeca() + ": R$" + orcamento.getPeca().getPrecoPeca());
		System.out.println("Valor total: R$" + orcamento.getValor_total());
	}
	
	
}
