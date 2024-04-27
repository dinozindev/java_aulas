package exercicioaula8;

import java.util.Scanner;

public class CalculadoraSimples {
	
	private Scanner input;
	private float n1;
	private float n2;
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}


	public int menu() {
		input = new Scanner(System.in);
		System.out.println("====== { MENU } ======");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Escolha uma das opções: ");
		int op = input.nextInt();
		while (op < 1 || op > 4) {
			System.out.println("Escolha uma opção válida.\n");
			System.out.println("Escolha uma das opções: ");
			op = input.nextInt();
		} 
		System.out.println("Valor 1: ");
		setN1(input.nextFloat());
		System.out.println("Valor 2: ");
		setN2(input.nextFloat());
		
		return op;	
	}
	
	public float switchCaseOp(int op) {
		float result = 0;
		switch (op) {
		case 1:
			result = somar(this.n1, this.n2);
			break;
		case 2:
			result = subtrair(this.n1, this.n2);
			break;
		case 3:
			result = multiplicar(this.n1, this.n2);
			break;
		case 4:
			result = dividir(this.n1, this.n2);
			break;
		}
		
		return result;
	}
	
	public float somar(float n1, float n2) {
		return n1 + n2;
	}
	
	public float subtrair(float n1, float n2) {
		return n1 - n2;
	}
	
	public float multiplicar(float n1, float n2) {
		return n1 * n2;
	}
	
	public float dividir(float n1, float n2) {
		return n1 / n2;
	}
	
	
	public void imprimirResultado(float result) {
		System.out.println("Resultado: " + result);
	}
	
	public static void main(String[] args) {
		CalculadoraSimples cs = new CalculadoraSimples();
		
		int op = cs.menu();
		float result = cs.switchCaseOp(op);
		cs.imprimirResultado(result);
	}
}
