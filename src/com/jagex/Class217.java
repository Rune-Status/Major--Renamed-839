package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class217 implements Interface34 {
	static ReferenceCache aClass168_2234 = new ReferenceCache(524288, 1024);
	static List aList2262 = new ArrayList();

	int[] anIntArray2200;
	int anInt2201;
	int anInt2202;
	int anInt2203;
	int anInt2204;
	Interface37 anInterface37_2205;
	List aList2206 = new ArrayList();
	Class342 aClass342_2207 = Class342.aClass342_3646;
	List aList2208;
	Class338 aClass338_2209;
	int anInt2210;
	Class337 aClass337_2211;
	int anInt2212;
	float aFloat2213;
	int anInt2214;
	int anInt2215;
	Class202[] aClass202Array2216;
	boolean[] aBoolArray2217;
	Class205[] aClass205Array2218;
	Class214[] aClass214Array2219;
	int anInt2220;
	Class225 aClass225_2221;
	Class225[] aClass225Array2222;
	int anInt2223;
	int anInt2224;
	boolean aBool2225;
	Class225[] aClass225Array2226;
	boolean aBool2227;
	Class223[] aClass223Array2228;
	Class225 aClass225_2229;
	Class225 aClass225_2230;
	Class225 aClass225_2231;
	Class225 aClass225_2232;
	int[] anIntArray2233;
	boolean aBool2235;
	List aList2236 = new ArrayList();
	int anInt2237;
	int anInt2238;
	int anInt2239;
	boolean[] aBoolArray2240;
	byte[] aByteArray2241;
	boolean aBool2242;
	int[] anIntArray2243;
	int anInt2244;
	int anInt2245;
	int anInt2246;
	int anInt2247;
	boolean aBool2248;
	int anInt2249;
	int anInt2250;
	int anInt2251;
	int anInt2252;
	int anInt2253;
	List aList2254;
	List aList2255;
	AtomicReference anAtomicReference2256;
	int anInt2257;
	int anInt2258;
	Class225[] aClass225Array2259;
	boolean[] aBoolArray2260;
	Buffer aClass480_Sub17_2261 = null;
	boolean aBool2263;
	boolean[] aBoolArray2264;
	int anInt2265;
	Class225 aClass225_2266;
	boolean[] aBoolArray2267;
	int anInt2268;
	int anInt2269;

	public Class217(float f) {
		aList2208 = new ArrayList();
		aList2254 = new ArrayList();
		aList2255 = new ArrayList();
		anAtomicReference2256 = new AtomicReference(null);
		aFloat2213 = f;
		aClass337_2211 = Class337.aClass337_3618;
		aClass338_2209 = Class338.aClass338_3622;
		method4052(false);
	}

	@Override
	public int method159(int i) {
		return i / (method280().anInt3617 * 1502392487 / 8);
	}

	@Override
	public void method170() {
		if (method234() == Class342.aClass342_3648 || method234() == Class342.aClass342_3646
				|| method234() == Class342.aClass342_3643) {
			method4040(Class342.aClass342_3647);
			method4053();
		}
	}

	@Override
	public void method22(Buffer buffer) {
		if (method234() == Class342.aClass342_3644 || method234() == Class342.aClass342_3645) {
			if (buffer != null) {
				buffer.cache();
			}
		} else if (buffer == null) {
			boolean bool = aBool2227 && (anInt2252 > 0 && anInt2253 < anInt2252 || anInt2252 < 0);
			if (aList2208.isEmpty()) {
				if (!bool) {
					method4062();
					method4040(Class342.aClass342_3645);
				}
			} else if (!bool) {
				method4062();
				method4040(Class342.aClass342_3644);
			}
			if (bool) {
				method4052(true);
			}
		} else {
			method4068(buffer);
		}
	}

	@Override
	public void method233() {
		if (method234() != Class342.aClass342_3647) {
			method4052(false);
			method4040(Class342.aClass342_3646);
		} else {
			method4052(false);
			method4040(Class342.aClass342_3648);
		}
	}

	@Override
	public Class342 method234() {
		return aClass342_2207;
	}

	@Override
	public void method235(Interface37 interface37) {
		anInterface37_2205 = interface37;
	}

	@Override
	public Class338 method237() {
		return aClass338_2209;
	}

	@Override
	public int method238() {
		if (aBool2242) {
			return method4046() < anInt2210 ? anInt2210 : method4046();
		}
		throw new RuntimeException("");
	}

	@Override
	public void method239(boolean bool) {
		if (!bool) {
			method233();
		} else if (method234() == Class342.aClass342_3645) {
			method4052(true);
			method4040(Class342.aClass342_3643);
		}
	}

	@Override
	public Buffer method241(int i) {
		Buffer buffer = method4042(i);
		return buffer;
	}

	@Override
	public synchronized boolean method244() {
		return aBool2225;
	}

	@Override
	public void method246(boolean bool, int i, int i_182_, int i_183_) {
		aBool2227 = bool;
		anInt2252 = i;
		anInt2220 = i_182_;
		anInt2212 = i_183_;
	}

	@Override
	public void method261(int i, Class337 class337, Class338 class338, int i_181_) {
		anInt2210 = i_181_;
		if (method4045(i, class337, class338)) {
			aClass337_2211 = class337;
			aClass338_2209 = class338;
		} else {
			throw new RuntimeException("");
		}
	}

	@Override
	public int method279(int i) {
		return i * (method280().anInt3617 * 1502392487 / 8);
	}

	@Override
	public Class337 method280() {
		return aClass337_2211;
	}

	@Override
	public int method48() {
		return method4075();
	}

	Class225[] method4039(int i, int i_0_) {
		Class225[] class225s = new Class225[i];
		for (int i_1_ = 0; i_1_ < class225s.length; i_1_++) {
			class225s[i_1_] = method4050(i_0_);
		}
		return class225s;
	}

	void method4040(Class342 class342) {
		aClass342_2207 = class342;
	}

	Buffer method4042(int i) {
		Buffer buffer = method4074(method279(i));
		int i_2_ = i;
		synchronized (aList2208) {
			while (!aList2208.isEmpty()) {
				Buffer buffer_3_ = (Buffer) aList2208.remove(0);
				anInt2239 -= method159(buffer_3_.offset * -165875887) / method238();
				int i_4_ = method279(i_2_);
				int i_5_ = buffer_3_.offset * -165875887 < i_4_ ? buffer_3_.offset * -165875887 : i_4_;
				buffer.writeBytes(buffer_3_.payload, 0, i_5_);
				i_2_ -= method159(i_5_);
				int i_6_ = buffer_3_.offset * -165875887 - i_5_;
				if (i_6_ != 0) {
					System.arraycopy(buffer_3_.payload, i_5_, buffer_3_.payload, 0, i_6_);
					buffer_3_.offset = i_6_ * 1258142129;
					anInt2239 += method159(i_6_) / method238();
					aList2208.add(0, buffer_3_);
				} else {
					buffer_3_.cache();
				}
				if (i_2_ <= 0) {
					break;
				}
			}
			if (aList2208.isEmpty() && method234() == Class342.aClass342_3644) {
				method4040(Class342.aClass342_3645);
			}
		}
		return buffer;
	}

	boolean method4045(int i, Class337 class337, Class338 class338) {
		if (class337 == Class337.aClass337_3618) {
			return true;
		} else if (class337 == Class337.aClass337_3619) {
			return true;
		} else if (class337 == Class337.aClass337_3616) {
			return true;
		}

		return class337 == Class337.aClass337_3620;
	}

	int method4046() {
		if (aBool2242) {
			return anInt2201;
		}
		throw new RuntimeException("");
	}

	Class225 method4050(int i) {
		synchronized (aClass168_2234) {
			Class225 class225 = (Class225) aClass168_2234.first();
			Class225 class225_7_ = null;
			int i_8_ = i;
			for (; class225 != null; class225 = (Class225) aClass168_2234.next()) {
				if (class225.aFloatArray2347.length > i && !class225.aBool2348
						&& (class225_7_ == null || class225.aFloatArray2347.length < i_8_)) {
					class225_7_ = class225;
					i_8_ = class225_7_.aFloatArray2347.length;
				}
				if (class225.aFloatArray2347.length == i && !class225.aBool2348) {
					break;
				}
			}
			if (class225 == null) {
				class225 = class225_7_;
			}
			if (class225 == null) {
				class225 = new Class225(this);
				int i_9_ = 0;
				boolean bool = false;
				while (!bool && i_9_ < 1000) {
					if (aClass168_2234.get(i_9_) != null) {
						i_9_++;
					} else {
						bool = true;
					}
				}
				class225.anInt2346 = i_9_;
				float[] fs = new float[i];
				class225.aFloatArray2347 = fs;
				class225.aBool2348 = true;
				class225.anInt2345 = i;
				if (aClass168_2234.remaining() >= i * 4) {

				}
				aClass168_2234.put(class225.anInt2346, class225, fs.length * 4);
			} else {
				for (int i_10_ = 0; i_10_ < class225.aFloatArray2347.length; i_10_++) {
					class225.aFloatArray2347[i_10_] = 0.0F;
				}
				class225.anInt2345 = i;
			}
			class225.aBool2348 = true;
			Class225 class225_11_ = class225;
			return class225_11_;
		}
	}

	synchronized void method4052(boolean bool) {
		if (!bool) {
			anInt2214 = 0;
			anInt2215 = 0;
			aBoolArray2264 = null;
			anIntArray2243 = null;
			method4122(aClass225Array2259);
			aClass225Array2259 = null;
			method4122(aClass225Array2222);
			aClass225Array2222 = null;
			anInt2223 = 0;
			anInt2224 = 0;
			aBoolArray2240 = null;
			method4122(aClass225Array2226);
			aClass225Array2226 = null;
			method4099(aClass225_2221);
			method4099(aClass225_2266);
			method4099(aClass225_2229);
			method4099(aClass225_2230);
			method4099(aClass225_2231);
			method4099(aClass225_2232);
			aClass225_2221 = null;
			aClass225_2266 = null;
			aClass225_2229 = null;
			aClass225_2230 = null;
			aClass225_2231 = null;
			aClass225_2232 = null;
			anIntArray2200 = null;
			anIntArray2233 = null;
		}
		anInt2257 = 0;
		Iterator iterator = aList2236.iterator();
		while (iterator.hasNext()) {
			Buffer buffer = (Buffer) iterator.next();
			buffer.cache();
		}
		aList2236.clear();
		aBool2235 = false;
		if (aClass480_Sub17_2261 != null) {
			synchronized (aClass480_Sub17_2261) {
				aClass480_Sub17_2261.cache();
				aClass480_Sub17_2261 = null;
			}
		}
		anInt2238 = 0;
		anInt2269 = 0;
		if (!bool) {
			synchronized (aList2208) {
				Iterator iterator_12_ = aList2208.iterator();
				while (iterator_12_.hasNext()) {
					Buffer buffer = (Buffer) iterator_12_.next();
					buffer.cache();
				}
				aList2208.clear();
			}
			anInt2239 = 0;
		}
		synchronized (aList2206) {
			Iterator iterator_13_ = aList2206.iterator();
			while (iterator_13_.hasNext()) {
				Buffer buffer = (Buffer) iterator_13_.next();
				buffer.cache();
			}
			aList2206.clear();
		}
		aBool2263 = false;
		anInt2244 = 0;
		anInt2247 = -1;
		anInt2251 = -1;
		if (!bool) {
			method4117(false);
			aBool2242 = false;
			anInt2220 = -1;
			anInt2212 = -1;
			anInt2252 = 0;
			anInt2253 = 0;
			anInt2245 = -1;
			anInt2246 = -1;
			anInt2249 = -1;
			anInt2250 = -1;
			aBool2248 = false;
			aBool2227 = false;
		} else {
			anInt2253++;
			aBool2248 = true;
		}
	}

	void method4053() {
		if (method234() != Class342.aClass342_3644) {
			method4073();
			if (method234() == Class342.aClass342_3647) {
				method4040(Class342.aClass342_3643);
			}
		}
	}

	void method4054(Buffer buffer) {
		aList2236.add(buffer);
	}

	boolean isOgg(Buffer buffer) {
		return !(buffer.readUByte() != 'O' || buffer.readUByte() != 'g' || buffer.readUByte() != 'g' || buffer
				.readUByte() != 'S');
	}

	float method4056(int i) {
		int i_14_ = i & 0x1fffff;
		int i_15_ = i & ~0x7fffffff;
		int i_16_ = (i & 0x7fe00000) >> 21;
		if (i_15_ != 0) {
			i_14_ = -i_14_;
		}
		return (float) (i_14_ * Math.pow(2.0, i_16_ - 788));
	}

	int method4057() {
		return anInt2265;
	}

	int method4058() {
		return anInt2237;
	}

	int method4060() {
		int i = aByteArray2241[anInt2265] >> anInt2237 & 0x1;
		anInt2237++;
		anInt2265 += anInt2237 >> 3;
		anInt2237 &= 0x7;
		return i;
	}

	void method4062() {
		aByteArray2241 = null;
	}

	void method4063() {
		int i = method4119(8) + 1;
		Iterator iterator = aList2262.iterator();
		while (iterator.hasNext()) {
			Class209 class209 = (Class209) iterator.next();
			if (class209.anInt2171 == 0 && class209.anInt2172 == 0) {
				if (class209.aClass202Array2170.length == i && class209.anInt2169 == anInt2201
						&& class209.anInt2174 == anInt2268 && class209.anInt2173 == anInt2203) {
					aClass202Array2216 = class209.aClass202Array2170;
					for (Class202 element : aClass202Array2216) {
						element.method3947(this);
					}
					return;
				}
			}
		}
		aClass202Array2216 = new Class202[i];
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			if (aClass202Array2216[i_18_] == null) {
				aClass202Array2216[i_18_] = new Class202();
			}
			aClass202Array2216[i_18_].method3958(this);
		}
		Class209 class209 = new Class209(anInt2201, anInt2268, anInt2202, anInt2204, anInt2203, aClass202Array2216);
		aList2262.add(class209);
	}

	void method4064(byte[] is, int i) {
		anInt2257 = 0;
		if (!method244()) {
			if (is == null) {
				throw new RuntimeException("");
			}
			int i_19_ = 0;
			if (isVorbis(is, i, 1)) {
				i_19_ = 1;
			} else if (isVorbis(is, i, 3)) {
				i_19_ = 3;
			} else if (isVorbis(is, i, 5)) {
				i_19_ = 5;
			} else {
				throw new RuntimeException(new StringBuilder().append("").append(i_19_).toString());
			}
			if (i_19_ == 1) {
				method4103(is, i + 7);
				int i_20_ = method4119(32);
				anInt2201 = method4119(8);
				anInt2268 = method4119(32);
				anInt2202 = method4119(32);
				anInt2203 = method4119(32);
				anInt2204 = method4119(32);
				anInt2214 = 1 << method4119(4);
				anInt2215 = 1 << method4119(4);
				int i_21_ = 1 << method4119(1);
				if (i_20_ != 0 || i_21_ == 0) {
					throw new RuntimeException("");
				}
				aBool2242 = true;
				anInt2247++;
			} else if (i_19_ != 3 && i_19_ == 5) {
				if (!isVorbis(is, i, 5)) {
					throw new RuntimeException("");
				}
				method4103(is, i + 7);
				if (aClass225Array2226 != null) {
					method4122(aClass225Array2226);
					aClass225Array2226 = null;
				}
				aClass225Array2226 = method4039(anInt2201, anInt2215);
				for (int i_22_ = 0; i_22_ < 2; i_22_++) {
					int i_23_ = i_22_ != 0 ? anInt2215 : anInt2214;
					int i_24_ = i_23_ >> 1;
					int i_25_ = i_23_ >> 2;
					int i_26_ = i_23_ >> 3;
					Class225 class225 = method4050(i_24_);
					for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
						class225.aFloatArray2347[2 * i_27_] = (float) Math.cos(4 * i_27_ * Math.PI / i_23_);
						class225.aFloatArray2347[2 * i_27_ + 1] = -(float) Math.sin(4 * i_27_ * Math.PI / i_23_);
					}
					Class225 class225_28_ = method4050(i_24_);
					for (int i_29_ = 0; i_29_ < i_25_; i_29_++) {
						class225_28_.aFloatArray2347[2 * i_29_] = (float) Math.cos((2 * i_29_ + 1) * Math.PI
								/ (2 * i_23_));
						class225_28_.aFloatArray2347[2 * i_29_ + 1] = (float) Math.sin((2 * i_29_ + 1) * Math.PI
								/ (2 * i_23_));
					}
					Class225 class225_30_ = method4050(i_25_);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++) {
						class225_30_.aFloatArray2347[2 * i_31_] = (float) Math.cos((4 * i_31_ + 2) * Math.PI / i_23_);
						class225_30_.aFloatArray2347[2 * i_31_ + 1] = -(float) Math.sin((4 * i_31_ + 2) * Math.PI
								/ i_23_);
					}
					int[] is_32_ = new int[i_26_];
					int i_33_ = LatencyMonitor.method1059(i_26_ - 1);
					for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
						is_32_[i_34_] = Queue.method13190(i_34_, i_33_, (short) 256);
					}
					if (i_22_ != 0) {
						aClass225_2230 = class225;
						aClass225_2231 = class225_28_;
						aClass225_2232 = class225_30_;
						anIntArray2233 = is_32_;
					} else {
						aClass225_2221 = class225;
						aClass225_2266 = class225_28_;
						aClass225_2229 = class225_30_;
						anIntArray2200 = is_32_;
					}
				}
				method4063();
				int i_35_ = method4119(6) + 1;
				for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
					method4119(16);
				}
				i_35_ = method4119(6) + 1;
				if (aClass223Array2228 == null || aClass223Array2228.length != i_35_) {
					aClass223Array2228 = new Class223[i_35_];
				}
				for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
					if (aClass223Array2228[i_37_] == null) {
						aClass223Array2228[i_37_] = new Class223();
					}
					aClass223Array2228[i_37_].method4171(this, anInt2201);
				}
				int i_38_ = method4119(6) + 1;
				if (aClass205Array2218 == null || aClass205Array2218.length != i_38_) {
					aClass205Array2218 = new Class205[i_38_];
				}
				for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
					if (aClass205Array2218[i_39_] == null) {
						aClass205Array2218[i_39_] = new Class205();
					}
					aClass205Array2218[i_39_].method3976(this);
				}
				int i_40_ = method4119(6) + 1;
				if (aClass214Array2219 == null || aClass214Array2219.length != i_40_) {
					aClass214Array2219 = new Class214[i_40_];
				}
				for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
					if (aClass214Array2219[i_41_] == null) {
						aClass214Array2219[i_41_] = new Class214();
					}
					aClass214Array2219[i_41_].method4025(this);
				}
				int i_42_ = method4119(6) + 1;
				aBoolArray2264 = new boolean[i_42_];
				anIntArray2243 = new int[i_42_];
				for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
					aBoolArray2264[i_43_] = method4060() != 0;
					method4119(16);
					method4119(16);
					anIntArray2243[i_43_] = method4119(8);
				}
				method4117(true);
			}
		}
	}

	int method4065(int i) {
		int i_44_ = 0;
		for (; i > 0; i >>= 1) {
			i_44_++;
		}
		return i_44_;
	}

	boolean method4066(byte[] is, int i, int i_45_, AtomicReference atomicreference) {
		if (is == null) {
			throw new RuntimeException("");
		}
		if (i + i_45_ > is.length) {
			return false;
		}
		method4103(is, i);
		int i_46_ = method4060();
		if (i_46_ != 0) {
			method4064(is, i);
			return false;
		}
		if (!method244()) {
			throw new RuntimeException();
		}
		int i_47_ = method4119(method4065(anIntArray2243.length - 1));
		boolean bool = aBoolArray2264[i_47_];
		int i_48_ = bool ? anInt2215 : anInt2214;
		boolean bool_49_ = false;
		boolean bool_50_ = false;
		if (bool) {
			bool_49_ = method4060() != 0;
			bool_50_ = method4060() != 0;
		}
		int i_51_ = i_48_ >> 1;
		int i_52_;
		int i_53_;
		int i_54_;
		if (bool && !bool_49_) {
			i_52_ = (i_48_ >> 2) - (anInt2214 >> 2);
			i_53_ = (i_48_ >> 2) + (anInt2214 >> 2);
			i_54_ = anInt2214 >> 1;
		} else {
			i_52_ = 0;
			i_53_ = i_51_;
			i_54_ = i_48_ >> 1;
		}
		int i_55_;
		int i_56_;
		int i_57_;
		if (bool && !bool_50_) {
			i_55_ = i_48_ - (i_48_ >> 2) - (anInt2214 >> 2);
			i_56_ = i_48_ - (i_48_ >> 2) + (anInt2214 >> 2);
			i_57_ = anInt2214 >> 1;
		} else {
			i_55_ = i_51_;
			i_56_ = i_48_;
			i_57_ = i_48_ >> 1;
		}
		Class214 class214 = aClass214Array2219[anIntArray2243[i_47_]];
		if (aBoolArray2267 == null || aBoolArray2267.length != anInt2201) {
			aBoolArray2267 = new boolean[anInt2201];
			aBoolArray2260 = new boolean[anInt2201];
		}
		for (int i_58_ = 0; i_58_ < anInt2201; i_58_++) {
			int i_59_ = class214.anIntArray2188 != null ? class214.anIntArray2188[i_58_] : 0;
			int i_60_ = i_59_;
			int i_61_ = class214.anIntArray2189[i_60_];
			aBoolArray2267[i_58_] = !aClass223Array2228[i_61_].method4183(i_58_);
			aBoolArray2260[i_58_] = aBoolArray2267[i_58_];
		}
		for (int i_62_ = 0; i_62_ < class214.anInt2187; i_62_++) {
			if (!aBoolArray2267[class214.anIntArray2192[i_62_]] || !aBoolArray2267[class214.anIntArray2193[i_62_]]) {
				aBoolArray2267[class214.anIntArray2192[i_62_]] = false;
				aBoolArray2267[class214.anIntArray2193[i_62_]] = false;
			}
		}
		if (aBoolArray2217 == null || aBoolArray2217.length != anInt2201) {
			aBoolArray2217 = new boolean[anInt2201];
		}
		for (int i_63_ = 0; i_63_ < class214.anInt2191; i_63_++) {
			int i_64_ = 0;
			for (int i_65_ = 0; i_65_ < anInt2201; i_65_++) {
				int i_66_ = class214.anIntArray2188 != null ? class214.anIntArray2188[i_65_] : i_63_;
				if (i_66_ == i_63_) {
					aBoolArray2217[i_64_++] = aBoolArray2267[i_65_];
				}
			}
			Class205 class205 = aClass205Array2218[class214.anIntArray2190[i_63_]];
			Class225[] class225s;
			if (class205.anInt2137 == 2) {
				Class225[] class225s_67_ = method4039(1, anInt2201 * i_48_);
				for (int i_68_ = 0; i_68_ < i_48_; i_68_++) {
					for (int i_69_ = 0; i_69_ < anInt2201; i_69_++) {
						try {
							class225s_67_[0].aFloatArray2347[i_68_ * anInt2201 + i_69_] = aClass225Array2226[i_69_].aFloatArray2347[i_68_];
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class225s_67_ = class205.method3971(class225s_67_, i_48_ >> 1, aBoolArray2217);
				class225s = aClass225Array2226;
				for (int i_70_ = 0; i_70_ < i_48_; i_70_++) {
					for (int i_71_ = 0; i_71_ < anInt2201; i_71_++) {
						try {
							class225s[i_71_].aFloatArray2347[i_70_] = class225s_67_[0].aFloatArray2347[anInt2201
									* i_70_ + i_71_];
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method4122(class225s_67_);
			} else {
				class225s = class205.method3971(aClass225Array2226, i_48_ >> 1, aBoolArray2217);
			}
			if (class214.anIntArray2188 != null) {
				i_64_ = 0;
				for (int i_73_ = 0; i_73_ < anInt2201; i_73_++) {
					int i_74_ = class214.anIntArray2188[i_73_];
					if (i_74_ == i_63_) {
						aClass225Array2226[i_73_] = class225s[i_64_++];
					}
				}
			} else {
				if (aClass225Array2226 != class225s) {
					method4122(aClass225Array2226);
				}
				aClass225Array2226 = class225s;
			}
		}
		for (int i_75_ = class214.anInt2187 - 1; i_75_ >= 0; i_75_--) {
			Class225 class225 = aClass225Array2226[class214.anIntArray2192[i_75_]];
			Class225 class225_76_ = aClass225Array2226[class214.anIntArray2193[i_75_]];
			for (int i_77_ = 0; i_77_ < class225.anInt2345; i_77_++) {
				float f = class225.aFloatArray2347[i_77_];
				float f_78_ = class225_76_.aFloatArray2347[i_77_];
				float f_79_ = f;
				float f_80_ = f_78_;
				if (f > 0.0F) {
					if (f_78_ > 0.0F) {
						f_79_ = f;
						f_80_ = f - f_78_;
					} else {
						f_80_ = f;
						f_79_ = f + f_78_;
					}
				} else if (f_78_ > 0.0F) {
					f_79_ = f;
					f_80_ = f + f_78_;
				} else {
					f_80_ = f;
					f_79_ = f - f_78_;
				}
				class225.aFloatArray2347[i_77_] = f_79_;
				class225_76_.aFloatArray2347[i_77_] = f_80_;
			}
		}
		for (int i_81_ = 0; i_81_ < aBoolArray2267.length; i_81_++) {
			aBoolArray2267[i_81_] = aBoolArray2260[i_81_];
		}
		for (int i_82_ = 0; i_82_ < anInt2201; i_82_++) {
			if (!aBoolArray2267[i_82_]) {
				int i_83_ = class214.anIntArray2188 != null ? class214.anIntArray2188[i_82_] : 0;
				int i_84_ = i_83_;
				int i_85_ = class214.anIntArray2189[i_84_];
				aClass223Array2228[i_85_].method4179(i_82_);
				aClass223Array2228[i_85_].method4180(aClass225Array2226[i_82_], i_48_ >> 1, i_82_);
			}
		}
		for (int i_86_ = 0; i_86_ < anInt2201; i_86_++) {
			if (aBoolArray2267[i_86_]) {
				for (int i_87_ = i_48_ >> 1; i_87_ < i_48_; i_87_++) {
					aClass225Array2226[i_86_].aFloatArray2347[i_87_] = 0.0F;
				}
			} else {
				int i_88_ = i_48_ >> 1;
				int i_89_ = i_48_ >> 2;
				int i_90_ = i_48_ >> 3;
				Class225 class225 = aClass225Array2226[i_86_];
				for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
					class225.aFloatArray2347[i_91_] *= 0.5F;
				}
				for (int i_92_ = i_88_; i_92_ < i_48_; i_92_++) {
					class225.aFloatArray2347[i_92_] = -class225.aFloatArray2347[i_48_ - i_92_ - 1];
				}
				Class225 class225_93_ = bool ? aClass225_2230 : aClass225_2221;
				Class225 class225_94_ = bool ? aClass225_2231 : aClass225_2266;
				Class225 class225_95_ = bool ? aClass225_2232 : aClass225_2229;
				int[] is_96_ = bool ? anIntArray2233 : anIntArray2200;
				for (int i_97_ = 0; i_97_ < i_89_; i_97_++) {
					float f = class225.aFloatArray2347[4 * i_97_] - class225.aFloatArray2347[i_48_ - 4 * i_97_ - 1];
					float f_98_ = class225.aFloatArray2347[4 * i_97_ + 2]
							- class225.aFloatArray2347[i_48_ - 4 * i_97_ - 3];
					float f_99_ = class225_93_.aFloatArray2347[2 * i_97_];
					float f_100_ = class225_93_.aFloatArray2347[2 * i_97_ + 1];
					class225.aFloatArray2347[i_48_ - 4 * i_97_ - 1] = f * f_99_ - f_98_ * f_100_;
					class225.aFloatArray2347[i_48_ - 4 * i_97_ - 3] = f * f_100_ + f_98_ * f_99_;
				}
				for (int i_101_ = 0; i_101_ < i_90_; i_101_++) {
					float f = class225.aFloatArray2347[i_88_ + 3 + 4 * i_101_];
					float f_102_ = class225.aFloatArray2347[i_88_ + 1 + 4 * i_101_];
					float f_103_ = class225.aFloatArray2347[4 * i_101_ + 3];
					float f_104_ = class225.aFloatArray2347[4 * i_101_ + 1];
					class225.aFloatArray2347[i_88_ + 3 + 4 * i_101_] = f + f_103_;
					class225.aFloatArray2347[i_88_ + 1 + 4 * i_101_] = f_102_ + f_104_;
					float f_105_ = class225_93_.aFloatArray2347[i_88_ - 4 - 4 * i_101_];
					float f_106_ = class225_93_.aFloatArray2347[i_88_ - 3 - 4 * i_101_];
					class225.aFloatArray2347[4 * i_101_ + 3] = (f - f_103_) * f_105_ - (f_102_ - f_104_) * f_106_;
					class225.aFloatArray2347[4 * i_101_ + 1] = (f_102_ - f_104_) * f_105_ + (f - f_103_) * f_106_;
				}
				int i_107_ = LatencyMonitor.method1059(i_48_ - 1);
				for (int i_108_ = 0; i_108_ < i_107_ - 3; i_108_++) {
					int i_109_ = i_48_ >> i_108_ + 2;
					int i_110_ = 8 << i_108_;
					for (int i_111_ = 0; i_111_ < 2 << i_108_; i_111_++) {
						int i_112_ = i_48_ - i_109_ * 2 * i_111_;
						int i_113_ = i_48_ - i_109_ * (2 * i_111_ + 1);
						for (int i_114_ = 0; i_114_ < i_48_ >> i_108_ + 4; i_114_++) {
							int i_115_ = 4 * i_114_;
							float f = class225.aFloatArray2347[i_112_ - 1 - i_115_];
							float f_116_ = class225.aFloatArray2347[i_112_ - 3 - i_115_];
							float f_117_ = class225.aFloatArray2347[i_113_ - 1 - i_115_];
							float f_118_ = class225.aFloatArray2347[i_113_ - 3 - i_115_];
							class225.aFloatArray2347[i_112_ - 1 - i_115_] = f + f_117_;
							class225.aFloatArray2347[i_112_ - 3 - i_115_] = f_116_ + f_118_;
							float f_119_ = class225_93_.aFloatArray2347[i_114_ * i_110_];
							float f_120_ = class225_93_.aFloatArray2347[i_114_ * i_110_ + 1];
							class225.aFloatArray2347[i_113_ - 1 - i_115_] = (f - f_117_) * f_119_ - (f_116_ - f_118_)
									* f_120_;
							class225.aFloatArray2347[i_113_ - 3 - i_115_] = (f_116_ - f_118_) * f_119_ + (f - f_117_)
									* f_120_;
						}
					}
				}
				for (int i_121_ = 1; i_121_ < i_90_ - 1; i_121_++) {
					int i_122_ = is_96_[i_121_];
					if (i_121_ < i_122_) {
						int i_123_ = 8 * i_121_;
						int i_124_ = 8 * i_122_;
						float f = class225.aFloatArray2347[i_123_ + 1];
						class225.aFloatArray2347[i_123_ + 1] = class225.aFloatArray2347[i_124_ + 1];
						class225.aFloatArray2347[i_124_ + 1] = f;
						f = class225.aFloatArray2347[i_123_ + 3];
						class225.aFloatArray2347[i_123_ + 3] = class225.aFloatArray2347[i_124_ + 3];
						class225.aFloatArray2347[i_124_ + 3] = f;
						f = class225.aFloatArray2347[i_123_ + 5];
						class225.aFloatArray2347[i_123_ + 5] = class225.aFloatArray2347[i_124_ + 5];
						class225.aFloatArray2347[i_124_ + 5] = f;
						f = class225.aFloatArray2347[i_123_ + 7];
						class225.aFloatArray2347[i_123_ + 7] = class225.aFloatArray2347[i_124_ + 7];
						class225.aFloatArray2347[i_124_ + 7] = f;
					}
				}
				for (int i_125_ = 0; i_125_ < i_88_; i_125_++) {
					class225.aFloatArray2347[i_125_] = class225.aFloatArray2347[2 * i_125_ + 1];
				}
				for (int i_126_ = 0; i_126_ < i_90_; i_126_++) {
					class225.aFloatArray2347[i_48_ - 1 - 2 * i_126_] = class225.aFloatArray2347[4 * i_126_];
					class225.aFloatArray2347[i_48_ - 2 - 2 * i_126_] = class225.aFloatArray2347[4 * i_126_ + 1];
					class225.aFloatArray2347[i_48_ - i_89_ - 1 - 2 * i_126_] = class225.aFloatArray2347[4 * i_126_ + 2];
					class225.aFloatArray2347[i_48_ - i_89_ - 2 - 2 * i_126_] = class225.aFloatArray2347[4 * i_126_ + 3];
				}
				for (int i_127_ = 0; i_127_ < i_90_; i_127_++) {
					float f = class225_95_.aFloatArray2347[2 * i_127_];
					float f_128_ = class225_95_.aFloatArray2347[2 * i_127_ + 1];
					float f_129_ = class225.aFloatArray2347[i_88_ + 2 * i_127_];
					float f_130_ = class225.aFloatArray2347[i_88_ + 2 * i_127_ + 1];
					float f_131_ = class225.aFloatArray2347[i_48_ - 2 - 2 * i_127_];
					float f_132_ = class225.aFloatArray2347[i_48_ - 1 - 2 * i_127_];
					float f_133_ = f_128_ * (f_129_ - f_131_) + f * (f_130_ + f_132_);
					class225.aFloatArray2347[i_88_ + 2 * i_127_] = (f_129_ + f_131_ + f_133_) * 0.5F;
					class225.aFloatArray2347[i_48_ - 2 - 2 * i_127_] = (f_129_ + f_131_ - f_133_) * 0.5F;
					f_133_ = f_128_ * (f_130_ + f_132_) - f * (f_129_ - f_131_);
					class225.aFloatArray2347[i_88_ + 2 * i_127_ + 1] = (f_130_ - f_132_ + f_133_) * 0.5F;
					class225.aFloatArray2347[i_48_ - 1 - 2 * i_127_] = (-f_130_ + f_132_ + f_133_) * 0.5F;
				}
				for (int i_134_ = 0; i_134_ < i_89_; i_134_++) {
					class225.aFloatArray2347[i_134_] = class225.aFloatArray2347[2 * i_134_ + i_88_]
							* class225_94_.aFloatArray2347[2 * i_134_]
							+ class225.aFloatArray2347[2 * i_134_ + 1 + i_88_]
							* class225_94_.aFloatArray2347[2 * i_134_ + 1];
					class225.aFloatArray2347[i_88_ - 1 - i_134_] = class225.aFloatArray2347[2 * i_134_ + i_88_]
							* class225_94_.aFloatArray2347[2 * i_134_ + 1]
							- class225.aFloatArray2347[2 * i_134_ + 1 + i_88_]
							* class225_94_.aFloatArray2347[2 * i_134_];
				}
				for (int i_135_ = 0; i_135_ < i_89_; i_135_++) {
					class225.aFloatArray2347[i_48_ - i_89_ + i_135_] = -class225.aFloatArray2347[i_135_];
				}
				for (int i_136_ = 0; i_136_ < i_89_; i_136_++) {
					class225.aFloatArray2347[i_136_] = class225.aFloatArray2347[i_89_ + i_136_];
				}
				for (int i_137_ = 0; i_137_ < i_89_; i_137_++) {
					class225.aFloatArray2347[i_89_ + i_137_] = -class225.aFloatArray2347[i_89_ - i_137_ - 1];
				}
				for (int i_138_ = 0; i_138_ < i_89_; i_138_++) {
					class225.aFloatArray2347[i_88_ + i_138_] = class225.aFloatArray2347[i_48_ - i_138_ - 1];
				}
				for (int i_139_ = i_52_; i_139_ < i_53_; i_139_++) {
					float f = (float) Math.sin((i_139_ - i_52_ + 0.5) / i_54_ * 0.5 * Math.PI);
					aClass225Array2226[i_86_].aFloatArray2347[i_139_] *= (float) Math.sin(1.5707963267948966 * f * f);
				}
				for (int i_140_ = i_55_; i_140_ < i_56_; i_140_++) {
					float f = (float) Math.sin((i_140_ - i_55_ + 0.5) / i_57_ * 0.5 * Math.PI + 1.5707963267948966);
					aClass225Array2226[i_86_].aFloatArray2347[i_140_] *= (float) Math.sin(1.5707963267948966 * f * f);
				}
			}
		}
		Class225[] class225s = null;
		if (anInt2223 > 0) {
			int i_141_ = anInt2223 + i_48_ >> 2;
			class225s = method4039(anInt2201, i_141_);
			for (int i_142_ = 0; i_142_ < anInt2201; i_142_++) {
				if (!aBoolArray2240[i_142_]) {
					for (int i_143_ = 0; i_143_ < anInt2224; i_143_++) {
						int i_144_ = (anInt2223 >> 1) + i_143_;
						class225s[i_142_].aFloatArray2347[i_143_] += aClass225Array2222[i_142_].aFloatArray2347[i_144_];
					}
				}
				if (!aBoolArray2267[i_142_]) {
					for (int i_145_ = i_52_; i_145_ < i_48_ >> 1; i_145_++) {
						int i_146_ = class225s[i_142_].anInt2345 - (i_48_ >> 1) + i_145_;
						class225s[i_142_].aFloatArray2347[i_146_] += aClass225Array2226[i_142_].aFloatArray2347[i_145_];
					}
				}
			}
		}
		Class225[] class225s_147_ = aClass225Array2222;
		aClass225Array2222 = aClass225Array2226;
		aClass225Array2226 = class225s_147_;
		anInt2223 = i_48_;
		anInt2224 = i_56_ - (i_48_ >> 1);
		aBoolArray2240 = aBoolArray2267;
		atomicreference.set(class225s);
		return true;
	}

	synchronized void method4068(Buffer buffer) {
		aList2206.add(buffer);
		method4040(Class342.aClass342_3643);
	}

	synchronized void method4069() {
		int i = aClass480_Sub17_2261 != null ? aClass480_Sub17_2261.offset * -165875887 : 0;
		int i_148_ = 0;
		Iterator iterator = aList2236.iterator();
		while (iterator.hasNext()) {
			Buffer buffer = (Buffer) iterator.next();
			i_148_ += buffer.offset * -165875887;
		}
		if (aClass480_Sub17_2261 != null) {
			if (aClass480_Sub17_2261.payload.length - aClass480_Sub17_2261.offset * -165875887 < i_148_) {
				Buffer buffer = method4074(i_148_ + anInt2238);
				buffer.writeBytes(aClass480_Sub17_2261.payload, aClass480_Sub17_2261.offset * -165875887 - anInt2269,
						anInt2238);
				aClass480_Sub17_2261.cache();
				aClass480_Sub17_2261 = buffer;
				i = anInt2269;
			}
		} else {
			aClass480_Sub17_2261 = method4074(i_148_);
			anInt2238 = 0;
			i = 0;
		}
		iterator = aList2236.iterator();
		while (iterator.hasNext()) {
			Buffer buffer = (Buffer) iterator.next();
			aClass480_Sub17_2261.writeBytes(buffer.payload, 0, buffer.offset * -165875887);
			anInt2238 += buffer.offset * -165875887;
			buffer.cache();
		}
		aClass480_Sub17_2261.offset = (i - anInt2269) * 1258142129;
		anInt2269 = 0;
		aList2236.clear();
		while (aBool2235 && aClass480_Sub17_2261.offset * -165875887 < aClass480_Sub17_2261.payload.length) {
			if (aBool2225 && anInt2239 / method4084() > aFloat2213) {
				break;
			}
			if (aClass480_Sub17_2261 == null || anInt2238 < 27) {
				if (aClass480_Sub17_2261 != null) {
					anInt2269 = anInt2238;
					aClass480_Sub17_2261.offset += anInt2238 * 1258142129;
				}
				aBool2235 = false;
				break;
			}
			int i_149_ = aClass480_Sub17_2261.offset * -165875887;
			int i_150_ = 0;
			int i_151_ = 0;
			if (!isOgg(aClass480_Sub17_2261)) {
				break;
			}
			anInt2251++;
			if (anInt2250 < 0) {
				anInt2249++;
			}
			aList2254.clear();
			aList2255.clear();
			aClass480_Sub17_2261.readUByte();
			int i_152_ = aClass480_Sub17_2261.readUByte();
			int i_153_ = aClass480_Sub17_2261.readUByte() & 0xff | (aClass480_Sub17_2261.readUByte() & 0xff) << 8
					| (aClass480_Sub17_2261.readUByte() & 0xff) << 16 | aClass480_Sub17_2261.readUByte() << 24;
			i_150_ = i_153_ - i_150_;
			aClass480_Sub17_2261.offset += -1344562416;
			int i_154_ = aClass480_Sub17_2261.readUByte();
			int i_155_ = aClass480_Sub17_2261.offset * -165875887;
			int i_156_ = i_155_ + i_154_;
			if (i_156_ > i_149_ + anInt2238) {
				aClass480_Sub17_2261.offset = (i_149_ + anInt2238) * 1258142129;
				anInt2269 = aClass480_Sub17_2261.offset * -165875887 - i_149_;
				aBool2235 = false;
			}
			int i_157_ = i_156_;
			int i_158_ = 0;
			if (aBool2235) {
				for (int i_159_ = 0; i_159_ < i_154_; i_159_++) {
					int i_160_ = aClass480_Sub17_2261.payload[i_155_++] & 0xff;
					i_156_ += i_160_;
					i_158_ += i_160_;
					if (i_156_ > i_149_ + anInt2238) {
						aClass480_Sub17_2261.offset = (i_149_ + anInt2238) * 1258142129;
						anInt2269 = aClass480_Sub17_2261.offset * -165875887 - i_149_;
						aBool2235 = false;
						break;
					}
					if (i_160_ < 255) {
						aList2254.add(Integer.valueOf(i_157_));
						aList2255.add(Integer.valueOf(i_158_));
						i_157_ = i_156_;
						i_158_ = 0;
					}
				}
			}
			if (aBool2235) {
				int i_161_ = i_156_;
				int i_162_ = -1;
				Iterator iterator_163_ = aList2254.iterator();
				Iterator iterator_164_ = aList2255.iterator();
				boolean bool = false;
				anInt2258 = 0;
				while (iterator_163_.hasNext()) {
					Integer integer = (Integer) iterator_163_.next();
					Integer integer_165_ = (Integer) iterator_164_.next();
					i_162_++;
					if (method244() && aBool2248 == true && anInt2251 < anInt2249 && i_162_ < anInt2250) {
						Class217 class217_166_ = this;
						class217_166_.anInt2244 = class217_166_.anInt2244 + (bool ? 0 : i_150_);
						bool = true;
					} else {
						anAtomicReference2256.set(null);
						boolean bool_167_ = method4066(aClass480_Sub17_2261.payload, integer.intValue(),
								integer_165_.intValue(), anAtomicReference2256);
						Class225[] class225s = (Class225[]) anAtomicReference2256.get();
						if (bool_167_ && (aBool2248 != true || anInt2251 >= anInt2249 || i_162_ >= anInt2250)) {
							if (class225s != null) {
								int i_168_ = class225s[0].anInt2345;
								anInt2257 += i_168_;
								if (anInt2257 > i_153_ && i_152_ == 4) {
									anInt2258 = anInt2257 - i_153_ - anInt2258;
									i_168_ -= anInt2258;
									if (anInt2258 > class225s[0].anInt2345) {
										anInt2258 = class225s[0].anInt2345;
									}
									if (i_168_ < 0) {
										i_168_ = 0;
									}
								}
								int i_169_ = 0;
								int i_170_ = method279(i_168_) * class225s.length;
								if (aBool2248 == true && anInt2244 < anInt2220) {
									int i_171_ = i_170_;
									i_170_ -= method279(anInt2220 - anInt2244);
									if (i_170_ <= 0) {
										anInt2244 += method159(i_171_);
										method4122(class225s);
										continue;
									}
									i_169_ += anInt2220 - anInt2244;
								}
								if (anInt2244 + i_168_ > anInt2212 && (anInt2253 < anInt2252 || anInt2252 < 0)
										&& aBool2227) {
									i_170_ -= method279(anInt2244 + i_168_ - anInt2212 - 1);
									if (i_170_ <= 0) {
										method4122(class225s);
										continue;
									}
								}
								int i_172_ = method238();
								if (method4046() < method238()) {
									int i_173_ = method238() - method4046();
									i_170_ += i_170_ / method4046() * i_173_;
								}
								Buffer buffer = method4074(i_170_);
								for (int i_174_ = i_169_; i_174_ < i_168_; i_174_++) {
									boolean bool_175_ = aBool2248;
									if (anInt2252 != 0) {
										if (anInt2244 == anInt2220) {
											if (anInt2245 < 0) {
												anInt2245 = anInt2247;
												anInt2250 = i_162_;
											}
											aBool2248 = false;
										}
										if (anInt2244 == anInt2212 && anInt2246 < 0) {
											anInt2246 = anInt2247;
										}
										if (anInt2244 > anInt2212 && (anInt2253 < anInt2252 || anInt2252 < 0)
												&& aBool2227) {
											bool_175_ = true;
										}
									}
									if (bool_175_ && (anInt2244 < anInt2220 || anInt2244 > anInt2212)) {
										anInt2244++;
										if (++i_151_ > i_150_) {
											throw new RuntimeException();
										}
									} else {
										for (int i_176_ = 0; i_176_ < i_172_; i_176_++) {
											float f;
											if (i_176_ < class225s.length) {
												f = class225s[i_176_].aFloatArray2347[i_174_];
											} else {
												f = class225s[i_176_ % method4046()].aFloatArray2347[i_174_];
											}
											if (aClass337_2211 == Class337.aClass337_3618) {
												int i_177_ = method4105(f);
												if (aClass338_2209 == Class338.aClass338_3622) {
													buffer.writeLEShort(i_177_);
												} else {
													buffer.writeShort(i_177_);
												}
											} else if (aClass337_2211 == Class337.aClass337_3616) {
												int i_178_ = method4070(f);
												if (aClass338_2209 == Class338.aClass338_3622) {
													buffer.writeLEShort(i_178_);
												} else {
													buffer.writeShort(i_178_);
												}
											} else if (aClass337_2211 == Class337.aClass337_3619) {
												int i_179_ = method4071(f);
												buffer.writeByte(i_179_);
											} else if (aClass337_2211 == Class337.aClass337_3620) {
												int i_180_ = method4081(f);
												buffer.writeByte(i_180_);
											}
										}
										anInt2244++;
										i_151_++;
									}
								}
								synchronized (aList2208) {
									anInt2239 += method159(buffer.offset * -165875887) / method238();
									aList2208.add(buffer);
								}
							}
						} else if (method244()) {
							anInt2223 = 0;
							if (aClass225Array2222 == null
									|| aClass225Array2222 != null
									&& (aClass225Array2222.length != anInt2201 || aClass225Array2222[0].anInt2345 != anInt2215)) {
								if (aClass225Array2222 != null) {
									method4122(aClass225Array2222);
								}
								aClass225Array2222 = method4039(anInt2201, anInt2215);
							}
						}
						method4122(class225s);
					}
				}
				aClass480_Sub17_2261.offset = i_161_ * 1258142129;
				anInt2238 -= i_161_ - i_149_;
			}
		}
	}

	int method4070(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535) {
			return 65535;
		}
		if (i < 0) {
			return 0;
		}
		return i;
	}

	int method4071(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127) {
			return 127;
		}
		if (i < -128) {
			return -128;
		}
		return i;
	}

	boolean method4072() {
		return aBool2235;
	}

	void method4073() {
		if (method234() != Class342.aClass342_3648 && method234() != Class342.aClass342_3642
				&& (!aBool2225 || !(anInt2239 / method4084() > aFloat2213))) {
			if (!method4072()) {
				Buffer buffer = (Buffer) (aList2206 != null && !aList2206.isEmpty() ? aList2206.get(0) : null);
				if (buffer == null) {
					if (!aBool2263) {
						method4040(Class342.aClass342_3642);
						anInterface37_2205.method172(1218735607);
						aBool2263 = true;
					}
					return;
				}
				aBool2263 = false;
				aBool2235 = true;
				aList2206.remove(0);
				method4054(buffer);
			}
			method4069();
		}
	}

	Buffer method4074(int i) {
		return new Buffer(i, true);
	}

	int method4075() {
		return anInt2239;
	}

	int method4081(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255) {
			return 255;
		}
		if (i < 0) {
			return 0;
		}
		return i;
	}

	int method4084() {
		if (method244()) {
			return anInt2268;
		}
		throw new RuntimeException("");
	}

	void method4099(Class225 class225) {
		if (class225 != null) {
			synchronized (aClass168_2234) {
				class225.aBool2348 = false;
			}
		}
	}

	void method4103(byte[] is, int i) {
		aByteArray2241 = is;
		anInt2265 = i;
		anInt2237 = 0;
	}

	int method4105(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767) {
			return 32767;
		} else if (i < -32768) {
			return -32768;
		}
		return i;
	}

	synchronized void method4117(boolean bool) {
		aBool2225 = bool;
	}

	int method4119(int i) {
		int i_184_ = 0;
		int i_185_ = 0;
		int i_186_;
		for (; i >= 8 - anInt2237; i -= i_186_) {
			i_186_ = 8 - anInt2237;
			int i_187_ = (1 << i_186_) - 1;
			i_184_ += (aByteArray2241[anInt2265] >> anInt2237 & i_187_) << i_185_;
			anInt2237 = 0;
			anInt2265++;
			i_185_ += i_186_;
		}
		if (i > 0) {
			i_186_ = (1 << i) - 1;
			i_184_ += (aByteArray2241[anInt2265] >> anInt2237 & i_186_) << i_185_;
			anInt2237 += i;
		}
		return i_184_;
	}

	void method4122(Class225[] class225s) {
		if (class225s != null) {
			for (Class225 class225 : class225s) {
				method4099(class225);
			}
		}
	}

	boolean isVorbis(byte[] data, int i, int i_188_) {
		if (data[i] != i_188_) {
			return false;
		}

		return !(data[i + 1] != 'v' || data[i + 2] != 'o' || data[i + 3] != 'r' || data[i + 4] != 'b'
				|| data[i + 5] != 'i' || data[i + 6] != 's');
	}
}
