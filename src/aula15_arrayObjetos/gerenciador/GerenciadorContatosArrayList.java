package aula15_arrayObjetos.gerenciador;

import java.util.ArrayList;

import aula15_arrayObjetos.model.Contato;

/**
 * 
 * ArrayList
 * - Array dinâmico
 * - Pode ser alterado em tempo de execução
 * - Faz parte do Framework Collection
 * 
 */

public class GerenciadorContatosArrayList {
	// atributos
	private ArrayList<Contato> contatos; // declarando um arrayList
	
	// constructor
	public GerenciadorContatosArrayList() {
		System.out.println("*** Lista Criada ***");
		
		// instanciando o ArrayList(contatos)
		contatos = new ArrayList<Contato>();
	}
	
	// metodos operacionais - manipulacao da lista
	public void adicionar(Contato contato) {
		// adiciona contato a lista contatos
		contatos.add(contato);
		System.out.println(contato.getNome() + " adicionado na lista.");
	}
	
	// removendo pelo objeto
	public Contato remover(Contato contato) {
		contatos.remove(contato);
		return contato;
	}
	
	// removendo pelo índice
	public String remover(int indice) {
		//Contato contato = contatos.get(indice);
		//contatos.remove(indice);
		Contato contato = contatos.remove(indice); // --> o .remove() já retorna o contato, portanto o .get() não seria necessário.
		return contato.getNome(); // retornando apenas o nome do contato (String)	
	}
	
	public void listar() {
		//foreach
		System.out.println("For Each");
		System.out.println("=========");
		
		for (Contato contato : contatos) {
			System.out.println(contato.toString());
		}
	}
}
