package exercicio1;

public class App {
	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Carlos", 324, 49, 32);
		
		float umPorcento = v1.getPreco() / 100;
		float cincoPorcento = umPorcento * 5;
		
		float comissao = cincoPorcento * v1.getQntd_vendida();
		
		System.out.println("Comissão: " + comissao + " reais");
		
	}
}
