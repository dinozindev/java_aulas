package aula11;

public class Exemplo1Vetor {
	public static void main(String[] args) {
		// criar um vetor
		int[] vetor = new int[5];
		
		// preenchendo o vetor
		vetor[0] = 10;
		vetor[1] = -20;
		vetor[2] = 30;
		vetor[3] = -40;
		vetor[4] = 50;
		
		System.out.println("Tamanho: " + vetor.length);
		
		for (int i = 0; i < 5;i++) {
			if (vetor[i] > 0) {
				System.out.printf("Vetor[%d]: %d\n", i, vetor[i]);
			} 	
		}
	}
}
