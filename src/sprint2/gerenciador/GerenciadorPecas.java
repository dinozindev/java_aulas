package sprint2.gerenciador;

import java.util.ArrayList;

import sprint2.model.Peca;

public class GerenciadorPecas {
	private ArrayList<Peca> pecas;
	
	public GerenciadorPecas() {
		this.pecas = new ArrayList<Peca>();
	}
	
	public void alterarDisponibilidade(Peca peca, boolean disponibilidade) {
		peca.setDisponibilidade(disponibilidade);
		System.out.println("Disponibilidade da peça " + peca.getNomePeca() + " alterada com sucesso.");
	}
	
	public void adicionarPeca(Peca peca) {
		pecas.add(peca);
		// System.out.println("Peça adicionada com sucesso.");
	}
	
	public void removerPeca(Peca peca) {
		pecas.remove(peca);
		System.out.println("Peça removida com sucesso.");
	}
	
	public void listarPecas() {
		System.out.println("\n*-* LISTA DE PEÇAS *-*\n");
		for (Peca peca : this.pecas) {
			System.out.println(peca.toString());
		}
	}
}
