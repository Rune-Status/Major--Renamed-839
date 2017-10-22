package com.jagex;

import java.util.LinkedList;

import com.jagex.twitch.TwitchTV;

public class Class514 implements Encodeable {
	static int anInt7014;

	public static void method8821(Toolkit toolkit, long l, int i, int i_0_, int i_1_) {
		do {
			if (toolkit.method2406() && toolkit.method2499() > -1) {
				int i_2_ = toolkit.method2499();
				Class535 class535 = null;
				if (!Class533.aLinkedList7284.isEmpty()) {
					class535 = (Class535) Class533.aLinkedList7284.getFirst();
				}
				if (class535 == null || 445816681 * class535.anInt7306 != i_2_) {
					toolkit.method2574();
					Class533.aLinkedList7284.clear();
				} else {
					Class533.aLinkedList7284.removeFirst();
					toolkit.method2457();
					int i_3_;
					if (class535.aLinkedList7305.isEmpty() && toolkit.method2408()) {
						long l_4_ = toolkit.method2685(Class554.anInt7503 * 1401702975, IgnoredPlayer.anInt4246
								* -1021853939);
						i_3_ = TwitchTV.tv.SubmitFrame(l_4_, toolkit.method2707(), Class533.aBool7287, i, i_0_);
						toolkit.method2413(l_4_);
					} else {
						toolkit.method2525(Class554.anInt7503 * 1401702975, -1021853939 * IgnoredPlayer.anInt4246,
								Class189.anIntArray2059, Deque.anIntArray8173);
						IgnoredPlayer.method1365(Class189.anIntArray2059, class535.aLinkedList7305,
								class535.anInt7303 * 1407066997, -176215205 * class535.anInt7304, class535.aFloat7302,
								(byte) 60);
						i_3_ = TwitchTV.tv.SubmitFrameRaw(Class189.anIntArray2059, Class533.aBool7287, i, i_0_);
					}
					toolkit.method2446();
					if (2072 == i_3_) {
						Class533.aLong7277 = l * -1187625281963989869L;
					} else if (i_3_ == 23) {
						Class533.aLong7278 = l * 3806400168656317587L;
					} else if (-995 == i_3_ || 0 != i_3_) {
						break;
					}
				}
			}
		} while (false);
		if (Class533.aBool7280) {
			if (Class189.anIntArray2059 == null) {
				Class189.anIntArray2059 = new int[Class533.aBool7287 ? i * i_0_ : Class554.anInt7503 * 1401702975
						* -1021853939 * IgnoredPlayer.anInt4246];
				Deque.anIntArray8173 = new int[Class533.aBool7287 ? i * i_0_ : -1021853939 * IgnoredPlayer.anInt4246
						* 1401702975 * Class554.anInt7503];
			}
			if (!toolkit.method2406()) {
				toolkit.method2457();
				toolkit.method2525(1401702975 * Class554.anInt7503, IgnoredPlayer.anInt4246 * -1021853939,
						Class189.anIntArray2059, Deque.anIntArray8173);
				IgnoredPlayer.method1365(Class189.anIntArray2059, Class533.aLinkedList7260,
						toolkit.anInt1569 * 81622179, -2040424545 * toolkit.anInt1568, toolkit.aFloat1550, (byte) 103);
				int i_5_ = TwitchTV.tv.SubmitFrameRaw(Class189.anIntArray2059, Class533.aBool7287, i, i_0_);
				toolkit.method2446();
				Class533.aLinkedList7260.clear();

				if (i_5_ == 2072) {
					Class533.aLong7277 = l * -1187625281963989869L;
				} else if (i_5_ == 23) {
					Class533.aLong7278 = l * 3806400168656317587L;
				} else if (-995 == i_5_ || 0 != i_5_) {
					return;
				}
			} else {
				toolkit.method2412(Client.tick, Class554.anInt7503 * 1401702975, -1021853939 * IgnoredPlayer.anInt4246);
				Class533.aLinkedList7284.add(new Class535(Client.tick, Class533.aLinkedList7260,
						toolkit.anInt1569 * 81622179, toolkit.anInt1568 * -2040424545, toolkit.aFloat1550));
				Class533.aLinkedList7260 = new LinkedList();
			}

			Class533.aBool7280 = false;
		}
	}

	Class22 aClass22_7013;

	Class514(Class22 class22) {
		aClass22_7013 = class22;
	}

	@Override
	public void encode() {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3990, Client.gameConnection.encryptor);
		frame.payload.writeByteA(aClass22_7013.getId());
		Client.gameConnection.sendFrame(frame);
	}

}