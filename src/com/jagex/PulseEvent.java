package com.jagex;

public class PulseEvent extends Cacheable {
	static boolean aBool11307 = false;
	static HashTable aClass667_11303 = new HashTable(16);
	static Queue delayed = new Queue();
	static Queue immediate = new Queue();

	public static void method13719(int widget) {
		PulseEvent event = create(15, widget);
		event.delay();
	}

	public static void method15134(int i, int i_0_) {
		PulseEvent event = create(17, (long) i_0_ << 32 | i);
		event.delay();
	}

	public static void method17525(int i) {
		PulseEvent class480_sub31_sub5 = create(9, i);
		class480_sub31_sub5.delay();
	}

	public static void method17579(int i) {
		PulseEvent class480_sub31_sub5 = create(10, i);
		class480_sub31_sub5.delay();
	}

	public static void method2856(int widget) {
		PulseEvent event = create(13, widget);
		event.delay();
	}

	public static void resetStringVarp(BaseVariableParameterDefinition parameter) {
		PulseEvent event = create(2, parameter.id * 169834903);
		event.delay();
	}

	public static void method4741(int i) {
		PulseEvent class480_sub31_sub5 = create(8, i);
		class480_sub31_sub5.delay();
	}

	public static void method7175(int i) {
		PulseEvent class480_sub31_sub5 = create(4, i);
		class480_sub31_sub5.delay();
	}

	public static void method8874(int i) {
		PulseEvent event = create(22, i);
		event.delay();
	}

	public static void method9353(int i) {
		PulseEvent class480_sub31_sub5 = create(7, i);
		class480_sub31_sub5.delay();
	}

	public static void resetWidgetColour(int widget) {
		PulseEvent event = create(6, widget);
		event.delay();
	}

	public static void resetWidgetPosition(int widget) {
		PulseEvent event = create(11, widget);
		event.delay();
	}

	public static void resetWidgetScrollPosition(int position) {
		PulseEvent event = create(12, position);
		event.delay();
	}

	static void clear() {
		aClass667_11303.clear();
		delayed.clear();
		immediate.clear();
	}

	static PulseEvent create(int type, long value) {
		aBool11307 = false;
		PulseEvent event = (PulseEvent) aClass667_11303.get((long) type << 56 | value);

		if (null == event) {
			event = new PulseEvent(type, value);
			aClass667_11303.put(-4821875126325281949L * event.linkedKey, event);
			aBool11307 = true;
		}

		return event;
	}

	static void method13201(int i, int i_5_) {
		PulseEvent event = create(13, i);
		event.immediate();
		event.primary = 106711445 * i_5_;
	}

	static void method13221(int i, int i_0_, int i_1_, int i_2_) {
		PulseEvent class480_sub31_sub5 = create(20, (long) i_0_ << 32 | i);
		class480_sub31_sub5.immediate();
		class480_sub31_sub5.primary = 106711445 * i_1_;
		class480_sub31_sub5.secondary = i_2_ * 1070353993;
	}

	static void method15089(int i, int i_7_, int i_8_, int i_9_) {
		PulseEvent event = create(10, i);
		event.immediate();
		event.primary = i_7_ * 106711445;
		event.secondary = i_8_ * 1070353993;
		event.tertiary = -1109510229 * i_9_;
	}

	static void method16137() {
		PulseEvent event = create(14, 0L);
		event.delay();
	}

	static void method1713(int i, int i_2_, int i_3_, int i_4_) {
		PulseEvent event = create(8, i);
		event.immediate();
		event.primary = i_2_ * 106711445;
		event.secondary = i_3_ * 1070353993;
		event.tertiary = i_4_ * -1109510229;
	}

	static void setStringVarp(int id, String value) {
		PulseEvent event = create(2, id);
		event.immediate();
		event.string = value;
	}

	static void method18134(int i, boolean bool) {
		PulseEvent event = create(22, i);
		event.immediate();
		event.primary = (bool ? 1 : 0) * 106711445;
	}

