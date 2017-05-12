package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;
import com.itakeunconf.roman.RomanRepresentation;

public class Five implements RepresentationContributor {
	private final RomanRepresentation romanRepresentation;

	public Five(RomanRepresentation romanRepresentation) {
		this.romanRepresentation = romanRepresentation;
	}
	
	@Override
	public void addMultiple(int multiple, String representation) {
		romanRepresentation.setRomanRepresentation(multiple, representation);
		final String one = "I";
		romanRepresentation.setRomanRepresentation(multiple + 1, representation + one);
		romanRepresentation.setRomanRepresentation(multiple + 2, representation + "II");
		romanRepresentation.setRomanRepresentation(multiple + 3, representation + "III");
		romanRepresentation.setRomanRepresentation(multiple - 1, insertOnThePenultimatePosition(representation, one));
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
