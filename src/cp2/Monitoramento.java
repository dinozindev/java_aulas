package cp2;

import java.util.Scanner;

// Lucas Kenji Kikuchi - RM554424

public class Monitoramento {

	private int tamanho;
	private Scanner input;
	private float maior = 0;
	private float menor = 0;
	private float media;
	private float[] negativos;
	private int diasPositivos;
	
	public Monitoramento() {
		
	}
	
	public Monitoramento(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public float getMaior() {
		return maior;
	}

	public void setMaior(float maior) {
		this.maior = maior;
	}

	public float getMenor() {
		return menor;
	}

	public void setMenor(float menor) {
		this.menor = menor;
	}
	
	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
	public float[] getNegativos() {
		return negativos;
	}

	public void setNegativos(float[] negativos) {
		this.negativos = negativos;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getDiasPositivos() {
		return diasPositivos;
	}

	public void setDiasPositivos(int diasPositivos) {
		this.diasPositivos = diasPositivos;
	}

	public int periodoDias() {
		input = new Scanner(System.in);
		System.out.println("Período em dias a ser mapeado: ");	
		int qtnd_dias = input.nextInt();
		
		return qtnd_dias;
	}
	
	public float[] mapearTemperaturas() {
		float temperaturas[] = new float[tamanho];
	
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.printf("Temperatura do dia %d: ", i+1);
			input = new Scanner(System.in);
			temperaturas[i] = input.nextFloat();
		}
		return temperaturas;
	}
	
	public void maiorMenorTemperatura(float temperaturas[]) {
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > maior) {
				setMaior(temperaturas[i]);
			}
			else if (temperaturas[i] < menor) {
				setMenor(temperaturas[i]);
			}
		}
	}
	
	public void temperaturasNegativas(float temperaturas[]) {
		int negativas = 0; 
		float tempsNegativas[];
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < 0) {
				negativas++;
			}
		}
		tempsNegativas = new float[negativas];
		int n = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < 0) {
				tempsNegativas[n] = temperaturas[i];
				n++;
			}
		}
		setNegativos(tempsNegativas);
	}
	

	public void mediaTemperaturas(float temperaturas[]) {
		float total = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			total+=temperaturas[i];
		}
		setMedia(total / temperaturas.length);
	}
	

	public void imprimirDados() {
		System.out.println("\n*-* Dados *-*\n");
		System.out.println("Maior Temperatura: " + this.maior);
		System.out.println("Menor Temperatura: " + this.menor);
		System.out.printf("Média: %.2f", this.media);
		System.out.println("\n====Temperaturas negativas====");
		for (int i = 0; i < this.negativos.length; i++) {
			System.out.println(negativos[i]);
		}
		
	}
	

	public void diasPositivos(float temperaturas[]) {
		int diasPositivos = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > 0) {
				diasPositivos++;
			}
		}
		setDiasPositivos(diasPositivos);
	}

	
}
