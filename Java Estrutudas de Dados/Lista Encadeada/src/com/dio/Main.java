package com.dio;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaListaE = new ListaEncadeada<>();
		
		minhaListaE.add("Teste1");
		minhaListaE.add("Teste2");
		minhaListaE.add("Teste3");
		minhaListaE.add("Teste4");
		
		System.out.println("Banana");
		
		System.out.println(minhaListaE.get(0));
		System.out.println(minhaListaE.get(1));
		System.out.println(minhaListaE.get(2));
		System.out.println(minhaListaE.get(3));
		
		System.out.println("Batata");
	}

}
