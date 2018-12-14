package listaligada;

public class ListaLigada {
	
	Celula primeiro = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeiro);
		this.primeiro = nova;
		
		this.totalDeElementos++;
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeiro;
		
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			
			atual = atual.getProximo();
		}
		
		builder.append("]");
		return builder.toString();
	}
	
	public void adiciona(Object elemento) {
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		
	}
	
	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object o) {
		return false;
	}
	
	

}