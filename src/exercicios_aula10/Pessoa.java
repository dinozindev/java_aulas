package exercicios_aula10;

public class Pessoa {
	private String nome;
	private int dataNascimento;
	private float alturaCm;
	
	public Pessoa(String nome, int dataNascimento, float alturaCm) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.alturaCm = alturaCm;
	}

	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", altura=" + alturaCm + "]";
	}
	
	public int calcularIdade() {
		int idade = 2024 - dataNascimento;
		return idade;
	}
	
	public float alturaEmMetros(float alturaCm) {
		float altura = alturaCm / 100;
		return altura;
	}
	
}
