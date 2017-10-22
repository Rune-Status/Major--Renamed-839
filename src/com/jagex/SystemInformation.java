package com.jagex;

import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

public class SystemInformation extends Linkable {
	static final int anInt10386 = 10;
	static final int anInt10387 = 3;
	static final int anInt10388 = 2;
	static final int anInt10389 = 3;
	static final int anInt10390 = 4;
	static final int anInt10394 = 2;
	static final int anInt10395 = 1;
	static final int anInt10396 = 4;
	public static final int anInt10397 = 0;
	static final int anInt10398 = 6;
	static final int anInt10399 = 7;
	static final int anInt10400 = 8;
	static final int anInt10401 = 9;
	static final int anInt10402 = 1;
	static final int anInt10403 = 25;
	static final int anInt10404 = 21;
	static final int anInt10405 = 22;
	static final int anInt10410 = 26;
	static final int anInt10412 = 2;
	static final int anInt10413 = 3;
	static final int anInt10414 = 4;
	static final int anInt10415 = 5;
	static final int anInt10416 = 5;
	static final int anInt10420 = 7;
	static final int anInt10422 = 1;
	static final int anInt10424 = 20;
	static final int anInt10432 = 24;
	static final int anInt10434 = 0;
	static final int anInt10435 = 23;

	int versionType;
	boolean aBool10392;
	boolean aBool10393;
	int vendorType;
	int osType;
	public int anInt10408;
	String aString10409;
	int anInt10411;
	int javaMajorVersion;
	int javaMinorVersion;
	int javaPatchVersion;
	int heapSize;
	int processorCount;
	int anInt10425;
	int anInt10426;
	String aString10427;
	String aString10428;
	String directXVersion;
	String aString10430;
	int anInt10431;
	int anInt10433;
	String aString10436;
	int[] anIntArray10437 = new int[3];
	int anInt10438;
	String aString10439;

