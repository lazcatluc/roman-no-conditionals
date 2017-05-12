package com.itakeunconf.roman.multiple.of;

public class RepresentationMutator {

	public String insertOnThePenultimatePosition(String representation, final String one) {
		String paddedRepresentation = " "+representation;
		int endIndex = paddedRepresentation.length() - 1;
		String prefix = paddedRepresentation.substring(0, endIndex);
		char suffix = paddedRepresentation.charAt(endIndex);
		String representationWithPadding = prefix + one + suffix;
		String representationWithoutPadding = representationWithPadding.replaceAll(" ", "");
		return representationWithoutPadding;
	}
	
}
