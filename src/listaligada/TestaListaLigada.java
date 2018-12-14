package listaligada;

public class TestaListaLigada {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		 
		System.out.println(lista);
		lista.adicionaNoComeco("Alemao");
		System.out.println(lista);
		lista.adicionaNoComeco("Teti");
		System.out.println(lista);
		lista.adicionaNoComeco("Dunga");
		System.out.println(lista);
		lista.adicionaNoComeco("Vivi");
	}
}
