package cp2;

//Lucas Kenji Kikuchi - RM554424

public class Teste {
	public static void main(String[] args) {
		Monitoramento m = new Monitoramento();
		int dias = m.periodoDias();
		
		Monitoramento m1 = new Monitoramento(dias);
		
		float temperaturas[] = m1.mapearTemperaturas();
		m1.maiorMenorTemperatura(temperaturas);
		m1.temperaturasNegativas(temperaturas);
		m1.mediaTemperaturas(temperaturas);
		m1.diasPositivos(temperaturas);
		m1.imprimirDados();
	
	}
}
