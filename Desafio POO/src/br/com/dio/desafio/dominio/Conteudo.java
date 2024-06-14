package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final Double XP_CONTEUDO = 10d;

	private String titulo;

	private String descricao;

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Conteudo [titulo=" + titulo + ", descricao=" + descricao + "]";
	}

	protected abstract Double calcularXP();
}
