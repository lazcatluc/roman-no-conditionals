package com.itakeunconf.roman.configuration;

import com.itakeunconf.roman.RomanRepresentation;
import com.itakeunconf.roman.multiple.of.Doubler;
import com.itakeunconf.roman.multiple.of.Fifty;
import com.itakeunconf.roman.multiple.of.Five;
import com.itakeunconf.roman.multiple.of.FiveHundred;
import com.itakeunconf.roman.multiple.of.RepresentationMutator;

public class RomanRepresentationInitializer {
	
	private final RomanRepresentation romanRepresentation;
	
	public RomanRepresentationInitializer() {
		romanRepresentation = new RomanRepresentation();
		RepresentationMutator representationMutator = new RepresentationMutator();
		Five five = new Five(romanRepresentation, representationMutator);
		Doubler ten = new Doubler(five, 5, "V");
		Fifty fifty = new Fifty(romanRepresentation, five, ten, representationMutator);
		Doubler hundred = new Doubler(fifty, 50, "L");
		FiveHundred fiveHundred = new FiveHundred(romanRepresentation, hundred, fifty, ten, representationMutator);
		Doubler thousand = new Doubler(fiveHundred, 500, "D");
		
		hundred.addMultiple(0, "");
		hundred.addMultiple(100, "C");
		hundred.addMultiple(200, "CC");
		hundred.addMultiple(300, "CCC");
		fiveHundred.addMultiple(500, "D");
		thousand.addMultiple(1000, "M");
		thousand.addMultiple(2000, "MM");
		thousand.addMultiple(3000, "MMM");
	}
	
	public RomanRepresentation getRomanRepresentation() {
		return romanRepresentation;
	}
}
