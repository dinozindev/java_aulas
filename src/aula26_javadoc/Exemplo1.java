package aula26_javadoc;

// comentario de uma unica linha

/*
 * Comentario
 * de 
 * multiplas
 * linhas
 */

// esses dois tipos de comentarios nao geram doclets

// Criação de doclets
/**
 * Java Documentation
 * 
 * Descrição: Esta classe foi definida pelo usuário e 
 * contém um método cubo. Criada durante a aula sobre JavaDoc
 * 
 * @author Dino
 */

public class Exemplo1 {
	
	/**
	 * O atributo atr1 foi definido para armazenar um número inteiro.
	 * <b>private int atr1<b> = <i>atributo privado do tipo inteiro<i>
	 */
	private int atr1;
	/**
	 * O atributo atr2 foi definido para armazenar um número inteiro.
	 * <b>private int atr2<b>
	 */
	private int atr2;
	/**
	 * O atributo atr3 foi definido para armazenar um número inteiro.
	 * <b>private int atr3<b>
	 */
	private int atr3;
	
	
	/**
	 * Construtor vazio!
	 */
	public Exemplo1() {
		
	}
	
	/**
	 * 
	 * Construtor parametrizado com três atributos do tipo int
	 * 
	 * @param atr1 - número fornecido pelo usuário
	 * @param atr2 - número fornecido pelo usuário
	 * @param atr3 - recebe o valor através de um arquivo
	 */
	public Exemplo1(int atr1, int atr2, int atr3) {
		this.atr1 = atr1;
		this.atr2 = atr2;
		this.atr3 = atr3;
	}

	/**
	 * Atr1 é responsável por armazenar uma informação
	 * @return the atr1
	 */
	public int getAtr1() {
		return atr1;
	}

	/**
	 * Atr1 armazena informações sobre XPTO
	 * @param atr1 the atr1 to set
	 */
	public void setAtr1(int atr1) {
		this.atr1 = atr1;
	}

	/**
	 * Atr2 é responsável por armazenar a informação do atributo 2
	 * @return the atr2
	 */
	public int getAtr2() {
		return atr2;
	}

	/**
	 * Atr2 é o atributo que representa...
	 * @param atr2 the atr2 to set
	 */
	public void setAtr2(int atr2) {
		this.atr2 = atr2;
	}

	/**
	 * Atr3 é o atributo que recebe dados externos...
	 * @return the atr3
	 */
	public int getAtr3() {
		return atr3;
	}

	/**
	 * Atributo 3 armazena informações sobre blablabla...
	 * @param atr3 the atr3 to set
	 */
	public void setAtr3(int atr3) {
		this.atr3 = atr3;
	}
	
	/**
	 * Método calcularCubo realiza o cálculo do cubo de n, onde o valor de n deve ser um número inteiro.
	 * 
	 * @param n - é o valor que será passado por parâmetro
	 * @return um número double que representa o cubo de um número através do método Math.pow()
	 */
	public double calcularCubo(int n) {
		return Math.pow(n, 3);
	}
	
	// testando javadoc
	/**
	 * Testando Main
	 * @param args - teste main
	 */
	public static void main(String[] args) {
		Exemplo1 e1 = new Exemplo1();
		System.out.println("Resultado: " + e1.calcularCubo(3));
	}
	
	
}
