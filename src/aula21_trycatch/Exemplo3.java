package aula21_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo3 {
	// lança a exceção, mas não a trata. Quem usar a função terá que tratar a exceção
	public static float calculaQuociente(int numerador, int denominador) throws ArithmeticException {
		return numerador/denominador;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continua = true;
		do {
			try {
				System.out.println("Numerador: ");
				int numerador = input.nextInt();
				
				System.out.println("Denominador: ");
				int denominador = input.nextInt();
				
				float resultado = calculaQuociente(numerador, denominador);
				System.out.println(resultado);
				continua = false;
			} catch (ArithmeticException e) {
				System.err.println("Erro: Divisão por zero");
			} catch (InputMismatchException e) {
				System.err.println("Não é permitido inserir letras. Insira números.");
				input.next(); // limpar o buffer
			} catch (NullPointerException e) {
				System.err.println("Objeto NULO");
			} finally {
				System.out.println("Fim do bloco try-catch");
			}	
		} while(continua);
		input.close();
	}
}
