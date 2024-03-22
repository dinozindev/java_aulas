package aula6;

import java.util.Scanner;

public class InteracaoUsuario {
	private Scanner input;
	
	public int menu() {
		input = new Scanner(System.in);
		
		System.out.println("*-- Menu --*");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Opção: ");
		int op = input.nextInt();
		return op;
	}
	
	// quando o metodo eh chamado, pede o input de um numero. 
	public float entradaDados() {
		System.out.println("*-* Entrada de Dados *-*");
		input = new Scanner(System.in);
		System.out.println("Número: ");
		float num = input.nextFloat();
		return num;
	}
	
	public void imprimirDados(float resultado) {
		System.out.println("*-* IMPRIMIR RESULTADO *-*");
		System.out.println("Resultado: " + resultado);
	}
}
