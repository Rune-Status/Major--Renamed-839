package com.jagex;

public class Class480_Sub31_Sub1 extends Cacheable implements Definition, Interface71 {

	static int method17278() {
		if (null == Client.aClass226_10801) {
			if (!Class56.menuOpen) {
				if (Script.aClass580_11401.aBool7758) {
					if (MenuOption.aClass480_Sub31_Sub17_348 != null) {
						return 754403867 * MenuOption.aClass480_Sub31_Sub17_348.cursor;
					}
				} else if (Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430 != null) {
					return Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430.cursor * 754403867;
				}
			} else {
				FontSpecification class9 = Class179.method3543();
				int i_10_ = Client.recorder.getMouseX();
				int i_11_ = Client.recorder.getMouseY();
				if (!Class56.aBool620) {
					if (i_10_ > 907118265 * TextureMetricsList.anInt1822
							&& i_10_ < Class480_Sub41_Sub4.anInt11432 * -1708755565 + 907118265
									* TextureMetricsList.anInt1822) {
						int i_12_ = -1;
						for (int i_13_ = 0; i_13_ < Class56.menuOptionCount * 84366055; i_13_++) {
							if (Class56.aBool642) {
								int i_14_ = (84366055 * Class56.menuOptionCount - 1 - i_13_) * Class56.anInt616
										* -1427683309 + 20 + MobVariableCollection.anInt6537 * 1889755609 + -1971642963
										* class9.topPadding + 1;
								if (i_11_ > i_14_ - -1971642963 * class9.topPadding - 1
										&& i_11_ < -1569538073 * class9.bottomPadding + i_14_) {
									i_12_ = i_13_;
								}
							} else {
								int i_15_ = (Class56.menuOptionCount * 84366055 - 1 - i_13_) * Class56.anInt616
										* -1427683309 + 31 + MobVariableCollection.anInt6537 * 1889755609;
								if (i_11_ > i_15_ - -1971642963 * class9.topPadding - 1
										&& i_11_ < -1569538073 * class9.bottomPadding + i_15_) {
									i_12_ = i_13_;
								}
							}
						}
						if (i_12_ != -1) {
							int i_16_ = 0;
							DequeIterator class645 = new DequeIterator(MenuOption.options);
							for (MenuOption class480_sub31_sub17 = (MenuOption) class645.front(); class480_sub31_sub17 != null; class480_sub31_sub17 = (MenuOption) class645
									.next()) {
								if (i_16_++ == i_12_) {
									return 754403867 * class480_sub31_sub17.cursor;
								}
							}
						}
					}
				} else if (i_10_ > 907118265 * TextureMetricsList.anInt1822
						&& i_10_ < 907118265 * TextureMetricsList.anInt1822 + -1708755565
								* Class480_Sub41_Sub4.anInt11432) {
					int i_17_ = -1;
					for (int i_18_ = 0; i_18_ < MenuCategory.count * 1469668737; i_18_++) {
						if (Class56.aBool642) {
							int i_19_ = -1427683309 * Class56.anInt616 * i_18_ + -1971642963 * class9.topPadding + 20
									+ MobVariableCollection.anInt6537 * 1889755609 + 1;
							if (i_11_ > i_19_ - class9.topPadding * -1971642963 - 1
									&& i_11_ < -1569538073 * class9.bottomPadding + i_19_) {
								i_17_ = i_18_;
							}
						} else {
							int i_20_ = 31 + 1889755609 * MobVariableCollection.anInt6537 + Class56.anInt616
									* -1427683309 * i_18_;
							if (i_11_ > i_20_ - -1971642963 * class9.topPadding - 1
									&& i_11_ < -1569538073 * class9.bottomPadding + i_20_) {
								i_17_ = i_18_;
							}
						}
					}
					if (i_17_ != -1) {
						int i_21_ = 0;
						QueueIterator class634 = new QueueIterator(Class56.aClass638_631);
						for (MenuCategory class480_sub31_sub4 = (MenuCategory) class634.head(); class480_sub31_sub4 != null; class480_sub31_sub4 = (MenuCategory) class634
								.next()) {
							if (i_21_++ == i_17_) {
								return 754403867 * ((MenuOption) class480_sub31_sub4.options.tail.nextCacheable).cursor;
							}
						}
					}
				} else if (Class56.aClass480_Sub31_Sub4_646 != null && i_10_ > Class56.anInt635 * -1393036739
						&& i_10_ < EnvironmentContext.anInt8164 * 328052667 + Class56.anInt635 * -1393036739) {
					int i_22_ = -1;
					for (int i_23_ = 0; i_23_ < Class56.aClass480_Sub31_Sub4_646.size * 713555001; i_23_++) {
						if (Class56.aBool642) {
							int i_24_ = Class56.anInt616 * -1427683309 * i_23_ + class9.topPadding * -1971642963 + 20
									+ -2036920667 * Class159.anInt1896 + 1;
							if (i_11_ > i_24_ - -1971642963 * class9.topPadding - 1
									&& i_11_ < -1569538073 * class9.bottomPadding + i_24_) {
								i_22_ = i_23_;
							}
						} else {
							int i_25_ = i_23_ * Class56.anInt616 * -1427683309 + Class159.anInt1896 * -2036920667 + 31;
							if (i_11_ > i_25_ - class9.topPadding * -1971642963 - 1
									&& i_11_ < -1569538073 * class9.bottomPadding + i_25_) {
								i_22_ = i_23_;
							}
						}
					}
					if (-1 != i_22_) {
						int i_26_ = 0;
						QueueIterator class634 = new QueueIterator(Class56.aClass480_Sub31_Sub4_646.options);
						for (MenuOption class480_sub31_sub17 = (MenuOption) class634.head(); null != class480_sub31_sub17; class480_sub31_sub17 = (MenuOption) class634
								.next()) {
							if (i_26_++ == i_22_) {
								return 754403867 * class480_sub31_sub17.cursor;
							}
						}
					}
				}
			}
		}
		return -1;
	}

	HashTable parameters;

	public String getOrDefault(int id, String defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}

		LinkableObject<String> linkable = (LinkableObject<String>) parameters.get(id);
		if (linkable == null) {
			return defaultValue;
		}

		return linkable.object;
	}

	public int getOrDefault(int id, int defaultValue) {
		if (null == parameters) {
			return defaultValue;
		}

		LinkableInt linkable = (LinkableInt) parameters.get(id);
		if (null == linkable) {
			return defaultValue;
		}

		return -1189875169 * linkable.value;
	}

	@Override
	public void method35() {

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
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void decode(Buffer buffer, int opcode) {
		if (249 == opcode) {
			int count = buffer.readUByte();

			if (parameters == null) {
				int size = HashTable.nextPowerOfTwo(count);
				parameters = new HashTable(size);
			}

			for (int index = 0; index < count; index++) {
				boolean string = buffer.readUByte() == 1;
				int id = buffer.readUTriByte();

				Linkable linkable;
				if (string) {
					linkable = new LinkableObject<String>(buffer.readString());
				} else {
					linkable = new LinkableInt(buffer.readInt());
				}

				parameters.put(id, linkable);
			}
		}
	}

}