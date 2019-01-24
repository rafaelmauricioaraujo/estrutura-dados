package br.com.estudos.java.collections;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleçoes", 24));
		
		Aluno a1 = new Aluno("Rafael Araujo", 34672);
		Aluno a2 = new Aluno("Teti Barreto", 5617);
		Aluno a3 = new Aluno("Dunga Doido", 5453);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos matriculados:");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		Aluno rafael = new Aluno("Rafael Araujo", 34672);
		System.out.println("E este Rafael, está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(rafael));
		
		System.out.println("O" + a1 + "é equals ao Rafael Araujo");
		System.out.println(a1.equals(rafael));
		
		
		
		
	}

}
