package aula7;

import java.util.Scanner;

public class CalculoMedia {
	
	Scanner input;
	
	private float n1;
	private float n2;
	private float n3;
	private float media;
	private char conceito;
	
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
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public char getConceito() {
		return conceito;
	}
	public void setConceito(char conceito) {
		this.conceito = conceito;
	}
	
	public void calcularMedia() {
		this.media = (this.n1 + this.n2 + this.n3) / 3;
	}
	
	public void definirConceito(float media) {
		if (media >= 9 && media <= 10) {
			this.conceito = 'A';
		} else if (media >= 8 && media < 9) {
			this.conceito = 'B';
		} else if (media >= 7 && media < 8) {
			this.conceito = 'C';
		} else if (media >= 6 && media < 7) {
			this.conceito = 'D';
		} else {
			this.conceito = 'E';
		}
		
	}
	
	public void imprimirMensagem(char conceito) {
		switch (conceito) {
			case 'A':
				System.out.println("Parábens! ");
				System.out.println("Conceito: " + conceito);
				System.out.println("Média: " + media);
				break;
			case 'B':
				System.out.println("Ótimo! ");
				System.out.println("Conceito: " + conceito);
				System.out.println("Média: " + media);
				break;
			case 'C':
				System.out.println("Ok! ");
				System.out.println("Conceito: " + conceito);
				System.out.println("Média: " + media);
				break;
			case 'D':
				System.out.println("Pode melhorar! ");
				System.out.println("Conceito: " + conceito);
				System.out.println("Média: " + media);
				break;
			case 'E':
				System.out.println("Reforço. ");
				System.out.println("Conceito: " + conceito);
				System.out.println("Média: " + media);
				break;
		}
	}
	
}