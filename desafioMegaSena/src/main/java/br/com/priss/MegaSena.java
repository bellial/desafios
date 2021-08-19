package br.com.priss;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class MegaSena {
	
	public static void main(String[] args) {
	Random rd = new Random();
	
	Scanner jogos = new Scanner(System.in);
	
    System.out.println("Quantos jogos você quer fazer?");
    int apostas = jogos.nextInt(); 
    Scanner numeros = new Scanner(System.in);
    System.out.println("Quantos números em cada jogo?");
    int numApostas = numeros.nextInt();
	
    if(numApostas < 6 || numApostas > 15) {
    	System.out.println("Número Inválido");
    }else {
    	for (int i=0; i<apostas; i++) {
    		
    		Set<Integer> aleatorio = new LinkedHashSet<Integer>();
    		while (aleatorio.size() < numApostas) 
    		{
    		    Integer next = rd.nextInt(60) + 1;
    		    // não pode ser 61 pois ele começa do zero, então seria do zero ate 59.
    		aleatorio.add(next);
    		}
    		System.out.println(aleatorio);
    	}
    }
	
}
}