	static void method3762(int i, int i_0_, int i_1_, int i_2_) {
		PulseEvent event = create(17, (long) i_0_ << 32 | i);
		event.immediate();
		event.primary = 106711445 * i_1_;
		event.secondary = 1070353993 * i_2_;
	}

	static void method502(int i, int i_1_, int i_2_, int i_3_) {
		PulseEvent event = create(4, i);
		event.immediate();
		event.primary = i_1_ * 106711445;
		event.secondary = i_2_ * 1070353993;
		event.tertiary = i_3_ * -1109510229;
	}

	static void method6906(int i, int i_100_) {
		PulseEvent event = create(14, 0L);
		event.immediate();
		event.primary = i * 106711445;
		event.secondary = i_100_ * 1070353993;
	}

	static void setIntVarp(int id, int value) {
		PulseEvent event = create(1, id);
		event.immediate();
		event.primary = 106711445 * value;
	}

	static void method8240(int i, boolean bool, int i_10_) {
		PulseEvent event = create(23, i);
		event.immediate();
		event.primary = 106711445 * (bool ? 1 : 0);
	}

	static final void method9831() {
		for (int i_10_ = PlayerVariableProvider.instance.collection.poll(true); i_10_ != -1; i_10_ = PlayerVariableProvider.instance.collection
				.poll(false)) {
			Widget.method4322(i_10_, 780116108);
			Client.anIntArray10821[(Client.anInt10898 += -112739175) * -1707026519 - 1 & 0x3f] = i_10_;
		}

		for (PulseEvent event = next(); null != event; event = next()) {
			int type = event.getType();
			long value = event.getValue();

			if (type == 1) {
				BaseVariableParameterDefinition varp = Class630.aClass77_Sub1_Sub1_8060.get((int) value);
				Class199.aClass126_Sub1_2099.setIntVarp(varp, event.primary * -1750222403);
				Client.anIntArray10751[(Client.anInt10672 += -2043713109) * -1997518589 - 1 & 0x3f] = (int) value;
			} else if (type == 2) {
				BaseVariableParameterDefinition varp = Class630.aClass77_Sub1_Sub1_8060.get((int) value);
				Class199.aClass126_Sub1_2099.setStringVarp(varp, event.string);
				Client.anIntArray10630[(Client.anInt10830 += 1725171251) * 1871078651 - 1 & 0x3f] = (int) value;
			} else if (3 == type) {
				Widget widget = Widget.lookup((int) value);
				if (!event.string.equals(widget.text)) {
					widget.text = event.string;
					Widget.redraw(widget);
				}
			} else if (4 == type) {
				Widget widget = Widget.lookup((int) value);
				int i_12_ = event.primary * -1750222403;
				int i_13_ = event.secondary * -1770716167;
				int i_14_ = event.tertiary * -1190982909;

				if (widget.anInt2418 * 286135323 != i_12_ || -643054127 * widget.anInt2486 != i_13_
						|| i_14_ != 405633305 * widget.anInt2420) {
					widget.anInt2418 = -512645613 * i_12_;
					widget.anInt2486 = 1265546033 * i_13_;
					widget.anInt2420 = i_14_ * -903294167;
					widget.aClass267_2361 = null;
					Widget.redraw(widget);
				}
			} else if (type == 5) {
				Widget widget = Widget.lookup((int) value);
				if (1642844085 * widget.animation != -1750222403 * event.primary) {
					if (-1 != -1750222403 * event.primary) {
						if (widget.aClass650_2541 == null) {
							widget.aClass650_2541 = new Class650_Sub3();
						}
						widget.aClass650_2541.update(-1750222403 * event.primary);
					} else {
						widget.aClass650_2541 = null;
					}
					widget.animation = -122177815 * event.primary;
					Widget.redraw(widget);
				}
			} else if (type == 6) {
				int colour = -1750222403 * event.primary;
				int r = colour >> 10 & 0x1f;
				int g = colour >> 5 & 0x1f;
				int b = colour & 0x1f;
				int rgb = (g << 11) + (r << 19) + (b << 3);

				Widget widget = Widget.lookup((int) value);
				if (rgb != 923665021 * widget.colour) {
					widget.colour = rgb * -742586667;
					Widget.redraw(widget);
				}
			} else if (type == 7) {
				Widget widget = Widget.lookup((int) value);
				boolean hidden = 1 == -1750222403 * event.primary;

				if (widget.hidden != hidden) {
					widget.hidden = hidden;
					Widget.redraw(widget);
				}
			} else if (8 == type) {
				Widget widget = Widget.lookup((int) value);
				if (event.primary * -1750222403 != widget.spritePitch * -322294683
						|| widget.spriteRoll * -1831978227 != -1770716167 * event.secondary
						|| event.tertiary * -1190982909 != widget.spriteScale * 1331228877) {
					widget.spritePitch = event.primary * 764208761;
					widget.spriteRoll = event.secondary * 198099357;
					widget.spriteScale = -2117817585 * event.tertiary;

					if (-1 != 1391525437 * widget.item) {
						if (459297459 * widget.anInt2431 > 0) {
							widget.spriteScale = 1495301125 * (-350348896 * widget.spriteScale / (459297459 * widget.anInt2431));
						} else if (-759235537 * widget.baseWidth > 0) {
							widget.spriteScale = 1495301125 * (widget.spriteScale * -350348896 / (widget.baseWidth * -759235537));
						}
					}

					Widget.redraw(widget);
				}
			} else if (type == 9) {
				Widget widget = Widget.lookup((int) value);
				if (-1750222403 * event.primary != widget.item * 1391525437
						|| -1770716167 * event.secondary != -1212380503 * widget.itemAmount) {
					widget.item = event.primary * -695017087;
					widget.itemAmount = -1820634927 * event.secondary;
					Widget.redraw(widget);
				}
			} else if (10 == type) {
				Widget widget = Widget.lookup((int) value);
				if (-1750222403 * event.primary != widget.spriteOffsetX * 2134977475
						|| event.secondary * -1770716167 != widget.spriteOffsetY * 2141391961
						|| 1151952653 * widget.spriteYaw != event.tertiary * -1190982909) {
					widget.spriteOffsetX = 975613055 * event.primary;
					widget.spriteOffsetY = -235650911 * event.secondary;
					widget.spriteYaw = -518146481 * event.tertiary;
					Widget.redraw(widget);
				}
			} else if (type == 11) {
				Widget widget = Widget.lookup((int) value);
				widget.aByte2400 = (byte) 0;
				widget.positionX = (widget.basePositionX = event.primary * -576091989) * -19961807;
				widget.aByte2381 = (byte) 0;
				widget.positionY = (widget.basePositionY = -942573691 * event.secondary) * 986926653;
				Widget.redraw(widget);
			} else if (type == 12) {
				Widget widget = Widget.lookup((int) value);
				int position = event.primary * -1750222403;
				if (widget != null && 1558474223 * widget.type == 0) {
					if (position > widget.scrollHeight * -184691147 - 1362321717 * widget.height) {
						position = widget.scrollHeight * -184691147 - 1362321717 * widget.height;
					}
					if (position < 0) {
						position = 0;
					}

					if (position != widget.scrollPosition * -1881455913) {
						widget.scrollPosition = 1223217383 * position;
						Widget.redraw(widget);
					}
				}
			} else if (type == 13) {
				Widget widget = Widget.lookup((int) value);
				widget.anInt2409 = event.primary * 2064110345;
			} else if (type == 14) {
				Class63.aBool955 = true;
				Class63.anInt939 = event.primary * 669457959;
				Class63.anInt950 = 1102018581 * event.secondary;
			} else if (type == 15) {
				Widget widget = Widget.lookup((int) value);
				widget.anInt2453 = -259195145 * event.primary;
			} else if (17 == type) {
				Widget widget = Widget.lookup((int) value);
				int i_21_ = (int) (value >> 32);
				widget.method4243(i_21_, (short) (event.primary * -1750222403), (short) (-1770716167 * event.secondary));
			} else if (type == 20) {
				Widget widget = Widget.lookup((int) value);
				int i_22_ = (int) (value >> 32);
				widget.method4249(i_22_, (short) (-1750222403 * event.primary), (short) (event.secondary * -1770716167));
			} else if (21 == type) {
				Widget widget = Widget.lookup((int) value);
				widget.aBool2536 = 1 == event.primary * -1750222403;
			} else if (type == 22) {
				Widget widget = Widget.lookup((int) value);
				widget.aBool2417 = 1 == event.primary * -1750222403;

			} else if (type == 23) {
				Widget widget = Widget.lookup((int) value);
				if (widget.aBool2461 != (event.primary * -1750222403 == 1)) {
					widget.aBool2461 = 1 == event.primary * -1750222403;
					Widget.redraw(widget);
				}
			}
		}
	}

