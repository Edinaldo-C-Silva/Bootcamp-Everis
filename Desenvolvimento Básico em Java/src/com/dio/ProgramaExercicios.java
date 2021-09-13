package com.dio;

import java.util.stream.IntStream;

public class ProgramaExercicios {

	public static void main(String[] args) {
		System.out.println("Edinaldo".toCharArray()); 
		System.out.println("Edinaldo Correia da Silva Junior".split(" "));
		//Deu algum erro...
		System.out.println("Edinaldo".concat(" Correia"));
		System.out.println("1234 asdf qw".replaceAll("[0-4]", "#"));
		
		IntStream.of(1,2,3,4,5).forEach(n -> {
			System.out.println(n);
		});
		
		IntStream.range(0,3).forEach(n -> {
			System.out.println("Número " + n);
		});
	}
}
