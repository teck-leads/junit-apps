package com.techleads.app.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@Before
	public void setup() {
		System.out.println("Before TEst");
	}

	@Test
	public final void test1() {
		System.out.println("test-1 Test");
	}
	
	@Test
	public final void test2() {
		System.out.println("test-2 Test");
	}

}
