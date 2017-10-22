package com.jagex;

import java.util.Random;

public abstract class Font {
	static int oldShadowColour;
	static int strikeColour = 257628529;
	static int underlineColour = -833806807;
	static int anInt1523 = 0;
	static int textColour = 0;
	static int shadowColour;
	static int anInt1527;
	static int anInt1528;
	static String[] aStringArray1529 = new String[100];

	public static int parseInt(CharSequence sequence, int radix) {
		return TextureMetrics.parseInt(sequence, radix, true);
	}

	FontSpecification specification;
	Toolkit toolkit;

	Font(Toolkit toolkit, FontSpecification specification) {
		this.toolkit = toolkit;
		this.specification = specification;
	}

	public void method2291(String string, int i, int i_0_, int i_1_, int i_2_) {
		if (string != null) {
			setColour(i_1_, i_2_);
			method2312(string, i, i_0_, null, null, null, 0, 0);
		}
	}

	public void method2293(String text, int i, int i_4_, int colour, int shadowColour) {
		if (text != null) {
			setColour(colour, shadowColour);
			method2312(text, i - specification.textWidth(text) / 2, i_4_, null, null, null, 0, 0);
		}
	}

	public int method2294(String string, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, int i_15_, Sprite[] class116s, int[] is, ClippingMask class129, int i_16_, int i_17_) {
		return method2295(string, i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, 0, class116s, is, class129,
				i_16_, i_17_);
	}

	public int method2295(String string, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_,
			int i_25_, int i_26_, int i_27_, Sprite[] class116s, int[] is, ClippingMask class129, int i_28_, int i_29_) {
		if (null == string) {
			return 0;
		}
		setColour(i_22_, i_23_);
		if (i_26_ == 0) {
			i_26_ = specification.verticalSpacing * 108311343;
		}
		int[] is_31_;
		if (i_21_ < i_26_ + -1569538073 * specification.bottomPadding + specification.topPadding * -1971642963
				&& i_21_ < i_26_ + i_26_) {
			is_31_ = null;
		} else {
			is_31_ = new int[] { i_20_ };
		}
		int i_32_ = specification.splitLines(string, is_31_, class116s, aStringArray1529);
		if (i_27_ == -1) {
			i_27_ = i_21_ / i_26_;
			if (i_27_ <= 0) {
				i_27_ = 1;
			}
		}
		if (i_27_ > 0 && i_32_ >= i_27_) {
			aStringArray1529[i_27_ - 1] = specification.fitText(aStringArray1529[i_27_ - 1], class116s, i_20_);
			i_32_ = i_27_;
		}
		if (i_25_ == 3 && i_32_ == 1) {
			i_25_ = 1;
		}
		int i_33_;
		if (i_25_ == 0) {
			i_33_ = specification.topPadding * -1971642963 + i_19_;
		} else if (1 == i_25_) {
			i_33_ = specification.topPadding
					* -1971642963
					+ i_19_
					+ (i_21_ - -1971642963 * specification.topPadding - -1569538073 * specification.bottomPadding - i_26_
							* (i_32_ - 1)) / 2;
		} else if (i_25_ == 2) {
			i_33_ = i_21_ + i_19_ - -1569538073 * specification.bottomPadding - i_26_ * (i_32_ - 1);
		} else {
			int i_34_ = (i_21_ - -1971642963 * specification.topPadding - specification.bottomPadding * -1569538073 - i_26_
					* (i_32_ - 1))
					/ (1 + i_32_);
			if (i_34_ < 0) {
				i_34_ = 0;
			}
			i_33_ = i_34_ + specification.topPadding * -1971642963 + i_19_;
			i_26_ += i_34_;
		}
		for (int i_35_ = 0; i_35_ < i_32_; i_35_++) {
			if (0 == i_24_) {
				method2312(aStringArray1529[i_35_], i, i_33_, class116s, is, class129, i_28_, i_29_);
			} else if (i_24_ == 1) {
				method2312(aStringArray1529[i_35_], i + (i_20_ - specification.textWidth(aStringArray1529[i_35_])) / 2,
						i_33_, class116s, is, class129, i_28_, i_29_);
			} else if (i_24_ == 2) {
				method2312(aStringArray1529[i_35_], i + i_20_ - specification.textWidth(aStringArray1529[i_35_]),
						i_33_, class116s, is, class129, i_28_, i_29_);
			} else if (i_32_ - 1 == i_35_) {
				method2312(aStringArray1529[i_35_], i, i_33_, class116s, is, class129, i_28_, i_29_);
			} else {
				method2303(aStringArray1529[i_35_], i_20_, -621628491);
				method2312(aStringArray1529[i_35_], i, i_33_, class116s, is, class129, i_28_, i_29_);
				anInt1527 = 0;
			}
			i_33_ += i_26_;
		}
		return i_32_;
	}

