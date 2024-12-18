package com.samlab.springlab.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samlab.springlab.herencia.Alumno;
import com.samlab.springlab.herencia.Persona;
import com.samlab.springlab.herencia.Profesor;
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
	
	@GetMapping("/herencia")
	public String herencia(Model model) {
		
		//En venezuela se califica del 1 al 20
		
		Alumno alumno = new Alumno();
		// Metodos propios de clase
		alumno.setInstitucion("Fe y Alegría");
		alumno.setNotaMatematica(16);
		alumno.setNotaHistoria(17);
		alumno.setNotaCastellano(20);
		
		// Metodos getter y setter Heredados de Persona
		alumno.setNombre("Miguel");
		alumno.setApellido("Gonzalez");
		alumno.setEdad(15);
		alumno.setEmail("miguel1@gmail.com");
		
		/**
		 * Casting
		 * Como un alumno es una clase que hereda de persona, se puede hacer la asignación 
		 * Persona alumno2 = new Alumno();
		 * 
		 * pero los metodos de la clase Alumno(), no estarán disponibles en la clase alumno2
		 * y para que estén desponibles primero hay que hacer un cast
		 * */
		
		Persona alumno2 = new Alumno();
		// Metodos getter y setter Heredados de Persona
		alumno2.setNombre("Xavy");
		alumno2.setApellido("Gonzalez");
		alumno2.setEdad(10);
		alumno2.setEmail("xavito@gmail.com");
		
		//Casting
		((Alumno) alumno2).setInstitucion("Fe y Alegría");
		((Alumno) alumno2).setNotaMatematica(16);
		((Alumno) alumno2).setNotaHistoria(17);
		((Alumno) alumno2).setNotaCastellano(20);
		
		Profesor profesor = new Profesor();
		// Metodos propios de clase
		profesor.setAsignatura("Matematicas");
		
		// Metodos getter y setter Heredados de Persona
		profesor.setNombre("Raul");
		profesor.setApellido("Guzman");
		profesor.setEdad(45);
		profesor.setEmail("raulGuzman@gmail.com");
		
		model.addAttribute("Titulo", "Boletin");
		model.addAttribute("profesor", profesor);
		model.addAttribute("alumno", alumno);
		model.addAttribute("alumno2", alumno2);
		
		return "herencia";
	}
	
}
