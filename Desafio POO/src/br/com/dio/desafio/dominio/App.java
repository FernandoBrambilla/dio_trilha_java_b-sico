package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso em java POO");
		curso1.setCargaHoraria(7);

		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso em javascript");
		curso2.setCargaHoraria(10);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descricao mentoria Java");
		mentoria1.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);

		Devs dev1 = new Devs();
		dev1.setNome("Fernando");
		dev1.inscreverBootcamp(bootcamp);
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos inscritos: " + dev1.getConteudosInscrtito());
		System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
		System.out.println("XP " + dev1.getNome() + "= " + dev1.calcularTotalXP());

		Devs dev2 = new Devs();
		dev2.setNome("Joao");
		dev2.inscreverBootcamp(bootcamp);
		dev2.progredir();
		System.out.println("Conteudos inscritos: " + dev2.getConteudosInscrtito());
		System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("XP " + dev2.getNome() + "= " + dev2.calcularTotalXP());

	}

}
