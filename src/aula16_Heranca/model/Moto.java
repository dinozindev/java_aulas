package aula16_Heranca.model;

public class Moto extends Veiculo {
	private boolean temPartidaEletrica;

	public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
		super(marca, modelo, ano);
		this.temPartidaEletrica = temPartidaEletrica;
	}

	public boolean isTemPartidaEletrica() {
		return temPartidaEletrica;
	}

	public void setTemPartidaEletrica(boolean temPartidaEletrica) {
		this.temPartidaEletrica = temPartidaEletrica;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Partida Elétrica: " + (temPartidaEletrica ? "sim" : "não"));
	}
}
