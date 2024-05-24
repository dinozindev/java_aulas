package aula18_HerancaUpa;

public class Funcionario {
	//atributos
	private String nome;
	private String ctps;
	
	public Funcionario(String nome, String ctps) {
		this.nome = nome;
		this.ctps = ctps;	
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", ctps=" + ctps + "]";
	}
	
}
