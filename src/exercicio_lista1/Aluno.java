package exercicio_lista1;

public class Aluno {
	private String matricula;
	private String nome;
	private String nascimento;
	private String endereco;
	private String telefone;
	private String curso;
	private String periodo;
	
	public Aluno(String matricula, String nome, String nascimento, String endereco, String telefone, String curso, String periodo) {
		this.matricula = matricula;
		this.nome = nome;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public void estudaNoite(String periodo) {
		if (periodo.equals("NOITE")) {
			System.out.println("Estuda a noite");
		} else {
			System.out.println("Estuda de manhã");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
	
}
