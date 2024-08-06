package aula19;

public class App {
	public static void main(String[] args) {
		Ingresso i = new Ingresso(100);
		IngressoVip iv = new IngressoVip(100, 40);
		
		ColetorIngresso ci = new ColetorIngresso();
		ci.receber(i);
		ci.receber(iv);
		
		System.out.println("Valor total: R$" + ci.getValorTotal());
	}
}
