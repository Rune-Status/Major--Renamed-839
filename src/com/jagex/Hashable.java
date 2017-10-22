package com.jagex;

public interface Hashable {

	long hash();

	boolean equals(Hashable hashable);

}