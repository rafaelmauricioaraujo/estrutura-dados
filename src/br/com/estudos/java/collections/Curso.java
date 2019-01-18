package br.com.estudos.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	// Deixando o cógido mais genérico, mais polimorfico com a classe List
	private List<Aula> aulas = new ArrayList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

}
