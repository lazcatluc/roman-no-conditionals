package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;

public class Ten implements RepresentationContributor {
	private final Five five;

	public Ten(Five five) {
		this.five = five;
	}

	@Override
	public void addMultiple(int multiple, String representation) {
		five.addMultiple(multiple, representation);
		five.addMultiple(multiple + 5, representation + "V");
	}
}
