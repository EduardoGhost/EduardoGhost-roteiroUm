package com.example.demo.entidades;

public class Disciplina {
	private int id;
	private String nome;
	private double nota;
	private String disciplina;
	
	public Disciplina() {
		this.disciplina = "disciplina";
	}
	
	public Disciplina(int id, String nome, double nota, String disciplina) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.disciplina = disciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
