package br.com.estudos.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	// Deixando o c�gido mais gen�rico, mais polimorfico com a classe List
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[" + this.nome + ", tempo total: " + this.getTempoTotal() + " Aulas: " + this.getAulas() + " ]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		 
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) { 
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		for (Aluno aluno : alunos) {
			if(aluno.getNumeroMatricula() == numero) {
				return aluno;
			}
		}
		throw new NoSuchElementException("Aluno n�o encontrado");
		
	}

}
