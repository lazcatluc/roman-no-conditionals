package com.itakeunconf.roman.configuration;

import com.itakeunconf.roman.RomanRepresentation;
import com.itakeunconf.roman.multiple.of.Fifty;
import com.itakeunconf.roman.multiple.of.Five;
import com.itakeunconf.roman.multiple.of.Ten;

public class RomanRepresentationInitializer {
	
	private final RomanRepresentation romanRepresentation;
	private final Five five;
	private final Ten ten;
	private final Fifty fifty;
	
	public RomanRepresentationInitializer() {
		romanRepresentation = new RomanRepresentation();
		five = new Five(romanRepresentation);
		ten = new Ten(five);
		fifty = new Fifty(romanRepresentation, five, ten);
		
		fifty.addMultiple(0, "");
		fifty.addMultiple(50, "L");
		fifty.addMultiple(100, "C");
		fifty.addMultiple(150, "CL");
	}
	
	public RomanRepresentation getRomanRepresentation() {
		return romanRepresentation;
	}
}
