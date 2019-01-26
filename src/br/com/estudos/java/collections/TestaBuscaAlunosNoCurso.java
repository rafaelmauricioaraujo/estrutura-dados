package br.com.estudos.java.collections;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole�oes", 24));
		
		Aluno a1 = new Aluno("Rafael Araujo", 34672);
		Aluno a2 = new Aluno("Teti Barreto", 5617);
		Aluno a3 = new Aluno("Dunga Doido", 5453);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem � o aluno com matr�cula 5617? ");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
		
	}

}
