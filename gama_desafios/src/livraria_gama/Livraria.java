package livraria_gama;

import java.text.ParseException;

import static livraria_gama.Usuario.numeroMatricula;

public class Livraria {

	public static void main(String[] args) throws ParseException {
		Usuario user = new Usuario("Rodrigo", 111_111_111-11, "61 99999-9999", numeroMatricula());
		user.mostrarUsuario();
		System.out.println();
		Usuario user2 = new Usuario("Eric", 222_222_222-22, "61 99999-9999", numeroMatricula());
		user2.mostrarUsuario();
		System.out.println();
		Usuario user3 = new Usuario("Joao", 333_333_333-33, "61 99999-9999", numeroMatricula());
		user3.mostrarUsuario();

		Livro Harry_Potter = new Livro("Harry Potter","J.K.Rolling","22/07/2018",5,"Calice","");

		Emprestimo emprestimo = new Emprestimo(Harry_Potter,user,1);
//		System.out.println(emprestimo.dataEmprestimo());
//		System.out.println(emprestimo.dataPrevistaDevolucao());
		//emprestimo.dataFinalDevolucao(10);
		emprestimo.mostrarEmprestimo();

	}
}
