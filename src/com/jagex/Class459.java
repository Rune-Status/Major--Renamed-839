package com.jagex;

public class Class459 {

	public static final void method7672() {
		BufferedConnectionContext connection = Client.getActiveConnection();
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3956, connection.encryptor);
		frame.payload.writeByte(0);
		connection.sendFrame(frame);
	}

	int anInt5162;
	boolean aBool5163;
	float aFloat5164;
	float aFloat5165;
	float[] aFloatArray5166;
	boolean aBool5167;
	int anInt5168;
	float aFloat5169;
	boolean aBool5170;
	int anInt5171;
	int anInt5172;
	int anInt5173;
	int anInt5174;
	Class343 aClass343_5175;
	int anInt5176;
	Object anObject5177;
	int anInt5178;
	int anInt5179;
	int[] anIntArray5180;
	int anInt5181;
	float aFloat5182;
	int[] anIntArray5183;
	Class453[] aClass453Array5184;
	long aLong5185;
	int anInt5186;
	boolean aBool5187;
	Class454 aClass454_5188;
	Interface34 anInterface34_5189;
	Interface53 anInterface53_5190;
	boolean aBool5191;
	int[] anIntArray5192;
	byte[] aByteArray5193;
	int anInt5194 = 0;
	int anInt5195 = 0;
	int anInt5196 = 0;
	Object anObject5197;
	int anInt5198 = 0;
	int anInt5199 = 0;
	Interface52 anInterface52_5200;
	int anInt5201 = 0;
	float aFloat5202;
	boolean aBool5203;
	int anInt5204;
	long aLong5205;
	int anInt5206;
	float aFloat5207;
	int anInt5208;
	boolean aBool5209;
	boolean aBool5210;
	int anInt5211;
	boolean aBool5212;

	public Class459(Class457 class457, int i, int i_53_, Interface34 interface34, Class343 class343) {
		aFloat5182 = 0.0F;
		aLong5205 = 0L;
		aLong5185 = 0L;
		aFloat5207 = 0.0F;
		anInt5208 = 0;
		anInt5211 = 0;
		aClass343_5175 = class343;
		method7609(Class454.aClass454_5106);
		anInt5174 = i * -479914391;
		anInt5172 = 1612841745 * i_53_;
		anInterface34_5189 = interface34;
		anInt5176 = 0;
		aBool5191 = false;
		anInterface34_5189.method235(new Class449(this));
		method7586();
	}

	public Class454 method7548() {
		return aClass454_5188;
	}

	public void method7552() {
		if (method7548().anInt5107 * -765352615 >= -765352615 * Class454.aClass454_5103.anInt5107) {
			throw new RuntimeException("");
		}

		method7609(Class454.aClass454_5103);
	}

	public void method7553() {
		if (method7548().anInt5107 * -765352615 < Class454.aClass454_5103.anInt5107 * -765352615) {
			throw new RuntimeException("");
		}

		anObject5197 = null;
		method7609(Class454.aClass454_5101);
	}

	public void method7558() {
		synchronized (this) {
			if (method7548() == Class454.aClass454_5099
					|| method7548().anInt5107 * -765352615 < -765352615 * Class454.aClass454_5103.anInt5107) {

			} else {
				method7609(Class454.aClass454_5099);
			}
		}
	}

	public float method7562() {
		return aFloat5202;
	}

	public boolean method7564() {
		return aBool5203;
	}

	public void method7576() {
		synchronized (this) {
			if (aBool5212) {

			} else if (anObject5177 == null) {

			} else {
				int i_37_ = aClass343_5175.method5889(anObject5177, 741042246);
				if (i_37_ <= 0) {

				} else if (aClass453Array5184 != null && aClass453Array5184[-93220855 * anInt5176] != null && aBool5170) {
					int i_38_ = i_37_ + 1616882453 * anInt5194 > -165875887
							* aClass453Array5184[-93220855 * anInt5176].buffer.offset ? aClass453Array5184[-93220855
							* anInt5176].buffer.offset
							* -165875887 - anInt5194 * 1616882453
							: i_37_;
					if (1616882453 * anInt5194 < aClass453Array5184[-93220855 * anInt5176].anInt5093 * -277979871
							&& anInt5194 * 1616882453 + i_38_ > aClass453Array5184[anInt5176 * -93220855].anInt5093
									* -277979871
							&& aClass453Array5184[anInt5176 * -93220855].anInt5093 * -277979871 >= 0) {
						anInt5194 += aClass453Array5184[anInt5176 * -93220855].anInt5093 * 1584659677 - 1 * anInt5194;
						i_38_ = 1616882453 * anInt5194 + i_37_ > aClass453Array5184[anInt5176 * -93220855].buffer.offset
								* -165875887 ? -165875887
								* aClass453Array5184[-93220855 * anInt5176].buffer.offset - 1616882453
								* anInt5194 : i_37_;
					}
					if (anInt5194 * 1616882453 + i_38_ > 1143175765 * aClass453Array5184[anInt5176 * -93220855].anInt5094
							&& 1143175765 * aClass453Array5184[-93220855 * anInt5176].anInt5094 >= 0) {
						i_38_ = 1143175765 * aClass453Array5184[-93220855 * anInt5176].anInt5094 - anInt5194
								* 1616882453;
					}
					method7577(aClass453Array5184[anInt5176 * -93220855].buffer.payload,
							anInt5194 * 1616882453, i_38_ + 1616882453 * anInt5194, -1954323298);
					aClass343_5175.method5876(anObject5177,
							aClass453Array5184[-93220855 * anInt5176].buffer.payload,
							anInt5194 * 1616882453, i_38_, 641651434);
					anInt5194 += 725765181 * i_38_;
					i_37_ -= i_38_;
					if (anInt5194 * 1616882453 >= -165875887
							* aClass453Array5184[-93220855 * anInt5176].buffer.offset
							|| 1616882453 * anInt5194 >= 1143175765 * aClass453Array5184[-93220855 * anInt5176].anInt5094
							&& 1143175765 * aClass453Array5184[anInt5176 * -93220855].anInt5094 >= 0) {
						aClass453Array5184[-93220855 * anInt5176].method7413();
						aClass453Array5184[-93220855 * anInt5176] = null;
						anInt5176 += 1759444537;
						anInt5176 = -93220855 * anInt5176 % aClass453Array5184.length * 1759444537;
						anInt5194 = 0;
					}
				}
			}
		}
	}

	public void method7580() {
		if (method7548().anInt5107 * -765352615 >= -765352615 * Class454.aClass454_5098.anInt5107
				&& method7548().anInt5107 * -765352615 < Class454.aClass454_5099.anInt5107 * -765352615 && method7560()) {
			synchronized (this) {
				anInterface34_5189.method170();
				method7574();
			}
			Thread.yield();
		}
	}

	public void method7631() {
		synchronized (this) {
			method7566(-1642502570);
		}
	}

	boolean method7550() {
		return aClass454_5188 == Class454.aClass454_5099;
	}

	boolean method7551() {
		return aClass454_5188 == Class454.aClass454_5105;
	}

	float method7555() {
		return aFloat5164;
	}

	boolean method7556(byte[] is, Interface53 interface53, int i, float f, boolean bool, boolean bool_0_, int i_1_,
			float f_2_, Object object) {
		synchronized (this) {
			if (interface53 != null) {
				aByteArray5193 = null;
				anInterface53_5190 = interface53;
			} else {
				aByteArray5193 = is;
			}
			anObject5197 = object;
			anInt5171 = i * -425103327;
			aFloat5164 = f;
			aBool5167 = bool_0_;
			anInt5168 = -1310306751 * i_1_;
			aFloat5169 = f_2_;
			byte[] is_4_ = null;
			if (null != aByteArray5193) {
				is_4_ = aByteArray5193;
			} else if (anInterface53_5190 != null) {
				anInt5204 = 0;
				is_4_ = anInterface53_5190.method349(-1872333597 * anInt5204, (byte) -66);
			}
			if (null != is_4_) {
				Buffer buffer = new Buffer(is_4_);
				if (buffer.readUByte() != 74 || buffer.readUByte() != 65 || buffer.readUByte() != 71
						|| buffer.readUByte() != 65) {
					throw new RuntimeException("");
				}
				anInt5178 = buffer.readInt() * 1384976781;
				anInt5179 = buffer.readInt() * 2128962551;
				anInt5181 = buffer.readInt() * 1223611801;
				anInt5162 = buffer.readInt() * -2015350941;
				anInt5206 = buffer.readInt() * -672802703;
				if (anObject5177 == null) {
					anObject5177 = aClass343_5175.method5874(anInt5162 * 180013643, anInt5181 * 1757392553,
							anInterface34_5189.method280(), anInterface34_5189.method237(), anInt5174 * 615111129,
							aFloat5169, (byte) 44);
					if (null == anObject5177) {
						method7609(Class454.aClass454_5105);
						boolean bool_5_ = false;
						return bool_5_;
					}
				}
				anIntArray5183 = new int[anInt5206 * 2051729553];
				anIntArray5180 = new int[anInt5206 * 2051729553];
				anIntArray5192 = new int[2051729553 * anInt5206];
				int i_6_ = -766032760 * anInt5206 + -165875887 * buffer.offset;
				for (int i_7_ = 0; i_7_ < anInt5206 * 2051729553; i_7_++) {
					anIntArray5183[i_7_] = i_6_;
					anIntArray5180[i_7_] = buffer.readInt();
					anIntArray5192[i_7_] = buffer.readInt();
					i_6_ += anIntArray5180[i_7_];
				}
				anInt5186 = -2135087597 * buffer.offset;
				aClass453Array5184 = new Class453[anInt5172 * -2044768783];
				aFloatArray5166 = new float[2];
				for (int i_8_ = 0; i_8_ < aFloatArray5166.length; i_8_++) {
					aFloatArray5166[i_8_] = 1.0F;
				}
				if (anObject5197 instanceof Class456) {
					Interface66 interface66 = ((Class456) anObject5197).method7444();
					aBool5209 = interface66.method442();
					aBool5210 = !aBool5209;
				}
				anInterface34_5189.method246(aBool5210, aBool5167 ? anInt5168 * -396312127 : 0, anInt5178 * 112302405,
						anInt5179 * -2066592313);
				if (anInterface53_5190 != null) {
					int i_9_ = buffer.payload.length - 618008971 * anInt5186;
					byte[] is_10_ = ByteArrayPool.get(i_9_, true);
					System.arraycopy(buffer.payload, 618008971 * anInt5186, is_10_, 0, i_9_);
					buffer.payload = is_10_;
					buffer.offset = 1258142129 * i_9_;
					anInterface34_5189.method22(buffer);
					anInt5204 += 910848203;
				} else {
					aBool5191 = true;
				}
				boolean bool_11_ = true;
				return bool_11_;
			}
			return false;
		}
	}

	void method7557() {
		synchronized (this) {
			method7569((byte) 16);
		}
	}

	void method7559(Interface52 interface52) {
		anInterface52_5200 = interface52;
		if (null != anInterface52_5200) {
			anInterface52_5200.method345(anObject5197, aFloatArray5166, null, -1346983139);
		}
	}

	boolean method7560() {
		if (aFloatArray5166 == null) {
			return false;
		}
		float f = 0.0F;
		float f_13_ = 0.0F;
		for (float f_15_ : aFloatArray5166) {
			if (aFloat5164 * f_15_ > f) {
				f = f_15_;
			}
			if (f_15_ > f_13_) {
				f_13_ = f_15_;
			}
		}
		if (f < 1.0E-5F) {
			return f_13_ >= 1.0E-5F && aFloat5182 >= 1.0E-5F;
		}
		return true;
	}

	void method7563(float f) {
		synchronized (this) {
			aFloat5202 = f;
		}
	}

	void method7566(int i) {
		if (method7548().anInt5107 * -765352615 >= -765352615 * Class454.aClass454_5098.anInt5107) {
			if (method7548() == Class454.aClass454_5101) {
				method7568((byte) 74);
			} else {
				method7567(169042312);
				if (aFloat5182 != aFloat5164) {
					long l = TimeUtil.time();
					if (l > aLong5205 * 119662195554387111L) {
						aFloat5164 = aFloat5182;
					} else {
						float f = aFloat5182 - aFloat5207;
						long l_16_ = 119662195554387111L * aLong5205 - 5348351787556755545L * aLong5185;
						float f_17_ = f / l_16_;
						aFloat5164 = aFloat5207 + (l - 5348351787556755545L * aLong5185) * f_17_;
						aFloat5164 = Math.max(0.0F, Math.min(1.0F, aFloat5164));
					}
				}
				method7663(729037184);
				if (method7548().anInt5107 * -765352615 < Class454.aClass454_5099.anInt5107 * -765352615) {
					method7570(65536);
				}
			}
		}
	}

	void method7567(int i) {
		synchronized (this) {
			int i_18_ = method7593(-2144155475);
			if (aBool5209 && i_18_ > anInt5208 * -533674933 && anInterface34_5189.method244()) {

			} else {
				Class342 class342 = anInterface34_5189.method234();
				if (aBool5191 && class342 != Class342.aClass342_3644) {
					if (null != aByteArray5193) {
						if (521479551 * anInt5198 >= 2051729553 * anInt5206) {
							anInterface34_5189.method22(null);
							anInt5198 = 0;
						} else {
							if (anInt5173 * -1310281223 < 618008971 * anInt5186) {
								anInt5173 = 54050979 * anInt5186;
							}
							anInt5173 = -859750327 * (anIntArray5183[anInt5198 * 521479551] + 507542975 * anInt5201);
							int i_19_ = anIntArray5180[521479551 * anInt5198];
							int i_20_ = i_19_;
							int i_21_ = anInt5201 * 507542975 + i_20_ > i_19_ ? anIntArray5183[anInt5198 * 521479551]
									+ i_19_ : i_20_ + anInt5173 * -1310281223;
							Class459 class459_22_ = this;
							class459_22_.anInt5201 = class459_22_.anInt5201
									+ -698453441
									* (anInt5173 * -1310281223 + i_20_ > aByteArray5193.length ? aByteArray5193.length
											- anInt5173 * -1310281223 : i_20_);
							Buffer buffer = new Buffer(i_21_ - -1310281223 * anInt5173, true);
							if (null == aByteArray5193) {
								throw new RuntimeException("");
							}
							if (null == buffer.payload) {
								throw new RuntimeException("");
							}
							buffer.writeBytes(aByteArray5193, anInt5173 * -1310281223, i_21_ - anInt5173 * -1310281223);
							anInterface34_5189.method22(buffer);
							method7575(false);
							if (507542975 * anInt5201 >= i_19_) {
								anInt5198 += -435381633;
								anInt5201 = 0;
							}
						}
					} else if (anInterface53_5190 != null) {
						if (-1872333597 * anInt5204 >= anInt5206 * 2051729553) {
							anInt5204 = 0;
							anInterface34_5189.method22(null);
						} else {
							byte[] is = anInterface53_5190
									.method349(anIntArray5192[anInt5204 * -1872333597], (byte) -6);
							if (is != null) {
								Buffer buffer = new Buffer(is);
								buffer.offset = is.length * 1258142129;
								anInterface34_5189.method22(buffer);
								method7575(false);
								anInt5204 += 910848203;
							}
						}
					}
				}
			}
		}
	}

	void method7568(byte i) {
		synchronized (this) {
			if (anInterface34_5189.method234() == Class342.aClass342_3646) {
				if (null != anObject5177) {
					int i_23_ = aClass343_5175.method5889(anObject5177, -486620588);
					if (i_23_ >= 615111129 * anInt5174) {
						aClass343_5175.method5904(anObject5177, -1706454812);
						anObject5177 = null;
						method7609(Class454.aClass454_5106);
					}
				} else {
					method7609(Class454.aClass454_5106);
				}
			}
		}
		method7586();
	}

	void method7569(byte i) {
		if (method7548() != Class454.aClass454_5099
				&& method7548().anInt5107 * -765352615 < -765352615 * Class454.aClass454_5098.anInt5107) {
			method7609(Class454.aClass454_5098);
			aBool5187 = true;
			method7570(65536);
			method7663(729037184);
		}
	}

	void method7570(int i) {
		if (true == aBool5187 && method7548().anInt5107 * -765352615 >= -765352615 * Class454.aClass454_5098.anInt5107
				&& method7548().anInt5107 * -765352615 < Class454.aClass454_5105.anInt5107 * -765352615
				&& null != anInterface52_5200 && aFloat5182 == aFloat5164) {
			anInterface52_5200.method345(anObject5197, aFloatArray5166, null, -1346983139);
		}
	}

	void method7571() {
		aBool5212 = true;
	}

	void method7572() {
		aBool5212 = false;
	}

	boolean method7573(byte i) {
		synchronized (this) {
			if (null != anObject5197 && anObject5197 instanceof Class456) {
				Class456 class456 = (Class456) anObject5197;
				Interface66 interface66 = class456.method7444();
				if (null != interface66) {
					boolean bool = interface66.method450();
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method7574() {
		if (null != aClass453Array5184) {
			boolean bool = true;
			Class342 class342 = anInterface34_5189.method234();
			if (anInterface34_5189.method244()) {
				if (aBool5209 && method7581(-533674933 * anInt5208, (short) -20964)) {
					if (null == aClass453Array5184[anInt5199 * -1137038873]) {
						Buffer buffer = method7616(anInt5208 * -533674933, (byte) 0);
						if (buffer != null) {
							aClass453Array5184[anInt5199 * -1137038873] = new Class453(this, buffer, false);
							int i_24_ = anInterface34_5189.method238();
							int i_25_ = anInterface34_5189
									.method159(aClass453Array5184[anInt5199 * -1137038873].buffer.offset
											* -165875887 / i_24_);
							anInt5195 += -1248339213 * i_25_;
							if (false == aBool5210 && aBool5167 && anInt5211 * 1071708631 > 0) {
								if (1596706363 * anInt5195 < anInt5178 * 112302405) {
									aClass453Array5184[-1137038873 * anInt5199] = null;
								} else if (anInt5195 * 1596706363 >= 112302405 * anInt5178
										&& 1596706363 * anInt5195 - i_25_ < anInt5178 * 112302405) {
									aClass453Array5184[anInt5199 * -1137038873].anInt5093 = anInterface34_5189
											.method279(i_24_ * (1596706363 * anInt5195 - 112302405 * anInt5178))
											* -582654239;
								}
							}
							anInt5208 += 1049093475;
							if (false == aBool5210 && aBool5167 && anInt5195 * 1596706363 >= anInt5179 * -2066592313
									&& (1071708631 * anInt5211 < anInt5168 * -396312127 || -396312127 * anInt5168 < 0)) {
								int i_26_ = anInt5195 * 1596706363 - -2066592313 * anInt5179;
								int i_27_ = i_25_ - i_26_;
								aClass453Array5184[anInt5199 * -1137038873].anInt5094 = anInterface34_5189
										.method279(i_27_ * i_24_) * 1499312893;
								anInt5208 = 0;
								anInt5195 = 0;
								anInt5211 += -608564761;
							}
							if (null != aClass453Array5184[anInt5199 * -1137038873]) {
								anInt5199 += -1257317929;
								anInt5199 = anInt5199 * -1137038873 % aClass453Array5184.length * -1257317929;
							}
						}
					}
				} else if (!method7573((byte) 24) || !aBool5209) {
					int i_28_ = anInterface34_5189.method48();
					int i_29_ = anInterface34_5189.method159(615111129 * anInt5174);
					if (false == aBool5163 && null == aClass453Array5184[anInt5199 * -1137038873]) {
						if (class342 != Class342.aClass342_3645 && i_28_ > 0) {
							Buffer buffer = method7589(i_29_, (byte) -42);
							aClass453Array5184[anInt5199 * -1137038873] = buffer != null ? new Class453(this, buffer,
									false) : null;
							int i_30_ = aClass453Array5184[anInt5199 * -1137038873] != null ? -165875887
									* aClass453Array5184[anInt5199 * -1137038873].buffer.offset : 0;
							int i_31_ = anInterface34_5189.method238();
							int i_32_ = anInterface34_5189.method159(i_30_ / i_31_);
							anInt5196 += 1620249569 * i_32_;
							if (-1095075807 * anInt5196 > 1596706363 * anInt5195) {
								anInt5195 += i_32_ * -1248339213;
								i_28_ -= i_32_;
								if (false == aBool5210 && aBool5167 && anInt5211 * 1071708631 > 0) {
									if (1596706363 * anInt5195 < anInt5178 * 112302405) {
										aClass453Array5184[-1137038873 * anInt5199] = null;
									} else if (1596706363 * anInt5195 >= 112302405 * anInt5178
											&& 1596706363 * anInt5195 - i_32_ < anInt5178 * 112302405) {
										aClass453Array5184[anInt5199 * -1137038873].anInt5093 = anInterface34_5189
												.method279(i_31_ * (1596706363 * anInt5195 - anInt5178 * 112302405))
												* -582654239;
									}
								}
								if (aClass453Array5184[-1137038873 * anInt5199] != null) {
									if (aBool5209 && !method7581(anInt5208 * -533674933, (short) -29808)) {
										method7618(aClass453Array5184[anInt5199 * -1137038873].buffer,
												(byte) 98);
									}
									if (false == aBool5210
											&& aBool5167
											&& anInt5195 * 1596706363 >= -2066592313 * anInt5179
											&& (anInt5211 * 1071708631 <= anInt5168 * -396312127 || anInt5168
													* -396312127 < 0)) {
										int i_33_ = 1596706363 * anInt5195 - anInt5179 * -2066592313;
										int i_34_ = i_32_ - i_33_;
										aClass453Array5184[anInt5199 * -1137038873].anInt5094 = anInterface34_5189
												.method279(i_34_ * i_31_) * 1499312893;
										anInt5208 = 0;
										anInt5211 += -608564761;
										anInt5195 = 0;
									} else {
										anInt5208 += 1049093475;
									}
									anInt5199 += -1257317929;
									anInt5199 = anInt5199 * -1137038873 % aClass453Array5184.length * -1257317929;
								}
							} else {
								aClass453Array5184[-1137038873 * anInt5199] = null;
							}
						} else if (class342 == Class342.aClass342_3645 && aBool5167 && false == aBool5210
								&& (1071708631 * anInt5211 < anInt5168 * -396312127 || -396312127 * anInt5168 < 0)) {
							anInterface34_5189.method239(true);
						}
					}
				}
			}
			int i_35_ = 0;
			for (Class453 element : aClass453Array5184) {
				if (null != element) {
					i_35_++;
					bool = false;
				}
			}
			if (!aBool5170
					&& method7562() >= 0.0F
					&& (i_35_ >= -2044768783 * anInt5172 || Class342.aClass342_3645 == class342 || Class342.aClass342_3644 == class342)) {
				aBool5170 = true;
				method7609(Class454.aClass454_5104);
			}
			if (anInterface34_5189.method244()
					&& bool
					&& (method7573((byte) -22) || aBool5163 || Class342.aClass342_3645 == class342)
					&& (!aBool5167 || !aBool5210 && anInt5211 * 1071708631 >= anInt5168 * -396312127
							&& -396312127 * anInt5168 >= 0)) {
				method7609(Class454.aClass454_5105);
				aBool5187 = false;
				if (aBool5209) {
					method7657(-1290680924);
				}
			}
		}
	}

	void method7575(boolean bool) {
		aBool5191 = bool;
	}

	void method7577(byte[] is, int i, int i_39_, int i_40_) {
		int i_41_ = i;
		int i_42_ = 0;
		int i_43_ = anInterface34_5189.method280().anInt3617 * 1502392487;
		while (i_41_ < is.length && i_41_ < i_39_) {
			float f = aFloat5165 * aFloat5164 * aFloatArray5166[i_42_];
			if (i_43_ == 16) {
				int i_44_ = (is[i_41_] & 0xff) + (is[i_41_ + 1] << 8);
				i_44_ *= f * f;
				is[i_41_++] = (byte) i_44_;
				is[i_41_++] = (byte) (i_44_ >> 8);
			} else if (i_43_ == 8) {
				byte i_45_ = is[i_41_];
				i_45_ *= f;
				is[i_41_++] = i_45_;
			} else {
				throw new RuntimeException("");
			}
			i_42_ = ++i_42_ % aFloatArray5166.length;
		}
	}

	boolean method7581(int i, short i_46_) {
		if (null != anObject5197 && anObject5197 instanceof Class456) {
			Class456 class456 = (Class456) anObject5197;
			Interface66 interface66 = class456.method7444();
			return interface66.method422(i);
		}
		return false;
	}

	Object method7585() {
		return anObject5197;
	}

	void method7586() {
		synchronized (this) {
			aByteArray5193 = null;
			anInt5171 = 0;
			aFloat5164 = 0.0F;
			aFloat5165 = 0.0F;
			aBool5167 = false;
			anInt5168 = 0;
			aFloat5169 = 1.0F;
			anInterface53_5190 = null;
			anInt5204 = 0;
			anInt5173 = 0;
			if (null != aClass453Array5184) {
				for (Class453 element : aClass453Array5184) {
					if (null != element) {
						element.method7413();
					}
				}
			}
			aClass453Array5184 = null;
			aBool5209 = false;
			anInt5176 = 0;
			anInt5178 = 0;
			anInt5179 = 0;
			anInt5162 = 0;
			anInt5181 = 0;
			anInt5206 = 0;
			anIntArray5183 = null;
			anIntArray5180 = null;
			anIntArray5192 = null;
			anInt5186 = 0;
			aBool5187 = false;
			anInterface34_5189.method233();
			aBool5191 = false;
			anInterface52_5200 = null;
			anObject5197 = null;
			anInt5194 = 0;
			anInt5195 = 0;
			anInt5196 = 0;
			aBool5163 = false;
			anInt5198 = 0;
			anInt5199 = 0;
			aBool5170 = false;
			anInt5201 = 0;
			method7563(-1.0F);
			aBool5203 = false;
			aFloat5182 = 0.0F;
			aLong5205 = 0L;
			aLong5185 = 0L;
			aFloat5207 = 0.0F;
			anInt5208 = 0;
			anInt5211 = 0;
		}
	}

	Buffer method7589(int i, byte i_48_) {
		return anInterface34_5189.method241(i);
	}

	void method7592(float f, int i) {
		if (i <= 0) {
			aFloat5164 = f;
			aFloat5182 = aFloat5164;
			aLong5185 = 0L;
			aLong5205 = 0L;
		} else {
			aFloat5207 = aFloat5164;
			aFloat5182 = f;
			aLong5185 = TimeUtil.time() * -4202955592658817047L;
			aLong5205 = -6152224638102052073L * (5348351787556755545L * aLong5185 + i);
		}
	}

	int method7593(int i) {
		if (anObject5197 != null && anObject5197 instanceof Class456) {
			Class456 class456 = (Class456) anObject5197;
			Interface66 interface66 = class456.method7444();
			return interface66.method429(-600923344);
		}
		return 0;
	}

	void method7609(Class454 class454) {
		aClass454_5188 = class454;
	}

	Buffer method7616(int i, byte i_50_) {
		if (null != anObject5197 && anObject5197 instanceof Class456) {
			Class456 class456 = (Class456) anObject5197;
			Interface66 interface66 = class456.method7444();
			Buffer buffer = interface66.method420(i);
			Buffer buffer_51_ = new Buffer(-165875887 * buffer.offset, true);
			buffer_51_.writeBuffer(buffer);
			return buffer_51_;
		}
		return null;
	}

	void method7618(Buffer buffer, byte i) {
		if (anObject5197 != null && anObject5197 instanceof Class456) {
			Class456 class456 = (Class456) anObject5197;
			Interface66 interface66 = class456.method7444();
			byte[] is = new byte[-165875887 * buffer.offset];
			System.arraycopy(buffer.payload, 0, is, 0, buffer.offset * -165875887);
			Buffer buffer_52_ = new Buffer(is);
			buffer_52_.offset = buffer.offset * 1;
			interface66.method412(buffer_52_);
		}
	}

	void method7657(int i) {
		synchronized (this) {
			if (null != anObject5197 && anObject5197 instanceof Class456) {
				Class456 class456 = (Class456) anObject5197;
				Interface66 interface66 = class456.method7444();
				if (interface66 != null) {
					interface66.method447(true);
				}
			}
		}
	}

	void method7663(int i) {
		Class326 class326 = aClass343_5175.method5888().method5845(anInt5171 * -1585310751);
		aFloat5165 = null != class326 ? class326.method5794(1278752590) : 1.0F;
		float f = class326 != null ? class326.method5779(-2094998409) : 0.1F;
		f *= aFloat5164;
		float f_54_ = aFloatArray5166.length > 0 ? 0.0F : 1.0F;
		for (float element : aFloatArray5166) {
			if (element > f_54_) {
				f_54_ = element;
			}
		}
		f *= f_54_;
		if (!method7560()) {
			f = -1.0F;
		}
		if (method7562() != f) {
			method7563(f);
			aBool5203 = true;
		}
	}

}