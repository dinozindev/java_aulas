package aula14_modelGerenciador;

public class App {
	public static void main(String[] args) {
		GerenciadorContatos gc = new GerenciadorContatos(2);
		
		gc.adicionarContatos();
		
		gc.mostrarContatos();
	}
}
