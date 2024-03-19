package aula6;

import java.util.Scanner;

public class CalculadoraSimples {
	private Scanner input;
	
	public int menu() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("*-- Menu --*");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Opção: ");
		int op = input.nextInt();
		return op;
	}
	
	public float add(float n1, float n2) {
		System.out.println("*-* Adição *-*");
		return n1 + n2;
	}
	
	public float sub(float n1, float n2) {
		System.out.println("*-* Subtração *-*");
		float result = n1 - n2;
		return result;
	}
	
	public float multi(float n1, float n2) {
		System.out.println("*-* Multiplicação *-*");
		return n1 * n2;
	}
	
	public float div(float n1, float n2) {
		System.out.println("*-* Divisão *-*");
		return n1 / n2;
	}
}
