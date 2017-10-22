package com.jagex;

public class Class54 {
	public static final int anInt605 = 8;
	public static Archive shaders;
	public static int anInt608;
	static Archive models;

	static final void method1165() {
		Widget.redraw(Client.aClass226_10801);
		Display.anInt1818 += 179107011;
		if (!Client.aBool10811 || !Client.aBool10806) {
			if (-1153541141 * Display.anInt1818 > 1) {
				Client.aClass226_10801 = null;
				Client.aClass226_10802 = null;
			}
		} else {
			int i_0_ = Client.recorder.getMouseX();
			int i_1_ = Client.recorder.getMouseY();
			i_0_ -= 1600472963 * Client.anInt10803;
			i_1_ -= 558940787 * Client.anInt10804;
			if (i_0_ < 1253169817 * Client.anInt10849) {
				i_0_ = 1253169817 * Client.anInt10849;
			}
			if (i_0_ + 688089097 * Client.aClass226_10801.width > Client.anInt10849 * 1253169817 + 1098611987
					* Client.anInt10809) {
				i_0_ = 1253169817 * Client.anInt10849 + 1098611987 * Client.anInt10809 - 688089097
						* Client.aClass226_10801.width;
			}
			if (i_1_ < 220249895 * Client.anInt10808) {
				i_1_ = Client.anInt10808 * 220249895;
			}
			if (1362321717 * Client.aClass226_10801.height + i_1_ > Client.anInt10808 * 220249895 + 1332547005
					* Client.anInt10810) {
				i_1_ = 220249895 * Client.anInt10808 + Client.anInt10810 * 1332547005 - 1362321717
						* Client.aClass226_10801.height;
			}
			int i_2_;
			int i_3_;
			if (Class172.aClass226_1961 == Client.aClass226_10802) {
				i_2_ = i_0_;
				i_3_ = i_1_;
			} else {
				i_2_ = -1909412215 * Client.aClass226_10802.anInt2382 + i_0_ - Client.anInt10849 * 1253169817;
				i_3_ = -1881455913 * Client.aClass226_10802.scrollPosition + i_1_ - 220249895 * Client.anInt10808;
			}
			if (!Client.recorder.buttonDown()) {
				if (Client.aBool10814) {
					PlayerVariableProvider.method1560();
					if (Client.aClass226_10801.anObjectArray2493 != null) {
						ScriptContext class480_sub35 = new ScriptContext();
						class480_sub35.source = Client.aClass226_10801;
						class480_sub35.mouseX = i_2_ * 2003537681;
						class480_sub35.mouseY = -1907805425 * i_3_;
						Widget class226 = Client.method17024(Client.aClass226_10801);
						Widget class226_4_ = Client.aClass226_10805;
						boolean bool = false;
						for (; class226_4_ != null && 1920469085 * class226_4_.parent != -1 && class226 != null; class226_4_ = Class598.loadedInterfaces[1857819631 * class226_4_.id >> 16].children[1920469085 * class226_4_.parent & 0xffff]) {
							if (class226.id * 1857819631 == class226_4_.id * 1857819631) {
								bool = true;
								break;
							}
						}
						if (class226_4_ != null && class226 != null && Class172.aClass226_1961 != class226 && !bool) {
							class480_sub35.target = Class172.aClass226_1961;
						} else {
							class480_sub35.target = Client.aClass226_10805;
						}
						class480_sub35.arguments = Client.aClass226_10801.anObjectArray2493;
						Script.execute(class480_sub35);
					}
					if (null != Client.aClass226_10805 && Client.method17024(Client.aClass226_10801) != null) {
						GraphicDefinition.method10406(Client.aClass226_10801, Client.aClass226_10805);
					}
				} else if ((1 == Client.anInt10780 * -1088062211 || Class436.method7269())
						&& Class56.menuOptionCount * 84366055 > 2) {
					Class122.method2241(Client.anInt10628 * 445820795 + Client.anInt10803 * 1600472963, 558940787
							* Client.anInt10804 + 1448151993 * Client.anInt10857);
				} else if (GlobalPlayer.method1099()) {
					Class122.method2241(445820795 * Client.anInt10628 + 1600472963 * Client.anInt10803, 558940787
							* Client.anInt10804 + Client.anInt10857 * 1448151993);
				}
				Client.aClass226_10801 = null;
				Client.aClass226_10802 = null;
			} else {
				if (Display.anInt1818 * -1153541141 > Client.aClass226_10801.anInt2465 * 991542439) {
					int i_5_ = i_0_ - 445820795 * Client.anInt10628;
					int i_6_ = i_1_ - Client.anInt10857 * 1448151993;
					if (i_5_ > Client.aClass226_10801.anInt2446 * 978009717
							|| i_5_ < -(978009717 * Client.aClass226_10801.anInt2446)
							|| i_6_ > Client.aClass226_10801.anInt2446 * 978009717
							|| i_6_ < -(978009717 * Client.aClass226_10801.anInt2446)) {
						Client.aBool10814 = true;
					}
				}
				if (null != Client.aClass226_10801.anObjectArray2492 && Client.aBool10814) {
					ScriptContext class480_sub35 = new ScriptContext();
					class480_sub35.source = Client.aClass226_10801;
					class480_sub35.mouseX = i_2_ * 2003537681;
					class480_sub35.mouseY = i_3_ * -1907805425;
					class480_sub35.arguments = Client.aClass226_10801.anObjectArray2492;
					Script.execute(class480_sub35);
				}
			}
		}
	}

	static final void method1166(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Widget.method7527(class226, class221, false, 0, class613);
	}

	Class54() throws Throwable {
		throw new Error();
	}
}
