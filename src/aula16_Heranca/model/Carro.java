package aula16_Heranca.model;

public class Carro extends Veiculo {
	
	// atributos
	private int numeroPortas;
	
	// construtor
	public Carro(String marca, String modelo, int ano, int numeroPortas) {
		super(marca, modelo, ano);
		this.numeroPortas = numeroPortas;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Número de portas: " + this.numeroPortas);
	}
}
