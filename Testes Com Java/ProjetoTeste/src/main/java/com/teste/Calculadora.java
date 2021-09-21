package com.teste;

public class Calculadora {
	
	
	public int somar(String expressao) {
		int soma = 0;
		for(String valor : expressao.split("\\+")) {
			soma += Integer.valueOf(valor);
		}
		
		System.out.println(soma);
		return soma;
	}
}
