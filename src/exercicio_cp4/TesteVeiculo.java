package exercicio_cp4;

import java.util.ArrayList;

public class TesteVeiculo {
	public static void main(String[] args) {
		ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		Onibus o = new Onibus("Scania", "ABC-1D23", 2009, 90, "Prata");
		Caminhao c = new Caminhao("Mercedes", "DER-3E21", 2012, 4, true);
		listaVeiculos.add(o);
		listaVeiculos.add(c);
		
		for (Veiculo v : listaVeiculos) {
			System.out.println("\n*-* VEICULO " + v.getModelo() + " *-*\n");
			v.exibirDados();
		}
	}
}
