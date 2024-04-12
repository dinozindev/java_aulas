package aula10;

import java.util.Scanner;

public class Exemplo1While {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = input.nextInt();
		int maior = n;
		
		while(n != 0) {
			if(n > maior) {
				maior = n;
			}
			System.out.println("Digite um numero: ");
			n = input.nextInt();
		}
		
		
		
		
		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);
			if (i == 5) {
				System.out.println("O valor de i eh 5");
				break;
			}
			i++;
		}
	}
}
