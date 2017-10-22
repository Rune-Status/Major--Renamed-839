package com.jagex;

public interface KeyRecord {

	int anInt1 = 1;
	int anInt2 = 2;
	int anInt3 = 2;
	int KEY_TYPED_TYPE = 3;
	int KEY_RELEASED_TYPE = 1;
	int KEY_PRESSED_TYPE = 0;
	int anInt7 = 4;

	int getType();

	int getCode();

	long getTime();

	int getFlags();

	char getCharacter();

}