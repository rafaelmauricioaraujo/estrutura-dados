package br.com.estudos.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayList", 21);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
