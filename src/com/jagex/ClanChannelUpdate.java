package com.jagex;

public abstract class ClanChannelUpdate extends Linkable {

	abstract void apply(ClanSettings settings);

	abstract void decode(Buffer buffer);

}