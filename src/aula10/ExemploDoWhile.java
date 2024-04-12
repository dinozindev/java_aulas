package aula10;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int op;
		
		do {
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 = Divisão");
		System.out.println("Opção: ");
		op = input.nextInt();
		} while(op > 4 || op < 1);
		
		System.out.println("Fora do laco de repeticao");
	}
}
