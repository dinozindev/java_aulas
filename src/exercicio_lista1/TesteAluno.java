package exercicio_lista1;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("RM433232", "Roberto", "30/02/2003", "Rua Carlos Dionisio", "11 99323-7658", "TDS", "Manhã");
		
		String periodo = a1.getPeriodo();
		
		a1.estudaNoite(periodo.toUpperCase());
	}
}
