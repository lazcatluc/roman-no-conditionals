package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;
import com.itakeunconf.roman.RomanRepresentation;

public class Five implements RepresentationContributor {
	private final RomanRepresentation romanRepresentation;
	private final RepresentationMutator representationMutator;

	public Five(RomanRepresentation romanRepresentation, RepresentationMutator representationMutator) {
		this.romanRepresentation = romanRepresentation;
		this.representationMutator = representationMutator;
	}
	
	@Override
	public void addMultiple(int multiple, String representation) {
		romanRepresentation.setRomanRepresentation(multiple, representation);
		final String one = "I";
		romanRepresentation.setRomanRepresentation(multiple + 1, representation + one);
		romanRepresentation.setRomanRepresentation(multiple + 2, representation + "II");
		romanRepresentation.setRomanRepresentation(multiple + 3, representation + "III");
		romanRepresentation.setRomanRepresentation(multiple - 1, 
				representationMutator.insertOnThePenultimatePosition(representation, one));
	}
	
}
