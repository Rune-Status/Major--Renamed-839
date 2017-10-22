package com.jagex;

public class Entity {

	public Entity previous;
	public Entity next;

	public void unlink() {
		if (previous != null) {
			previous.next = next;
			next.previous = previous;
			next = null;
			previous = null;
		}
	}

}