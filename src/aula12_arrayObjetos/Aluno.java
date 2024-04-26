package aula12_arrayObjetos;

public class Aluno {
	
	private int matricula;
	private String nome;
	private String turma;
	private float media;
	
	// construtor vazio
	public Aluno() {
		
	}
	
	// construtor parametrizado
	public Aluno(int matricula, String nome, String turma) {
		this.matricula = matricula;
		this.nome = nome;
		this.turma = turma;
		this.media = 0;
	}
	

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	
	// metodo toString (mostra os dados do objeto Aluno)
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome:" + nome + ", turma:" + turma + ", media:" + media + "]";
	}
	
	
	
}