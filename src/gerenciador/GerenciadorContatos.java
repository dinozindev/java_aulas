package gerenciador;

import java.util.Scanner;

import model.Contato;

public class GerenciadorContatos {
	// atributos
	// lista de objetos / models do tipo Contato
	private Contato[] contatos; // lista de contatos
	private Scanner input; // declarando um objeto Scanner
	
	// tamanho do array passado como parametro para o Constructor. Array é criado dentro do constructor.
	public GerenciadorContatos(int t) {
		System.out.println("Lista Criada com " + t + "elementos.");
		System.out.println("======================================");
		contatos = new Contato[t];
	}
	
	// metodo para criar contato
	public Contato criarContato() {
		System.out.println("*-* Criando um contato *-*");
		System.out.println("===========================");
		input = new Scanner(System.in);
		
		System.out.println("Nome do Contato: ");
		String nome = input.next();
		System.out.println("Telefone do Contato: ");
		String tel = input.next();
		
		// instancia o objeto Contato com o constructor
		Contato c = new Contato(nome, tel);
		
		return c;
	}
	
	// metodo para adicionar contato na lista
	public void adicionarContatos() {
		System.out.println("*-* Adicionando contatos na lista *-*");
		System.out.println("======================================");
		
		for(int i = 0; i < contatos.length; i++) {
			contatos[i] = criarContato();
		}
	}
	
	public void mostrarContatos() {
		System.out.println("*-* Listando os contatos... *-*");
		System.out.println("================================");
		
		for(int i = 0; i < contatos.length; i++) {
			System.out.println("Contato: " + contatos[i].toString());
		}
	}
}
