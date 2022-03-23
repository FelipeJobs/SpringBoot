package com.generationhelloword.hellowordcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloWordController {

	@GetMapping
	public String helloWorld() {
		return "Hello World, não estou feliz";
	}
	
	@GetMapping("bsm")
	public String bsm() {
		return "Mentalidades:\nPersistência\nOrientação ao futuro\nResponsabilidade pessoal\n"
				+ "Mentalidade de crescimento\n\nHabilidades: \n"
				+ "Trabalho em equipe\nAtenção ao detalhe\nProatividade\n"
				+ "Comunicação";
	}
	@GetMapping("obs")
	public String objetivos() {
		return "Me aperfeiçoar em Spring\nConhecer mais do MYSQL\nTenta trabalhar em "
				+ "projetos pessoais.";
		
	}
		
	

}
