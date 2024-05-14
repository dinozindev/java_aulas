package exercicios_aula10;

public class ControleRemoto {
	
	public void aumentarVolume(Televisao televisao) {
		int volume = televisao.getVolume();
		televisao.setVolume(volume++);
	}
	
	public void diminuirVolume(Televisao televisao) {
		int volume = televisao.getVolume();
		televisao.setVolume(volume--);
	}
	
	public void aumentarCanal(Televisao televisao) {
		int canal = televisao.getCanal();
		televisao.setCanal(canal++);
	}
	
	public void DiminuirCanal(Televisao televisao) {
		int canal = televisao.getCanal();
		televisao.setCanal(canal--);
	}
	
	public void trocarCanal(int canal, Televisao televisao) {
		televisao.setCanal(canal);
	}
	
	public void consultar(Televisao televisao) {
		System.out.println("Volume: " + televisao.getVolume());
		System.out.println("Canal selecionado: " + televisao.getCanal());
	}
	
}
