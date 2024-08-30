package aula21_trycatch;

import java.util.Random;

public class Exemplo2 {
	public static void main(String[] args) {
		int a=0,b=0,resp=0;
		Random r = new Random();
		
		for(int i = 0; i < 100; i++) {
			try {
				a = r.nextInt();
				b = r.nextInt();
				
				System.out.printf("a: %d | b: %d \n", a, b);
				
				resp = 1234 / (a/b);
				
				System.out.println("Resp: " + resp);
			} catch (ArithmeticException e) {
				System.err.println("Erro: Exemplo2.main()" + i);
			}
				
		}
	}
}
