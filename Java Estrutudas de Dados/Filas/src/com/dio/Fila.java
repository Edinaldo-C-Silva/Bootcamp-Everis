package com.dio;

public class Fila {
	private No refEntrada;

	public Fila() {
		this.refEntrada = null;
	}
	
	public void enqueue(No novoNo) {
		novoNo.setReferencia(refEntrada);
		refEntrada = novoNo;
	}
	
	public No dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntrada;
			No auxiliar = refEntrada;
			while(true) {
				if(primeiroNo.getReferencia() != null) {
					auxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferencia();
					} else {
						auxiliar.setReferencia(null);
						break;
				}
			}
			return primeiroNo;
		} else {
			return null;
		}
	}
	
	public No first() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntrada;
			while(true) {
				if(primeiroNo.getReferencia() != null) {
					primeiroNo = primeiroNo.getReferencia();
					} else {
						return primeiroNo;
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
		No auxiliar = refEntrada;
		
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
