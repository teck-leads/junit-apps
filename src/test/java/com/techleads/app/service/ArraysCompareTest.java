package com.techleads.app.service;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public final void testArraysSort() {
		int[] numbers= {12,3,4,1};
		int[] expected= {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public final void testArraysNull() {
		int[] numbers= null;
		Arrays.sort(numbers);
	}
	
	

	@Test(timeout = 1000)
	public final void testSort_Performance() {
		int[] numbers= {12,3,4,1};
		
		for(int i=1;i<1000000;i++) {
			numbers[0]=i;
			
		}
		Arrays.sort(numbers);
		
	}

}
