package com.itakeunconf.roman.configuration;

import com.itakeunconf.roman.RomanRepresentation;
import com.itakeunconf.roman.multiple.of.Fifty;
import com.itakeunconf.roman.multiple.of.Five;
import com.itakeunconf.roman.multiple.of.RepresentationMutator;
import com.itakeunconf.roman.multiple.of.Ten;

public class RomanRepresentationInitializer {
	
	private final RomanRepresentation romanRepresentation;
	
	public RomanRepresentationInitializer() {
		romanRepresentation = new RomanRepresentation();
		RepresentationMutator representationMutator = new RepresentationMutator();
		Five five = new Five(romanRepresentation, representationMutator);
		Ten ten = new Ten(five);
		Fifty fifty = new Fifty(romanRepresentation, five, ten, representationMutator);
		
		fifty.addMultiple(0, "");
		fifty.addMultiple(50, "L");
		fifty.addMultiple(100, "C");
		fifty.addMultiple(150, "CL");
		fifty.addMultiple(200, "CC");
	}
	
	public RomanRepresentation getRomanRepresentation() {
		return romanRepresentation;
	}
}
