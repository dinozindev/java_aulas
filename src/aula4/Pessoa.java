package aula4;

public class Pessoa {
	// atributos
	private String nome;
	private int idade;
	private float altura;
	
	// Construtores
	
	public Pessoa() {
		System.out.println("*-* Construtor DEFAULT *-*");
		System.out.println("Um objeto Pessoa foi criado.");
	}
	
	public Pessoa(String nome) {
		System.out.println("*-* Construtor Parametrizado - 1 parâmetro *-*");
		System.out.println("Um objeto Pessoa foi criado.");
		this.nome = nome;
	}
	
	public Pessoa(String nome, int idade, float altura) {
		System.out.println("*-* Construtor Parametrizado - 3 parâmetros *-*");
		System.out.println("Um objeto Pessoa foi criado.");
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	// getters() e setters()
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
