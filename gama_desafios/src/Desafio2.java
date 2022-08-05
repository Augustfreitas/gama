package defaultPackage;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int codigo = 1234;
		int senha = 9999;
		int inputSenha, inputUsuario;

		System.out.print("Digite o código do usuário: ");
		inputUsuario = in.nextInt();

		if (inputUsuario == codigo) {
			System.out.print("Digite a senha: ");
			inputSenha = in.nextInt();
			if (inputSenha == senha) {
				System.out.println("Acesso permitido!");
			} else {
				System.out.println("Senha incorreta!");
			}
		} else {
			System.out.println("Usuário inválido!");
		}

		in.close();
	}
}
