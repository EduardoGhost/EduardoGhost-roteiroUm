package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Disciplina;
import com.example.demo.services.DisciplinaService;

@RestController
public class DisciplinaController {

	@Autowired
	private DisciplinaService disciplinaService;
	
	@GetMapping("/disciplina")
	public ResponseEntity<Disciplina> getDisciplina(@RequestParam(value = "disciplina", defaultValue = "Nome padrão") String disciplina) {
		return new ResponseEntity<Disciplina>(disciplinaService.getDisciplina(disciplina), HttpStatus.OK);	
}
	
	@PostMapping("/novaDisciplina")
	public ResponseEntity<Disciplina> setNovaDisciplina(@RequestBody Disciplina novaDisciplina) {
		return new ResponseEntity<Disciplina>(disciplinaService.setNovaDisciplina(novaDisciplina), HttpStatus.CREATED);
	}
	}
