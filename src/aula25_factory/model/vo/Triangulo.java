package aula25_factory.model.vo;

import aula25_factory.model.interfaces.Poligono;

public class Triangulo implements Poligono {
	@Override
	public int getNumeroLados() {
		return 3;
	}

}
