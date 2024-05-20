package sprint2.gerenciador;


import java.util.ArrayList;
import java.util.Scanner;

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
    	System.out.println("\n*-* CADASTRO USUÁRIO *-*");
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

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
                    return;
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
