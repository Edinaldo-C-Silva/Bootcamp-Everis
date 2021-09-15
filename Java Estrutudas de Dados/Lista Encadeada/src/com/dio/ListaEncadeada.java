package com.dio;

public class ListaEncadeada<T> {
	
	private No<T> refEntrada;

	public ListaEncadeada() {
		this.refEntrada = null;
	}
	
	public boolean isEmpty() {
		if (refEntrada == null) {
			return true;
		} else {
			return true;
		}
	}
	
	private No<T> getNo(int index){
		validaIndice(index);
		
		No<T> auxiliar = refEntrada;
		No<T> noRetorno = null;
		
		for (int i=0; i<=index;i++) {
			noRetorno = auxiliar;
			auxiliar = auxiliar.getProximoNo();
		}
		
		return noRetorno;
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
			int indice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + ". Esta lista só vai até o índice " + indice + ".");
		}
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> auxiliar = refEntrada;
		
		while(true) {
			if (auxiliar != null) {
				tamanhoLista++;
				if(auxiliar.getProximoNo() != null) {
					auxiliar = auxiliar.getProximoNo();
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return tamanhoLista;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<T>(conteudo);
		
		if (this.isEmpty()) {
			refEntrada = novoNo;
			return;
		} 
		
		No<T> auxiliar = refEntrada;
		for (int i=0; i<this.size() -1;i++) {
			auxiliar = auxiliar.getProximoNo();
		}
		
		auxiliar.setProximoNo(novoNo);
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	public T remove(int index) {
		validaIndice(index);
		No<T> noRemover = this.getNo(index);
		
		if(index == 0) {
			refEntrada = noRemover.getProximoNo();
			return noRemover.getConteudo();
		}
		
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noRemover.getProximoNo());
		return noRemover.getConteudo();
	}

	@Override
	public String toString() {
		String str = "";
		No<T> auxiliar = refEntrada;
		
		for(int i=0; i<size(); i++) {
			str += "No [conteudo = " + auxiliar.getConteudo() + "] ----> ";
			auxiliar = auxiliar.getProximoNo();
		}
		str += "null";
		
		return str;
	}

	public No<T> getRefEntrada() {
		return refEntrada;
	}

	public void setRefEntrada(No<T> refEntrada) {
		this.refEntrada = refEntrada;
	}
	
	
	
}
