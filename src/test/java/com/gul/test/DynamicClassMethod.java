package com.gul.test;

import java.util.HashMap;

public class DynamicClassMethod {

	public static void main(String[] args) {

		HashMap<String, Object> properties = new HashMap<>();

		    //Add name and age
		    properties.put("name", "John Doe");
		    properties.put("age", 25);

		    //Create person
		    MyObject person = new MyObject(properties);

		    //Get properties
		    System.out.println(person.getProperty("age")); //Result: 25
		    System.out.println(person.getProperty("name")); //Result: John Doe
	}

}
