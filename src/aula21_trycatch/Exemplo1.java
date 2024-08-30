package aula21_trycatch;

public class Exemplo1 {
	public static void main(String[] args) {
		
		int a, b , result;
		
		try {
			a=42;
			b=0;
			
			result = a/b;	
			// ArithmeticException -> não pode dividir por 0
			
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("Erro: Divisão por ZERO - / by zero");
		}
		
		
		
	}
}
