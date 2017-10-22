package com.jagex;

public class Tuple<T, U> {
	public U second;
	public T first;

	public Tuple(T first, U second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null || !(object instanceof Tuple)) {
			return false;
		}

		Tuple other = (Tuple) object;
		if (first == null) {
			if (other.first != null) {
				return false;
			}
		} else if (!first.equals(other.first)) {
			return false;
		}

		if (second == null) {
			if (other.second != null) {
				return false;
			}
		} else if (!second.equals(other.second)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hashcode = 0;
		if (first != null) {
			hashcode += first.hashCode();
		}
		if (second != null) {
			hashcode += 31 * second.hashCode();
		}

		return hashcode;
	}

	@Override
	public String toString() {
		return first + ", " + second;
	}

}