	public SystemInformation(boolean bool) {
		if (bool) {
			if (Class189.osName.startsWith("win")) {
				osType = 331342887;
			} else if (Class189.osName.startsWith("mac")) {
				osType = 662685774;
			} else if (Class189.osName.startsWith("linux")) {
				osType = 994028661;
			} else {
				osType = 1325371548;
			}

			aBool10392 = IntRaster.architecture.startsWith("amd64") || IntRaster.architecture.startsWith("x86_64");
			if (-52474985 * osType == 1) {
				if (Class343_Sub2.osVersion.indexOf("4.0") != -1) {
					versionType = -1041422399;
				} else if (Class343_Sub2.osVersion.indexOf("4.1") != -1) {
					versionType = -2082844798;
				} else if (Class343_Sub2.osVersion.indexOf("4.9") != -1) {
					versionType = 1170700099;
				} else if (Class343_Sub2.osVersion.indexOf("5.0") != -1) {
					versionType = 129277700;
				} else if (Class343_Sub2.osVersion.indexOf("5.1") != -1) {
					versionType = -912144699;
				} else if (Class343_Sub2.osVersion.indexOf("5.2") != -1) {
					versionType = 258555400;
				} else if (Class343_Sub2.osVersion.indexOf("6.0") != -1) {
					versionType = -1953567098;
				} else if (Class343_Sub2.osVersion.indexOf("6.1") != -1) {
					versionType = 1299977799;
				} else if (Class343_Sub2.osVersion.indexOf("6.2") != -1) {
					versionType = -782866999;
				} else if (Class343_Sub2.osVersion.indexOf("6.3") != -1) {
					versionType = -1824289398;
				}
			} else if (2 == osType * -52474985) {
				if (Class343_Sub2.osVersion.indexOf("10.4") != -1) {
					versionType = 646388500;
				} else if (Class343_Sub2.osVersion.indexOf("10.5") != -1) {
					versionType = -395033899;
				} else if (Class343_Sub2.osVersion.indexOf("10.6") != -1) {
					versionType = -1436456298;
				} else if (Class343_Sub2.osVersion.indexOf("10.7") != -1) {
					versionType = 1817088599;
				} else if (Class343_Sub2.osVersion.indexOf("10.8") != -1) {
					versionType = 775666200;
				} else if (Class343_Sub2.osVersion.indexOf("10.9") != -1) {
					versionType = -265756199;
				} else if (Class343_Sub2.osVersion.indexOf("10.10") != -1) {
					versionType = -1307178598;
				}
			}

			if (TextureMetricsList.javaVendor.toLowerCase().indexOf("sun") != -1) {
				vendorType = -2032507911;
			} else if (TextureMetricsList.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
				vendorType = 229951474;
			} else if (TextureMetricsList.javaVendor.toLowerCase().indexOf("apple") != -1) {
				vendorType = -1802556437;
			} else if (TextureMetricsList.javaVendor.toLowerCase().indexOf("oracle") != -1) {
				vendorType = -1572604963;
			} else {
				vendorType = 459902948;
			}

			int packed = 0;
			try {
				for (int index = 2; index < LatencyMonitor.javaVersion.length(); index++) {
					char character = LatencyMonitor.javaVersion.charAt(index);
					if (character < 48 || character > 57) {
						break;
					}

					packed = 10 * packed + character - 48;
				}
			} catch (Exception exception) {

			}

			javaMajorVersion = packed * 2137411585;
			packed = 0;

			try {
				for (int index = LatencyMonitor.javaVersion.indexOf('.', 2) + 1; index < LatencyMonitor.javaVersion
						.length(); index++) {
					char character = LatencyMonitor.javaVersion.charAt(index);
					if (character < 48 || character > 57) {
						break;
					}

					packed = 10 * packed + character - 48;
				}
			} catch (Exception exception) {

			}

			javaMinorVersion = packed * -727910181;
			packed = 0;

			try {
				for (int index = LatencyMonitor.javaVersion.indexOf('_', 4) + 1; index < LatencyMonitor.javaVersion
						.length(); index++) {
					char character = LatencyMonitor.javaVersion.charAt(index);
					if (character < 48 || character > 57) {
						break;
					}
					packed = 10 * packed + character - 48;
				}
			} catch (Exception exception) {

			}

			javaPatchVersion = 1186182985 * packed;
			aBool10393 = false;
			heapSize = Engine.heapSize * 108230103;

			if (1503244289 * javaMajorVersion > 3) {
				processorCount = Engine.processorCount * -2099484633;
			} else {
				processorCount = 0;
			}

			try {
				int[] info = HardwareInfo.getCPUInfo();
				if (null != info && info.length == 3) {
					anInt10433 = info[0] * 1899334599;
					anInt10426 = info[1] * -707023713;
					anInt10408 = info[2] * 696568413;
				}

				int[] raw = HardwareInfo.getRawCPUInfo();
				if (raw != null && raw.length % 5 == 0) {
					HashMap<Integer, ProcessorInformation> hashmap = new HashMap<Integer, ProcessorInformation>();
					for (int index = 0; index < raw.length / 5; index++) {
						int i_8_ = raw[5 * index];
						int i_9_ = raw[1 + index * 5];
						int i_10_ = raw[5 * index + 2];
						int i_11_ = raw[3 + index * 5];
						int i_12_ = raw[4 + 5 * index];

						ProcessorInformation class665 = new ProcessorInformation(i_8_, i_9_, i_10_, i_11_, i_12_);
						hashmap.put(Integer.valueOf(i_8_), class665);
					}

					ProcessorInformation class665 = hashmap.get(Integer.valueOf(0));
					if (class665 != null) {
						Buffer buffer = new Buffer(13);
						buffer.writeLEInt(class665.anInt8395 * 1482992217);
						buffer.writeLEInt(309196585 * class665.anInt8393);
						buffer.writeLEInt(class665.anInt8397 * -569581273);
						buffer.offset = 0;
						aString10427 = buffer.readString();
					}

					ProcessorInformation class665_13_ = hashmap.get(Integer.valueOf(1));
					if (null != class665_13_) {
						anInt10438 = class665_13_.anInt8394 * 823007235;
						int i_14_ = 1482992217 * class665_13_.anInt8395;
						anInt10431 = (i_14_ >> 16 & 0xff) * 2126702771;
						anIntArray10437[0] = class665_13_.anInt8397 * -569581273;
						anIntArray10437[1] = class665_13_.anInt8393 * 309196585;
					}

					ProcessorInformation class665_15_ = hashmap.get(Integer.valueOf(-2147483647));
					if (class665_15_ != null) {
						anIntArray10437[2] = class665_15_.anInt8393 * 309196585;
					}

					Buffer buffer = new Buffer(49);
					for (int i_16_ = -2147483646; i_16_ <= -2147483644; i_16_++) {
						ProcessorInformation class665_17_ = hashmap.get(Integer.valueOf(i_16_));
						if (class665_17_ != null) {
							buffer.writeLEInt(class665_17_.anInt8394 * 1143072555);
							buffer.writeLEInt(class665_17_.anInt8395 * 1482992217);
							buffer.writeLEInt(-569581273 * class665_17_.anInt8397);
							buffer.writeLEInt(309196585 * class665_17_.anInt8393);
						}
					}

					buffer.offset = 0;
					aString10436 = buffer.readString();
				}

				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (strings != null && strings.length > 0 && null != strings[0]) {
					for (int index = 0; index < strings[0].length; index += 2) {
						if (strings[0][index].equalsIgnoreCase("szDescription")) {
							aString10409 = strings[0][1 + index];
						} else if (strings[0][index].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][1 + index];

							try {
								int i_19_ = string.indexOf("/");
								int i_20_ = string.indexOf("/", i_19_ + 1);
								anInt10425 = Integer.parseInt(string.substring(0, i_19_)) * -1722728897;
								anInt10411 = Integer.parseInt(string.substring(i_20_ + 1, string.indexOf(" ", i_20_))) * 537009579;
							} catch (Exception exception) {

							}
						}
					}
				}

				String[] props = HardwareInfo.getDXDiagSystemProps();
				if (props != null) {
					String majorVersion = "";
					String minorVersion = "";
					String letterVersion = "";

					for (int index = 0; index < props.length; index += 2) {
						if (props[index].equalsIgnoreCase("dwDirectXVersionMajor")) {
							majorVersion = props[1 + index];
						} else if (props[index].equalsIgnoreCase("dwDirectXVersionMinor")) {
							minorVersion = props[1 + index];
						} else if (props[index].equalsIgnoreCase("dwDirectXVersionLetter")) {
							letterVersion = props[index + 1];
						}
					}

					directXVersion = new StringBuilder().append(majorVersion).append(".").append(minorVersion)
							.append(letterVersion).toString();
				}

			} catch (Throwable throwable) {
				anInt10408 = 0;
			}
		}

