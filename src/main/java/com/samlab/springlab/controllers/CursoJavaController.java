package com.samlab.springlab.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samlab.springlab.models.Temario;

@Controller
@RequestMapping("/web")
public class CursoJavaController {

	@GetMapping("/temario")
	public String temario(Model model) {
		
		/*	
		 * 	Java no soporta la herencia multiple, solo se puede heredar de una sola clase
		 * 
		 * 	Especializacion obedece al principio open-close
		 * 	abierto a heredar, cerrado a modificar
		 * 
		 * */
		
		model.addAttribute("title", "Curso Java");
		ArrayList<String> capitulos = new ArrayList<String>();
		
		capitulos.add("Herencia");
		capitulos.add("Clases Abstractas");
		capitulos.add("Interfases");
		capitulos.add("Tipos Genericos");
		capitulos.add("Manejo de Excepciones");
		
		Temario temario = new Temario("Java POO", capitulos);
		model.addAttribute("temario", temario);
		
		return "temario";
	}
	
}
