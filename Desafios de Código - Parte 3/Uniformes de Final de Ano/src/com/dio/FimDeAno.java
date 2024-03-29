package com.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class FimDeAno {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int linhas = Integer.parseInt(st.nextToken());
        List<Uniforme> uniformes = new ArrayList<>();

        for (int i = 0; i <= linhas; i++) {
            var next = br.readLine();
            if(next.equals("0")) {
                break;
            }
            Uniforme uniforme = new Uniforme();
            uniforme.setNomeEstudante(next);
            var camiseta = br.readLine().split(" ");
            uniforme.setCorUniforme(camiseta[0]);
            uniforme.setTamUniforme(camiseta[1]);
            uniformes.add(uniforme);
        }
        Comparator<Uniforme> comparator = Comparator
                .comparing(Uniforme::getCorUniforme).reversed()
                .thenComparing(Uniforme::getTamUniforme).reversed()
                .thenComparing(Uniforme::getNomeEstudante);

        uniformes.stream().sorted(comparator).forEach(System.out::println);
    }
}