	public void method2296(String string, int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		if (string != null) {
			setColour(i_37_, i_38_);
			int i_41_ = string.length();
			int[] is = new int[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
				is[i_42_] = (int) (Math.sin(i_42_ / 2.0 + i_39_ / 5.0) * 5.0);
			}
			method2308(string, i - specification.textWidth(string) / 2, i_36_, null, null, null, is, (byte) -59);
		}
	}

	public void method2297(String string, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		if (null != string) {
			setColour(i_44_, i_45_);
			int i_48_ = string.length();
			int[] is = new int[i_48_];
			int[] is_49_ = new int[i_48_];
			for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
				is[i_50_] = (int) (Math.sin(i_46_ / 5.0 + i_50_ / 5.0) * 5.0);
				is_49_[i_50_] = (int) (Math.sin(i_46_ / 5.0 + i_50_ / 3.0) * 5.0);
			}
			method2308(string, i - specification.textWidth(string) / 2, i_43_, null, null, is, is_49_, (byte) 78);
		}
	}

	public void method2298(String string, int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		if (null != string) {
			setColour(i_52_, i_53_);
			double d = 7.0 - i_55_ / 8.0;
			if (d < 0.0) {
				d = 0.0;
			}
			int i_57_ = string.length();
			int[] is = new int[i_57_];
			for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
				is[i_58_] = (int) (Math.sin(i_54_ / 1.0 + i_58_ / 1.5) * d);
			}
			method2308(string, i - specification.textWidth(string) / 2, i_51_, null, null, null, is, (byte) -5);
		}
	}

	public int method2300(String string, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_,
			int i_65_, Random random, int i_66_, int[] is, Sprite[] class116s, int[] is_67_, int i_68_) {
		if (null == string) {
			return 0;
		}
		random.setSeed(i_66_);
		int i_69_ = 192 + (random.nextInt() & 0x1f);
		setColour(i_69_ << 24 | i_62_ & 0xffffff, i_63_ == -1 ? 0 : i_69_ << 24 | i_63_ & 0xffffff);
		int i_70_ = string.length();
		int[] is_71_ = new int[i_70_];
		int i_72_ = 0;
		for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
			is_71_[i_73_] = i_72_;
			if ((random.nextInt() & 0x3) == 0) {
				i_72_++;
			}
		}
		int i_74_ = i;
		int i_75_ = specification.topPadding * -1971642963 + i_59_;
		int i_76_ = -1;
		if (i_65_ == 1) {
			i_75_ += (i_61_ - -1971642963 * specification.topPadding - specification.bottomPadding * -1569538073) / 2;
		} else if (2 == i_65_) {
			i_75_ = i_59_ + i_61_ - specification.bottomPadding * -1569538073;
		}
		if (1 == i_64_) {
			i_76_ = specification.textWidth(string) + i_72_;
			i_74_ += (i_60_ - i_76_) / 2;
		} else if (2 == i_64_) {
			i_76_ = specification.textWidth(string) + i_72_;
			i_74_ += i_60_ - i_76_;
		}
		method2308(string, i_74_, i_75_, class116s, is_67_, is_71_, null, (byte) 99);
		if (is != null) {
			if (-1 == i_76_) {
				i_76_ = specification.textWidth(string) + i_72_;
			}
			is[0] = i_74_;
			is[1] = i_75_ - specification.topPadding * -1971642963;
			is[2] = i_76_;
			is[3] = specification.topPadding * -1971642963 + -1569538073 * specification.bottomPadding;
		}
		return i_72_;
	}

	public void method2318(String text, int i, int i_111_, int i_112_, int i_113_) {
		if (text != null) {
			setColour(i_112_, i_113_);
			method2312(text, i - specification.textWidth(text), i_111_, null, null, null, 0, 0);
		}
	}

	public int method2326(String string, int i, int i_117_, int i_118_, int i_119_, Random random, int i_120_,
			Sprite[] class116s, int[] is, int i_121_) {
		if (null == string) {
			return 0;
		}
		random.setSeed(i_120_);
		int i_122_ = 192 + (random.nextInt() & 0x1f);
		setColour(i_122_ << 24 | i_118_ & 0xffffff, i_122_ << 24 | i_119_ & 0xffffff);
		int i_123_ = string.length();
		int[] is_124_ = new int[i_123_];
		int i_125_ = 0;
		for (int i_126_ = 0; i_126_ < i_123_; i_126_++) {
			is_124_[i_126_] = i_125_;
			if ((random.nextInt() & 0x3) == 0) {
				i_125_++;
			}
		}
		method2308(string, i, i_117_, class116s, is, is_124_, null, (byte) -24);
		return i_125_;
	}

	void setColour(int colour, int shadow) {
		strikeColour = 257628529;
		underlineColour = -833806807;
		textColour = (anInt1523 = colour * 2123242347) * 728232255;
		anInt1527 = 0;
		anInt1528 = 0;
		if (shadow == -1) {
			shadow = 0;
		}
		shadowColour = (oldShadowColour = shadow * 310307255) * -687044391;
	}

	void parseModifier(String modifier) {
		try {
			if (modifier.startsWith("col=")) {
				textColour = (textColour * 639349501 & ~0xffffff | parseInt(modifier.substring(4), 16) & 0xffffff)
						* -304776619;
			} else if (modifier.equals("/col")) {
				textColour = -304776619 * (textColour * 639349501 & ~0xffffff | -149145277 * anInt1523 & 0xffffff);
			}
			if (modifier.startsWith("argb=")) {
				textColour = parseInt(modifier.substring(5), 16) * -304776619;
			} else if (modifier.equals("/argb")) {
				textColour = anInt1523 * 728232255;
			} else if (modifier.startsWith("str=")) {
				strikeColour = (639349501 * textColour & ~0xffffff | parseInt(modifier.substring(4), 16)) * -257628529;
			} else if (modifier.equals("str")) {
				strikeColour = (639349501 * textColour & ~0xffffff | 0x800000) * -257628529;
			} else if (modifier.equals("/str")) {
				strikeColour = 257628529;
			} else if (modifier.startsWith("u=")) {
				underlineColour = (639349501 * textColour & ~0xffffff | parseInt(modifier.substring(2), 16)) * 833806807;
			} else if (modifier.equals("u")) {
				underlineColour = 833806807 * (639349501 * textColour & ~0xffffff);
			} else if (modifier.equals("/u")) {
				underlineColour = -833806807;
			} else if (modifier.equalsIgnoreCase("shad=-1")) {
				shadowColour = 0;
			} else if (modifier.startsWith("shad=")) {
				shadowColour = (textColour * 639349501 & ~0xffffff | parseInt(modifier.substring(5), 16)) * -1085189089;
			} else if (modifier.equals("shad")) {
				shadowColour = (639349501 * textColour & ~0xffffff) * -1085189089;
			} else if (modifier.equals("/shad")) {
				shadowColour = -687044391 * oldShadowColour;
			} else if (modifier.equals("br")) {
				setColour(-149145277 * anInt1523, 119882759 * oldShadowColour);
			}
		} catch (Exception exception) {

		}
	}

	void method2303(String string, int i, int i_79_) {
		int i_80_ = 0;
		boolean bool = false;
		for (int i_81_ = 0; i_81_ < string.length(); i_81_++) {
			char c = string.charAt(i_81_);
			if (c == '<') {
				bool = true;
			} else if (c == '>') {
				bool = false;
			} else if (!bool && ' ' == c) {
				i_80_++;
			}
		}
		if (i_80_ > 0) {
			anInt1527 = (i - specification.textWidth(string) << 8) / i_80_ * 793390061;
		}
	}

	void method2308(String string, int i, int i_82_, Sprite[] class116s, int[] is, int[] is_83_, int[] is_84_,
			byte i_85_) {
		i_82_ -= 108311343 * specification.verticalSpacing;
		int i_86_ = -1;
		int i_87_ = -1;
		int i_88_ = 0;
		int i_89_ = string.length();
		for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
			char c = (char) (Class483.charToByte(string.charAt(i_90_)) & 0xff);
			if (60 == c) {
				i_86_ = i_90_;
			} else {
				if (62 == c && i_86_ != -1) {
					String string_91_ = string.substring(i_86_ + 1, i_90_);
					i_86_ = -1;
					if (string_91_.equals("lt")) {
						c = '<';
					} else if (string_91_.equals("gt")) {
						c = '>';
					} else if (string_91_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_91_.equals("shy")) {
						c = '\u00ad';
					} else if (string_91_.equals("times")) {
						c = '\u00d7';
					} else if (string_91_.equals("euro")) {
						c = '\u20ac';
					} else if (string_91_.equals("copy")) {
						c = '\u00a9';
					} else if (string_91_.equals("reg")) {
						c = '\u00ae';
					} else {
						if (string_91_.startsWith("img=")) {
							try {
								int i_92_;
								if (is_83_ != null) {
									i_92_ = is_83_[i_88_];
								} else {
									i_92_ = 0;
								}
								int i_93_;
								if (null != is_84_) {
									i_93_ = is_84_[i_88_];
								} else {
									i_93_ = 0;
								}
								i_88_++;
								int i_94_ = Client.parseDecimal(string_91_.substring(4));
								Sprite class116 = class116s[i_94_];
								int i_95_ = null != is ? is[i_94_] : class116.scaleHeight();
								class116.method2142(i + i_92_, i_93_ + 108311343 * specification.verticalSpacing
										+ i_82_ - i_95_, 1, -1, 1);
								i += class116s[i_94_].scaleWidth();
								i_87_ = -1;
							} catch (Exception exception) {

							}
						} else {
							parseModifier(string_91_);
						}
						continue;
					}
				}
				if (i_86_ == -1) {
					if (-1 != i_87_) {
						i += specification.getSpacing(i_87_, c);
					}
					int i_96_;
					if (null != is_83_) {
						i_96_ = is_83_[i_88_];
					} else {
						i_96_ = 0;
					}
					int i_97_;
					if (is_84_ != null) {
						i_97_ = is_84_[i_88_];
					} else {
						i_97_ = 0;
					}
					i_88_++;
					if (32 != c) {
						if ((shadowColour * 415836127 & ~0xffffff) != 0) {
							renderCharacter(c, i + 1 + i_96_, i_97_ + 1 + i_82_, 415836127 * shadowColour, true);
						}
						renderCharacter(c, i_96_ + i, i_82_ + i_97_, 639349501 * textColour, false);
					} else if (366799333 * anInt1527 > 0) {
						anInt1528 += anInt1527 * 1339245675;
						i += anInt1528 * 196255471 >> 8;
						anInt1528 = (196255471 * anInt1528 & 0xff) * -821932017;
					}
					int i_98_ = specification.getWidth(c);
					if (strikeColour * 725842031 != -1) {
						toolkit.method2382(i, (int) (108311343 * specification.verticalSpacing * 0.7) + i_82_, i_98_,
								strikeColour * 725842031, -1959638804);
					}
					if (-1 != 2132976103 * underlineColour) {
						toolkit.method2382(i, specification.verticalSpacing * 108311343 + i_82_, i_98_,
								underlineColour * 2132976103, -1892018254);
					}
					i += i_98_;
					i_87_ = c;
				}
			}
		}
	}

	void method2312(String string, int i, int i_99_, Sprite[] class116s, int[] is, ClippingMask class129, int i_100_,
			int i_101_) {
		i_99_ -= specification.verticalSpacing * 108311343;
		int i_103_ = -1;
		int i_104_ = -1;
		int i_105_ = string.length();
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
			char c = (char) (Class483.charToByte(string.charAt(i_106_)) & 0xff);
			if (c == 60) {
				i_103_ = i_106_;
			} else {
				if (c == 62 && i_103_ != -1) {
					String string_107_ = string.substring(i_103_ + 1, i_106_);
					i_103_ = -1;
					if (string_107_.equals("lt")) {
						c = '<';
					} else if (string_107_.equals("gt")) {
						c = '>';
					} else if (string_107_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_107_.equals("shy")) {
						c = '\u00ad';
					} else if (string_107_.equals("times")) {
						c = '\u00d7';
					} else if (string_107_.equals("euro")) {
						c = '\u20ac';
					} else if (string_107_.equals("copy")) {
						c = '\u00a9';
					} else if (string_107_.equals("reg")) {
						c = '\u00ae';
					} else {
						if (string_107_.startsWith("img=")) {
							try {
								int i_108_ = Client.parseDecimal(string_107_.substring(4));
								Sprite class116 = class116s[i_108_];
								int i_109_ = null != is ? is[i_108_] : class116.scaleHeight();
								if (-16777216 == (textColour * 639349501 & ~0xffffff)) {
									class116.method2142(i, specification.verticalSpacing * 108311343 + i_99_ - i_109_,
											1, -1, 1);
								} else {
									class116.method2142(i, specification.verticalSpacing * 108311343 + i_99_ - i_109_,
											0, textColour * 639349501 & ~0xffffff | 0xffffff, 1);
								}
								i += class116s[i_108_].scaleWidth();
								i_104_ = -1;
							} catch (Exception exception) {

							}
						} else {
							parseModifier(string_107_);
						}
						continue;
					}
				}
				if (i_103_ == -1) {
					if (-1 != i_104_) {
						i += specification.getSpacing(i_104_, c);
					}
					if (c != 32) {
						if (null == class129) {
							if (0 != (shadowColour * 415836127 & ~0xffffff)) {
								renderCharacter(c, i + 1, i_99_ + 1, shadowColour * 415836127, true);
							}
							renderCharacter(c, i, i_99_, 639349501 * textColour, false);
						} else {
							if ((415836127 * shadowColour & ~0xffffff) != 0) {
								renderCharacter(c, i + 1, i_99_ + 1, 415836127 * shadowColour, true, class129, i_100_,
										i_101_);
							}
							renderCharacter(c, i, i_99_, 639349501 * textColour, false, class129, i_100_, i_101_);
						}
					} else if (anInt1527 * 366799333 > 0) {
						anInt1528 += anInt1527 * 1339245675;
						i += 196255471 * anInt1528 >> 8;
						anInt1528 = (anInt1528 * 196255471 & 0xff) * -821932017;
					}
					int i_110_ = specification.getWidth(c);
					if (strikeColour * 725842031 != -1) {
						toolkit.method2382(i, i_99_ + (int) (0.7 * (108311343 * specification.verticalSpacing)),
								i_110_, 725842031 * strikeColour, -2120703155);
					}
					if (underlineColour * 2132976103 != -1) {
						toolkit.method2382(i, i_99_ + specification.verticalSpacing * 108311343 + 1, i_110_,
								2132976103 * underlineColour, -1944906110);
					}
					i += i_110_;
					i_104_ = c;
				}
			}
		}
	}

	abstract void renderCharacter(char character, int x, int y, int colour, boolean mono);

	abstract void renderCharacter(char c, int i, int i_127_, int i_128_, boolean bool, ClippingMask clipping,
			int i_129_, int i_130_);

}