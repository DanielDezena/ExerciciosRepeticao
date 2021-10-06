package br.com.generation.Repeticao;



import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		int idade, genero, status, contagem = 0, 
			sit1 = 0, sit2 = 0, sit3 = 0, sit4 = 0, sit5 = 0, sit6= 0;
		while(contagem < 150) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("digite a idade da " +
		    (contagem + 1) + "ª pessoa: "));
			genero = Integer.parseInt(JOptionPane.showInputDialog("digite o gênero da " +
				    (contagem + 1) + "ª pessoa: \n(1) feminino (2) masculino (3) outros"));
			status = Integer.parseInt(JOptionPane.showInputDialog("digite o status da " +
				    (contagem + 1) + "ª pessoa: \n(1) calma (2) nervosa (3) agressiva"));
			contagem++;
			if(status == 1) {
				sit1++;
			}
			if(genero == 1 && status == 2) {
				sit2++;
			}
			if(genero == 2 && status == 3) {
				sit3++;
			}
			if(genero == 3 && status ==1) {
				sit4++;
			}
			if(idade > 40 && status ==3) {
				sit5++;
			}
			if(idade < 18 && status ==1) {
				sit6++;
			}
			
		}
		JOptionPane.showMessageDialog(null, "Resultados:\ntotal de pessoas calmas: " + sit1+
				"\ntotal de mulheres nervosas: " + sit2 + "\ntotal de homens agressivos :" +
				sit3 + "\ntotal de outres calmes: " + sit4 + "\ntotal de idosos agressivos acima de 40 anos: " + 
				sit5 + "\ntotal de jovens menores de 18 anos calmos: " + sit6);

	}

}
