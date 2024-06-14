package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Mentoria [data= " + data + ", Titulo= " + getTitulo() + ", Descricao= " + getDescricao()+ "]";
	}

	@Override
	protected Double calcularXP() {

		return XP_CONTEUDO * 2;
	}

}
