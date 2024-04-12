package aula10;

public class ExemploFor {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
			if (i == 5) {
				System.out.println("Mensagem!");
				break;
			}
		}
		System.out.println("fora do for");
	}
}
