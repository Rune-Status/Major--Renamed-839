package com.jagex;

public class ParticleProducerDefinition {

	public int anInt3728;
	public short minimumAngleH;
	public short maximumAngleH;
	public short minimumAngleV;
	public short maximumAngleV;
	public int minimumParticleRate;
	public int maximumSpeed;
	public int anInt3737 = 0;
	public int anInt3738;
	public int endSpeed = 1418813445;
	int alphaFading;
	public int minimumSize;
	public int maximumSize;
	public boolean aBool3743;
	int sizeChange;
	int minimumStartColour;
	int maximumStartColour;
	public boolean uniformColourVariance;
	public int fadeColour;
	int colourFading;
	int anInt3750;
	public int fadeGreenStep;
	public boolean aBool3752;
	public int anInt3753;
	public int fadeAlphaStep;
	public int maximumParticleRate;
	public int[] anIntArray3756;
	public int[] anIntArray3757;
	public int[] anIntArray3758;
	public int minimumSpeed;
	public int alphaFadeStart;
	public int anInt3762;
	public int anInt3763;
	public boolean activeFirst;
	public boolean periodic;
	public int anInt3766;
	public int lifetime;
	public int minimumSetting;
	public int startAlphaVariance;
	public int anInt3770;
	public int speedStep;
	public int endSize;
	public boolean aBool3773;
	public int anInt3774;
	int maximumStartBlue;
	public int minimumStartGreen;
	public int[] anIntArray3777;
	public boolean aBool3778;
	int speedChange = -1526875196;
	public int minimumLifetime;
	public boolean aBool3781;
	public int minimumStartRed;
	int maximumStartRed;
	public int startRedVariance;
	int anInt3785;
	public int anInt3786;
	public int startBlueVariance;
	public int anInt3788;
	int maximumStartGreen;
	public int startGreenVariance;
	public int minimumStartAlpha;
	int maximumStartAlpha;
	public int anInt3793;
	public int colourFadeStart;
	public int minimumStartBlue;
	public int fadeRedStep;
	public int fadeBlueStep;
	public boolean aBool3799;
	public int startSpeedChange;
	public boolean aBool3801;
	public int startSizeChange;
	public int sizeChangeStep;
	public int anInt3804;
	public int maximumLifetime;
	public static CachedParticleDefinitionLoader loader;

	ParticleProducerDefinition() {
		endSize = -214208973;
		sizeChange = 879160140;
		uniformColourVariance = true;
		colourFading = 1542577556;
		alphaFading = 1591002052;
		anInt3793 = 133902713;
		anInt3728 = 2074682858;
		anInt3762 = 195780830;
		activeFirst = true;
		periodic = true;
		anInt3766 = 192595189;
		lifetime = 77578087;
		aBool3773 = true;
		anInt3770 = -1395928743;
		aBool3801 = true;
		aBool3752 = true;
	}

