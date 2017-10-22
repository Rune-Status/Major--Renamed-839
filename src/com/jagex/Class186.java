package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class186 {
	static final int anInt2008 = 0;
	static final int anInt2010 = 8192;
	static final int anInt2011 = 8192;
	static final int anInt2013 = 4096;
	static final int anInt2014 = 4096;
	static final int anInt2021 = 16384;
	static final int anInt2034 = 16384;

	static void method3724(int i, boolean bool) {
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (null != class480_sub1) {
			for (int i_98_ = 0; i_98_ < class480_sub1.anIntArray9964.length; i_98_++) {
				class480_sub1.anIntArray9964[i_98_] = -1;
				class480_sub1.anIntArray9965[i_98_] = 0;
			}
		}
	}

	static Class11_Sub1 method3725() {
		Class11_Sub1 class11_sub1 = new Class11_Sub1();
		boolean bool = false;
		boolean bool_99_ = false;
		boolean bool_100_ = false;

		if (Class189.osName.startsWith("win")) {
			bool_99_ = true;
			bool = true;
			bool_100_ = true;
		} else {
			bool = true;
			bool_100_ = true;
		}

		if (Class73.aBool1107) {
			class11_sub1.method16220(16);
			bool = false;
		}

		if (Class73.aBool1108) {
			class11_sub1.method16220(32);
			bool_99_ = false;
		}

		if (Class73.aBool1102) {
			class11_sub1.method16220(16384);
			bool_100_ = false;
		}

		if (!bool && !bool_99_) {
			LoadingRequirementType.method590(class11_sub1);
			return class11_sub1;
		}

		int i_101_ = -1;
		int i_102_ = -1;
		int i_103_ = -1;
		if (bool_99_) {
			try {
				Class199.preferences.setValue(Class199.preferences.safeMode, 3);
				Client.savePreferences();
				i_102_ = Class431.method7147(3, 1000);
				if (Class199.preferences.currentToolkit.getValue() == 3) {
					class11_sub1.method16220(4);
					RendererType type = Class60.activeToolkit.renderer();
					long driver = type.driver * 5948376926536753019L & 0xffffffffffffL;
					switch (-1979234319 * type.vendor) {
						case 4098: {
							boolean bool_104_ = driver >= 60129613779L;
							bool &= bool_104_;
							if (!bool_104_) {
								class11_sub1.method16220(512);
							}
							break;
						}
						case 4318: {
							boolean bool_105_ = driver >= 64425238954L;
							bool &= bool_105_;
							if (!bool_105_) {
								class11_sub1.method16220(256);
							}
							break;
						}
					}
				}
			} catch (Exception exception) {
				class11_sub1.method16220(4096);
			}
		}
		if (bool_100_) {
			try {
				Class199.preferences.setValue(Class199.preferences.safeMode, 5);
				Client.savePreferences();
				i_103_ = Class431.method7147(5, 1000);
				if (Class199.preferences.currentToolkit.getValue() == 5) {
					class11_sub1.method16220(8192);
				}
			} catch (Exception exception) {
				class11_sub1.method16220(32768);
			}
		}
		if (bool) {
			try {
				Class199.preferences.setValue(Class199.preferences.safeMode, 4);
				Client.savePreferences();
				i_101_ = Class431.method7147(1, 1000);
				if (Class199.preferences.currentToolkit.getValue() == 1) {
					class11_sub1.method16220(2);
				}
			} catch (Exception exception) {
				class11_sub1.method16220(2048);
			}
		}
		Class199.preferences.setValue(Class199.preferences.safeMode, 0);
		if (-1 == i_101_ && -1 == i_102_) {
			LoadingRequirementType.method590(class11_sub1);
			return class11_sub1;
		}
		class11_sub1.method16222(3, i_102_);
		class11_sub1.method16222(1, i_101_);
		class11_sub1.method16222(5, i_103_);
		i_102_ *= 1.3F;
		if (i_102_ > 100000 && i_101_ > 100000 || i_102_ > i_101_) {
			PreferenceManager.method1627(class11_sub1, 3, -1 == i_101_ ? i_102_ : i_101_);
		} else {
			PreferenceManager.method1627(class11_sub1, 1, -1 == i_102_ ? i_101_ : i_102_);
		}
		return class11_sub1;
	}

	Class456 aClass456_2009;
	ReferenceCache aClass168_2012;
	boolean aBool2015;
	List aList2016 = new ArrayList();
	List aList2017 = new ArrayList();
	HashMap aHashMap2018 = new HashMap();
	Interface52 anInterface52_2019;
	List aList2020;
	ReferenceCache aClass168_2022;
	ReferenceCache aClass168_2023;
	int anInt2024;
	Class397 aClass397_2025;
	HashMap aHashMap2026;
	HashMap aHashMap2027 = new HashMap();
	Interface52 anInterface52_2028;
	int anInt2029;
	boolean aBool2030;
	int anInt2031;
	int anInt2032;
	boolean aBool2033;
	Class456 aClass456_2035;
	Interface52 anInterface52_2036;
	Interface52 anInterface52_2037;

	public Class186() {
		aList2020 = new ArrayList();
		aHashMap2026 = new HashMap();
		anInterface52_2019 = new Class172(this);
		anInterface52_2028 = new Class157(this);
		anInterface52_2036 = new Class173(this);
		anInterface52_2037 = new Class177(this);
	}

	public void method3590(int i, int i_0_) {
		if (!aBool2015) {
			anInt2024 = i * 504862393;
			aClass168_2012 = new ReferenceCache(i_0_, 100);
			aClass168_2022 = new ReferenceCache(10);
			aClass168_2012.method3423(new Class164(this));
			Class584 class584 = new Class584(Class335.aClass335_3605);
			Class280.method5220(class584);
			method3634();
			anInt2029 = -1311941563;
			aBool2015 = true;
		}
	}

	public void method3592(int i) {
		Class622.method10431();
	}

	public void method3593(Class456 class456, int i, int i_2_, int i_3_) {
		if (class456 != null) {
			Class187 class187 = (Class187) aHashMap2026.get(Integer.valueOf(i));
			if (null == class187) {
				class187 = new Class187(this);
				aHashMap2026.put(Integer.valueOf(i), class187);
			}
			if (!class187.contains(class456)) {
				class456.method7451(i_2_, true);
				class187.add(class456);
			}
		}
	}

	public void method3594(int i) {
		Class187 class187 = (Class187) aHashMap2026.get(Integer.valueOf(i));
		if (class187 != null) {
			List list = class187.backing();
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class456 class456 = (Class456) iterator.next();
				if (!class456.method7435()) {
					class456.method7430();
				}
			}
		}
	}

	public void method3599(int i, int i_5_) {
		Class326 class326 = PriorityQueueIterator.method6069(i);
		if (class326 != null) {
			float f = 1.5258789E-5F * i_5_;
			class326.method5781(f);
		}
	}

	public void method3603(int i) {
		if (aBool2015 && i >= 0) {
			method3607(i, false);
		}
	}

	public Class456 method3609(Class171 class171, Object object, int i, int i_17_, int i_18_, int i_19_,
			Class167 class167, float f, float f_20_, Class397 class397, int i_21_, int i_22_, boolean bool) {
		if (!aBool2015) {
			return null;
		} else if (object == null) {
			return null;
		}

		i_18_ = Math.max(0, Math.min(i_18_, 255));
		i_22_ = Math.max(0, i_22_);
		if (Class167.aClass167_1926 != class167 && !method3608(aClass397_2025, class397, f_20_)) {
			return null;
		}

		if (i_22_ <= 0) {
			i_22_ = 255;
		}

		float f_24_ = i_18_ / 255.0F;
		float f_25_ = i_22_ / 255.0F;
		Interface66 interface66 = method3607(i, bool);
		Class456 class456 = method3606(interface66);
		if (null == class456) {
			return null;
		}

		class456.method7437(object);
		class456.method7521(i_19_);
		if (class167 != Class167.aClass167_1926) {
			class456.method7443(true);
			class456.method7445(class397);
			class456.method7449(f);
			class456.method7487(f_20_);

			if (Class167.aClass167_1928 == class167) {
				class456.method7434(anInterface52_2028);
			} else if (class167 == Class167.aClass167_1929) {
				class456.method7434(anInterface52_2037);
			} else if (Class167.aClass167_1927 == class167) {
				class456.method7434(anInterface52_2019);
			} else if (Class167.aClass167_1930 == class167) {
				class456.method7434(anInterface52_2036);
			} else {
				class456.method7443(false);
			}
		}

		class456.method7454(f_24_, 0);
		class456.method7450(i_17_ > 1 || i_17_ < 0, i_17_ > 0 ? i_17_ - 1 : i_17_);
		class456.method7441(f_25_);
		class456.method7439(class171);
		return class456;
	}

	public void method3613(int i) {
		anInt2031 = 1284038985 * i;
	}

	public int method3614() {
		return anInt2031 * -1730813703;
	}

	public void method3615() {
		if (aBool2015) {
			if (null != Class593.aClass343_7835) {
				Class593.aClass343_7835.method5873();
			}

			if (Client.localPlayer != null && Client.localPlayer.method10164() != null) {
				if (aClass397_2025 == null) {
					aClass397_2025 = new Class397();
				}
				aClass397_2025.x = Client.localPlayer.method10164().aClass397_4507.x;
				aClass397_2025.y = 0.0F;
				aClass397_2025.z = Client.localPlayer.method10164().aClass397_4507.z;
			}

			Iterator<Interface66> iterator = aHashMap2018.values().iterator();
			while (iterator.hasNext()) {
				Interface66 interface66 = iterator.next();
				interface66.method172();
			}

			iterator = aHashMap2027.values().iterator();
			while (iterator.hasNext()) {
				Interface66 interface66 = iterator.next();
				interface66.method172();
			}

			iterator = aList2020.iterator();
			while (iterator.hasNext()) {
				Interface66 interface66 = iterator.next();
				if (interface66.method414()) {
					aHashMap2027.remove(Integer.valueOf(interface66.getId()));
				} else {
					aHashMap2018.remove(Integer.valueOf(interface66.getId()));
				}
			}

			aList2020.clear();
			if (null != aClass456_2009 && aClass456_2009.method7436() == Class455.aClass455_5113 && !aBool2030
					&& Client.gameConnection.encryptor != null
					&& BaseAnimationDefinitionProvider.method3320(Client.gameState * -1501875989)) {
				OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3981,
						Client.gameConnection.encryptor);
				frame.payload.writeInt(aClass456_2009.method7444().getId());
				Client.gameConnection.sendFrame(frame);
				aBool2030 = true;
			}

			Iterator<Class456> iterator2 = aList2016.iterator();
			while (iterator2.hasNext()) {
				Class456 class456 = iterator2.next();
				class456.method7517();
				class456.method7513();
				Class455 class455 = class456.method7436();
				if (class456.method7484() == this) {
					if (Class455.aClass455_5112 == class455 || Class455.aClass455_5117 == class455) {
						if (class456.method7440() == Class171.aClass171_1948
								|| class456.method7440() == Class171.aClass171_1958) {
							if (aClass456_2009 == class456) {
								aBool2030 = false;
								aClass456_2009 = null;
								class456.method7509();
								aList2017.remove(class456);
							} else {
								int i_27_ = class456.method7444().getId();
								boolean bool = method3605(Class156.aClass156_1875.method3293()) > 0.0F;
								if (false == aBool2033 && bool) {
									if (anInt2029 * -1881233037 == i_27_) {
										method3699(i_27_, -1887110909);
										anInt2029 = -1311941563;
									}
									class456.method7509();
									aList2017.remove(class456);
								} else if (-739122489 * anInt2032 == i_27_) {
									anInt2032 = -2076065527;
									aBool2033 = false;
									class456.method7509();
									aList2017.remove(class456);
									Iterator iterator_28_ = aList2016.iterator();
									while (iterator_28_.hasNext()) {
										Class456 class456_29_ = (Class456) iterator_28_.next();
										if (class456_29_.method7440() == Class171.aClass171_1948) {
											int i_30_ = class456_29_.method7444().getId();
											if (i_30_ == anInt2029 * -1881233037
													&& class456_29_.method7436() == Class455.aClass455_5112
													|| class456_29_.method7436() == Class455.aClass455_5119
													|| class456_29_.method7436() == Class455.aClass455_5111
													|| class456_29_.method7436() == Class455.aClass455_5113) {
												if (class456_29_.method7436() == Class455.aClass455_5112) {
													class456_29_.method7483();
												} else {
													class456_29_.method7430();
												}
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2033 || i_27_ != -1881233037 * anInt2029) {
										class456.method7509();
										aList2017.remove(class456);
									}
									if (!aBool2033 && i_27_ == -1881233037 * anInt2029) {
										anInt2029 = -1311941563;
										aClass456_2035 = null;
									}
								}
							}
						} else {
							Iterator<Integer> iterator_31_ = aHashMap2026.keySet().iterator();
							while (iterator_31_.hasNext()) {
								int i_32_ = iterator_31_.next().intValue();
								Class187 class187 = (Class187) aHashMap2026.get(Integer.valueOf(i_32_));
								if (class187.backing().contains(class456)) {
									class187.remove(class456);
									break;
								}
							}
							class456.method7509();
							aList2017.remove(class456);
						}
					} else if (class456.method7436() != Class455.aClass455_5110
							&& class456.method7506(-1897566666) == Class156.aClass156_1875.method3293()) {
						boolean bool = method3605(Class156.aClass156_1875.method3293()) > 1.0E-4F;
						if (!bool) {
							class456.method7431(150);
						}
					}
				}
			}
		}
	}

	public void method3616(int i) {
		method3617(i, 255);
	}

	public void method3617(int i, int i_34_) {
		method3618(i, i_34_, false, 0, 0, 0, 0, 0);
	}

	public void method3618(int i, int i_36_, boolean bool, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
		if (aBool2015 && -1881233037 * anInt2029 != i) {
			Class456 class456 = method3619(-2061996937);
			if (class456 != null && class456.method7444().getId() == i) {
				aClass456_2035 = class456;
				anInt2029 = class456.method7444().getId() * 1311941563;
			} else {
				boolean bool_43_ = false;
				if (-1881233037 * anInt2029 >= 0) {
					Iterator iterator = aList2017.iterator();
					while (iterator.hasNext()) {
						Class456 class456_44_ = (Class456) iterator.next();
						if (class456_44_.method7440() == Class171.aClass171_1948) {
							class456_44_.method7431(2000);
							bool_43_ = true;
						}
					}
				}
				aClass456_2035 = null;
				anInt2029 = -1311941563;
				Class456 class456_45_ = null;
				if (aClass456_2009 != null && aClass456_2009.method7444() != null
						&& aClass456_2009.method7444().getId() == i
						&& aClass456_2009.method7436() == Class455.aClass455_5113) {
					class456_45_ = aClass456_2009;
					aClass456_2009 = null;
					aBool2030 = false;
				}
				if (class456_45_ == null) {
					if (bool) {
						float f = i_40_;
						float f_46_ = i_41_;
						Class397 class397 = new Class397(i_38_, 0.0F, i_39_);
						class456_45_ = method3609(Class171.aClass171_1948, this, i, 0, bool_43_ ? 0 : i_36_,
								-1730813703 * anInt2031 == i ? Class154.aClass154_1869.method3278()
										: Class156.aClass156_1875.method3293(), Class167.aClass167_1930, f, f_46_,
								class397, i_37_, 255, true);
					} else {
						class456_45_ = method3609(Class171.aClass171_1948, this, i, 0, bool_43_ ? 0 : i_36_,
								i == anInt2031 * -1730813703 ? Class154.aClass154_1869.method3278()
										: Class156.aClass156_1875.method3293(), Class167.aClass167_1926, 0.0F, 0.0F,
								null, 0, 255, true);
					}
				}
				if (class456_45_ != null) {
					if (false == aBool2033) {
						if (bool_43_) {
							float f = i_36_ / 255.0F;
							class456_45_.method7454(f, 2000);
						}
						class456_45_.method7430();
					} else if (class456_45_.method7436().anInt5120 * 1353762627 < 1353762627 * Class455.aClass455_5113.anInt5120) {
						class456_45_.method7429();
					}
					method3631(class456_45_);
					aClass456_2035 = class456_45_;
					anInt2029 = i * 1311941563;
					if (Client.gameConnection.encryptor != null
							&& BaseAnimationDefinitionProvider.method3320(-1501875989 * Client.gameState)) {
						OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3981,
								Client.gameConnection.encryptor);
						frame.payload.writeInt(-1881233037 * anInt2029);
						Client.gameConnection.sendFrame(frame);
					}
				}
			}
		}
	}

	public void method3620() {
		Iterator iterator = aList2017.iterator();
		while (iterator.hasNext()) {
			Class456 class456 = (Class456) iterator.next();
			if (class456.method7440() == Class171.aClass171_1948) {
				class456.method7431(500);
				if (class456.method7444().getId() == anInt2029 * -1881233037) {
					method3699(anInt2029 * -1881233037, -1887110909);
					break;
				}
			}
		}
		aClass456_2035 = null;
		anInt2029 = -1311941563;
	}

	public void method3621(int i, int i_47_) {
		if (aBool2015 && !aBool2033) {
			if (0 != i_47_ && i != -1) {
				if (!aBool2033 && aClass456_2035 != null) {
					aClass456_2035.method7432();
				}

				Class456 class456 = method3609(Class171.aClass171_1958, this, i, 0, i_47_,
						Class156.aClass156_1875.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, 255, true);
				if (null != class456) {
					class456.method7430();
					method3631(class456);
					aBool2033 = true;
					anInt2032 = i * 2076065527;
				}
			}
		}
	}

	public void method3631(Class456 class456) {
		class456.method7437(this);
		aList2017.add(class456);
	}

	public void method3652(int i) {
		Class187 class187 = (Class187) aHashMap2026.get(Integer.valueOf(i));
		if (class187 != null) {
			List<Class456> list = class187.backing();
			Iterator<Class456> iterator = list.iterator();
			while (iterator.hasNext()) {
				Class456 class456 = iterator.next();
				class456.method7429();
			}
		}
	}

	public void method3655(int i) {
		Class187 class187 = (Class187) aHashMap2026.get(Integer.valueOf(i));
		if (null != class187) {
			List list = class187.backing();
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class456 class456 = (Class456) iterator.next();
				class456.method7431(50);
			}
		}
	}

	public void method3661(AnimationDefinition class175, int i, byte i_51_) {
		if (class175 != null && null != class175.anIntArrayArray1975 && i < class175.anIntArrayArray1975.length
				&& null != class175.anIntArrayArray1975[i]) {
			int i_52_ = class175.anIntArrayArray1975[i][0];
			int i_53_ = i_52_ >> 8;
			int i_54_ = i_52_ >> 5 & 0x7;
			if (class175.anIntArrayArray1975[i].length > 1) {
				int i_55_ = (int) (Math.random() * class175.anIntArrayArray1975[i].length);
				if (i_55_ > 0) {
					i_53_ = class175.anIntArrayArray1975[i][i_55_];
				}
			}
			int i_56_ = 256;
			if (class175.anIntArray1987 != null && class175.anIntArray1988 != null) {
				i_56_ = (int) (class175.anIntArray1987[i] + Math.random()
						* (class175.anIntArray1988[i] - class175.anIntArray1987[i]));
			}
			int i_57_ = class175.anIntArray1986 == null ? 255 : class175.anIntArray1986[i];
			method3710(Class171.aClass171_1947, i_53_, i_54_, i_57_, Class156.aClass156_1879.method3293(),
					Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_56_, 0);
		}
	}

	public void method3685(int i, int i_58_) {
		if (i != anInt2029 * -1881233037) {
			if (aClass456_2009 != null) {
				aClass456_2009.method7431(0);
				method3631(aClass456_2009);
				aClass456_2009 = null;
			}
			Class456 class456 = method3609(Class171.aClass171_1948, this, i, 0, i_58_,
					Class156.aClass156_1875.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, 255, true);
			if (null != class456) {
				class456.method7429();
				aClass456_2009 = class456;
			}
			aBool2030 = false;
		}
	}

	public void method3686(int i) {
		Iterator iterator = aList2017.iterator();
		while (iterator.hasNext()) {
			Class456 class456 = (Class456) iterator.next();
			int i_61_ = class456.method7506(-974957195);
			boolean bool = Class24.method772(i_61_, i, 1705175661);
			if (bool) {
				class456.method7431(50);
			}
		}
	}

	public void method3710(Class171 class171, int i, int i_63_, int i_64_, int i_65_, Class167 class167, float f,
			float f_66_, Class397 class397, int i_67_, int i_68_, int i_69_) {
		if (aBool2015) {
			Class456 class456 = method3609(class171, this, i, i_63_, i_64_, i_65_, class167, f, f_66_, class397, i_67_,
					i_68_, false);
			if (null != class456) {
				if (i_69_ == 0) {
					class456.method7430();
				} else {
					class456.method7451(i_69_, false);
				}
				method3631(class456);
			}
		}
	}

	public void method3714(AnimationDefinition class175, int i, Class600_Sub1 class600_sub1) {
		if (null != class175 && class175.anIntArrayArray1975 != null && i < class175.anIntArrayArray1975.length
				&& class175.anIntArrayArray1975[i] != null && Client.localPlayer.plane == class600_sub1.plane
				&& class600_sub1.method16296()) {
			int i_72_ = class175.anIntArrayArray1975[i][0];
			int i_73_ = i_72_ >> 8;
			int i_74_ = i_72_ >> 5 & 0x7;
			int i_75_ = i_72_ & 0x1f;
			if (class175.anIntArrayArray1975[i].length > 1) {
				int i_76_ = (int) (Math.random() * class175.anIntArrayArray1975[i].length);
				if (i_76_ > 0) {
					i_73_ = class175.anIntArrayArray1975[i][i_76_];
				}
			}
			int i_77_ = 256;
			if (null != class175.anIntArray1987 && class175.anIntArray1988 != null) {
				i_77_ = (int) (Math.random() * (class175.anIntArray1988[i] - class175.anIntArray1987[i]))
						+ class175.anIntArray1987[i];
			}
			int i_78_ = null == class175.anIntArray1986 ? 255 : class175.anIntArray1986[i];
			if (i_75_ == 0) {
				if (class600_sub1 == Client.localPlayer) {
					method3710(Class171.aClass171_1951, i_73_, i_74_, i_78_, Class156.aClass156_1878.method3293(),
							Class167.aClass167_1926, 0.0F, 0.0F, null, class600_sub1.plane, i_77_, 0);
				}
			} else {
				if (Client.localPlayer == class600_sub1) {
					if (Class199.preferences.soundsEffectsVolume.getValue() == 0) {
						return;
					}
				} else if (Class199.preferences.areaSoundsVolume.getValue() == 0) {
					return;
				}
				if (-1 != -1733854003 * class175.anInt1990) {
					int i_79_ = 0;
					if (class600_sub1 instanceof Mob) {
						i_79_ = ((Mob) class600_sub1).method17969();
					} else if (class600_sub1 instanceof AnimatedObject) {
						i_79_ = ((AnimatedObject) class600_sub1).method18210();
					} else if (class600_sub1 instanceof Projectile) {
						i_79_ = ((Projectile) class600_sub1).method18191();
					}
					if (i_79_ != 0 && i_79_ != Client.localPlayer.method17969()
							&& -585847029 * Client.anInt10859 != i_79_) {
						i_78_ = i_78_ * class175.anInt1990 * -1733854003 / 100;
						if (i_78_ < 0) {
							i_78_ = 0;
						} else if (i_78_ > 255) {
							i_78_ = 255;
						}
					}
				}
				Class397 class397 = class600_sub1.method10164().aClass397_4507;
				int i_80_ = (int) class397.x - 256 >> 9;
				int i_81_ = (int) class397.z - 256 >> 9;
				Class397 class397_82_ = new Class397(i_80_ << 9, 0.0F, i_81_ << 9);
				int i_83_ = class600_sub1.plane << 24;
				method3710(Class171.aClass171_1953, i_73_, i_74_, i_78_, Class156.aClass156_1879.method3293(),
						class600_sub1 != Client.localPlayer ? Class167.aClass167_1927 : Class167.aClass167_1926, 0.0F,
						i_75_ << 9, class397_82_, i_83_, i_77_, 0);
			}
		}
	}

	public int method3719() {
		return anInt2029 * -1881233037;
	}

	public void method3720(int i, int i_84_, int i_85_) {
		int i_87_ = Class154.aClass154_1867.method3278();
		if (PriorityQueueIterator.method6069(i) == null
				&& (i_87_ == i_84_ || PriorityQueueIterator.method6069(i_84_) != null)) {
			float f = i_85_ * 1.5258789E-5F;
			ThemeMusicVolumeNormaliser.method3756(i, i_84_ == i_87_ ? -1 : i_84_, f, null);
		}
	}

	ReferenceCache method3587() {
		return aClass168_2012;
	}

	ReferenceCache method3588() {
		return aClass168_2022;
	}

	Class397 method3598() {
		return aClass397_2025;
	}

	void method3602(int[] is, int i) {
		if (aBool2015 && null != is) {
			int[] is_7_ = is;
			for (int i_9_ : is_7_) {
				method3603(i_9_);
			}
		}
	}

	Interface66 method3604(int i, boolean bool) {
		if (!aBool2015) {
			return null;
		}
		Interface66 interface66 = (Interface66) (bool ? aClass168_2022.get(i) : aClass168_2012.get(i));
		if (interface66 == null) {
			if (bool) {
				interface66 = (Interface66) aHashMap2027.get(Integer.valueOf(i));
			} else {
				interface66 = (Interface66) aHashMap2018.get(Integer.valueOf(i));
			}
		}
		return interface66;
	}

	float method3605(int i) {
		Class326 class326 = PriorityQueueIterator.method6069(i);
		float f = 1.0F;
		for (; class326 != null; class326 = class326.method5782()) {
			f *= class326.method5780();
		}
		return f;
	}

	Class456 method3606(Interface66 interface66) {
		if (!aBool2015) {
			return null;
		}
		int i_13_ = 0;
		Iterator iterator = aList2016.iterator();
		while (iterator.hasNext()) {
			Class456 class456 = (Class456) iterator.next();
			i_13_++;
			if (class456.method7436() == Class455.aClass455_5116) {
				class456.method7427(interface66);
				return class456;
			}
		}
		if (i_13_ >= anInt2024 * -769159287) {
			return null;
		}
		Class456 class456 = interface66.method416();
		aList2016.add(class456);
		return class456;
	}

	Interface66 method3607(int i, boolean music) {
		if (!aBool2015) {
			return null;
		}

		Interface66 interface66 = method3604(i, music);
		if (null == interface66) {
			Class193 class193 = new Class193(this);
			interface66 = Class248.method4643(music ? Class614.music : Class480_Sub21_Sub3.soundEffects, i, class193,
					music, aClass168_2023);
			if (music) {
				aHashMap2027.put(Integer.valueOf(i), interface66);
			} else {
				aHashMap2018.put(Integer.valueOf(i), interface66);
			}
		}

		return interface66;
	}

	boolean method3608(Class397 class397, Class397 class397_15_, float f) {
		Class397 class397_16_ = Class397.difference(class397_15_, class397);
		return class397_16_.distance() < f;
	}

	Class456 method3619(int i) {
		Iterator iterator = aList2017.iterator();
		while (iterator.hasNext()) {
			Class456 class456 = (Class456) iterator.next();
			if (class456.method7440() == Class171.aClass171_1948 && class456.method7436() == Class455.aClass455_5114) {
				return class456;
			}
		}
		return null;
	}

	void method3634() {
		SoundEffectsVolumeNormaliser effects = new SoundEffectsVolumeNormaliser(this);
		MusicVolumeNormaliser music = new MusicVolumeNormaliser(this);
		ThemeMusicVolumeNormaliser theme = new ThemeMusicVolumeNormaliser(this);
		AreaSoundVolumeNormaliser area = new AreaSoundVolumeNormaliser(this);
		VoiceOverVolumeNormaliser voice = new VoiceOverVolumeNormaliser(this);
		ThemeMusicVolumeNormaliser.method3756(Class154.aClass154_1865.method3278(),
				Class154.aClass154_1867.method3278(), 0.2F, effects);
		ThemeMusicVolumeNormaliser.method3756(Class154.aClass154_1866.method3278(),
				Class154.aClass154_1867.method3278(), 1.0F, music);
		ThemeMusicVolumeNormaliser.method3756(Class154.aClass154_1869.method3278(),
				Class154.aClass154_1867.method3278(), 1.0F, theme);
		ThemeMusicVolumeNormaliser.method3756(Class154.aClass154_1868.method3278(),
				Class154.aClass154_1867.method3278(), 0.8F, area);
		ThemeMusicVolumeNormaliser.method3756(Class154.aClass154_1864.method3278(),
				Class154.aClass154_1867.method3278(), 1.0F, voice);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1875.method3293(),
				Class154.aClass154_1866.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1877.method3293(),
				Class154.aClass154_1864.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1876.method3293(),
				Class154.aClass154_1865.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1878.method3293(),
				Class154.aClass154_1865.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1879.method3293(),
				Class154.aClass154_1865.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1880.method3293(),
				Class154.aClass154_1865.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1881.method3293(),
				Class154.aClass154_1865.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1883.method3293(),
				Class154.aClass154_1868.method3278(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1884.method3293(),
				Class156.aClass156_1883.method3293(), 1.0F, null);
		ThemeMusicVolumeNormaliser.method3756(Class156.aClass156_1885.method3293(),
				Class156.aClass156_1883.method3293(), 1.0F, null);
		PriorityQueueIterator.method6069(Class156.aClass156_1875.method3293()).method5781(0.75F);
	}

	List method3649() {
		return aList2020;
	}

	List method3667() {
		return aList2017;
	}

	void method3699(int i, int i_62_) {
		if (null != Client.gameConnection.encryptor
				&& BaseAnimationDefinitionProvider.method3320(-1501875989 * Client.gameState)) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4036,
					Client.gameConnection.encryptor);
			class480_sub15.payload.writeInt(i);
			Client.gameConnection.sendFrame(class480_sub15);
		}
	}

	static final void method6959() {
		TurnMobCutsceneAction.aClass186_9434.method3620();
	}

}