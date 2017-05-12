package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;

public class Thousand implements RepresentationContributor {

	private final FiveHundred fiveHundred;

	public Thousand(FiveHundred fiveHundred) {
		this.fiveHundred = fiveHundred;
	}

	@Override
	public void addMultiple(int multiple, String representation) {
		fiveHundred.addMultiple(multiple, representation);
		fiveHundred.addMultiple(multiple + 500, representation + "D");
	}

}
