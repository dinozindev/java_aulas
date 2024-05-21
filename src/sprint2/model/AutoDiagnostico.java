package sprint2.model;

public class AutoDiagnostico {
	private int idDiagnostico;
	private Problema problema;
	private Servico solucao;
	private String descricao;
	
	public AutoDiagnostico(int idDiagnostico, Problema problema, String descricao) {
		this.idDiagnostico = idDiagnostico;
		this.problema = problema;
		this.descricao = descricao;
	}

	public int getIdDiagnostico() {
		return idDiagnostico;
	}

	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public Servico getSolucao() {
		return solucao;
	}

	public void setSolucao(Servico solucao) {
		this.solucao = solucao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public String toString() {
		return "AutoDiagnostico [idDiagnostico=" + idDiagnostico + ", problema=" + problema + ", solucao=" + solucao
				+ ", descricao=" + descricao + "]";
	}
	
}
