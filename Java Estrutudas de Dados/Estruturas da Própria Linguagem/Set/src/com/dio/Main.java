package com.dio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Carro> hashSetCarro = new HashSet<>();
		
		hashSetCarro.add(new Carro("Ford"));
		hashSetCarro.add(new Carro("Chevrolet"));
		hashSetCarro.add(new Carro("Fiat"));
		hashSetCarro.add(new Carro("Peugeot"));
		hashSetCarro.add(new Carro("Zip"));
		hashSetCarro.add(new Carro("Alfa Romeo"));
		
		System.out.println(hashSetCarro);
		
		Set<Carro> treeSetCarro = new TreeSet<>();
		
		treeSetCarro.add(new Carro("Ford"));
		treeSetCarro.add(new Carro("Chevrolet"));
		treeSetCarro.add(new Carro("Fiat"));
		treeSetCarro.add(new Carro("Peugeot"));
		treeSetCarro.add(new Carro("Zip"));
		treeSetCarro.add(new Carro("Alfa Romeo"));
		
		System.out.println(treeSetCarro);
		
	}
}
