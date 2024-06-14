package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private Integer cargaHoraria;

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria= " + cargaHoraria + ", Titulo= " + getTitulo() + ", Descricao= " +getDescricao() + "]";
	}

	@Override
	protected Double calcularXP() {
		return XP_CONTEUDO * getCargaHoraria();
	}

}
