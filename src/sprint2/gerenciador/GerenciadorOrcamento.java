package sprint2.gerenciador;

import sprint2.model.Orcamento;
import sprint2.model.Peca;
import sprint2.model.Servico;

public class GerenciadorOrcamento {
	private Orcamento orcamento;
	
	public GerenciadorOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	public void gerarOrcamento(Servico servico, Peca peca) {
		double total = servico.getPreco() + peca.getPrecoPeca();
		orcamento.setValor_total(total);
		
		System.out.println("\n*-* ORÇAMENTO *-*\n");
		System.out.println("Valor serviço: " + servico.getPreco());
		System.out.println("Valor peça: " + peca.getPrecoPeca());
		System.out.println("Valor total: " + total);
	}
	
	
}
