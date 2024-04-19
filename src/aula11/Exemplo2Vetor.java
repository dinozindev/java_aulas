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
	
	public int obterNumero() {
		System.out.println("*-* Obter um número *-*");
		input = new Scanner(System.in);
		System.out.println("Número: ");
		int n = input.nextInt();
		return n;
	}
	
	public int verificarOcorrencias(int n, int[] vetor) {
		System.out.println("*-- Verificar Ocorrencias de um numero --*");
		int cont = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (n == vetor[i]) {
				cont++;
			}
		}
		return cont;
	}
	
	public int[] verificarParesImpares(int [] vetor) {
		System.out.println("*-- Verificar Ocorrencia de pares e impares");
		int contPares = 0;
		int contImpares = 0;
		int vetorValores[] = new int[2];
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}
		}
		
		vetorValores[0] = contPares;
		vetorValores[1] = contImpares;
		return vetorValores;
	}
	
	// FAZER PROXIMA AULA
	// escrever um metodo para verificar os numeros pares e impares presentes no vetor.
	// retorne quantos elementos pares e quantos elementos impares
}
