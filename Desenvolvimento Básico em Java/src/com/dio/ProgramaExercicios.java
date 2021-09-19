package com.dio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.stream.IntStream;

public class ProgramaExercicios {

	public static void main(String[] args) {
		//Exercício Strings
		System.out.println("Edinaldo".toCharArray()); 
		System.out.println("a b".split(" "));
		System.out.println("Edinaldo".concat(" Correia"));
		System.out.println("1234 asdf qw".replaceAll("[0-4]", "#"));
		
		//Exercício forEach
		IntStream.of(1,2,3,4,5).forEach(n -> {
			System.out.println(n);
		});
		
		IntStream.range(0,3).forEach(n -> {
			System.out.println("Número " + n);
		});
		
		//Exercício datas
		//Comparar minha data de nascimento com 15/05/2010
		Date nascimento = new Date(888462000000l);
		System.out.println(nascimento);
		System.out.println(nascimento.toInstant());
		
		Date dataComparar = new Date(12738924000000l);
		System.out.println(nascimento.compareTo(dataComparar));
				
		//Exercício DateFormat
		Date atual = new Date();
		System.out.println(atual);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
		String dataFormatada = formatter.format(atual);
		System.out.println(dataFormatada);
		
		//Exercício LocalDateTime
		LocalDate umDia = LocalDate.of(2010, 05, 15);
		LocalTime umaHora = LocalTime.of(10, 0, 0);
		LocalDateTime diaHora = LocalDateTime.of(umDia, umaHora);
		System.out.println(diaHora);
		
		LocalDateTime outroDiaHora = diaHora.plusYears(4).plusMonths(6).plusHours(13);
		System.out.println(outroDiaHora);
	}
}
