package aula12_arrayObjetos;

public class ListaAlunos {
	private Aluno[] alunos; // array de objetos do tipo Aluno
	private int i = 0; // variavel de controle do indice do array
	
	// construtor
	public ListaAlunos(int qtde) {
		System.out.println("*-* Lista Criada! *-*");
		// instanciar o array (alunos)
		alunos = new Aluno[qtde];
	}
	
	// inserir (um aluno na lista de alunos)
	public String inserir(Aluno aluno) {
		if (aluno != null) {
			// adicionar o aluno no array de alunos
			alunos[i] = aluno;
			i++;
			return "Aluno inserido na lista";
		} else {
			return "Aluno não foi inserido na lista";
		}
	}
	
	// listar os alunos do array
	public void listar() {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].toString());
		}
	}
}
