package com.itakeunconf.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanRepresentation {
	private Map<Integer, String> representation = new HashMap<>();
	
	public String getRomanRepresentation(int number) {
		return representation.get(number);
	}
	
	public void setRomanRepresentation(int number, String representation) {
		this.representation.put(number, representation);
	}
}
