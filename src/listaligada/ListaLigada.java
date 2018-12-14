package listaligada;

public class ListaLigada {
	
	Celula primeiro = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeiro);
		this.primeiro = nova;
		
		this.totalDeElementos++;
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