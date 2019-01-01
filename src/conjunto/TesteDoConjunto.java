package conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDoConjunto {
	
	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Alemao");
		conjunto.adiciona("Dunga");
		conjunto.adiciona("Amor");
		conjunto.adiciona("Vivi");
		System.out.println(conjunto);
		
		conjunto.remove("Vivi");
		System.out.println(conjunto);
		
		
		Set<String> conjuntoJava = new HashSet<String>();
		conjuntoJava.add("Rafael");
		conjuntoJava.add("Teti");
		System.out.println("Conjunto Java: " + conjuntoJava);
		
		String nome = "Alemao";
		System.out.println(nome.hashCode());
		
	}
}
