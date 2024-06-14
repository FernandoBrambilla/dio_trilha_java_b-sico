package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {

	private String nome;

	private Set<Conteudo> conteudosInscrtito = new LinkedHashSet<>();

	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudosInscrtito() {
		return conteudosInscrtito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setConteudosInscrtito(Set<Conteudo> conteudosInscrtito) {
		this.conteudosInscrtito = conteudosInscrtito;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscrtito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Devs other = (Devs) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscrtito, other.conteudosInscrtito) && Objects.equals(nome, other.nome);
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscrtito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscrtito.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscrtito.remove(conteudo.get());
		} else {
			System.err.println("Nao matriculado em nenhum conteudo");
		}
	}

	public Double calcularTotalXP() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
	}
}
