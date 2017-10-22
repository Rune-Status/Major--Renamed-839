package com.jagex;

public interface IcmpServiceListener {

	void notify(int point, int type, int flags);

	void notify(boolean bool);

}