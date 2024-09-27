package aula25_factory.controller;

import aula25_factory.model.interfaces.Poligono;
import aula25_factory.model.vo.Pentagono;
import aula25_factory.model.vo.Quadrado;
import aula25_factory.model.vo.Triangulo;

public class PoligonoFactory {
	public static Poligono getPoligono(int numLados) {
		if (numLados == 3) {
			return new Triangulo();
		} else if (numLados == 4) {
			return new Quadrado();
		} else if (numLados == 5) {
			return new Pentagono();
		} else {
			return null;
		}
	}
}
