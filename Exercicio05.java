package br.com.generation.Repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;
		do {
			System.out.println("digite um número: ");
			numero = ler.nextInt();
			soma += numero;
		}while(numero !=0);
		ler.close();
		System.out.println("valor total dos valores somados: " + soma);

	}

}
