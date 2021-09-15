package com.dio;

public class ListaCircular<T> {
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;
	}

	public int size() {
		return this.tamanhoLista;
	}
	
	public boolean isEmpty() {
		if(tamanhoLista == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("Lista vazia!");
		}
		
		if(index == 0) {
			return this.cauda;
		}
				
		No<T> auxiliar = this.cauda;
		
		for(int i = 0; (i < index) && (auxiliar != null); i++) {
			auxiliar = auxiliar.getProximoNo();
		}
		
		return auxiliar;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void remove(int index) {
		if(index >= this.size()) {
			throw new IndexOutOfBoundsException("Índice maior que a lista");
		} 
		
		No<T> auxiliar = this.cauda;
		
		if(index == 0) {
			this.cauda = this.cauda.getProximoNo();
			this.cabeca.setProximoNo(this.cauda);
		} else {
			if(index == 1) {
				this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
			} else {
				for (int i = 0; i < index; i++) {
					auxiliar = auxiliar.getProximoNo();
				}
				auxiliar.setProximoNo(auxiliar.getProximoNo().getProximoNo());
			}
		}
		this.tamanhoLista--;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if (this.isEmpty()) {
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setProximoNo(cauda);
		} else {
			novoNo.setProximoNo(cauda);
			this.cabeca.setProximoNo(novoNo);		
			this.cauda = novoNo;
		}
		
		this.tamanhoLista++;
	}

	@Override
	public String toString() {
		String str = "";
		
		No<T> auxiliar = this.cauda;
		
		for(int i = 0; i < this.size(); i++) {
			str += "No [conteudo = " + auxiliar.getConteudo() + "] ---> ";
			auxiliar = auxiliar.getProximoNo();
		}
		
		if(this.isEmpty()) {
			str += "[]";
		} else {
			str += "[Retorna ao início]";
		}
		
		return str;
	}
	
	
	
}
