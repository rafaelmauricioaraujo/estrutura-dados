package pilha;

import java.util.Stack;

public class TestaPilha {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push("Rafael");
		System.out.println(pilha);
		
		pilha.push("Teti");
		System.out.println(pilha);
		
		pilha.push("Dunga");
		System.out.println(pilha);
		System.out.println(pilha.vazio());
		
		String r1 = pilha.pop();
		
		System.out.println(pilha);
		String r2 = pilha.pop();
		String r3 = pilha.pop();
		
		System.out.println(pilha);
		System.out.println(pilha.vazio());
		
		Stack<String> strings = new Stack<String>();
		
	}

}
