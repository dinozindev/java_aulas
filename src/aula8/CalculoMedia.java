package aula8;

import java.util.Scanner;

	public class CalculoMedia {
		Scanner input = new Scanner(System.in);
		private float n1;
		private float n2;
		private float n3;
		private float media;
		private char conceito;
		private String mensagem;
		
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
			return this.conceito;
		}
		public void setConceito(char conceito) {
			this.conceito = conceito;
		}
		
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		
		public void obterNotas() {
			System.out.println("N1: ");
			float n1 = input.nextFloat();
			setN1(n1);
			System.out.println("N2: ");
			float n2 = input.nextFloat();
			setN2(n2);
			System.out.println("N3: ");
			float n3 = input.nextFloat();
			setN3(n3);	
		}
		
		public void calcularMedia() {
			setMedia((this.n1 + this.n2 + this.n3) / 3);
		}
		
		
		public void determinarConceito() {
			if (this.media <= 10 || this.media >= 9) {
				setConceito('A');
			} else if (this.media < 9 || this.media >= 8) {
				setConceito('B');
			} else if (this.media < 8 || this.media >= 7) {
				setConceito('C');
			} else if (this.media < 7 || this.media >= 6) {
				setConceito('D');
			} else if (this.media < 6 || this.media >= 5) {
				setConceito('E');
			} else if (this.media < 5) {
				setConceito('F');
			} else {
				System.out.println("Nota inválida!");
			}
		}
		
		public void definirMensagem() {
			switch(this.conceito) {
			case 'A': 
				setMensagem("Excelente");
				break;
			case 'B': 
				setMensagem("Ótimo");
				break;
			case 'C': 
				setMensagem("Bom");
				break;
			case 'D': 
				setMensagem("Regular");
				break;
			case 'E': 
				setMensagem("Ruim");
				break;
			case 'F': 
				setMensagem("Nos vemos no próximo ano...");
				break;
			}
		}
		
		public void imprimirMensagem() {
			System.out.println("Média: " + this.media);
			System.out.println("Conceito: " + this.conceito);
			System.out.println(this.mensagem);
			if (this.conceito == 'E' || this.conceito == 'F') {
				System.out.println("Status: Reprovado");
			} else {
				System.out.println("Status: Aprovado");
			}
		}
	}

