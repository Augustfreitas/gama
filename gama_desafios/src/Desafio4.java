package defaultPackage;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
		// Variaveis
		Scanner in = new Scanner(System.in);
		String[] nome = new String[3];
		int[] idade = new int[3];
		Double[] altura = new Double[3];
		int qntPessoas = 0;

		// Entrada
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite seu nome: ");
			nome[i] = in.next();
			System.out.println("Digite sua idade: ");
			idade[i] = in.nextInt();
			System.out.println("Digite sua altura: ");
			altura[i] = in.nextDouble();
		}
		// Processamento
		for (int i = 0; i < 3; i++) {
			if (idade[i] > 25 && altura[i] > 1.75) {
				qntPessoas++;
			}
		}
		// Exibe o resultado
		System.out.println("O numero de pessoas que participaram da pesquisa acima de 25 anos e maiore sque 1,75m é: "+ qntPessoas);
		
		in.close();//<== Fecha o scanner
	}
}
