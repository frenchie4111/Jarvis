package org.mikelyons.jarvis.commands;

import org.mikelyons.jarvis.Command;

public class Print extends Command {

	private String print_string;

	public void Print() {
		print_string = "No Print Set";
	}

	public void set( String ... args ) {
		this.print_string = args[0];
	}

	public void run() {
		System.out.println(print_string);
	}
}