		if (null == aString10409) {
			aString10409 = "";
		}

		if (null == aString10428) {
			aString10428 = "";
		}

		if (directXVersion == null) {
			directXVersion = "";
		}

		if (aString10430 == null) {
			aString10430 = "";
		}

		if (null == aString10427) {
			aString10427 = "";
		}

		if (aString10436 == null) {
			aString10436 = "";
		}

		if (null == aString10439) {
			aString10439 = "";
		}

		method16357();
	}

	public int getEncodedSize() {
		int size = 38;
		size += TimeZoneUtils.method4000(aString10409);
		size += TimeZoneUtils.method4000(aString10428);
		size += TimeZoneUtils.method4000(directXVersion);
		size += TimeZoneUtils.method4000(aString10430);
		size += TimeZoneUtils.method4000(aString10427);
		size += TimeZoneUtils.method4000(aString10436);
		size += TimeZoneUtils.method4000(aString10439);
		return size;
	}

	public void encode(Buffer buffer) {
		buffer.writeByte(7);
		buffer.writeByte(osType * -52474985);
		buffer.writeByte(aBool10392 ? 1 : 0);
		buffer.writeByte(1464002625 * versionType);
		buffer.writeByte(990441033 * vendorType);
		buffer.writeByte(javaMajorVersion * 1503244289);
		buffer.writeByte(javaMinorVersion * 537805651);
		buffer.writeByte(1448798969 * javaPatchVersion);
		buffer.writeByte(aBool10393 ? 1 : 0);
		buffer.writeShort(heapSize * -693791267);
		buffer.writeByte(processorCount * 30815921);
		buffer.writeTriByte(-2033165835 * anInt10408);
		buffer.writeShort(924741471 * anInt10426);
		buffer.writeString(aString10409);
		buffer.writeString(aString10428);
		buffer.writeString(directXVersion);
		buffer.writeString(aString10430);
		buffer.writeByte(anInt10425 * 1533522367);
		buffer.writeShort(1707078915 * anInt10411);
		buffer.writeString(aString10427);
		buffer.writeString(aString10436);
		buffer.writeByte(anInt10433 * 218809847);
		buffer.writeByte(880936571 * anInt10431);

		for (int element : anIntArray10437) {
			buffer.writeInt(element);
		}

		buffer.writeInt(anInt10438 * 1311649721);
		buffer.writeString(aString10439);
	}

	void method16357() {
		if (aString10409.length() > 40) {
			aString10409 = aString10409.substring(0, 40);
		}

		if (aString10428.length() > 40) {
			aString10428 = aString10428.substring(0, 40);
		}

		if (directXVersion.length() > 10) {
			directXVersion = directXVersion.substring(0, 10);
		}

		if (aString10430.length() > 10) {
			aString10430 = aString10430.substring(0, 10);
		}

		if (aString10439.length() > 120) {
			aString10439 = aString10439.substring(0, 120);
		}
	}

}