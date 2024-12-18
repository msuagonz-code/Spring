package com.samlab.springlab.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samlab.springlab.models.User;

@Controller
@RequestMapping("/web")
public class UserController {

	@GetMapping("/details")
	public String details(Model model) {
		
		model.addAttribute("title", "Detalles de usuario");
		model.addAttribute("name", "Manuel");
		model.addAttribute("lastname", "Suárez");
		
		return "details";
	}
	
	/**
	 * Esta forma se puede usar pero Model es más limpio
	 * */
	@GetMapping("/detailsMap")
	public String detailsMap(Map<String, Object> model) {
		
		model.put("title", "Detalles de usuario");
		model.put("name", "Manuel");
		model.put("lastname", "Suárez");
		
		return "details";
	}
	
	@GetMapping("/detailsObject")
	public String detailsObject(Model model) {
		
		User user = new User(1, "Manuel", "Suárez");
		model.addAttribute("title", "Detalles de usuario");
		model.addAttribute("user", user);
		
		return "detailsObject";
	}
	
}
