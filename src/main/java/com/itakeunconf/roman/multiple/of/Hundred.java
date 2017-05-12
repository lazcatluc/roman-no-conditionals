package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;

public class Hundred implements RepresentationContributor {

	private final Fifty fifty;
	
	public Hundred(Fifty fifty) {
		this.fifty = fifty;
	}

	@Override
	public void addMultiple(int multiple, String representation) {
		fifty.addMultiple(multiple, representation);
		fifty.addMultiple(multiple + 50, representation + "L");
	}

}
