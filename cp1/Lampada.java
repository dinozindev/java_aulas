package cp1;

public class Lampada {
	
	private boolean status;
	
	public Lampada() {
		this.status = false;
	}
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public boolean obterStatus() {
		return status;
	}
	
	// testando a classe
	
    public static void main(String[] args) {
    	Lampada lamp = new Lampada();
    	System.out.println(lamp.obterStatus() == true ? "Estado: Ligado" : "Estado: Desligado");
    	lamp.ligar();
    	System.out.println(lamp.obterStatus() == true ? "Estado: Ligado" : "Estado: Desligado");
    	lamp.desligar();
    	System.out.println(lamp.obterStatus() == true ? "Estado: Ligado" : "Estado: Desligado");
	
    }
}
