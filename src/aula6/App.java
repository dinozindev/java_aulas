package aula6;



public class App {
	public static void main(String[] args) {
		
		CalculadoraSimples cs = new CalculadoraSimples();
		InteracaoUsuario ui = new InteracaoUsuario();
		
		System.out.println("**- Calculadora Simples -**");
		
		int op = ui.menu();
		float n1 = ui.entradaDados();
		float n2 = ui.entradaDados();
		
		// A resposabilidade da entrada de dados foi passada para o metodo entradaDados do objeto InteracaoUsuario.
		//System.out.println("N1: ");
		//float n1 = input.nextFloat();
		//System.out.println("N2: ");
		//float n2 = input.nextFloat();
		
		
		// criamos o metodo imprimirDados que servira especificamente para imprimir dados que forem passados por parametro.
		if (op == 1) {
			ui.imprimirDados(cs.add(n1, n2));
			// System.out.println("Resultado: " + cs.add(n1, n2));
		} else if (op == 2) {
			float resultado = cs.sub(n1, n2);
			ui.imprimirDados(resultado);
			//System.out.println("Resultado: " + cs.sub(n1, n2));
		} else if (op == 3) {
			ui.imprimirDados(cs.multi(n1, n2));
			//System.out.println("Resultado: " + cs.multi(n1, n2));
		} else if (op == 4) {
			ui.imprimirDados(cs.div(n1, n2));
			//System.out.println("Resultado: " + cs.div(n1, n2));
		} else {
			System.out.println("Digite uma opção válida.");
		}
	}
}
