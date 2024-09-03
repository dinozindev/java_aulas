package exercicio_cp4;

public class Caminhao extends Veiculo {
	private int eixos;
	private boolean carreta;
	
	public Caminhao(String modelo, String placa, int ano, int eixos, boolean carreta) {
		super(modelo, placa, ano);
		this.eixos = eixos;
		this.carreta = carreta;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public boolean isCarreta() {
		return carreta;
	}

	public void setCarreta(boolean carreta) {
		this.carreta = carreta;
	}

	@Override
	public void exibirDados() {
		System.out.println("Modelo: " + super.getModelo());
		System.out.println("Placa: " + super.getPlaca());
		System.out.println("Ano: " + super.getAno());
		System.out.println("Eixos: " + getEixos());
		System.out.println("Carreta: " + (isCarreta() == true ? "Tem Carreta" : "Não tem Carreta"));		
	}
}
