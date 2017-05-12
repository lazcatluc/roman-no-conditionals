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
		final String representationOfMinus10 = insertOnThePenultimatePosition(representation, "X");
		five.addMultiple(multipleOfFifty - 10, representationOfMinus10);
		five.addMultiple(multipleOfFifty - 5, representationOfMinus10 + "V");
		romanRepresentation.setRomanRepresentation(multipleOfFifty - 11, 
				romanRepresentation.getRomanRepresentation(multipleOfFifty - 20) + "IX");
		ten.addMultiple(multipleOfFifty,representation);
		romanRepresentation.setRomanRepresentation(multipleOfFifty - 1, 
				romanRepresentation.getRomanRepresentation(multipleOfFifty - 10) + "IX");
		ten.addMultiple(multipleOfFifty + 10, representation + "X");
		ten.addMultiple(multipleOfFifty + 20, representation + "XX");
		ten.addMultiple(multipleOfFifty + 30, representation + "XXX");
	}
	
	private String insertOnThePenultimatePosition(String representation, final String one) {
		String paddedRepresentation = " "+representation;
		int endIndex = paddedRepresentation.length() - 1;
		String prefix = paddedRepresentation.substring(0, endIndex);
		char suffix = paddedRepresentation.charAt(endIndex);
		String representationWithPadding = prefix + one + suffix;
		String representationWithoutPadding = representationWithPadding.replaceAll(" ", "");
		return representationWithoutPadding;
	}
}
