package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class EvitarChuva {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        String prevIda;
        String prevVolta;
        for (  int i = 0; i < N; i++  ) {
          prevIda = leitor.next();
          prevVolta = leitor.next();
        	if (  (prevIda.equalsIgnoreCase("chuva")) && (casaSobrando == 0)  ) {
            casaComprado++;
            trabSobrando++;
        	} else if (  (prevIda.equalsIgnoreCase("chuva")) && (casaSobrando > 0)  ) {
        	  casaSobrando--;
        	  trabSobrando++;
        	}
        	if (  (prevVolta.equalsIgnoreCase("chuva")) && (trabSobrando == 0)  ) {
        		 trabComprado++;
        		 casaSobrando++;
        	} else if (  (prevVolta.equalsIgnoreCase("chuva")) && (trabSobrando > 0)  ) {
        		trabSobrando--;
        		casaSobrando++;
        	}
        }
        System.out.println(casaComprado + " " + trabComprado);
        
        leitor.close();
    }
	
}
