
public class VetorTeste {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jo�o");
		Aluno a2 = new Aluno("Jose");
		
		Vetor lista = new Vetor();
		
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		Aluno a3 = new Aluno("Rafael");
		System.out.println(lista.contem(a3));
		lista.adiciona(a3);
		System.out.println(lista.contem(a3));
		//System.out.println(lista.pega(200));
		
		System.out.println(lista.pega(2));
		
		lista.remove(1);
		System.out.println(lista);	
	}
}
