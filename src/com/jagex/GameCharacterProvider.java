package com.jagex;

public interface GameCharacterProvider {

	GameCharacter get(MobType type, int index);

}