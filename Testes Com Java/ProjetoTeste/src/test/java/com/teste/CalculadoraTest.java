package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}
	
	//Mockar calculadora
	//A dependencia não funciona??
	//@Test
	//public void testeSomarMock() {
		//Calculadora calcm = mock(Calculadora.class);
		
		//when(calcm.somar("1+2")).thenReturn(10);
	
		//int resultado = calcm.somar("1+2");
	
		//assertEquals(10, resultado);
	//}
}
