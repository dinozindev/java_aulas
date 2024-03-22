package aula6;

// metodo menu foi movido para classe InteracaoUsuario.java, onde os metodos serao utilizados.

public class CalculadoraSimples {

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
