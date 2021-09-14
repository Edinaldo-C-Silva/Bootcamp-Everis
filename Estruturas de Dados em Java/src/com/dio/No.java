package com.dio;

//Classe No recebe um tipo gen�rico
public class No<T> {
	// O tipo do conte�do ser� especificado na cria��o do objeto
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo = " + conteudo + "]";
	}
	
	
}
