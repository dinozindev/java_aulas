package sprint2.gerenciador;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sprint2.model.Usuario;
import sprint2.model.Veiculo;

public class GerenciadorUsuario {
    private ArrayList<Usuario> usuarios;
    private Scanner scanner;
    private Usuario usuarioLogado;

    public GerenciadorUsuario() {
        this.usuarios = new ArrayList<Usuario>();
        this.scanner = new Scanner(System.in);
    }

    public Usuario cadastrar() {
    	Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    	String email;
    	Pattern patternTel = Pattern.compile("^(\\(\\d{2}\\)\\s*\\d{5}-\\d{4})|^(\\d{2}\\s*\\d{5}-\\d{4})$");
    	String telefone;
    	
    	System.out.println("\n*-* CADASTRO USUÁRIO *-*");
        System.out.print("Digite o nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        while (true) {
        	System.out.print("Digite o email: ");
            email = scanner.nextLine();
            Matcher matcher = patternEmail.matcher(email);
            if (matcher.matches()) {
            	break;
            } else {
            	System.out.println("E-mail inválido.");
            	continue;
            }
        }
        while (true) {
        	System.out.print("Digite o telefone: ");
            telefone = scanner.nextLine();
            Matcher matcher = patternTel.matcher(telefone);
            if (matcher.matches()) {
            	break;
            } else {
            	System.out.println("Telefone inválido.");
            	continue;
            }
        }
        Usuario usuario = new Usuario(nomeUsuario, senha, email, telefone);
        usuarios.add(usuario);
        System.out.println("\nUsuário cadastrado com sucesso!");
        return usuario;
    }

    public void login() {
    	do {
    		System.out.println("\n*-* LOGIN USUÁRIO *-*");
            System.out.print("Digite o nome de usuário: ");
            String nomeUsuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            for (Usuario usuario : usuarios) {
                if (usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)) {
                    System.out.println("\nLogin realizado com sucesso!");
                    break;
                } else {
                	System.out.println("\nUsuário ou senha inválidos.");
                	continue;
                }
            }
    	}	while (true);
    	
    }
    
    public void adicionarVeiculoAoUsuario(Veiculo veiculo, Usuario usuario) {
    	usuario.getVeiculos().add(veiculo);
    	System.out.println("\nVeículo adicionado com sucesso.");
    }
    
    public void removerVeiculoDoUsuario(Veiculo veiculo, Usuario usuario) {
    	usuario.getVeiculos().remove(veiculo);
    	System.out.println("\nVeículo removido com sucesso.");
    }
    
    public void removerUsuario(Usuario usuario) {
    	usuarios.remove(usuario);
    }
    
    public void imprimirUsuarios() {
    	System.out.println("\n*-* LISTA DE USUÁRIOS *-*\n");
    	for (Usuario usuario : usuarios) {
    		System.out.println("Nome: " + usuario.getNomeUsuario());
    		System.out.println("E-mail: " + usuario.getEmail());
    		System.out.println("Telefone: " + usuario.getTelefone() + "\n");
    	}
    }
    
    public void listarVeiculosDoUsuario(Usuario usuario) {
		System.out.println("\n*-* VEÍCULOS DO USUÁRIO " + usuario.getNomeUsuario().toUpperCase() + " *-*\n");
    for (Veiculo veiculo : usuario.getVeiculos()) {
        System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAno() + ", " + veiculo.getPlaca() + ", " + veiculo.getQuilometragem() + ")");
    }
}
   
    public Usuario getUsuarioLogado() { // add this method
        return usuarioLogado;
    }
}
