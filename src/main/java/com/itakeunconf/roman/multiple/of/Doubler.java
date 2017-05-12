package com.itakeunconf.roman.multiple.of;

import com.itakeunconf.roman.RepresentationContributor;

public class Doubler implements RepresentationContributor {
	private final RepresentationContributor contributorToDouble;
	private final int doubledQuantity;
	private final String representationSuffix;

	public Doubler(RepresentationContributor contributorToDouble, int doubledQuantity, String representationSuffix) {
		this.contributorToDouble = contributorToDouble;
		this.doubledQuantity = doubledQuantity;
		this.representationSuffix = representationSuffix;
	}

	@Override
	public void addMultiple(int multiple, String representation) {
		contributorToDouble.addMultiple(multiple, representation);
		contributorToDouble.addMultiple(multiple + doubledQuantity, representation + representationSuffix);
	}

}
