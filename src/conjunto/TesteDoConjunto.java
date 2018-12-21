package conjunto;

import java.util.LinkedList;

public class TesteDoConjunto {
	
	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Alemao");
		conjunto.adiciona("Dunga");
		conjunto.adiciona("Amor");
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Vivi");
		System.out.println(conjunto);
		
		conjunto.remove("Vivi");
		System.out.println(conjunto);
	}
}
