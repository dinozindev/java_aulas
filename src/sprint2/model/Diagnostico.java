package sprint2.model;

public class Diagnostico {
	private int idDiagnostico;
	private Usuario usuario;
	private Veiculo veiculo;
	private Peca peca;
	private String descricaoSintomas;
	private Servico solucao;
	private Orcamento orcamento;
	private String gravidade;
	private String categoria;
	private String status;
	
	public Diagnostico(int idDiagnostico, Usuario usuario, Veiculo veiculo, Peca peca, String descricaoSintomas, Servico solucao, Orcamento orcamento, String gravidade, String categoria, String status) {
		this.idDiagnostico = idDiagnostico;
		this.usuario = usuario;
		this.veiculo = veiculo;
		this.peca = peca;
		this.descricaoSintomas = descricaoSintomas;
		this.solucao = solucao;
		this.orcamento = orcamento;
		this.gravidade = gravidade;
		this.categoria = categoria;
		this.status = status;
	}

	public int getIdDiagnostico() {
		return idDiagnostico;
	}

	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public String getDescricaoSintomas() {
		return descricaoSintomas;
	}

	public void setDescricaoSintomas(String descricaoSintomas) {
		this.descricaoSintomas = descricaoSintomas;
	}

	public Servico getSolucao() {
		return solucao;
	}

	public void setSolucao(Servico solucao) {
		this.solucao = solucao;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public String getGravidade() {
		return gravidade;
	}

	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
