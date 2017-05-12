package com.itakeunconf.roman;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.AbstractCharSequenceAssert;
import org.junit.Before;
import org.junit.Test;

import com.itakeunconf.roman.configuration.RomanRepresentationInitializer;

public class RomanTest {
	
	private RomanRepresentation romanRepresentation;
	
	@Before
	public void setUp() {
		romanRepresentation = new RomanRepresentationInitializer().getRomanRepresentation();
	}
	
	@Test
	public void zeroIsEmpty() throws Exception {
		assertRepresentationOf(0).isEqualTo("");
	}

	public AbstractCharSequenceAssert<?, String> assertRepresentationOf(final int i) {
		return assertThat(roman(i));
	}
	
	@Test
	public void oneIsI() throws Exception {
		assertRepresentationOf(1).isEqualTo("I");
	}
	
	@Test
	public void twoIsII() throws Exception {
		assertRepresentationOf(2).isEqualTo("II");
	}
	
	@Test
	public void fourIsIV() throws Exception {
		assertRepresentationOf(4).isEqualTo("IV");
	}
	
	@Test
	public void fiveIsV() throws Exception {
		assertRepresentationOf(5).isEqualTo("V");
	}
	
	@Test
	public void sixIsVI() throws Exception {
		assertRepresentationOf(6).isEqualTo("VI");
	}
	
	@Test
	public void sevenIsVII() throws Exception {
		assertRepresentationOf(7).isEqualTo("VII");
	}
	
	@Test
	public void eightIsVIII() throws Exception {
		assertRepresentationOf(8).isEqualTo("VIII");
	}
	
	@Test
	public void nineIsIX() throws Exception {
		assertRepresentationOf(9).isEqualTo("IX");
	}
	
	@Test
	public void tenIsX() throws Exception {
		assertRepresentationOf(10).isEqualTo("X");
	}
	
	@Test
	public void elevenIsXI() throws Exception {
		assertRepresentationOf(11).isEqualTo("XI");
	}
	
	@Test
	public void fourteenIsXIV() throws Exception {
		assertRepresentationOf(14).isEqualTo("XIV");
	}
	
	@Test
	public void twentyOneIsXXI() throws Exception {
		assertRepresentationOf(21).isEqualTo("XXI");
	}
	
	@Test
	public void twentySixIsXXVI() throws Exception {
		assertRepresentationOf(26).isEqualTo("XXVI");
	}
	
	@Test
	public void twentyNineIsXXIX() throws Exception {
		assertRepresentationOf(29).isEqualTo("XXIX");
	}
	
	@Test
	public void thirtySevenIsXXXVII() throws Exception {
		assertRepresentationOf(37).isEqualTo("XXXVII");
	}
	
	@Test
	public void thirtyNineIsXXXIX() throws Exception {
		assertRepresentationOf(39).isEqualTo("XXXIX");
	}
	
	@Test
	public void fortyIsXL() throws Exception {
		assertRepresentationOf(40).isEqualTo("XL");
	}
	
	@Test
	public void fortyFourIsXL() throws Exception {
		assertRepresentationOf(44).isEqualTo("XLIV");
	}
	
	@Test
	public void fortyNineIsXLIX() throws Exception {
		assertRepresentationOf(49).isEqualTo("XLIX");
	}
	
	@Test
	public void ninetyNineIsC() throws Exception {
		assertRepresentationOf(99).isEqualTo("XCIX");
	}
	
	@Test
	public void hunderdIsC() throws Exception {
		assertRepresentationOf(100).isEqualTo("C");
	}
	
	@Test
	public void eightySixIsLXXXVI() throws Exception {
		assertRepresentationOf(86).isEqualTo("LXXXVI");
	}
	
	@Test
	public void hundredSixtyThreIsCLXIII() throws Exception {
		assertRepresentationOf(163).isEqualTo("CLXIII");
	}
	
	@Test
	public void hundredThirtyNineIsCXXXIX() throws Exception {
		assertRepresentationOf(139).isEqualTo("CXXXIX");
	}
	
	@Test
	public void twoHundredOneIsCCI() throws Exception {
		assertRepresentationOf(201).isEqualTo("CCI");
	}
	
	@Test
	public void hundredNinety() throws Exception {
		assertRepresentationOf(190).isEqualTo("CXC");
	}
	
	@Test
	public void hundredNinetySix() throws Exception {
		assertRepresentationOf(196).isEqualTo("CXCVI");
	}
	
	@Test
	public void hundredNinetyNine() throws Exception {
		assertRepresentationOf(199).isEqualTo("CXCIX");
	}
	
	@Test
	public void twoHundredEightyNine() throws Exception {
		assertRepresentationOf(289).isEqualTo("CCLXXXIX");
	}
	
	@Test
	public void twoHundredNinetyNine() throws Exception {
		assertRepresentationOf(299).isEqualTo("CCXCIX");
	}

	@Test
	public void threeHundredEightyNine() throws Exception {
		assertRepresentationOf(389).isEqualTo("CCCLXXXIX");
	}
	
	@Test
	public void threeHundredNinety() throws Exception {
		assertRepresentationOf(390).isEqualTo("CCCXC");
	}
	
	@Test
	public void threeHundredNinetyNine() throws Exception {
		assertRepresentationOf(399).isEqualTo("CCCXCIX");
	}
	
	@Test
	public void fourHundred() throws Exception {
		assertRepresentationOf(400).isEqualTo("CD");
	}
	
	@Test
	public void fourHundredEightyNine() throws Exception {
		assertRepresentationOf(489).isEqualTo("CDLXXXIX");
	}
	
	@Test
	public void fourHundredNinety() throws Exception {
		assertRepresentationOf(490).isEqualTo("CDXC");
	}
	
	@Test
	public void fourHundredNinetyNine() throws Exception {
		assertRepresentationOf(499).isEqualTo("CDXCIX");
	}
	
	@Test
	public void fiveHundred() throws Exception {
		assertRepresentationOf(500).isEqualTo("D");
	}
	
	@Test
	public void fourFourNine() throws Exception {
		assertRepresentationOf(449).isEqualTo("CDXLIX");
	}
	
	@Test
	public void fourSixFive() throws Exception {
		assertRepresentationOf(465).isEqualTo("CDLXV");
	}
	
	private String roman(int i) {
		return romanRepresentation.getRomanRepresentation(i);
	}
}
