package com.techleads.app.service;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringHelperTest {
	private StringHelper sh;
	private String input;
	private String expectedOutput;
	
	public StringHelperTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<?> testCondtions() {
		String expectedOutputs[][]={
				{"AACD","CD"},
				{"ACD","CD"},
				{"DCD","DCD"}
				};
		return Arrays.asList(expectedOutputs);
		
	}

	@BeforeClass
	public  static void beforeCalss() {
		System.out.println("beforeCalss");
	}
	@Before
	public void setup() {
		sh = new StringHelper();
		System.out.println("setup");
	}

	@Test
	public final void testTruncateAInFirst2Positions_2As() {

//		assertEquals("CD", sh.truncateAInFirst2Positions("AACD"));
//		assertEquals("CD", sh.truncateAInFirst2Positions("ACD"));
		assertEquals(expectedOutput, sh.truncateAInFirst2Positions(input));
//		assertEquals(expectedOutput, sh.truncateAInFirst2Positions(input));
		System.out.println("testTruncateAInFirst2Positions_2As");
	}

	@Test
	public final void testTruncateAInFirst2Positions2_1A() {
//		assertEquals("CD", sh.truncateAInFirst2Positions("ACD"));
		assertEquals(expectedOutput, sh.truncateAInFirst2Positions(input));
		System.out.println("testTruncateAInFirst2Positions2_1A");
	}

	@Test
	public final void testTruncateAInFirst2Positions2_NoA() {
		assertEquals(expectedOutput, sh.truncateAInFirst2Positions(input));
//		assertEquals("DCD", sh.truncateAInFirst2Positions("DCD"));
		System.out.println("testTruncateAInFirst2Positions2_NoA");
	}

	@Test
	public final void testAreFirstAndLastTwoCharactersTheSame_true() {
		StringHelper sh = new StringHelper();
		assertEquals(true, sh.areFirstAndLastTwoCharactersTheSame("AAbAA"));
		System.out.println("testAreFirstAndLastTwoCharactersTheSame_true");
	}

	@Test
	public final void testAreFirstAndLastTwoCharactersTheSame_false() {
		boolean acutal = sh.areFirstAndLastTwoCharactersTheSame("CdbAA");
		assertFalse(acutal);
		System.out.println("testAreFirstAndLastTwoCharactersTheSame_false");
	}

	@Test
	public final void testAreFirstAndLastTwoCharactersTheSame_NoMach_false() {
		boolean acutal = sh.areFirstAndLastTwoCharactersTheSame("ABCDREF");
		assertFalse(acutal);
		System.out.println("testAreFirstAndLastTwoCharactersTheSame_NoMach_false");
	}
	
	@After
	public void tearDown() {
		sh=null;
		System.out.println("tearnDown");
	}

}
