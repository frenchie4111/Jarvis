package org.mikelyons.jarvis.test;

import org.mikelyons.jtest.*;

public class TestSuite extends Test {
	
	public void test_01smokeTest() {
		assertTrue(true, "True was not true");
	}

	public static void main(String args[] ) {
		System.out.println("Testing Suite");
		Test tester = new TestSuite();
		tester.run();
		
		System.out.println("Testing Command");
		Test command = new TestCommand();
		command.run();
	}
}
