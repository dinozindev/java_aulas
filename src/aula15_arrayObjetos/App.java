package aula15_arrayObjetos;

import aula15_arrayObjetos.gerenciador.GerenciadorContatosArrayList;
import aula15_arrayObjetos.model.Contato;

public class App {
	public static void main(String[] args) {
		GerenciadorContatosArrayList gerenciador = new GerenciadorContatosArrayList();
		
		gerenciador.adicionar(new Contato("Leonardo", "123-321"));
		gerenciador.adicionar(new Contato("Lucas", "321-123"));
		gerenciador.adicionar(new Contato("Leo", "432-234"));
		
		gerenciador.listar();
		
		gerenciador.remover(2);
		
		gerenciador.listar();
	}
}
