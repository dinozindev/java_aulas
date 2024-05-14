package aula16_Heranca.main;

import aula16_Heranca.model.Carro;
import aula16_Heranca.model.Moto;

public class App {
	public static void main(String[] args) {
		Carro carro = new Carro("GM", "Celta TURBO", 2000, 2);
		Moto moto = new Moto("Honda", "R1", 2024, true);
		
		carro.exibirDetalhes();
		System.out.println("========================");
		moto.exibirDetalhes();
	}
	
}
