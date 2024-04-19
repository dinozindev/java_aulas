package aula11;

public class TesteVetor {
	public static void main(String[] args) {
		
		Exemplo2Vetor v2 = new Exemplo2Vetor(); 
		int t = v2.tamanhoVetor();
		
		int vetor[] = v2.criarVetor(t);
		v2.imprimirVetor(vetor);
		
		vetor = v2.atribuiVetor(vetor);
		v2.imprimirVetor(vetor);
		
		int n = v2.obterNumero();
		System.out.printf("Ocorrencias do numero %d: %d \n", n, v2.verificarOcorrencias(n, vetor));
		
		int vetorParesImpares[] = v2.verificarParesImpares(vetor);
		System.out.printf("Ocorrencias de pares: %d\nOcorrencia de impares: %d\n", vetorParesImpares[0], vetorParesImpares[1]);
	}
}
