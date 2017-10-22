package com.jagex;

public class Class375 {
	public float aFloat4159;
	public float aFloat4160;
	public float aFloat4161;
	public float aFloat4162;

	public Class375() {
		reset();
	}

	public Class375(float f, float f_0_, float f_1_, float f_2_) {
		set(f, f_0_, f_1_, f_2_);
	}

	public final void invert() {
		aFloat4161 = -aFloat4161;
		aFloat4160 = -aFloat4160;
		aFloat4159 = -aFloat4159;
		aFloat4162 = -aFloat4162;
	}

	public void method6159(int i) {
		set((i >> 16 & 0xff) * 0.003921569F, (i >> 8 & 0xff) * 0.003921569F, (i >> 0 & 0xff) * 0.003921569F,
				(i >> 24 & 0xff) * 0.003921569F);
	}

	public final void multiply(float scalar) {
		aFloat4161 *= scalar;
		aFloat4160 *= scalar;
		aFloat4159 *= scalar;
		aFloat4162 *= scalar;
	}

	public final void method6163(Matrix4f matrix) {
		float f = aFloat4161;
		float f_3_ = aFloat4160;
		float f_4_ = aFloat4159;
		float f_5_ = aFloat4162;

		aFloat4161 = matrix.array[0] * f + matrix.array[4] * f_3_ + matrix.array[8] * f_4_ + matrix.array[12] * f_5_;
		aFloat4160 = matrix.array[1] * f + matrix.array[5] * f_3_ + matrix.array[9] * f_4_ + matrix.array[13] * f_5_;
		aFloat4159 = matrix.array[2] * f + matrix.array[6] * f_3_ + matrix.array[10] * f_4_ + matrix.array[14] * f_5_;
		aFloat4162 = matrix.array[3] * f + matrix.array[7] * f_3_ + matrix.array[11] * f_4_ + matrix.array[15] * f_5_;
	}

	public void method6170(Class375 class375_6_) {
		set(class375_6_.aFloat4161, class375_6_.aFloat4160, class375_6_.aFloat4159, class375_6_.aFloat4162);
	}

	public void set(float f, float f_7_, float f_8_, float f_9_) {
		aFloat4161 = f;
		aFloat4160 = f_7_;
		aFloat4159 = f_8_;
		aFloat4162 = f_9_;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(aFloat4161).append(",").append(aFloat4160).append(",").append(aFloat4159)
				.append(",").append(aFloat4162).toString();
	}

	final void reset() {
		aFloat4162 = 0.0F;
		aFloat4159 = 0.0F;
		aFloat4160 = 0.0F;
		aFloat4161 = 0.0F;
	}

}