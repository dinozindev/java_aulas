package aula3;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente("Carlos", "123.654.321-10", "Básico");
		Cliente c3 = new Cliente("Marcos", "432.232.654-09", "11 95432-8765", "marcos@gmail.com", "Rua 2", "Pro");
		
		System.out.println("Cliente 1");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Telefone: " + c1.getTelefone());
		System.out.println("Email: " + c1.getEmail());
		System.out.println("Endereço: " + c1.getEndereco());
		System.out.println("Plano: " + c1.getPlano());
	
		System.out.println("===========================");

		
		System.out.println("Cliente 2");
		System.out.println("Nome: " + c2.getNome());
		System.out.println("CPF: " + c2.getCpf());
		System.out.println("Plano: " + c2.getPlano());
		
		System.out.println("===========================");
		
		System.out.println("Cliente 3");
		System.out.println("Nome: " + c3.getNome());
		System.out.println("CPF: " + c3.getCpf());
		System.out.println("Telefone: " + c3.getTelefone());
		System.out.println("Email: " + c3.getEmail());
		System.out.println("Endereço: " + c3.getEndereco());
		System.out.println("Plano: " + c3.getPlano());
	}
}