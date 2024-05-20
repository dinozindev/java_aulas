package sprint2.model;

public class Orcamento {
	private int idOrcamento;
	private String descricao;
	private double valor_total;
	private String status;
	
	public Orcamento(int idOrcamento, String descricao, String status) {
		this.idOrcamento = idOrcamento;
		this.descricao = descricao;
		this.valor_total = 0;
		this.status = status;
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
	
	
}
