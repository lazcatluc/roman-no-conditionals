package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;
import com.itakeunconf.roman.RomanRepresentation;

public class Fifty implements RepresentationContributor {
	private final RomanRepresentation romanRepresentation;
	private final Five five;
	private final Ten ten;
	
	public Fifty(RomanRepresentation romanRepresentation, Five five, Ten ten) {
		this.romanRepresentation = romanRepresentation;
		this.five = five;
		this.ten = ten;
	}
	
	@Override
	public void addMultiple(int multipleOfFifty, String representation) {
		five.addMultiple(multipleOfFifty - 10, "X" + representation);
		five.addMultiple(multipleOfFifty - 5, "X" + representation + "V");
		romanRepresentation.setRomanRepresentation(multipleOfFifty - 11, 
				romanRepresentation.getRomanRepresentation(multipleOfFifty - 20) + "IX");
		ten.addMultiple(multipleOfFifty,representation);
		ten.addMultiple(multipleOfFifty + 10, representation + "X");
		ten.addMultiple(multipleOfFifty + 20, representation + "XX");
		ten.addMultiple(multipleOfFifty + 30, representation + "XXX");
	}
}
