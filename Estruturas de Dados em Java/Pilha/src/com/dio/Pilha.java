package com.dio;

public class Pilha {
	private No noEntradaPilha;

	public Pilha() {
		this.noEntradaPilha = null;
	}
	
	public No top() {
		return this.noEntradaPilha;
	}
	
	public void push(No novoNo) {
		No refAuxiliar = noEntradaPilha;
		noEntradaPilha = novoNo;
		noEntradaPilha.setReferencia(refAuxiliar);
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPopped = noEntradaPilha;
			noEntradaPilha = noEntradaPilha.getReferencia();
			return noPopped;
		}
		return null;
	}
	
	public boolean isEmpty() {
		if (noEntradaPilha == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String stringRetorno = "===============\n";
		stringRetorno += "     Pilha\n";
		stringRetorno += "===============\n";
		
		No noAuxiliar = noEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "No [dado = " + noAuxiliar.getDado() + "]\n";
				noAuxiliar = noAuxiliar.getReferencia();
			} else {
				break;
			}
		}
		
		stringRetorno += "===============\n";
		return stringRetorno;
	}
}
