package com.samlab.springlab.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samlab.springlab.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@GetMapping("/details")
	public Map<String, Object> details(Model model) {
		
		Map<String, Object> body = new HashMap<>();
		
		/**
		 * Map es una estructura de datos de tipo <Atributo, Valor>
		 * */
		
		body.put("title", "Detalles");
		
		User user = new User(1, "Manuel", "Suárez");
		body.put("user", user);
		
		return body;
	}
	
	/**
	 * @GetMapping("/details")
	 * es la forma abreviada de 
	 * @RequestMapping(path="/details", method= RequestMethod.GET)
	 * */
	@RequestMapping(path="/detailsRM", method= RequestMethod.GET)
	public String detailsMap(Map<String, Object> model) {
		
		model.put("title", "details");
		model.put("name", "G");
		model.put("lastname", "Sam");
		
		return "details";
	}
		
}
