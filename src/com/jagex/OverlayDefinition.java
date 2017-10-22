package com.jagex;

public class OverlayDefinition implements Definition, Interface71 {
	static final int anInt7803 = 1190717;

	public static void method9930() {
		if (null != Class277.anInterface27Array3114) {
			Interface27[] interface27s = Class277.anInterface27Array3114;
			for (Interface27 interface27 : interface27s) {
				interface27.method106();
			}
		}
	}

	static final void method9929(Class600_Sub1 class600_sub1, ScriptExecutionContext class613) {
		boolean bool = false;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		if (null != class600_sub1.aClass139Array10373) {
			for (Class139 class139 : class600_sub1.aClass139Array10373) {
				if (class139.aBool1581) {
					int i_10_;
					int i_11_;
					if (class139.anInt1583 < class139.anInt1580) {
						i_10_ = class139.anInt1583 - class139.anInt1585;
						i_11_ = class139.anInt1585 + class139.anInt1580;
					} else {
						i_10_ = class139.anInt1580 - class139.anInt1585;
						i_11_ = class139.anInt1583 + class139.anInt1585;
					}
					int i_12_;
					int i_13_;
					if (class139.anInt1584 < class139.anInt1582) {
						i_12_ = class139.anInt1584 - class139.anInt1585;
						i_13_ = class139.anInt1585 + class139.anInt1582;
					} else {
						i_12_ = class139.anInt1582 - class139.anInt1585;
						i_13_ = class139.anInt1585 + class139.anInt1584;
					}
					if (!bool || i_10_ < i_5_) {
						i_5_ = i_10_;
					}
					if (!bool || i_12_ < i_6_) {
						i_6_ = i_12_;
					}
					if (!bool || i_11_ > i_7_) {
						i_7_ = i_11_;
					}
					if (!bool || i_13_ > i_8_) {
						i_8_ = i_13_;
					}
					bool = true;
				}
			}
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = bool ? 1 : 0;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_5_;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_6_;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_7_;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_8_;
	}

	static final void method9931(ScriptExecutionContext class613, byte i) {
		int i_15_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_15_);
		Interface class221 = Class598.loadedInterfaces[i_15_ >>> 16];
		Widget class226_16_ = Class339.method5850(class221, class226, 1736880654);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = null == class226_16_ ? -1
				: class226_16_.id * 1857819631;
	}

	public int anInt7797;
	int id;
	public int texture;
	public int anInt7800;
	public int scale;
	public int blendColour;
	public boolean blockShadow;
	public boolean aBool7805;
	public boolean aBool7806;
	public int anInt7807;
	public int waterScale;
	public int waterIntensity;
	public int colour = 0;
	public int waterColour;
	public int anInt7812;
	boolean aBool7813;
	public static OverlayDefinitionLoader loader;

	OverlayDefinition() {
		texture = -2018042817;
		aBool7805 = true;
		blendColour = -1950947019;
		scale = 702252544;
		blockShadow = true;
		anInt7807 = 688073128;
		waterColour = -2122775075;
		waterScale = -1617775936;
		waterIntensity = -785015789;
		anInt7800 = 661646015;
		anInt7812 = -154680384;
	}

	@Override
	public void method35() {
		anInt7807 = (anInt7807 * 868255005 << 8 | 163603879 * id) * -1524603595;
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	@Override
	public void method40(int id) {
		this.id = id * 88732183;
	}

	@Override
	public void setId(int id) {
		this.id = id * 88732183;
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			colour = OverlayDefinition.rgbToHsl(buffer.readUTriByte()) * -996168735;
		} else if (opcode == 2) {
			texture = buffer.readUByte() * 2018042817;
		} else if (3 == opcode) {
			texture = buffer.readUShort() * 2018042817;
			if (65535 == -795268031 * texture) {
				texture = -2018042817;
			}
		} else if (5 == opcode) {
			aBool7805 = false;
		} else if (opcode == 7) {
			blendColour = OverlayDefinition.rgbToHsl(buffer.readUTriByte()) * 1950947019;
		} else if (opcode == 8) {
			aBool7813 = true;
		} else if (9 == opcode) {
			scale = (buffer.readUShort() << 2) * 1804922307;
		} else if (opcode == 10) {
			blockShadow = false;
		} else if (opcode == 11) {
			anInt7807 = buffer.readUByte() * -1524603595;
		} else if (12 == opcode) {
			aBool7806 = true;
		} else if (opcode == 13) {
			waterColour = buffer.readUTriByte() * -2046136543;
		} else if (opcode == 14) {
			waterScale = (buffer.readUByte() << 2) * -1635890485;
		} else if (opcode == 16) {
			waterIntensity = buffer.readUByte() * 1243304173;
		} else if (20 == opcode) {
			anInt7800 = buffer.readUShort() * -739412607;
		} else if (21 == opcode) {
			anInt7797 = buffer.readUByte() * 330831251;
		} else if (opcode == 22) {
			anInt7812 = buffer.readUShort() * -203743473;
		}
	}

	static final int getOverlayColour(Toolkit toolkit, OverlayDefinition overlay) {
		if (overlay.blendColour * -1041293597 != -1) {
			return overlay.blendColour * -1041293597;
		} else if (-1 != -795268031 * overlay.texture) {
			TextureMetrics metrics = toolkit.metricsList.get(-795268031 * overlay.texture);

			if (!metrics.aBool1724) {
				return metrics.colour;
			}
		}

		return overlay.colour * -217720799;
	}

	static int rgbToHsl(int rgb) {
		if (0xFF00FF == rgb) {
			return -1;
		}

		return HslUtils.fromRgb(rgb);
	}

}