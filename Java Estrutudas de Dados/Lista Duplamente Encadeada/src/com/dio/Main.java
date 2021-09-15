package com.dio;

public class Main {

	public static void main(String[] args) {
		
		ListaDupla<String> minhaLista = new ListaDupla<>();
		
		minhaLista.add("C1");
		minhaLista.add("C2");
		minhaLista.add("C3");
		minhaLista.add("C4");
		minhaLista.add("C5");
		minhaLista.add("C6");
		minhaLista.add("C7");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(3);
		minhaLista.add(3, "C99");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(6);
		
		System.out.println(minhaLista);
		
	}
}
