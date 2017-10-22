package com.jagex;

import com.jagex.twitch.TwitchTV;

public class Class341 implements Interface43 {

	public static int method5864(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
		if (i != 0 && (i < 50 || i > 100)) {
			i = 0;
		}

		if (i_0_ != 0 && (i_0_ < 50 || i_0_ > 100)) {
			i_0_ = 0;
		}

		boolean osx = Class485.osName.startsWith("mac");
		int[] is = TwitchTV.tv.GetRecommendedSettings(Engine.screenWidth * 1319181337, Engine.screenHeight
				* -551672947, i, 2000, i_1_, Class533.aFloat7288, osx);
		if (is[0] != 0) {
			return is[0];
		}
		int i_4_ = is[1];
		int i_5_ = is[2];
		int i_6_ = is[3];
		int kbps = i_6_;
		Class533.aLong7285 = 0L;
		Class341.aLong6921 = 1354312109387400137L * (long) (1000.0F / i_1_);
		Class554.anInt7503 = 1057400255 * i_4_;
		IgnoredPlayer.anInt4246 = i_5_ * -212129851;
		if (0 != i_0_) {
			i_6_ = i_6_ * i_0_ / 100;
		}
		CutsceneMob.printConsoleMessage(new StringBuilder().append("Stream - Input: ")
				.append(Engine.screenWidth * 1319181337).append("x").append(-551672947 * Engine.screenHeight)
				.append(" (").append(kbps).append("kbps)").append(" => ").append("Output: ").append(i_4_).append("x")
				.append(i_5_).append(" [")
				.append(0 == i ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (")
				.append(i_6_).append("kbps [")
				.append(0 == i_0_ ? "auto" : new StringBuilder().append(i_0_).append("%").toString()).append("])")
				.toString());
		return TwitchTV.tv.StartStreaming(i_4_, i_5_, i_1_, i_6_, i_0_ != 0, Class533.aFloat7288,
				-1441029373 * Class533.anInt7267, bool);
	}

	static String method5865(Widget class226) {
		if (Client.method17050(class226).method15633() == 0) {
			return null;
		}
		if (class226.aString2480 == null || class226.aString2480.trim().length() == 0) {
			if (Client.aBool10603) {
				return "Hidden-use";
			}
			return null;
		}
		return class226.aString2480;
	}

	static final void method5866(int i) {
		for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068.head(); null != class480_sub12; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068
				.next()) {
			Class604.method10232(class480_sub12, false);
		}
		for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067.head(); null != class480_sub12; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067
				.next()) {
			Class604.method10232(class480_sub12, true);
		}
	}

	static final void method5867() {
		if (-1 != 1764783361 * Client.anInt10790) {
			int x = Client.recorder.getMouseX();
			int y = Client.recorder.getMouseY();
			MouseRecord record = Client.mouseRecords.head();
			if (null != record) {
				x = record.getX();
				y = record.getY();
			}
			if (Client.aClass226_10801 != null && Class172.aClass226_1961 == Client.aClass226_10802) {
				Client.aBool10806 = true;
				Client.anInt10849 = 0;
				Client.anInt10808 = 0;
				Client.anInt10809 = Engine.screenWidth * 1857668003;
				Client.anInt10810 = -1941716463 * Engine.screenHeight;
			}
			Class575.method9766(null, 1764783361 * Client.anInt10790, 0, 0, Engine.screenWidth * 1319181337, -551672947
					* Engine.screenHeight, 0, 0, x, y);
			if (null != ParticleProducer.aClass226_7678) {
				ScriptExecutionContext.method10340(x, y);
			}
		}
	}

	public int anInt3639;
	static long aLong6921;

	Class341(int i) {
		anInt3639 = i * 664533713;
	}

	@Override
	public Class360 method316() {
		return Class360.aClass360_3884;
	}

	public static Class341 decode(Buffer buffer) {
		int i_0_ = buffer.readInt();
		return new Class341(i_0_);
	}

}