package com.jagex;

public final class DirectXProgram extends Program {
	boolean aBool9542;
	Class249_Sub1 aClass249_Sub1_9543;
	DirectXToolkit toolkit;

	DirectXProgram(DirectXToolkit toolkit, ProgramDefinition class239) {
		super(toolkit, class239);
		this.toolkit = toolkit;
		aBool9542 = false;
	}

	@Override
	public void method4443() {
		toolkit.method17408(0L);
		toolkit.method17409(0L);
		aBool9542 = false;
		toolkit.aClass249_Sub1_11065 = null;
		toolkit.method14666(1);
		toolkit.method14689(null);
		toolkit.method14666(0);
		toolkit.method14689(null);
	}

	@Override
	public boolean method4464(Class249 class249) {
		if (aClass249_Sub1_9543 == class249) {
			return true;
		}
		if (!class249.method4648()) {
			return false;
		}
		aClass249_Sub1_9543 = (Class249_Sub1) class249;
		anInt2637 = indexOf(class249) * 99944697;
		if (anInt2637 * -1872152247 == -1) {
			throw new IllegalArgumentException();
		}
		if (aBool9542) {
			toolkit.method17408(aClass249_Sub1_9543.vertexIdentifier);
			toolkit.method17409(aClass249_Sub1_9543.pixelIdentifier);
			toolkit.aClass249_Sub1_11065 = aClass249_Sub1_9543;
		}
		return true;
	}

	@Override
	public boolean method4476() {
		return toolkit.aClass249_Sub1_11065 == aClass249_Sub1_9543;
	}

	@Override
	public void method4522() {
		if (aClass249_Sub1_9543 == null) {
			throw new RuntimeException_Sub3();
		}

		toolkit.method17408(aClass249_Sub1_9543.vertexIdentifier);
		toolkit.method17409(aClass249_Sub1_9543.pixelIdentifier);
		toolkit.aClass249_Sub1_11065 = aClass249_Sub1_9543;
		aBool9542 = true;
	}

	@Override
	Class249 method4446(NativeToolkit toolkit, Class246 class246) {
		return new Class249_Sub1((DirectXToolkit) toolkit, this, class246);
	}

	@Override
	Class480_Sub13_Sub1 method4472(Class241 class241) {
		return new Class480_Sub13_Sub1_Sub1(this, class241);
	}

}