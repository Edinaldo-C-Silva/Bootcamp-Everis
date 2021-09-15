package com.dio;

public class No {
	private Object objeto;
	private No Referencia;
	
	public No() {
		
	}
	
	public No(Object objeto) {
		this.Referencia = null;
		this.objeto = objeto;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public No getReferencia() {
		return Referencia;
	}

	public void setReferencia(No referencia) {
		Referencia = referencia;
	}

	@Override
	public String toString() {
		return "No [objeto = " + objeto + "]";
	}
}
