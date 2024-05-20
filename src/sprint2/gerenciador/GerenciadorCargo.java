package sprint2.gerenciador;

import java.util.ArrayList;

import sprint2.model.Cargo;

public class GerenciadorCargo {
	private ArrayList<Cargo> cargos;
	
	public GerenciadorCargo() {
		this.cargos = new ArrayList<Cargo>();
	}
	
	public void adicionarCargo(Cargo cargo) {
		cargos.add(cargo);
	}
	
	public void removerCargo(Cargo cargo) {
		cargos.remove(cargo);
	}
	
	public void listarCargos() {
		System.out.println("\n*-* LISTA DE CARGOS *-*\n");
		for (Cargo cargo : cargos) {
			System.out.println("ID: " + cargo.getIdCargo());
			System.out.println("Nome do Cargo: " + cargo.getNomeCargo());
			System.out.println("Descrição: " + cargo.getDescricaoCargo());
			System.out.println("Área do Cargo: " + cargo.getAreaCargo() + "\n");
		}
	}
	
	public Cargo retornaCargo(String nomeCargo) {
        for (Cargo cargo : cargos) {
            if (cargo.getNomeCargo().equalsIgnoreCase(nomeCargo)) {
                return cargo;
            }
        }

        return null;
    }
}
