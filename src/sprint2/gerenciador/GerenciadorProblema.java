package sprint2.gerenciador;

import java.util.ArrayList;

import sprint2.model.Problema;

public class GerenciadorProblema {
	private ArrayList<Problema> problemas;
	
	public GerenciadorProblema() {
		this.problemas = new ArrayList<Problema>();	
	}
	
	public void adicionarProblema(Problema problema) {
		problemas.add(problema);
	}
	
	public void removerProblema(Problema problema) {
		problemas.remove(problema);
	}
	
	public void listarProblemas() {
		System.out.println("\n*-* LISTA DE PROBLEMAS *-*\n");
		for (Problema problema : problemas) {
			System.out.println("ID: " + problema.getIdProblema());
			System.out.println("Problema: " + problema.getNomeProblema());
			System.out.println("Descrição: " + problema.getDescricaoProblema());
			System.out.println("Categoria: " + problema.getCategoriaProblema());
			System.out.println("Gravidade: " + problema.getGravidadeProblema() + "\n");
		}
	}
	
}
