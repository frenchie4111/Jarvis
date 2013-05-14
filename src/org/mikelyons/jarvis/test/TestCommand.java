package org.mikelyons.jarvis.test;

// Parent import
import org.mikelyons.jtest.Test;

// This project imports
import org.mikelyons.jarvis.*;

// Java import
import java.util.ArrayList;

public class TestCommand extends Test {
	public void test01_smokeTest() {
		assertTrue(true,"True is not true");
	}

	// Tests a simple command to see if they run correctly
	public void test02_simpleCommand() {

		final ArrayList<String> temp_list = new ArrayList<String>();

		Command test = new Command() {
			public void run() {
				temp_list.add("Hello world");
			}
		};

		test.run();

		assertEqual( temp_list.size(), 1, "List is the wrong size" );
		assertEqual( temp_list.get(0), "Hello world", "List doesn't contain Hello World" );
	}
}
