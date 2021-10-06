package br.com.generation.Repeticao;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		int idade = 0, idosos = 0, jovens = 0, total = 0;
		while(idade != -99) {
			idade = Integer.parseInt(JOptionPane.showInputDialog(
					"insira a idade(digitando -99 fecha o sistema): "));
			
			if(idade<0 && idade != -99 || idade > 121) {
				JOptionPane.showMessageDialog(null, "valor inválido!");
			}else if(idade >= 0 && idade < 22) {
				jovens++;
				total++;
			}else if(idade > 50 && idade < 121) {
				idosos++;
				total++;
			}else if(idade > 21 && idade < 50){
				total++;
			}
		}
		JOptionPane.showMessageDialog(null, "número total de idades coletadas"+ 
		total + "\ntotal de pessoas menores de 21 anos: " + jovens + 
		"\ntotal de pessoas com mais de 50 anos: " + idosos);
	}

}
