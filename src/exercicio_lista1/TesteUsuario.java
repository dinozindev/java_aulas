package exercicio_lista1;

public class TesteUsuario {
	public static void main(String[] args) {
		Usuario u1 = new Usuario(3456, "Gerson", "gerson@gmail.com", "123");
		
		int id = u1.loginId();
		String senha = u1.loginSenha();
		
		u1.validarUsuario(id, senha);
	}
}
