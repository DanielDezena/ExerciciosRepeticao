package br.com.generation.Repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0, total = 0, media;
		do {
			System.out.println("digite um n�mero: ");
			numero = ler.nextInt();
			if(numero % 3 == 0 && numero !=0){
				soma+=numero;
				total++;
			}
			
		}while(numero !=0);
		ler.close();
		media = soma/total;
		System.out.println("a m�dia dos valores m�ltiplos de 3 foi de: " + media);

	}

}
