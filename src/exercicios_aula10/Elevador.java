package exercicios_aula10;

public class Elevador {
	private int andar = 0;
	private int totalAndares;
	private int capacidade;
	private int pessoas = 0;
	
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getPessoas() {
		return pessoas;
	}
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
	public void inicializa(int totalAndares, int capacidade) {
		setTotalAndares(totalAndares);
		setCapacidade(capacidade);
	}
	
	public void entraPessoa() {
		if (pessoas < capacidade) {
			this.pessoas++;
		} else {
			System.out.println("Elevador está cheio.");
		}
	}
	
	public void saiPessoa() {
		if (pessoas == 0) {
			System.out.println("Elevador está vazio.");
		} else {
			this.pessoas--;
		}
	}
	
	public void sobeElevador() {
		if (andar == totalAndares) {
			System.out.println("O elevador está no último andar.");
		} else {
			andar++;
		}
	}
	
	public void desceElevador() {
		if (andar < 0) {
			System.out.println("O elevador está no térreo.");
		} else {
			andar--;
		}
	}
}	


