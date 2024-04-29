package exercicioaula8;

import java.util.Scanner;

public class Metodos {
	
	private Scanner input;
	
	public int maiorMenor(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else if (n1 == n2) {
			return 0;
		} else {
			return n2;
		}
	}
	
	public int obterNumero() {
		input = new Scanner(System.in);
		System.out.println("Valor: ");
		int n = input.nextInt();
		return n;
	}
	
	public void imprimirMaior(int maior) {
		if (maior == 0) {
			System.out.println("Os dois valores são iguais.");
		} else {
			System.out.printf("O valor %d é o maior.\n", maior);
		}
	}
	
	public int maiorValor(int vetor[]) {
		int maior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				System.out.println("maior: " + maior);
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {
		Metodos m = new Metodos();
		int n1 = m.obterNumero();
		int n2 = m.obterNumero();
		int maior = m.maiorMenor(n1, n2);
		m.imprimirMaior(maior);
		
		int vetor[] = {1, 4, 3, 28, 7, 54, 32, 0, 9, 101};
		int maiorNoVetor = m.maiorValor(vetor);
		m.imprimirMaior(maiorNoVetor);
	}
}
