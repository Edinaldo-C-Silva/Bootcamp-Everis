package com.dio;

import java.io.IOException;
import java.util.Scanner;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Preencher{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X).setScale(6, RoundingMode.HALF_UP);
        for (  int i = 1; i < N.length; i++  ) {
        	N[i] = N[i - 1].divide(new BigDecimal("2.00"), MathContext.UNLIMITED);
        }
        
        for (  int i = 0; i < N.length; i++  ) {
        	System.out.println(String.format("N[" + i + "] = %.4f", N[i].setScale(4, RoundingMode.HALF_EVEN)));
        }
        
        leitor.close();
    }
}