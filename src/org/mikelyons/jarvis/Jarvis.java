package org.mikelyons.jarvis;

import java.util.HashMap;

import org.mikelyons.jarvis.commands.*;

/**
 * This class is the main runner the Jarvis.
 *
 * It will load commands intoa  file, and then call
 * them when the user says to
 */

class Jarvis {

	HashMap<String, Command> commands;

	public Jarvis() {
		commands = new HashMap<String, Command>();
	}
	
	public Jarvis(HashMap<String, Command> commands) {
		this.commands = commands;
	}

	public void run( String command_name ) {
		this.commands.get(command_name).run();
	}

	public static void main( String args[] ) {

		Jarvis myJarvis = new Jarvis( CommandLoader.loadCommands() );
		myJarvis.run( "helloprint" );

	}
}
