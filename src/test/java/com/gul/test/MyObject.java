package com.gul.test;

import java.util.HashMap;

public class MyObject {
	private HashMap<String, Object> properties;

	// Create object with properties
	public MyObject(HashMap<String, Object> properties) {
		this.properties = properties;
	}

	// Set properties
	public Object setProperty(String key, Object value) {
		return this.properties.put(key, value); // Returns old value if existing
	}

	// Get properties
	public Object getProperty(String key) {
		return this.properties.getOrDefault(key, null);
	}
}
