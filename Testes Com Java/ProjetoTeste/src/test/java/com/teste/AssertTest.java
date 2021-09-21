package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {
	@Test
	public void testeArray(){
		byte[] esperado = "teste".getBytes();
		byte[] usado = "teste".getBytes();
		assertArrayEquals(esperado, usado);
	}
	
	@Test
	public void testeEquals(){
		assertEquals("texto", "texto");
	}
	
	@Test
	public void testeFalse(){
		assertFalse(false);
	}
	
	@Test
	public void testeSame(){
		Integer numero = 7;
		assertSame(numero, numero);
	}
	
	@Test
	public void testeNotSame(){
		assertNotSame(new Object(), new Object());
	}
	
	@Test
	public void testeNull(){
		assertNull(null);
	}
	
	@Test
	public void testeNotNull(){
		assertNotNull(new Object());
	}
}
