package aula3;

public class Cliente {
	// atributos da classe
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String endereco;
	private String plano;
	
	// métodos construtores
	// construtor vazio
	public Cliente() {
		
	}
	
	// construtor parametrizado
	public Cliente(String nomeNovo, String cpfNovo, String telefoneNovo, String emailNovo, String enderecoNovo, String planoNovo) {
		this.nome = nomeNovo;
		this.cpf = cpfNovo;
		this.telefone = telefoneNovo;
		this.email = emailNovo;
		this.endereco = enderecoNovo;
		this.plano = planoNovo;
	}
	
	// construtor parametrizado (apenas atributos selecionados)
	public Cliente(String nomeNovo, String cpfNovo, String planoNovo) {
		this.nome = nomeNovo;
		this.cpf = cpfNovo;
		this.plano = planoNovo;
	}
	
	// getters e setters
	// <encapsulamento> <tipo de retorno> <nome método>
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getPlano() {
		return this.plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
}
