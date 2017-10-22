package com.jagex;

public class Class179 implements Interface23 {
	static int crossIndex;

	public static String method3540(Object[] objects, int start, int amount) {
		if (amount == 0) {
			return "";
		} else if (amount == 1) {
			CharSequence sequence = (CharSequence) objects[start];
			if (sequence == null) {
				return "null";
			}

			return sequence.toString();
		}

		int count = amount + start;
		int length = 0;
		for (int index = start; index < count; index++) {
			CharSequence sequence = (CharSequence) objects[index];
			if (null == sequence) {
				length += 4;
			} else {
				length += sequence.length();
			}
		}

		StringBuilder builder = new StringBuilder(length);
		for (int index = start; index < count; index++) {
			CharSequence sequence = (CharSequence) objects[index];
			if (null == sequence) {
				builder.append("null");
			} else {
				builder.append(sequence);
			}
		}

		return builder.toString();
	}

	static FontSpecification method3543() {
		FontSpecification specification;
		if (Class56.aBool642) {
			if (null != VariableBitsDefinitionProvider.aClass132_9779 && null != Class592.aClass9_7834) {
				specification = Class592.aClass9_7834;
			} else {
				specification = Class281_Sub3.b12Full;
			}
		} else {
			specification = Class281_Sub3.b12Full;
		}

		Class56.anInt616 = -1061405889 * specification.topPadding + specification.bottomPadding * -160412835;
		return specification;
	}

	int anInt1994;
	Class195 this$0;

	Class179(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt1994 = buffer.readUShort() * 2048416907;
	}

	@Override
	public void method131(Class192 class192) {
		Class182 class182 = (Class182) class192.method3765().get(anInt1994 * -379573469);
		class192.method3808(-379573469 * anInt1994);
		class182.method3562();
	}

}