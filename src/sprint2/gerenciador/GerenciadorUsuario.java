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

        Usuario usuario = new Usuario(nomeUsuario, senha, email);
        usuarios.add(usuario);
        System.out.println("\nUsuário cadastrado com sucesso!");
        return usuario;
    }

    public void login() {
    	System.out.println("\n*-* LOGIN USUÁRIO *-*");
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)) {
                System.out.println("\nLogin realizado com sucesso!");
                return;
            }
        }

        System.out.println("Usuário ou senha inválidos.");

    }
    
    public void adicionarVeiculoAoUsuario(Veiculo veiculo, Usuario usuario) {
    	usuario.getVeiculos().add(veiculo);
    	System.out.println("Veículo adicionado com sucesso.");
    }
    
    public void removerVeiculoDoUsuario(Veiculo veiculo, Usuario usuario) {
    	usuario.getVeiculos().remove(veiculo);
    	System.out.println("Veículo removido com sucesso.");
    }
   

    public Usuario getUsuarioLogado() { // add this method
        return usuarioLogado;
    }
}
