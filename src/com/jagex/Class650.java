package com.jagex;

public class Class650 {
	public static final int anInt8204 = 2;
	public static final int anInt8209 = 1;
	public static final int anInt8210 = 0;

	public static void method13519(int i, int i_27_) {
		Class495_Sub1.anInt10327 = 1164673443 * (i - Class495.anInt6849);
		Class495_Sub1.anInt10324 = 732309487 * (i_27_ - Class495.anInt6823);
	}

	boolean aBool8211 = false;
	boolean aBool8212 = false;
	boolean aBool8214 = false;
	Class631 aClass631_8203;
	Class631 aClass631_8217;
	AnimationDefinition animation;
	int anInt8202;
	int anInt8206;
	int anInt8207;
	int anInt8213 = 0;
	int anInt8215;

	int anInt8216;

	Class650(boolean bool) {
		aBool8212 = bool;
		aClass631_8203 = new Class631();
		if (aBool8212) {
			aClass631_8217 = new Class631();
		} else {
			aClass631_8217 = null;
		}
	}

	public final AnimationDefinition getAnimation() {
		return animation;
	}

	public final int getAnimationId() {
		return animation != null ? animation.id * -1880295959 : -1;
	}

	public final boolean hasAnimation() {
		return null != animation;
	}

	public final void method13450(int i, int i_0_) {
		method13453(i, i_0_, 0, false);
	}

	public final void method13451(int i, boolean bool) {
		method13453(i, 0, 0, bool);
	}

	public final void method13452(int i, boolean bool, boolean bool_3_) {
		method13474(i, 0, 0, bool, bool_3_);
	}

	public final void method13453(int animationId, int i_5_, int i_6_, boolean bool) {
		method13474(animationId, i_5_, i_6_, bool, false);
	}

	public final int method13455() {
		return anInt8207 * 2070277225;
	}

	public final int method13457() {
		if (method13468()) {
			int i_8_ = 0;
			if (method13468()) {
				i_8_ |= aClass631_8203.anInt8063 * -444292541;

				if (aBool8212 && animation.anIntArray1970 != null) {
					i_8_ |= -444292541 * aClass631_8217.anInt8063;
				}
			}

			return i_8_;
		}
		return 0;

	}

	public final void method13458(Model model, int i) {
		if (null != animation) {
			if (animation.frames != null && method13468()) {
				model.method2950(aClass631_8203.aClass480_Sub31_Sub8_8064, aClass631_8203.anInt8062 * 140382599,
						aClass631_8203.aClass480_Sub31_Sub8_8065, aClass631_8203.anInt8061 * 1088051891,
						anInt8206 * 1563999969, animation.frameDurations[-1747811733 * anInt8202], i,
						animation.aBool1971);

				if (aBool8212 && null != animation.anIntArray1970 && aClass631_8217.aBool8066) {
					model.method2950(aClass631_8217.aClass480_Sub31_Sub8_8064, 140382599 * aClass631_8217.anInt8062,
							aClass631_8217.aClass480_Sub31_Sub8_8065, 1088051891 * aClass631_8217.anInt8061,
							1563999969 * anInt8206, animation.frameDurations[anInt8202 * -1747811733], i,
							animation.aBool1971);
				}
			}
		}
	}

	public final void method13459(Model model, int i, int i_10_, int i_11_) {
		if (null != animation.frames && method13468()) {
			model.method2906(aClass631_8203.aClass480_Sub31_Sub8_8064, 140382599 * aClass631_8203.anInt8062,
					aClass631_8203.aClass480_Sub31_Sub8_8065, aClass631_8203.anInt8061 * 1088051891,
					1563999969 * anInt8206, animation.frameDurations[-1747811733 * anInt8202], i, i_10_,
					animation.aBool1971, null);

			if (aBool8212 && animation.anIntArray1970 != null && aClass631_8217.aBool8066) {
				model.method2906(aClass631_8217.aClass480_Sub31_Sub8_8064, 140382599 * aClass631_8217.anInt8062,
						aClass631_8217.aClass480_Sub31_Sub8_8065, 1088051891 * aClass631_8217.anInt8061,
						1563999969 * anInt8206, animation.frameDurations[-1747811733 * anInt8202], i, i_10_,
						animation.aBool1971, null);
			}
		}
	}

