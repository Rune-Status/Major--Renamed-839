package com.jagex;

import java.awt.Desktop;
import java.net.URI;

public class HitbarDefinition implements Definition {
	static final int anInt7196 = 70;

	public static void method8947(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class280.anInt3154 = 0;
		if (Client.anInt10901 * 1225579785 != -634892237 * Client.anInt10900 || Client.aBool10675 != bool
				|| !string.equals(Class115.aString1445)) {
			Class115.aString1445 = string;
			Client.anInt10901 = 160779867 * Client.anInt10900;
			Client.aBool10675 = bool;
			short[] is = new short[16];
			int i_4_ = 0;
			int i_5_ = bool ? 32768 : 0;
			int i_6_ = i_5_
					+ (bool ? 482647213 * ThemeMusicVolumeNormaliser.aClass10_2062.anInt243 : -425076679
							* ThemeMusicVolumeNormaliser.aClass10_2062.anInt245);
			for (int i_7_ = i_5_; i_7_ < i_6_; i_7_++) {
				QuickChatMessage class480_sub31_sub6 = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_7_);
				if (class480_sub31_sub6.searchable
						&& class480_sub31_sub6.getMessage().toLowerCase().indexOf(string) != -1) {
					if (i_4_ >= 50) {
						Class357.anInt3819 = -1647591413;
						Class16.aShortArray282 = null;
						return;
					}
					if (i_4_ >= is.length) {
						short[] is_8_ = new short[is.length * 2];
						for (int i_9_ = 0; i_9_ < i_4_; i_9_++) {
							is_8_[i_9_] = is[i_9_];
						}
						is = is_8_;
					}
					is[i_4_++] = (short) i_7_;
				}
			}
			Class16.aShortArray282 = is;
			Class357.anInt3819 = 1647591413 * i_4_;
			String[] strings = new String[-1937034147 * Class357.anInt3819];
			for (int i_10_ = 0; i_10_ < -1937034147 * Class357.anInt3819; i_10_++) {
				strings[i_10_] = ThemeMusicVolumeNormaliser.aClass10_2062.get(is[i_10_]).getMessage();
			}
			ArrayUtils.sort(Class16.aShortArray282, strings);
		}
	}

	public static void method8948(String string, String string_11_, String string_12_, boolean bool, int i) {
		if (string.length() <= 320 && Client.unconnected()) {
			Client.lobbyConnection.stopConnection();
			Class614.method10354();
			Class31.aString423 = string;
			Class31.accountPassword = string_11_;
			Class31.aString405 = string_12_;
			Class31.aBool426 = bool;
			Class536.setGameState(18);
		}
	}

	public static void method8950() {
		Class403.method6716();
		Class56.menuOpen = false;
		Client.method8796(907118265 * TextureMetricsList.anInt1822, MobVariableCollection.anInt6537 * 1889755609,
				-1708755565 * Class480_Sub41_Sub4.anInt11432, Class593.anInt7836 * 502538357);
		Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430 = null;
		MenuOption.aClass480_Sub31_Sub17_348 = null;
	}

	public static void method8951() {
		int i_15_ = Client.aClass460_10760.method7680();
		int i_16_ = Client.aClass460_10760.method7707();
		IdentikitDefinitionProvider.aBoolArrayArray3303 = new boolean[i_15_ >> 3][i_16_ >> 3];
	}

	public static void openUrl(String url, boolean stayLoggedIn, String method, boolean forceJs) {
		if (stayLoggedIn) {
			if (!forceJs && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(url));
				} catch (Exception exception) {
				}

				return;
			}

			if (Class474.osName.startsWith("win") && !forceJs) {
				Client.openUrl(url, 0);
			} else if (Class474.osName.startsWith("mac")) {
				Client.openUrl(url, 1, method);
			} else {
				Client.openUrl(url, 2);
			}
		} else {
			Client.openUrl(url, 3);
		}
	}

	public int anInt7194;
	public int anInt7195 = 1738159489;
	public int anInt7197 = -1506459821;
	public int anInt7198 = -1129912659;
	public int anInt7199 = 179499273;
	public int anInt7201;
	public int anInt7202;
	public int anInt7203;
	public int anInt7204 = -489300790;
	public int anInt7205;
	public int anInt7206;
	BaseHitbarDefinitionProvider provider;
	public static HitbarDefinitionLoader loader;

	HitbarDefinition(int id, BaseHitbarDefinitionProvider provider) {
		anInt7201 = 843895687;
		anInt7202 = 1768190293;
		anInt7203 = -707597089;
		anInt7194 = 594670639;
		anInt7205 = 1657703495;
		anInt7206 = -1888839769;
		this.provider = provider;
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	public Sprite getSprite(Toolkit toolkit, int id) {
		if (id < 0) {
			return null;
		}

		Sprite sprite = provider.sprites.get(id);
		if (sprite == null) {
			cacheSprites(toolkit);
			sprite = provider.sprites.get(id);
		}

		return sprite;
	}

	@Override
	public void method35() {

	}

	void cacheSprite(Toolkit toolkit, int id) {
		Archive images = provider.images;

		if (id >= 0 && provider.sprites.get(id) == null && images.fileLoaded(id)) {
			Image image = ImageUtils.loadFirst(images, id);
			provider.sprites.put(id, toolkit.createSprite(image, true));
		}
	}

	void cacheSprites(Toolkit toolkit) {
		cacheSprite(toolkit, -239895095 * anInt7201);
		cacheSprite(toolkit, 1597504515 * anInt7202);
		cacheSprite(toolkit, 759967969 * anInt7203);
		cacheSprite(toolkit, anInt7194 * -250575);
		cacheSprite(toolkit, 1119789705 * anInt7205);
		cacheSprite(toolkit, 524509161 * anInt7206);
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			buffer.readUShort();
		} else if (opcode == 2) {
			anInt7195 = buffer.readUByte() * 1202669951;
		} else if (3 == opcode) {
			anInt7197 = buffer.readUByte() * -1841795667;
		} else if (opcode == 4) {
			anInt7198 = 0;
		} else if (opcode == 5) {
			anInt7204 = buffer.readUShort() * -1847690281;
		} else if (opcode == 6) {
			buffer.readUByte();
		} else if (7 == opcode) {
			anInt7201 = buffer.readSmart32() * -843895687;
		} else if (opcode == 8) {
			anInt7202 = buffer.readSmart32() * -1768190293;
		} else if (opcode == 9) {
			anInt7203 = buffer.readSmart32() * 707597089;
		} else if (opcode == 10) {
			anInt7194 = buffer.readSmart32() * -594670639;
		} else if (11 == opcode) {
			anInt7198 = buffer.readUShort() * 1129912659;
		} else if (12 == opcode) {
			anInt7205 = buffer.readSmart32() * -1657703495;
		} else if (13 == opcode) {
			anInt7206 = buffer.readSmart32() * 1888839769;
		}
	}

}