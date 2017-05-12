package com.itakeunconf.roman.configuration;

import com.itakeunconf.roman.RomanRepresentation;
import com.itakeunconf.roman.multiple.of.Fifty;
import com.itakeunconf.roman.multiple.of.Five;
import com.itakeunconf.roman.multiple.of.FiveHundred;
import com.itakeunconf.roman.multiple.of.Hundred;
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
		Hundred hundred = new Hundred(fifty);
		FiveHundred fiveHundred = new FiveHundred(romanRepresentation, hundred, fifty, ten, representationMutator);
		
		hundred.addMultiple(0, "");
		hundred.addMultiple(100, "C");
		hundred.addMultiple(200, "CC");
		hundred.addMultiple(300, "CCC");
		fiveHundred.addMultiple(500, "D");
		fiveHundred.addMultiple(1000, "M");
		fiveHundred.addMultiple(1500, "MD");
		fiveHundred.addMultiple(2000, "MM");
		fiveHundred.addMultiple(2500, "MMD");
		fiveHundred.addMultiple(3000, "MMM");
	}
	
	public RomanRepresentation getRomanRepresentation() {
		return romanRepresentation;
	}
}
