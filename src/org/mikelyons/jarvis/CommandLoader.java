package org.mikelyons.jarvis;

import org.mikelyons.jarvis.commands.*;

// Java imports
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CommandLoader {
	public static HashMap<String, Command> loadCommands() {
		HashMap<String, Command> commands = new HashMap<String, Command>();

		Class cls = new Class.forName("org.mikelyons.jarvis.commands.Print");

		Command new_command = (Command) cls.newInstance();
		new_command.set("Hello");

		commands.put("helloprint", new_command );

		return commands;
	}
}
