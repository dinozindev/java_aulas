package aula18_HerancaUpa;

public class Teste {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João", "123");
		Funcionario funcionario2 = new Funcionario("Carlos");
		System.out.println(funcionario.toString());
		System.out.println(funcionario2.toString());
		funcionario2.setCtps("456");
		
		System.out.println("");
		
		System.out.println(funcionario2.toString());
		
		System.out.println("");
		
		Medico medico = new Medico("Maria", "124", "987");
		System.out.println(medico.toString());
	}
}
