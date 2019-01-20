package br.com.estudos.java.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rafael Araujo");
		alunos.add("Nathercia Barreto");
		alunos.add("Dunga Doido");
		alunos.add("Vivi Princesa");
		alunos.add("Gigi Surtada");
		
		System.out.println(alunos);
		
		boolean rafaelEstaPresente = alunos.contains("Rafael Araujo");
		System.out.println(rafaelEstaPresente);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println("aluno:" + aluno);
		});
		
	}

}
