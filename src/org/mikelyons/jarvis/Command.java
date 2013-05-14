package org.mikelyons.jarvis;

public abstract class Command implements Runnable {

	public Command() {

	}

	public abstract void set( String ... args );

	public abstract void run();
}
