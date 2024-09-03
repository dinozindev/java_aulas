package exercicio2_cp4;

import java.util.ArrayList;

public class TesteEx2 {
	public static void main(String[] args) {
		ArrayList<Imprimir> listaVeiculos = new ArrayList<Imprimir>();
		Onibus o = new Onibus("Scania", "ABC-1D23", 2009, 90, "Prata");
		Caminhao c = new Caminhao("Mercedes", "DER-3E21", 2012, 4, true);
		listaVeiculos.add(o);
		listaVeiculos.add(c);
		
		for (Imprimir v : listaVeiculos) {
			v.exibirDados();
		}
	}
	
}
