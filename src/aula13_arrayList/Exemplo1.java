package aula13_arrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * - ArrayList
 * - Array Dinamico
 * - Pode ser alterado em tempo de execucao
 * - Framework Collection
 * - Java.util
 * 
 * 
 * 
 */
public class Exemplo1 {
	
	public static void main(String[] args) {
		
		// instanciar um ArrayList()
		ArrayList<String> carros = new ArrayList<String>();
		
		// metodo para adicionar elementos no ArrayList carros - metodo add()
		carros.add("BMW");
		carros.add("Ferrari");
		carros.add("Mercedes");
		carros.add("Audi");
		carros.add("Toyota");
		
		// imprimir todos os elementos do ArrayList carros
		System.out.println(carros);
		
		// acessar um elemento especifico do ArrayList - metodo get()
		System.out.println("Carro: " + carros.get(2));
		
		// alterar um elemento do ArrayList - metodo set()
		carros.set(2, "Chevrolet");
		
		System.out.println(carros);
		
		// remover um elemento do ArrayList - metodo remove()
		carros.remove(2);
		System.out.println(carros);
		
		// apaga todos os elementos do ArrayList - metodo clear()
		// carros.clear();
		// System.out.println(carros);
		
		System.out.println("==============================");
		
		// obter o tamanho do ArrayList - metodo size()
		System.out.println("Tamanho array: " + carros.size());
		
		// percorrer o ArrayList com for
		for (int i = 0; i < carros.size(); i++) {
			System.out.printf("Carro %d: %s\n", i+1, carros.get(i));
		}
		
		//percorrer o ArrayList com foreach
		int i = 0; // definindo um contador
		for(String carro : carros) {
			System.out.printf("%d - %s \n", i+1, carro);
			i++;
		}
		
		System.out.println("==============================");
		
		//obter o indice(posicao) de um elemento especifico - metodo indexOf
		System.out.println("Índice: " + carros.indexOf("Toyota"));
		
		// verificar ocorrencias de um elemento especifico - metodo contains
		System.out.println("Contém: " + carros.contains("HB20"));
		
		// formatando a saída com operador ternário
		System.out.println("Contém: " + (carros.contains("HB20") ? "sim" : "não"));
		
		System.out.println("=======================");
		
		// ArrayList - Integer(int)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		// populando o ArrayList
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(4);
		numeros.add(2);
		numeros.add(23);
		
		System.out.println(numeros);
		for (Integer n : numeros) {
			System.out.println(n);
		}
		
		// ordenar um ArrayList - metodo sort()
		Collections.sort(numeros);
		System.out.println(numeros);
	}
}
