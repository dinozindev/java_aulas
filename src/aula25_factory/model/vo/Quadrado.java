package aula25_factory.model.vo;

import aula25_factory.model.interfaces.Poligono;

public class Quadrado implements Poligono {
	@Override
	public int getNumeroLados() {
		return 4;
	}

}
