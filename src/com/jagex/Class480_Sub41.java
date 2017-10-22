package com.jagex;

public class Class480_Sub41 extends Linkable {
	public int anInt10371;
	public int anInt10372;

	public Class480_Sub41(int i, int i_0_) {
		anInt10372 = 1499985759 * i;
		anInt10371 = i_0_ * -2058254549;
	}

	public boolean method16250() {
		return true;
	}

	public static final Class480_Sub41 method4800(int widgetId, Class480_Sub41 class480_sub41, int[] is, boolean bool) {
		Class480_Sub41 class480_sub41_1_ = (Class480_Sub41) Client.aClass667_10791.get(widgetId);
		if (null != class480_sub41_1_) {
			method9830(class480_sub41_1_,
					1021060255 * class480_sub41.anInt10372 != class480_sub41_1_.anInt10372 * 1021060255, bool);
		}

		Client.aClass667_10791.put(widgetId, class480_sub41);
		ParticleProducer.method9684(1021060255 * class480_sub41.anInt10372, is);
		Widget widget = Widget.lookup(widgetId);
		if (null != widget) {
			Widget.redraw(widget);
		}

		if (Client.aClass226_10793 != null) {
			Widget.redraw(Client.aClass226_10793);
			Client.aClass226_10793 = null;
		}

		if (widget != null) {
			Class548.method9327(Class598.loadedInterfaces[1857819631 * widget.id >>> 16], widget, !bool);
		}

		if (!bool) {
			Widget.method5082(1021060255 * class480_sub41.anInt10372, is);
		}

		if (!bool && Client.anInt10790 * 1764783361 != -1) {
			Widget.method15440(Client.anInt10790 * 1764783361, 1);
		}

		return class480_sub41;
	}

	public static final void method9830(Class480_Sub41 class480_sub41, boolean bool, boolean bool_5_) {
		int i_6_ = class480_sub41.anInt10372 * 1021060255;
		int i_7_ = (int) (-4821875126325281949L * class480_sub41.linkedKey);
		class480_sub41.unlink();
		if (bool) {
			Widget.method10427(i_6_);
		}
		Class530.method9027(i_6_, -1899213702);
		Widget class226 = Widget.lookup(i_7_);
		if (class226 != null) {
			Widget.redraw(class226);
		}
		Class193.method3844(i_6_, 1712775751);
		if (!bool_5_ && 1764783361 * Client.anInt10790 != -1) {
			Widget.method15440(Client.anInt10790 * 1764783361, 1);
		}
		HashTableIterator class661 = new HashTableIterator(Client.aClass667_10791);
		for (Class480_Sub41 class480_sub41_8_ = (Class480_Sub41) class661.first(); class480_sub41_8_ != null; class480_sub41_8_ = (Class480_Sub41) class661
				.next()) {
			if (!class480_sub41_8_.isLinked()) {
				class480_sub41_8_ = (Class480_Sub41) class661.first();
				if (class480_sub41_8_ == null) {
					break;
				}
			}
			if (class480_sub41_8_.anInt10371 * -487784573 == 3) {
				int i_9_ = (int) (-4821875126325281949L * class480_sub41_8_.linkedKey);
				if (i_9_ >>> 16 == i_6_) {
					method9830(class480_sub41_8_, true, bool_5_);
				}
			}
		}
	}

}