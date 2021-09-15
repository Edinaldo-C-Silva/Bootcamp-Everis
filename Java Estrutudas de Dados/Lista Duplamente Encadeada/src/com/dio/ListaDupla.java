package com.dio;

public class ListaDupla<T> {
	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	private int tamanhoLista;
	
	public ListaDupla() {
		this.tamanhoLista = 0;
		this.primeiroNo = null;
		this.ultimoNo = null;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> auxiliar = primeiroNo;
		
		for(int i = 0; (i < index) && (auxiliar != null); i++) {
			auxiliar = auxiliar.getProximo();
		}
		return auxiliar;
	}
	
	public T get(int index){
		return this.getNo(index).getConteudo();
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		
		novoNo.setProximo(null);
		novoNo.setAnterior(ultimoNo);
		
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		
		if(ultimoNo != null) {
			ultimoNo.setProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista++;
	}
	
	public void add(int index, T elemento) {
		NoDuplo<T> auxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		
		novoNo.setProximo(auxiliar);
		
		if(novoNo.getProximo() != null) {
			novoNo.setAnterior(auxiliar.getAnterior());
			novoNo.getProximo().setAnterior(novoNo);
		} else {
			novoNo.setAnterior(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		} else {
			novoNo.getAnterior().setProximo(novoNo);
		}
		
		tamanhoLista++;
	}
	
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getProximo();
			if(primeiroNo != null) {
				primeiroNo.setAnterior(null);
			}
		} else {
			NoDuplo<T> auxiliar = getNo(index);
			auxiliar.getAnterior().setProximo(auxiliar.getProximo());
			if(auxiliar != ultimoNo) {
				auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
			} else {
				ultimoNo = auxiliar;
			}
		}
		
		this.tamanhoLista--;
	}

	@Override
	public String toString() {
		String str = "";
		NoDuplo<T> auxiliar = primeiroNo;
		
		for(int i = 0; i < size(); i++) {
			str += "No [coteúdo = " + auxiliar.getConteudo() + "] ---> ";
			auxiliar = auxiliar.getProximo();
		}
		
		str += "null";
		
		return str;
	}
	
	
	
	
}
