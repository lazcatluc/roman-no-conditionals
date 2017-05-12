package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;
import com.itakeunconf.roman.RomanRepresentation;

public class Fifty implements RepresentationContributor {
	private final RepresentationMutator representationMutator;
	private final RomanRepresentation romanRepresentation;
	private final Five five;
	private final Ten ten;
	
	public Fifty(RomanRepresentation romanRepresentation, Five five, Ten ten, RepresentationMutator representationMutator) {
		this.romanRepresentation = romanRepresentation;
		this.five = five;
		this.ten = ten;
		this.representationMutator = representationMutator;
	}
	
	@Override
	public void addMultiple(int multipleOfFifty, String representation) {
		final String representationOfMinus10 = representationMutator.insertOnThePenultimatePosition(representation, "X");
		five.addMultiple(multipleOfFifty - 10, representationOfMinus10);
		five.addMultiple(multipleOfFifty - 5, representationOfMinus10 + "V");
		romanRepresentation.setRomanRepresentation(multipleOfFifty - 11, 
				romanRepresentation.getRomanRepresentation(multipleOfFifty - 20) + "IX");
		ten.addMultiple(multipleOfFifty,representation);
		ten.addMultiple(multipleOfFifty + 10, representation + "X");
		ten.addMultiple(multipleOfFifty + 20, representation + "XX");
		ten.addMultiple(multipleOfFifty + 30, representation + "XXX");
		romanRepresentation.setRomanRepresentation(multipleOfFifty - 1, 
				romanRepresentation.getRomanRepresentation(multipleOfFifty - 10) + "IX");
	}
	
	
}
