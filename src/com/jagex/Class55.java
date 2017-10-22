package com.jagex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class55 {
	static final int anInt610 = 10;
	static final int anInt611 = 1;

	public static int method1183(int i, int i_25_, int orientation) {
		orientation &= 0x3;
		if (0 == orientation) {
			return i_25_;
		} else if (1 == orientation) {
			return 7 - i;
		} else if (2 == orientation) {
			return 7 - i_25_;
		}

		return i;
	}

	public static Class480_Sub37 method1184() {
		if (null == Class495.aClass644_6820 || null == Class480_Sub37.aClass645_10316) {
			return null;
		}
		Class480_Sub37.aClass645_10316.setDeque(Class495.aClass644_6820);
		Class480_Sub37 class480_sub37 = (Class480_Sub37) Class480_Sub37.aClass645_10316.front();
		if (null == class480_sub37) {
			return null;
		}
		Class224 class224 = (Class224) Class495.aClass678_Sub8_6803.get(class480_sub37.id * 818539827);
		if (null == class224 || !class224.aBool2340
				|| !class224.method4205(Class495.anInterface14_6806, Class495.anInterface12_6805)) {
			return Class480_Sub37.method7529();
		}
		return class480_sub37;
	}

	static float method1182(float f, float f_5_, float f_6_, float f_7_, float f_8_, float f_9_, int i) {
		float f_11_ = 0.0F;
		float f_12_ = f_7_ - f;
		float f_13_ = f_8_ - f_5_;
		float f_14_ = f_9_ - f_6_;
		float lastWorldX = 0.0F;
		float f_16_ = 0.0F;
		float lastWorldZ = 0.0F;

		Class490 class490 = Client.aClass460_10760.method7687();
		for (; f_11_ < 1.1F; f_11_ += 0.1F) {
			float worldX = f_11_ * f_12_ + f;
			float f_19_ = f_5_ + f_11_ * f_13_;
			float worldZ = f_6_ + f_14_ * f_11_;
			int x = (int) worldX >> 9;
			int z = (int) worldZ >> 9;
			if (x > 0 && z > 0 && x < Client.aClass460_10760.method7680() && z < Client.aClass460_10760.method7707()) {
				int plane = Client.localPlayer.plane;
				if (plane < 3 && (Client.aClass460_10760.method7775().flags[1][x][z] & TileFlags.BRIDGE_FLAG) != 0) {
					plane++;
				}

				int height = class490.aClass120Array6702[plane].averageHeight((int) worldX, (int) worldZ);
				if (height < f_19_) {
					if (i >= 2) {
						return f_11_ - 0.1F + method1182(lastWorldX, f_16_, lastWorldZ, worldX, f_19_, worldZ, i - 1)
								* 0.1F;
					}

					return f_11_;
				}
			}

			lastWorldX = worldX;
			f_16_ = f_19_;
			lastWorldZ = worldZ;
		}

		return -1.0F;
	}

	static String decodeBase37(long encoded) {
		if (encoded <= 0L || encoded >= 6582952005840035281L) {
			return null;
		}
		if (0L == encoded % 37L) {
			return null;
		}

		int length = 0;
		for (long copy = encoded; 0L != copy; copy /= 37L) {
			length++;
		}

		StringBuilder builder = new StringBuilder(length);
		while (encoded != 0L) {
			long old = encoded;
			encoded /= 37L;
			char character = Class610.BASE_37_CHARACTERS[(int) (old - encoded * 37L)];

			if ('_' == character) {
				int index = builder.length() - 1;
				builder.setCharAt(index, Character.toUpperCase(builder.charAt(index)));
				character = '\u00a0';
			}

			builder.append(character);
		}

		builder.reverse();
		builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
		return builder.toString();
	}

	LinkedHashMap<Long, Integer> aLinkedHashMap612 = new LinkedHashMap<Long, Integer>();

	Class55() {
		this(null);
	}

	Class55(Buffer buffer) {
		if (buffer != null && null != buffer.payload) {
			int valid = buffer.readUByte();

			if (valid == 1) {
				int count = buffer.readUByte();

				for (int i = 0; i < count; i++) {
					long key = buffer.readLong();
					int value = buffer.readInt();
					aLinkedHashMap612.put(key, value);
				}
			}
		}
	}

	void put(long key, int value) {
		if (aLinkedHashMap612.size() >= 10 && !aLinkedHashMap612.containsKey(Long.valueOf(key))) {
			Iterator<Map.Entry<Long, Integer>> iterator = aLinkedHashMap612.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}

		aLinkedHashMap612.put(Long.valueOf(key), Integer.valueOf(value));
		save();
	}

	boolean containsKey(long key) {
		return aLinkedHashMap612.containsKey(Long.valueOf(key));
	}

	int get(long key) {
		return aLinkedHashMap612.get(Long.valueOf(key)).intValue();
	}

	void save() {
		DiskFile preferences = null;
		try {
			try {
				preferences = PriorityQueueIterator.getPreferences("3", Client.game.domain, true);
				Buffer buffer = new Buffer(5000);
				encode(buffer);
				preferences.write(buffer.payload, 0, buffer.offset * -165875887);
			} catch (Exception exception) {
				try {
					if (null != preferences) {
						preferences.close();
					}
				} catch (Exception ex) {
				}
				return;
			}

			try {
				preferences.close();
			} catch (Exception exception) {

			}
		} catch (Exception object) {
			try {
				preferences.close();
			} catch (Exception exception) {

			}
		}
	}

	void encode(Buffer buffer) {
		buffer.writeByte(1);
		buffer.writeByte(aLinkedHashMap612.size());
		Iterator<Map.Entry<Long, Integer>> iterator = aLinkedHashMap612.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Long, Integer> entry = iterator.next();
			buffer.writeLong(entry.getKey().longValue());
			buffer.writeInt(entry.getValue().intValue());
		}
	}

}