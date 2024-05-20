package sprint2.model;

public class Orcamento {
	private int idOrcamento;
	private String descricao;
	private double valor_total;
	private String status;
	private Servico servico;
	private Peca peca;
	
	public Orcamento(int idOrcamento, String descricao, String status, Servico servico, Peca peca) {
		this.idOrcamento = idOrcamento;
		this.descricao = descricao;
		this.valor_total = 0;
		this.status = status;
		this.servico = servico;
		this.peca = peca;
	}

	public int getIdOrcamento() {
		return idOrcamento;
	}

	public void setIdOrcamento(int idOrcamento) {
		this.idOrcamento = idOrcamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	
	
}
