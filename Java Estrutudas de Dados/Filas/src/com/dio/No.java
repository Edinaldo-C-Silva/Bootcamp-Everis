package com.dio;

public class No<T> {
	private T objeto;
	private No<T> Referencia;
	
	public No() {
		
	}
	
	public No(T objeto) {
		this.Referencia = null;
		this.objeto = objeto;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public No<T> getReferencia() {
		return Referencia;
	}

	public void setReferencia(No<T> referencia) {
		Referencia = referencia;
	}

	@Override
	public String toString() {
		return "No [objeto = " + objeto + "]";
	}
}
