package br.com.priss.escolheMes;

import java.util.Scanner;

public class escolheMes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Pede ao usuário para inserir um número
		System.out.print("Insira o número do mês: ");
		//Guarda na variável mes
		int mes;

		mes = input.nextInt();
		//recebe o input e testa os cases, se for dentro dos 12 cases ele retorna o mês, 
		//senão, retorna erro
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês Inválido");
			break;
		}
	}
}
