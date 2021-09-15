package com.dio;

public class Main {

	public static void main(String[] args) {
		
		//Especifica que o n� ser� de String
		//O conte�do deste n� s� receber� String
		No<String> no1 = new No<String>("Conte�do do N� 1");
		
		No<String> no2 = new No<String>("Conte�do do N� 2");
		
		No<String> no3 = new No<String>("Conte�do do N� 3");
		
		No<String> no4 = new No<String>("Conte�do do N� 4");
		
		no1.setProximoNo(no2);
		//N� 1 aponta para o n� 2
		no2.setProximoNo(no3);
		//N� 2 aponta para o n� 3
		no3.setProximoNo(no4);
		//N� 3 aponta para o n� 4
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}

}
