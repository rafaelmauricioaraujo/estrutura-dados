package pilha;

public class TestaPilha {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.insere("Rafael");
		System.out.println(pilha);
		
		pilha.insere("Teti");
		System.out.println(pilha);
		
		pilha.insere("Dunga");
		System.out.println(pilha);
		
		String r1 = pilha.remove();
		
		System.out.println(pilha);
		String r2 = pilha.remove();
		String r3 = pilha.remove();
		
		System.out.println(pilha);
		
	}

}
