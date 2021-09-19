package com.dio;

public class Fila<T> {
	private No<T> refEntrada;

	public Fila() {
		this.refEntrada = null;
	}
	
	public void enqueue(T obj) {
		No<T> novoNo = new No<T>(obj);
		novoNo.setReferencia(refEntrada);
		refEntrada = novoNo;
	}
	
	@SuppressWarnings("unchecked")
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refEntrada;
			No<T> auxiliar = refEntrada;
			while(true) {
				if(primeiroNo.getReferencia() != null) {
					auxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferencia();
					} else {
						auxiliar.setReferencia(null);
						break;
				}
			}
			return (T) primeiroNo.getObjeto();
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T first() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refEntrada;
			while(true) {
				if(primeiroNo.getReferencia() != null) {
					primeiroNo = primeiroNo.getReferencia();
					} else {
						return (T) primeiroNo.getObjeto();
				}
			}
		} else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		if(refEntrada == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No<T> auxiliar = refEntrada;
		
		if(refEntrada != null) {
			while(true) {
				stringRetorno += "No [objeto = " + auxiliar.getObjeto() + "] ---> ";
				if(auxiliar.getReferencia() != null) {
					auxiliar = auxiliar.getReferencia();
				} else {
					stringRetorno += "Null";
					break;
				}
			}
		} else {
			stringRetorno = "Null";
		}
		
		return stringRetorno;
	}
	
	
}
