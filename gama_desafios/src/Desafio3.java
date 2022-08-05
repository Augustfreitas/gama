package defaultPackage;

// scanner não estava importado
import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		// Criação da variavel scanner
		Scanner sc = new Scanner(System.in);

		// Declaração das variaves
		int n1, n2, n3;

		// Entrada
		System.out.print("Entre com o primeiro inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Entre com o segundo inteiro: ");
		n2 = sc.nextInt();
		System.out.print("Entre com o terceiro inteiro: ");
		n3 = sc.nextInt();

		// Verifica maior e menor utilizando entrada de dados do usuario
		if (n1 > n2) {
			if (n1 > n3) {
				if (n2 < n3) {
					System.out.println("O menor numero eh: " + n2);
				} else {
					System.out.println("O menor numero eh: " + n3);
				}
				System.out.println("O maior numero eh: " + n1);
			} else {
				if (n1 < n2) {
					System.out.println("O menor numero eh: " + n1);
				} else {
					System.out.println("O menor numero eh: " + n2);
				}
				System.out.println("O maior numero eh: " + n3);
			}
			
			
		// Verifica maior e menor utilizando entrada de dados do usuario
		} 
		else {
			if (n2 > n3) {
				if (n1 < n3) {
					System.out.println("O menor numero eh: " + n1);
				} else {
					System.out.println("O menor numero eh: " + n3);
				}
				System.out.println("O maior numero eh: " + n2);
			} else {
				if (n1 < n2) {
					System.out.println("O menor numero eh: " + n1);
				} else {
					System.out.println("O menor numero eh: " + n2);
				}
				System.out.println("O maior numero eh: " + n3);
			}
		}
		// scaner não foi fechado
		sc.close();
		
	} //fechado chave que estava faltando
}
