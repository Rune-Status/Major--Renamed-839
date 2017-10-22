package com.jagex;

public class Linkable {

	public Linkable next;

	public Linkable previous;

	public long linkedKey;

	public boolean isLinked() {
		return previous != null;
	}

	public void unlink() {
		if (previous != null) {
			previous.next = next;
			next.previous = previous;
			next = null;
			previous = null;
		}
	}

	public static void insertBefore(Linkable first, Linkable second) {
		if (first.previous != null) {
			first.unlink();
		}

		first.previous = second.previous;
		first.next = second;
		first.previous.next = first;
		first.next.previous = first;
	}
}
