package com.dio;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular<String> minhaLista = new ListaCircular<>();
		
		minhaLista.add("C1");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		
		System.out.println(minhaLista);
		
		minhaLista.add("C1");
		minhaLista.add("C2");
		minhaLista.add("C3");
		minhaLista.add("C4");
		
		System.out.println(minhaLista);
		
		System.out.println(minhaLista.get(0));
		System.out.println(minhaLista.get(1));
		System.out.println(minhaLista.get(2));
		System.out.println(minhaLista.get(3));
		System.out.println(minhaLista.get(4));
		System.out.println(minhaLista.get(5));
	}

}
