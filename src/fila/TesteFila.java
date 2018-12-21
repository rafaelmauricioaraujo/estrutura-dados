package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Rafael");
		fila.adiciona("Teti");
		
		System.out.println(fila);
		
		String primeiro = fila.remove();
		
		System.out.println(primeiro);
		
		System.out.println(fila);
		
		//Java ja tem uma Fila
		
		Queue<String> filaDoJava = new LinkedList<String>();
		filaDoJava.add("Dunga");
		filaDoJava.add("Vivi");
		System.out.println(filaDoJava);
		
		filaDoJava.poll();
		System.out.println(filaDoJava);
		
	}
	
}
