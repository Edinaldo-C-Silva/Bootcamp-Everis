package com.dio;

public class Main {

	public static void main(String[] args) {
		
		//Especifica que o nó será de String
		//O conteúdo deste nó só receberá String
		No<String> no1 = new No<String>("Conteúdo do Nó 1");
		
		No<String> no2 = new No<String>("Conteúdo do Nó 2");
		
		No<String> no3 = new No<String>("Conteúdo do Nó 3");
		
		No<String> no4 = new No<String>("Conteúdo do Nó 4");
		
		no1.setProximoNo(no2);
		//Nó 1 aponta para o nó 2
		no2.setProximoNo(no3);
		//Nó 2 aponta para o nó 3
		no3.setProximoNo(no4);
		//Nó 3 aponta para o nó 4
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}

}
