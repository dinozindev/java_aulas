package aula8;

import java.util.Scanner;

public class Exemplo2_switch_case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Final da placa: ");
		byte finalPlaca = input.nextByte();
		
		switch(finalPlaca) {
			case 1:
			case 2:
				System.out.println("Rodízio SEGUNDA-FEIRA");
				break;
			case 3:
			case 4:
				System.out.println("Rodízio TERÇA-FEIRA");
				break;
			case 5:
			case 6:
				System.out.println("Rodízio QUARTA-FEIRA");
				break;
			case 7:
			case 8:
				System.out.println("Rodízio QUINTA-FEIRA");
				break;
			case 9:
			case 0:
				System.out.println("Rodízio SEXTA-FEIRA");
				break;
			default:
				System.out.println("Final de placa inválido!");
				
		}
	}
}
