package aula11;

import java.util.Scanner;

public class Exemplo2Vetor {
	
	private Scanner input;
	
	// exemplos de métodos operacionais
	public int tamanhoVetor() {
		System.out.println("*-* Tamanho do vetor *-*");
		input = new Scanner(System.in);
		System.out.println("Tamanho do vetor: ");
		int t = input.nextInt();
		return t;
	}
	
	public int[] criarVetor(int tamanho) {
		System.out.println("*-* Cria vetor *-*");
		 int[] vetor = new int[tamanho]; 
		 return vetor;
	}
	
	public int[] atribuiVetor(int[] vetor) {
		System.out.println("*-* Popular vetor *-*");
		input = new Scanner(System.in);
		int t = vetor.length;
		for (int i = 0; i < t; i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public void imprimirVetor(int[] vetor) {
		int t = vetor.length;
			System.out.println("*-* Imprime Vetor *-*");
		for (int i = 0; i < t; i++) {
			System.out.printf("Vetor[%d]: %d\n", i, vetor[i]);
		}
	}
}