	static PulseEvent next() {
		PulseEvent event = (PulseEvent) immediate.getFront();
		if (event != null) {
			event.unlink();
			event.uncache();
			return event;
		}

		for (;;) {
			event = (PulseEvent) delayed.getFront();
			if (event == null) {
				return null;
			} else if (event.getTime() > TimeUtil.time()) {
				return null;
			}

			event.unlink();
			event.uncache();

			if (0L != (event.cachedKey * -4988283294723658683L & ~0x7fffffffffffffffL)) {
				return event;
			}
		}
	}

	static void setWidgetAnimation(int widget, int animation) {
		PulseEvent event = create(5, widget);
		event.immediate();
		event.primary = animation * 106711445;
	}

	static void setWidgetColour(int widget, int rgb) {
		PulseEvent event = create(6, widget);
		event.immediate();
		event.primary = 106711445 * rgb;
	}

	static void setWidgetHidden(int widget, int hidden) {
		PulseEvent event = create(7, widget);
		event.immediate();
		event.primary = hidden * 106711445;
	}

	static void setWidgetItem(int widget, int item, int amount) {
		PulseEvent event = create(9, widget);
		event.immediate();
		event.primary = item * 106711445;
		event.secondary = 1070353993 * amount;
	}

	static void setWidgetPosition(int widget, int x, int y) {
		PulseEvent event = create(11, widget);
		event.immediate();
		event.primary = x * 106711445;
		event.secondary = 1070353993 * y;
	}

