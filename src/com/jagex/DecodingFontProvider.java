package com.jagex;

import java.awt.Dimension;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

final class DecodingFontProvider implements FontProvider<Font> {
	static void method915() {
		if (Class60.activeToolkit.method2387()) {
			Class60.activeToolkit.method2394(Engine.aCanvas6501, -1552648719);
			Class166_Sub8.method15090();

			Dimension dimension = Engine.aCanvas6501.getSize();
			Class60.activeToolkit.method2392(Engine.aCanvas6501, dimension.width, dimension.height);
			Class60.activeToolkit.method2620(Engine.aCanvas6501);
		} else {
			ChecksumTableEntry.method6355(Class199.preferences.currentToolkit.getValue(), false);
		}

		EntityQueue.method13532();
	}

	static void method917(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		float f = (float) Class495.anInt6826 / (float) Class495.anInt6824;
		int i_8_ = i_5_;
		int i_9_ = i_6_;

		if (f < 1.0F) {
			i_9_ = (int) (f * i_5_);
		} else {
			i_8_ = (int) (i_6_ / f);
		}

		i -= (i_5_ - i_8_) / 2;
		i_4_ -= (i_6_ - i_9_) / 2;

		AsynchronousStreamRequest.anInt4532 = i * Class495.anInt6824 / i_8_ * 807429799;
		ClanChannelUpdater.anInt3185 = 1001358417 * (Class495.anInt6826 - i_4_ * Class495.anInt6826 / i_9_);
		Class495_Sub1.anInt10327 = -1164673443;
		Class495_Sub1.anInt10324 = -732309487;
		SpawnObjectCutsceneAction.method15149();
	}

	static void readFileBytes(File file, byte[] buffer, int length) throws IOException {
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		try {
			in.readFully(buffer, 0, length);
		} catch (EOFException eofexception) {

		}
		in.close();
	}

	@Override
	public Font get(byte[] data, FontSpecification specification, boolean bool) {
		return Class60.activeToolkit.createFont(specification, ImageUtils.decode(data), bool);
	}

}