	void init() {
		if (2069100195 * anInt3728 > -2 || anInt3762 * 1187402097 > -2) {
			aBool3781 = true;
		}
		minimumStartRed = (1280874965 * minimumStartColour >> 16 & 0xff) * 1417078419;
		maximumStartRed = (1383181759 * maximumStartColour >> 16 & 0xff) * 1128570921;
		startRedVariance = maximumStartRed * -1520455761 - -1718393283 * minimumStartRed;
		minimumStartBlue = -860424561 * (1280874965 * minimumStartColour >> 8 & 0xff);
		maximumStartBlue = (maximumStartColour * 1383181759 >> 8 & 0xff) * -1957265075;
		startBlueVariance = 311773435 * maximumStartBlue - -1204453103 * minimumStartBlue;
		minimumStartGreen = -2119288773 * (1280874965 * minimumStartColour & 0xff);
		maximumStartGreen = (maximumStartColour * 1383181759 & 0xff) * -132488025;
		startGreenVariance = maximumStartGreen * 112807973 - 1312765241 * minimumStartGreen;
		minimumStartAlpha = 438757211 * (1280874965 * minimumStartColour >> 24 & 0xff);
		maximumStartAlpha = (maximumStartColour * 1383181759 >> 24 & 0xff) * 1142615945;
		startAlphaVariance = 284397653 * maximumStartAlpha - -751575289 * minimumStartAlpha;

		if (0 != -626809649 * fadeColour) {
			colourFadeStart = 1376545565 * (836246693 * colourFading * maximumLifetime * -1122401665 / 100);
			alphaFadeStart = -2070194043 * (927842729 * alphaFading * -1122401665 * maximumLifetime / 100);
			if (66694965 * colourFadeStart == 0) {
				colourFadeStart = 1376545565;
			}

			fadeRedStep = ((-626809649 * fadeColour >> 16 & 0xff)
					- (minimumStartRed * 14034843 + startRedVariance * 1537964727 / 2) << 8)
					/ (colourFadeStart * 66694965) * -1006079771;
			fadeBlueStep = -866185513
					* (((fadeColour * -626809649 >> 8 & 0xff)
							- (minimumStartBlue * 938436719 + 1320046975 * startBlueVariance / 2) << 8) / (colourFadeStart * 66694965));
			fadeGreenStep = -1268162885
					* (((fadeColour * -626809649 & 0xff)
							- (startGreenVariance * 1586025355 / 2 + -914890509 * minimumStartGreen) << 8) / (66694965 * colourFadeStart));
			if (alphaFadeStart * 573235277 == 0) {
				alphaFadeStart = -2070194043;
			}
			fadeAlphaStep = 253436763 * (((fadeColour * -626809649 >> 24 & 0xff)
					- (910074069 * startAlphaVariance / 2 + -1556156205 * minimumStartAlpha) << 8) / (573235277 * alphaFadeStart));

			fadeRedStep += -1006079771 * (-1564095251 * fadeRedStep > 0 ? -4 : 4);
			fadeBlueStep += -866185513 * (fadeBlueStep * -580139801 > 0 ? -4 : 4);
			fadeGreenStep += (-962775437 * fadeGreenStep > 0 ? -4 : 4) * -1268162885;
			fadeAlphaStep += (fadeAlphaStep * -1516743469 > 0 ? -4 : 4) * 253436763;
		}
		if (-386165965 * endSpeed != -1) {
			startSpeedChange = 804672501 * (-1122401665 * maximumLifetime * -1646136407 * speedChange / 100);
			if (startSpeedChange * -691699619 == 0) {
				startSpeedChange = 804672501;
			}
			speedStep = 1514700107 * ((-386165965 * endSpeed - ((1808445073 * maximumSpeed - minimumSpeed * 723887793) / 2 + minimumSpeed * 723887793)) / (startSpeedChange * -691699619));
		}

		if (-1 != endSize * -410860795) {
			startSizeChange = sizeChange * -1231098397 * -1122401665 * maximumLifetime / 100 * -1110573463;
			if (startSizeChange * 293564889 == 0) {
				startSizeChange = -1110573463;
			}
			sizeChangeStep = (endSize * -410860795 - (minimumSize * 1137043897 + (-598486203 * maximumSize - 1137043897 * minimumSize) / 2))
					/ (startSizeChange * 293564889) * -1701700787;
		}
		anInt3804 = -1316043887 * anInt3750 - anInt3786 * -1095100511;
		anInt3788 = anInt3785 * -784771309 - anInt3774 * -1129746183;
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			minimumAngleH = (short) buffer.readUShort();
			maximumAngleH = (short) buffer.readUShort();
			minimumAngleV = (short) buffer.readUShort();
			maximumAngleV = (short) buffer.readUShort();
			int scale = 3;
			minimumAngleH <<= scale;
			maximumAngleH <<= scale;
			minimumAngleV <<= scale;
			maximumAngleV <<= scale;
		} else if (opcode == 2) {
			buffer.readUByte();
		} else if (opcode == 3) {
			minimumSpeed = buffer.readInt() * -229711279;
			maximumSpeed = buffer.readInt() * 1509347953;
		} else if (4 == opcode) {
			anInt3737 = buffer.readUByte() * 1978117481;
			anInt3738 = buffer.readByte() * -1185268147;
		} else if (opcode == 5) {
			minimumSize = (maximumSize = (buffer.readUShort() << 12 << 2) * 1456654221) * 659262445;
		} else if (6 == opcode) {
			minimumStartColour = buffer.readInt() * -1814046851;
			maximumStartColour = buffer.readInt() * -1652211137;
		} else if (7 == opcode) {
			minimumLifetime = buffer.readUShort() * -308861953;
			maximumLifetime = buffer.readUShort() * 1136672127;
		} else if (opcode == 8) {
			minimumParticleRate = buffer.readUShort() * 1148534245;
			maximumParticleRate = buffer.readUShort() * 1237635421;
		} else if (opcode == 9) {
			int count = buffer.readUByte();
			anIntArray3756 = new int[count];
			for (int index = 0; index < count; index++) {
				anIntArray3756[index] = buffer.readUShort();
			}
		} else if (opcode == 10) {
			int count = buffer.readUByte();
			anIntArray3758 = new int[count];
			for (int index = 0; index < count; index++) {
				anIntArray3758[index] = buffer.readUShort();
			}
		} else if (12 == opcode) {
			anInt3728 = buffer.readByte() * -1037341429;
		} else if (opcode == 13) {
			anInt3762 = buffer.readByte() * -97890415;
		} else if (opcode == 14) {
			anInt3763 = buffer.readUShort() * -626550887;
		} else if (15 == opcode) {
			anInt3793 = buffer.readUShort() * -133902713;
		} else if (16 == opcode) {
			activeFirst = buffer.readUByte() == 1;
			anInt3766 = buffer.readUShort() * -192595189;
			lifetime = buffer.readUShort() * -77578087;
			periodic = buffer.readUByte() == 1;
		} else if (17 == opcode) {
			anInt3770 = buffer.readUShort() * 1395928743;
		} else if (18 == opcode) {
			fadeColour = buffer.readInt() * -1649745361;
		} else if (opcode == 19) {
			minimumSetting = buffer.readUByte() * 1414211273;
		} else if (opcode == 20) {
			colourFading = buffer.readUByte() * 616721197;
		} else if (21 == opcode) {
			alphaFading = buffer.readUByte() * 574255769;
		} else if (22 == opcode) {
			endSpeed = buffer.readInt() * -1418813445;
		} else if (opcode == 23) {
			speedChange = buffer.readUByte() * 1101422745;
		} else if (opcode == 24) {
			uniformColourVariance = false;
		} else if (opcode == 25) {
			int i_11_ = buffer.readUByte();
			anIntArray3757 = new int[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				anIntArray3757[i_12_] = buffer.readUShort();
			}
		} else if (26 == opcode) {
			aBool3773 = false;
		} else if (opcode == 27) {
			endSize = (buffer.readUShort() << 12 << 2) * 214208973;
		} else if (opcode == 28) {
			sizeChange = buffer.readUByte() * 1512030155;
		} else if (opcode == 29) {
			if (buffer.readUByte() == 0) {
				anInt3774 = (anInt3785 = buffer.readShort() * 1984732728) * 1949751147;
			} else {
				anInt3774 = buffer.readShort() * -1967707800;
				anInt3785 = buffer.readShort() * 1984732728;
			}
		} else if (opcode == 30) {
			aBool3799 = true;
		} else if (31 == opcode) {
			minimumSize = (buffer.readUShort() << 12 << 2) * -993309559;
			maximumSize = (buffer.readUShort() << 12 << 2) * 1456654221;
		} else if (32 == opcode) {
			aBool3801 = false;
		} else if (33 == opcode) {
			aBool3778 = true;
		} else if (opcode == 34) {
			aBool3752 = false;
		} else if (35 == opcode) {
			if (buffer.readUByte() == 0) {
				anInt3786 = (anInt3750 = buffer.readShort() * 1351241496) * -1383307791;
			} else {
				anInt3786 = buffer.readShort() * -595006056;
				anInt3750 = buffer.readShort() * 1351241496;
				anInt3753 = buffer.readUByte() * -1767361629;
			}
		} else if (36 == opcode) {
			aBool3743 = true;
		}
	}

}