package aula1;

import java.util.Scanner;

/*
 * Criando um objeto em Java
 * <nomeClasse> <nomeObj/nomeVariavel> = new <nomeClasse>;
 */

public class ExemploEntradaDados {
	
	public static void main(String[] args) {
		
		// criando um objeto de Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = input.next(); // entrada de dados	
		System.out.println("Hello, " + nome + "!"); // saida de dados
	};
	
}
