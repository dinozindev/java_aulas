package exercicio2_cp4;

public class Veiculo {
	private String modelo;
	private String placa;
	private int ano;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String modelo, String placa, int ano) {
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
}
