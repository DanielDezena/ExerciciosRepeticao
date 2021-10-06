package br.com.generation.Repeticao;

public class Exercicio02 {
	public static void main(String[] args) {
		int numero, impar= 0, par = 0;
		for(numero = 1; numero <= 10; numero++) {
			if(numero%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("==total de números pares: " + par + 
				"\ntotal de números ìmpares: " + impar);
	}

}
