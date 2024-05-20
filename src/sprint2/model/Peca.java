package sprint2.model;

public class Peca {
	private int idPeca;
	private boolean disponibilidade;
	private String nomePeca;
	private double precoPeca;
	
	public Peca(int idPeca, boolean disponibilidade, String nomePeca, double precoPeca) {
		this.idPeca = idPeca;
		this.disponibilidade = disponibilidade;
		this.nomePeca = nomePeca;
		this.precoPeca = precoPeca;
	}

	public int getIdPeca() {
		return idPeca;
	}

	public void setIdPeca(int idPeca) {
		this.idPeca = idPeca;
	}

	public boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getNomePeca() {
		return nomePeca;
	}

	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}

	public double getPrecoPeca() {
		return precoPeca;
	}

	public void setPrecoPeca(double precoPeca) {
		this.precoPeca = precoPeca;
	}

	public String toString() {
		return "Peca [idPeca=" + idPeca + ", disponibilidade=" + disponibilidade + ", nomePeca=" + nomePeca
				+ ", precoPeca=" + precoPeca + "]";
	}
}
