package br.com.priss.megaSena;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class MegaSena {

	public static void main(String[] args) {
		Random rd = new Random();

		Scanner numJogos = new Scanner(System.in);
		// Pede ao usuário para inserir a quantidade de apostas.
		System.out.println("Quantas apostas você quer fazer?");
		// Guarda na variável apostas.
		int apostas = numJogos.nextInt();
		Scanner numeros = new Scanner(System.in);
		// Pede ao usuário para inserir a quantidade de números.
		System.out.println("Quantos números em cada jogo?");
		// Guarda na variável jogo.
		int jogo = numeros.nextInt();
		// Faz um teste se cada jogo possui entre 6 e 15 números, que são as regras da
		// Mega Sena, senão retorna erro.
		if (jogo < 6 || jogo > 15) {
			System.out.println("A quantidade de números no jogo é inválida");
		} else {
			// Se o usuário escolher um jogo que possua entre 6 e 15 números, o código gera
			// a quantidade de números desejada aleatoriamente, sem repetir números, de 1 a
			// 60.
			for (int i = 0; i < apostas; i++) {

				Set<Integer> numAleatorio = new LinkedHashSet<Integer>();
				while (numAleatorio.size() < jogo) {
					Integer maximo = rd.nextInt(60) + 1;
					// Explicando O "(60) + 1": Não poderia ser 61 pois ele começa a contar do zero,
					// então assim ele conta do 1 até 60.
					numAleatorio.add(maximo);
				}
				//Imprime a aposta com a quantidade de números.
				System.out.println(numAleatorio);
			}
		}

	}
}
