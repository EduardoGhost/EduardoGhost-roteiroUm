package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entidades.Disciplina;

@Service
public class DisciplinaService {
	
	private List<Disciplina> disciplinaAlternativa = new ArrayList<>();

	public Disciplina getDisciplina(String nome) {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		return disciplina;
	}
	public Disciplina setNovaDisciplina(Disciplina novaDisciplina) {
		disciplinaAlternativa.add(novaDisciplina);
		return disciplinaAlternativa.get(disciplinaAlternativa.size() - 1);
	}
	
}
