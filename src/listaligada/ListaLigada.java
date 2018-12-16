package listaligada;

public class ListaLigada {
	
	Celula primeira = null;
	Celula ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			
			atual = atual.getProxima();
		}
		
		builder.append("]");
		return builder.toString();
	}
	
	public void adiciona(Object elemento) {		
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			this.ultima.setAnterior(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoComeco(elemento);
		}else if (posicao == this.totalDeElementos){
			this.adiciona(elemento);
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Ocupada");
		}
		Celula atual = primeira;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		}else {
			this.primeira = this.primeira.getProxima();
			this.totalDeElementos--;
		}
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean contem(Object o) {
		return false;
	}
	
	public void remove(int posicao) {
		
	}
}