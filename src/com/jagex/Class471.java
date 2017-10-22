package com.jagex;

import java.io.File;
import java.util.Hashtable;

public class Class471 {
	static boolean aBool6533 = false;
	static File aFile6534;
	static Hashtable readWriteFileCache = new Hashtable(16);

	public static void method8058(String name) {
		if (Client.widgetSelected && (Class577.selectedWidgetAttributes * -1564025309 & 0x18) != 0) {
			boolean found = false;
			int count = -1784886003 * Class80.playerCount;
			int[] indices = Class80.playerIndices;

			for (int index = 0; index < count; index++) {
				Player player = Client.players[indices[index]];
				if (null != player.accountName
						&& player.accountName.equalsIgnoreCase(name)
						&& (Client.localPlayer == player
								&& 0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x10) || 0 != (-1564025309
								* Class577.selectedWidgetAttributes & 0x8))) {
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4017,
							Client.gameConnection.encryptor);
					frame.payload.writeLEShort(Client.anInt10867 * -224153241);
					frame.payload.writeLEShort(-800680953 * Client.anInt10756);
					frame.payload.writeNegatedByte(0);
					frame.payload.writeLEShort(indices[index]);
					frame.payload.writeLEInt(Class490.anInt6751 * 1969702363);
					Client.gameConnection.sendFrame(frame);
					Class20.method728(player.pathX[0], player.pathZ[0]);
					found = true;
					break;
				}
			}

			if (!found) {
				Class632_Sub11.addUnnamedMessage(4, TranslatableString.UNABLE_TO_FIND.translate(Client.currentLanguage)
						+ name);
			}
			if (Client.widgetSelected) {
				PlayerVariableProvider.method1560();
			}
		}
	}

	static void method8052(Toolkit toolkit) {
		if (Class56.menuOpen) {
			Toolkit.method5369(toolkit);
		} else {
			ObjectDefinition.method9290(toolkit);
		}
	}

	static final void method8053(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.spriteOffsetY * 2141391961;
	}

	static final void method8054(ScriptExecutionContext class613) {
		class613.anInt7924 -= -2049596966;
		int i_0_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_1_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		ConnectionInfo.method13843(3, i_0_, i_1_, "");
	}

	static void method8055(int i, String string, String string_2_, int i_3_) {
		if (null != Client.gameConnection) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4027,
					Client.gameConnection.encryptor);
			class480_sub15.payload.writeShort(1 + TimeZoneUtils.method4000(string)
					+ TimeZoneUtils.method4000(string_2_));
			class480_sub15.payload.writeString(string);
			class480_sub15.payload.writeString(string_2_);
			class480_sub15.payload.writeByteS(i);
			Client.gameConnection.sendFrame(class480_sub15);
		}
	}

	static final void method8056(ScriptExecutionContext class613, int i) {
		Class125.method2261(Class495_Sub1.anInt10323 * -1626686433, 593106085);
	}

	static final void method8057(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_5_ = Class199.preferences.themeMusicVolume.getValue();
		if (i_5_ != i_4_) {
			Class199.preferences.setValue(Class199.preferences.themeMusicVolume, i_4_);
			Client.savePreferences();
			Client.sentPreferences = false;
		}
	}

	Class471() throws Throwable {
		throw new Error();
	}
}
