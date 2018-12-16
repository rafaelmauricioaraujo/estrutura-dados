package listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		 
		System.out.println(lista);
		lista.adicionaNoComeco("Alemao");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Teti");
		System.out.println(lista.tamanho());
		
		lista.adiciona("Gigi");
		
		System.out.println(lista);
		
		lista.adiciona(2, "Dunga");
		System.out.println(lista);
		
		lista.adiciona(2, "Vivi");
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.removeDoFim();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.adiciona("Rafael");
		lista.adiciona("Nathercia");
		System.out.println(lista);
		
		lista.remove(4);
		System.out.println(lista);
		
		System.out.println(lista.contem("Rafael"));
		System.out.println(lista.contem("Gigi"));
		
	}
}