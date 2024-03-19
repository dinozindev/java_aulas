package aula6;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CalculadoraSimples cs = new CalculadoraSimples();
		
		System.out.println("**- Calculadora Simples -**");
		
		int op = cs.menu();
		
		System.out.println("N1: ");
		float n1 = input.nextFloat();
		System.out.println("N2: ");
		float n2 = input.nextFloat();
		
		if (op == 1) {
			System.out.println("Resultado: " + cs.add(n1, n2));
		} else if (op == 2) {
			System.out.println("Resultado: " + cs.sub(n1, n2));
		} else if (op == 3) {
			System.out.println("Resultado: " + cs.multi(n1, n2));
		} else if (op == 4) {
			System.out.println("Resultado: " + cs.div(n1, n2));
		} else {
			System.out.println("Digite uma opção válida.");
		}
	}
}
