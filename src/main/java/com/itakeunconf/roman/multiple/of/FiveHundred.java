package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;
import com.itakeunconf.roman.RomanRepresentation;

public class FiveHundred implements RepresentationContributor {
	
	private final RomanRepresentation romanRepresentation;
	private final Hundred hundred;
	private final Fifty fifty;
	private final Ten ten;
	private final RepresentationMutator representationMutator;
	
	public FiveHundred(RomanRepresentation romanRepresentation, Hundred hundred, Fifty fifty, 
			Ten ten, RepresentationMutator representationMutator) {
		this.romanRepresentation = romanRepresentation;
		this.hundred = hundred;
		this.fifty = fifty;
		this.ten = ten;
		this.representationMutator = representationMutator;
	}

	@Override
	public void addMultiple(int multiple, String representation) {
		final String representationOfMinus100 = representationMutator.insertOnThePenultimatePosition(representation, "C");
		fifty.addMultiple(multiple - 100, representationOfMinus100);
		fifty.addMultiple(multiple - 50, representationOfMinus100 + "L");
		ten.addMultiple(multiple - 110, romanRepresentation.getRomanRepresentation(multiple - 200) + "XC");
		fifty.addMultiple(multiple,representation);
		ten.addMultiple(multiple - 10, representationOfMinus100 + "XC");
		romanRepresentation.setRomanRepresentation(multiple - 111, 
				romanRepresentation.getRomanRepresentation(multiple - 200) + "LXXXIX");
		romanRepresentation.setRomanRepresentation(multiple - 101, 
				romanRepresentation.getRomanRepresentation(multiple - 110) + "IX");
		romanRepresentation.setRomanRepresentation(multiple - 11, 
				romanRepresentation.getRomanRepresentation(multiple - 100) + "LXXXIX");
		romanRepresentation.setRomanRepresentation(multiple - 1, 
				romanRepresentation.getRomanRepresentation(multiple - 10) + "IX");
		hundred.addMultiple(multiple + 100, representation + "C");
		hundred.addMultiple(multiple + 200, representation + "CC");
		hundred.addMultiple(multiple + 300, representation + "CCC");
	}

}
