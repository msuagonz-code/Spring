package com.samlab.springlab.models;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Implementacion de anotaciones Lombok
 * 
 * https://projectlombok.org/features/constructor
 * https://projectlombok.org/features/Data
 * 
 * */

@AllArgsConstructor
@Data
public class Temario {

	private String tema;
	private ArrayList<String> capitulos;
	
}
