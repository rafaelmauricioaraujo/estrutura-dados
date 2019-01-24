package br.com.estudos.java.collections;

public class Recibo {
	
	int numero = 0;
	String desc;
	
	public Recibo(int numero, String desc) {
		this.numero = numero;
		this.desc = desc;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
