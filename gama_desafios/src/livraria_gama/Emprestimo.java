package livraria_gama;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;

public class Emprestimo {

	private LocalDate dataDeEmprestimo;
	private LocalDate dataPrevistaDeDevulcao;
	private LocalDate dataDeEntregaReal;
	private int situacao;
	private Livro titulo;

	private Usuario usuario;
	LocalDate data = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private double multa = 0.5;

	Livro livro = new Livro();
	Usuario usuarioFinal = new Usuario();

	public Emprestimo(Livro titulo, Usuario usuario ,int situacao) {
		this.dataDeEmprestimo = data;
		this.dataPrevistaDeDevulcao = LocalDate.parse(dataPrevistaDevolucao(),formatter);
		this.situacao = situacao;
		this.titulo = titulo;
		this.usuario = usuario;
	}

	public Emprestimo() {

	}

	public LocalDate getDataDeEmprestimo() {

		return dataDeEmprestimo;
	}

	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {

		this.dataDeEmprestimo = dataDeEmprestimo;
	}

	public LocalDate getDataPrevistaDeDevulcao() {

		return dataPrevistaDeDevulcao;
	}

	public void setDataPrevistaDeDevulcao(LocalDate dataPrevistaDeDevulcao) {
		this.dataPrevistaDeDevulcao = dataPrevistaDeDevulcao;
	}

	public LocalDate getDataDeEntregaReal() {

		return dataDeEntregaReal;
	}

	public void setDataDeEntregaReal(LocalDate dataDeEntregaReal) {

		this.dataDeEntregaReal = dataDeEntregaReal;
	}

	public String getSituacao() {
		String Situacao;
		if (situacao == 1){
			Situacao = "Em aberto.";
		}else {
			Situacao ="Fechada";
		}
		return Situacao;
	}

	public void setSituacao(int situacao) {

		this.situacao = situacao;
	}

	public String dataEmprestimo() {
		return data.format(formatter);
	}

	public String dataPrevistaDevolucao() {
		LocalDate dataDevolucao = data.plusDays(3);
		return dataDevolucao.format(formatter);
	}


	public String dataFinalDevolucao(int dias) {
		LocalDate datafinalDevolucao = data.plusDays(dias);
		LocalDate dataPrevistaDevolucao = LocalDate.parse(dataPrevistaDevolucao(),formatter);
		Period periodo = Period.between(dataPrevistaDevolucao,datafinalDevolucao);
		int diasDiferenca = periodo.getDays();
		if (diasDiferenca > 0 ) {
			multa *= diasDiferenca;
			System.out.printf("Multa de entrega atrasada: R$%.2f", multa);
		}
		return datafinalDevolucao.format(formatter);

	}

	public void situacao(){

	}

	public void mostrarEmprestimo() {
		System.out.println(
					"Livro: "+titulo.getTitulo()+
					"Usuario: "+usuario.getNome()+
					"\nData do emprestimo: "+dataEmprestimo()+
					"\nData prevista de devolução: "+dataPrevistaDevolucao()+
					"\nData de devolução: "+dataPrevistaDevolucao()+
					"\nSituação: " + getSituacao()
				);
	}

}