package aula8;

import java.util.Scanner;

public class Exemplo1_switch_case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dia da semana (1-7): ");
		int dia = input.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Domingo");
				break; // sai do switch case. Caso o caso não seja igual a variável, passa para o próximo.
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default: // comando opcional
				System.out.println("Dia da semana inválido!");
		}
	}
}
