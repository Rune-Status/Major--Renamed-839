package com.jagex;

public class Class393 {
	public Class395 aClass395_4506 = new Class395();
	public Class397 aClass397_4507 = new Class397();

	public Class393() {

	}

	public Class393(Class393 other) {
		method6347(other);
	}

	public void method6347(Class393 other) {
		aClass395_4506.copyFrom(other.aClass395_4506);
		aClass397_4507.copyFrom(other.aClass397_4507);
	}

	public final void method6349() {
		aClass395_4506.method6379();
		aClass397_4507.invert();
		aClass397_4507.method6480(aClass395_4506);
	}

	public final void method6350(Class393 other) {
		aClass395_4506.method6377(other.aClass395_4506);
		aClass397_4507.method6480(other.aClass395_4506);
		aClass397_4507.add(other.aClass397_4507);
	}

	@Override
	public String toString() {
		return new StringBuilder().append("[").append(aClass395_4506.toString()).append("|")
				.append(aClass397_4507.toString()).append("]").toString();
	}

}