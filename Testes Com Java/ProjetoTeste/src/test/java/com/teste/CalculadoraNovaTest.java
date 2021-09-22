package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {
	
	@Test
	public void somarDois() {
		int n1 = 1;
		int n2 = 2;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(n1, n2);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void somarTres() {
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(n1, n2, n3);
		
		assertEquals(6, soma);
	}
}
