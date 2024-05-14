package exercicios_aula10;

public class Lampada {
	private String estado = "LIGADA";
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void ligarDesligarLampada() {
		if (this.estado == "LIGADA") {
			this.estado = "DESLIGADA";
		} else {
			this.estado = "LIGADA";
		}
	}
	
	public static void main(String[] args) {
		Lampada l = new Lampada();
		System.out.println(l.getEstado());
		l.ligarDesligarLampada();
		System.out.println(l.getEstado());
		l.ligarDesligarLampada();
		System.out.println(l.getEstado());
		l.ligarDesligarLampada();
		System.out.println(l.getEstado());
		l.ligarDesligarLampada();
		System.out.println(l.getEstado());
	}
}
