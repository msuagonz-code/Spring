package com.samlab.springlab.models;

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
public class User {

	private Integer id;
	private String name;
	private String lastname;
	
}