	public final void method13460(Model model) {
		if (null != animation.frames && method13468()) {
			model.method2979(aClass631_8203.aClass480_Sub31_Sub8_8064, aClass631_8203.anInt8062 * 140382599);
			if (aBool8212 && null != animation.anIntArray1970 && aClass631_8217.aBool8066) {
				model.method2979(aClass631_8217.aClass480_Sub31_Sub8_8064, 140382599 * aClass631_8217.anInt8062);
			}
		}
	}

	public final boolean method13461() {
		return aBool8211;
	}

	public final void method13462(int i) {
		anInt8207 = -1929485351 * i;
	}

	public final void method13463() {
		method13464(0);
	}

	public final void method13464(int i) {
		anInt8202 = 0;
		anInt8215 = 1049760421 * (animation.frames.length > 1 ? 1 : -1);
		anInt8206 = 0;
		aBool8211 = false;
		anInt8207 = i * -1929485351;
		anInt8216 = 0;

		if (animation != null & null != animation.frames) {
			method13467(animation, anInt8202 * -1747811733);
			method13469();
		}
	}

	public final boolean method13465(int i) {
		if (animation == null || 0 == i) {
			return false;
		}
		if (anInt8207 * 2070277225 > 0) {
			if (2070277225 * anInt8207 > i) {
				anInt8207 -= i * -1929485351;
				return false;
			}
			i -= 2070277225 * anInt8207;
			anInt8207 = 0;
			method13467(animation, anInt8202 * -1747811733);
		}
		i += anInt8206 * 1563999969;
		boolean bool = animation.tweened | AnimationDefinition.aBool1977;
		if (i > 100 && animation.loopOffset * -1185584257 > 0) {
			int i_15_;
			for (i_15_ = animation.frames.length - -1185584257 * animation.loopOffset; -1747811733 * anInt8202 < i_15_
					&& i > animation.frameDurations[-1747811733 * anInt8202]; anInt8202 += 2084248131) {
				i -= animation.frameDurations[-1747811733 * anInt8202];
			}
			if (-1747811733 * anInt8202 >= i_15_) {
				int i_16_ = 0;
				for (int i_17_ = i_15_; i_17_ < animation.frames.length; i_17_++) {
					i_16_ += animation.frameDurations[i_17_];
				}
				if (0 == anInt8213 * -820900329) {
					anInt8216 += 427630669 * (i / i_16_);
				}
				i %= i_16_;
			}
			anInt8215 = -220228361 * anInt8202 + 1049760421;
			if (-1213758163 * anInt8215 >= animation.frames.length) {
				if (-1 == animation.loopOffset * -1185584257 && aBool8214) {
					anInt8215 = 0;
				} else {
					anInt8215 -= animation.loopOffset * -2046085413;
				}
				if (anInt8215 * -1213758163 < 0 || -1213758163 * anInt8215 >= animation.frames.length) {
					anInt8215 = -1049760421;
				}
			}
			bool = true;
		}
		while (i > animation.frameDurations[-1747811733 * anInt8202]) {
			bool = true;
			i -= animation.frameDurations[(anInt8202 += 2084248131) * -1747811733 - 1];
			if (-1747811733 * anInt8202 >= animation.frames.length) {
				if (animation.loopOffset * -1185584257 != -1 && anInt8213 * -820900329 != 2) {
					anInt8202 -= 2022377533 * animation.loopOffset;
					if (-820900329 * anInt8213 == 0) {
						anInt8216 += 427630669;
					}
				}
				if (anInt8216 * -967632763 >= 971793323 * animation.maxLoops || -1747811733 * anInt8202 < 0
						|| anInt8202 * -1747811733 >= animation.frames.length) {
					aBool8211 = true;
					break;
				}
			}
			method13467(animation, -1747811733 * anInt8202);
			anInt8215 = 1049760421 + anInt8202 * -220228361;
			if (anInt8215 * -1213758163 >= animation.frames.length) {
				if (-1 == animation.loopOffset * -1185584257 && aBool8214) {
					anInt8215 = 0;
				} else {
					anInt8215 -= animation.loopOffset * -2046085413;
				}
				if (-1213758163 * anInt8215 < 0 || -1213758163 * anInt8215 >= animation.frames.length) {
					anInt8215 = -1049760421;
				}
			}
		}
		anInt8206 = -1483406047 * i;
		if (bool) {
			method13469();
		}
		return bool;
	}

