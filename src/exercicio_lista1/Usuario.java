package exercicio_lista1;

import java.util.Scanner;

public class Usuario {
	Scanner input;
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public int loginId() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ID: ");
		int loginId = input.nextInt();
		return loginId;
	}
	
	public String loginSenha() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		String loginSenha = input.nextLine();
		return loginSenha;
	}
	
	public void validarUsuario(int id, String senha) {
		if (this.id == id && this.senha.equals(senha)) {
			System.out.println("O usuário foi validado!");
		} else {
			System.out.println("ID ou senha incorretos.");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