	static void setWidgetScrollPosition(int widget, int scrollPosition) {
		PulseEvent event = create(12, widget);
		event.immediate();
		event.primary = 106711445 * scrollPosition;
	}

	static void setWidgetText(int widget, String text) {
		PulseEvent event = create(3, widget);
		event.immediate();
		event.string = text;
	}

	int primary;
	int secondary;
	String string;
	int tertiary;

	PulseEvent(int type, long value) {
		linkedKey = ((long) type << 56 | value) * -7096345066895942069L;
	}

	void delay() {
		cachedKey = (-4988283294723658683L * cachedKey & ~0x7fffffffffffffffL | TimeUtil.time() + 500L)
				* -4152461709571586419L;
		delayed.offer(this);
	}

	void immediate() {
		cachedKey = -4152461709571586419L * (-4988283294723658683L * cachedKey | ~0x7fffffffffffffffL);

		if (getTime() == 0) {
			immediate.offer(this);
		}
	}

	long getTime() {
		return -4988283294723658683L * cachedKey & 0x7fffffffffffffffL;
	}

	int getType() {
		return (int) (linkedKey * -4821875126325281949L >>> 56 & 0xffL);
	}

	long getValue() {
		return -4821875126325281949L * linkedKey & 0xffffffffffffffL;
	}

}