	public final void update(int animation) {
		method13453(animation, 0, 0, false);
	}

	public final void method13496() {
		anInt8216 = 0;
	}

	public final boolean method13507(int i) {
		if (animation == null | (i -= 2070277225 * anInt8207) <= 0) {
			return false;
		}

		return animation.tweened | i + 1563999969 * anInt8206 > animation.frameDurations[anInt8202 * -1747811733];
	}

	public final void method13514(Class650 class650_25_) {
		animation = class650_25_.animation;
		aBool8211 = class650_25_.aBool8211;
		aBool8212 = class650_25_.aBool8212;
		anInt8207 = 1 * class650_25_.anInt8207;
		anInt8216 = class650_25_.anInt8216 * 1;
		anInt8202 = class650_25_.anInt8202 * 1;
		anInt8215 = class650_25_.anInt8215 * 1;
		anInt8206 = class650_25_.anInt8206 * 1;
		method13469();
	}

	public final boolean method13515() {
		return 0 != anInt8207 * 2070277225;
	}

	void method13467(AnimationDefinition animation, int i) {

	}

	final boolean method13468() {
		if (animation != null) {
			boolean bool = aClass631_8203.method13113(AnimationDefinitionLoader.instance, animation, anInt8202 * -1747811733, anInt8215
					* -1213758163, animation.frames);
			if (bool && aBool8212 && null != animation.anIntArray1970) {
				aClass631_8217.method13113(AnimationDefinitionLoader.instance, animation, anInt8202 * -1747811733,
						anInt8215 * -1213758163, animation.anIntArray1970);
			}

			return bool;
		}

		return false;
	}

	final void method13469() {
		aClass631_8203.method13111();
		if (aBool8212) {
			aClass631_8217.method13111();
		}
	}

	final void method13474(int id, int i_20_, int i_21_, boolean bool, boolean bool_22_) {
		if (id != getAnimationId()) {
			if (id != -1) {
				if (animation != null && id == -1880295959 * animation.id) {
					if (animation.replayMode * -1719904053 == 0) {
						return;
					}
				} else {
					animation = AnimationDefinitionLoader.instance.get(id);
					if (animation == null || animation.frames == null) {
						animation = null;
						return;
					}
				}

				anInt8216 = 0;
				anInt8207 = i_20_ * -1929485351;
				anInt8213 = i_21_ * -78247513;
				aBool8214 = bool_22_;
				if (bool) {
					anInt8202 = (int) (Math.random() * animation.frames.length) * 2084248131;
					anInt8206 = (int) (Math.random() * animation.frameDurations[-1747811733 * anInt8202]) * -1483406047;
				} else {
					anInt8202 = 0;
					anInt8206 = 0;
				}

				anInt8215 = 1049760421 + anInt8202 * -220228361;
				if (-1213758163 * anInt8215 < 0 || anInt8215 * -1213758163 >= animation.frames.length) {
					anInt8215 = -1049760421;
				}

				if (0 == 2070277225 * anInt8207) {
					method13467(animation, -1747811733 * anInt8202);
				}

				aBool8211 = false;
			} else {
				animation = null;
			}

			method13469();
		}
	}

}