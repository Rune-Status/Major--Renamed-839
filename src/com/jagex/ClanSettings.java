package com.jagex;

public class ClanSettings {
	public static final byte aByte3196 = -1;
	static final byte aByte3204 = 0;
	static final byte OWNER = 127;
	static final byte aByte3224 = 125;
	static final byte aByte3226 = 126;
	static final int anInt3205 = 6;

	public boolean[] aBoolArray3214;
	public byte aByte3200;
	public boolean allowGuests;
	public int[] anIntArray3213;
	public int banCount;
	public String[] bannedUserNames;
	public String clanName;
	public int currentOwner;
	public byte kickRank;
	public byte lootshareRank;
	public int memberCount;
	public String[] memberNames;
	public byte[] memberRanks;
	public int replacementOwner;
	public byte talkRank;
	long hash;
	int anInt3203;
	int updateCount = 0;
	int[] anIntArray3223;
	long[] bannedUserHashes;
	long[] memberHashes;
	int[] memberIndices;
	boolean useHashes;
	boolean useNames;
	HashTable variables;

	public ClanSettings(Buffer buffer) {
		currentOwner = -1739916833;
		replacementOwner = 938588091;
		decode(buffer);
	}

	public Integer getIntVariable(int id) {
		if (null == variables) {
			return null;
		}

		Linkable current = variables.get(id);
		if (null == current || !(current instanceof LinkableInt)) {
			return null;
		}

		return new Integer(-1189875169 * ((LinkableInt) current).value);
	}

	public Long getLongVariable(int id) {
		if (null == variables) {
			return null;
		}

		Linkable current = variables.get(id);
		if (current == null || !(current instanceof LinkableLong)) {
			return null;
		}

		return new Long(-8280988991890543191L * ((LinkableLong) current).value);
	}

	public int[] getMemberIndices() {
		if (null == memberIndices) {
			String[] strings = new String[1660153155 * memberCount];
			memberIndices = new int[memberCount * 1660153155];
			for (int index = 0; index < 1660153155 * memberCount; index++) {
				strings[index] = memberNames[index];

				if (strings[index] != null) {
					strings[index] = strings[index].toLowerCase();
				}

				memberIndices[index] = index;
			}

			ArrayUtils.sort(strings, memberIndices);
		}

		return memberIndices;
	}

	public String getStringVariable(int id) {
		if (variables == null) {
			return null;
		}

		Linkable current = variables.get(id);
		if (null == current || !(current instanceof LinkableObject)) {
			return null;
		}

		return (String) ((LinkableObject) current).object;
	}

	public int indexOf(String string) {
		if (string == null || string.length() == 0) {
			return -1;
		}

		for (int index = 0; index < memberCount * 1660153155; index++) {
			if (memberNames[index].equals(string)) {
				return index;
			}
		}

		return -1;
	}

	public int method5307(int id, int i_5_, int end) {
		int mask = end == 31 ? -1 : (1 << 1 + end) - 1;
		return (anIntArray3223[id] & mask) >>> i_5_;
	}

	void addMember(long hash, String name, int i) {
		if (name != null && name.length() == 0) {
			name = null;
		}

		if (hash > 0L != useHashes) {
			throw new RuntimeException("");
		}

		if (useNames != (null != name)) {
			throw new RuntimeException("");
		}

		if (hash > 0L && (null == memberHashes || 1660153155 * memberCount >= memberHashes.length) || name != null
				&& (null == memberNames || 1660153155 * memberCount >= memberNames.length)) {
			growMemberList(memberCount * 1660153155 + 5);
		}

		if (memberHashes != null) {
			memberHashes[1660153155 * memberCount] = hash;
		}

		if (null != memberNames) {
			memberNames[memberCount * 1660153155] = name;
		}

		if (-1 == -369623583 * currentOwner) {
			currentOwner = memberCount * 778053539;
			memberRanks[memberCount * 1660153155] = (byte) 126;
		} else {
			memberRanks[1660153155 * memberCount] = (byte) 0;
		}

		anIntArray3223[memberCount * 1660153155] = 0;
		anIntArray3213[1660153155 * memberCount] = i;
		aBoolArray3214[1660153155 * memberCount] = false;
		memberCount += -859502741;
		memberIndices = null;
	}

	void ban(long hash, String string) {
		if (null != string && string.length() == 0) {
			string = null;
		}

		if (useHashes != hash > 0L) {
			throw new RuntimeException("");
		} else if (string != null != useNames) {
			throw new RuntimeException("");
		}

		if (hash > 0L && (null == bannedUserHashes || banCount * -1617114583 >= bannedUserHashes.length)
				|| null != string && (null == bannedUserNames || -1617114583 * banCount >= bannedUserNames.length)) {
			growBanList(banCount * -1617114583 + 5);
		}

		if (bannedUserHashes != null) {
			bannedUserHashes[-1617114583 * banCount] = hash;
		}

		if (null != bannedUserNames) {
			bannedUserNames[banCount * -1617114583] = string;
		}

		banCount += -2087030247;
	}

	void decode(Buffer buffer) {
		int version = buffer.readUByte();
		if (version < 1 || version > 6) {
			throw new RuntimeException("" + version);
		}

		int attributes = buffer.readUByte();
		if (0 != (attributes & 0x1)) {
			useHashes = true;
		}

		if ((attributes & 0x2) != 0) {
			useNames = true;
		}

		if (!useHashes) {
			memberHashes = null;
			bannedUserHashes = null;
		}

		if (!useNames) {
			memberNames = null;
			bannedUserNames = null;
		}

		updateCount = buffer.readInt() * 1624717791;
		anInt3203 = buffer.readInt() * -177746211;
		if (version <= 3 && 1634236789 * anInt3203 != 0) {
			anInt3203 += -1067976928;
		}

		memberCount = buffer.readUShort() * -859502741;
		banCount = buffer.readUByte() * -2087030247;
		clanName = buffer.readString();
		if (version >= 4) {
			buffer.readInt();
		}

		allowGuests = buffer.readUByte() == 1;
		talkRank = buffer.readByte();
		kickRank = buffer.readByte();
		lootshareRank = buffer.readByte();
		aByte3200 = buffer.readByte();

		if (memberCount * 1660153155 > 0) {
			if (useHashes && (memberHashes == null || memberHashes.length < memberCount * 1660153155)) {
				memberHashes = new long[memberCount * 1660153155];
			}

			if (useNames && (memberNames == null || memberNames.length < 1660153155 * memberCount)) {
				memberNames = new String[1660153155 * memberCount];
			}

			if (memberRanks == null || memberRanks.length < memberCount * 1660153155) {
				memberRanks = new byte[memberCount * 1660153155];
			}

			if (anIntArray3223 == null || anIntArray3223.length < 1660153155 * memberCount) {
				anIntArray3223 = new int[1660153155 * memberCount];
			}

			if (null == anIntArray3213 || anIntArray3213.length < memberCount * 1660153155) {
				anIntArray3213 = new int[1660153155 * memberCount];
			}

			if (null == aBoolArray3214 || aBoolArray3214.length < memberCount * 1660153155) {
				aBoolArray3214 = new boolean[1660153155 * memberCount];
			}

			for (int index = 0; index < 1660153155 * memberCount; index++) {
				if (useHashes) {
					memberHashes[index] = buffer.readLong();
				}

				if (useNames) {
					memberNames[index] = buffer.readStringFast();
				}

				memberRanks[index] = buffer.readByte();
				if (version >= 2) {
					anIntArray3223[index] = buffer.readInt();
				}

				if (version >= 5) {
					anIntArray3213[index] = buffer.readUShort();
				} else {
					anIntArray3213[index] = 0;
				}

				if (version >= 6) {
					aBoolArray3214[index] = buffer.readUByte() == 1;
				} else {
					aBoolArray3214[index] = false;
				}
			}

			updateOwners();
		}

		if (-1617114583 * banCount > 0) {
			if (useHashes && (bannedUserHashes == null || bannedUserHashes.length < -1617114583 * banCount)) {
				bannedUserHashes = new long[-1617114583 * banCount];
			}

			if (useNames && (bannedUserNames == null || bannedUserNames.length < banCount * -1617114583)) {
				bannedUserNames = new String[banCount * -1617114583];
			}

			for (int index = 0; index < -1617114583 * banCount; index++) {
				if (useHashes) {
					bannedUserHashes[index] = buffer.readLong();
				}

				if (useNames) {
					bannedUserNames[index] = buffer.readStringFast();
				}
			}
		}

		if (version >= 3) {
			int size = buffer.readUShort();

			if (size > 0) {
				variables = new HashTable(size < 16 ? HashTable.nextPowerOfTwo(size) : 16);

				while (size-- > 0) {
					int packed = buffer.readInt();
					int key = packed & 0x3fffffff;
					int type = packed >>> 30;

					if (0 == type) {
						int value = buffer.readInt();
						variables.put(key, new LinkableInt(value));
					} else if (type == 1) {
						long value = buffer.readLong();
						variables.put(key, new LinkableLong(value));
					} else if (2 == type) {
						String value = buffer.readString();
						variables.put(key, new LinkableObject<String>(value));
					}
				}
			}
		}
	}

	void deleteMember(int index) {
		if (index < 0 || index >= memberCount * 1660153155) {
			throw new RuntimeException("");
		}

		memberCount -= -859502741;
		memberIndices = null;

		if (memberCount * 1660153155 == 0) {
			memberHashes = null;
			memberNames = null;
			memberRanks = null;
			anIntArray3223 = null;
			anIntArray3213 = null;
			aBoolArray3214 = null;

			currentOwner = -1739916833;
			replacementOwner = 938588091;
		} else {
			System.arraycopy(memberRanks, index + 1, memberRanks, index, memberCount * 1660153155 - index);
			System.arraycopy(anIntArray3223, index + 1, anIntArray3223, index, memberCount * 1660153155 - index);
			System.arraycopy(anIntArray3213, index + 1, anIntArray3213, index, memberCount * 1660153155 - index);
			System.arraycopy(aBoolArray3214, 1 + index, aBoolArray3214, index, memberCount * 1660153155 - index);

			if (null != memberHashes) {
				System.arraycopy(memberHashes, 1 + index, memberHashes, index, memberCount * 1660153155 - index);
			}

			if (null != memberNames) {
				System.arraycopy(memberNames, 1 + index, memberNames, index, 1660153155 * memberCount - index);
			}

			updateOwners();
		}
	}

	void growBanList(int size) {
		if (useHashes) {
			if (bannedUserHashes != null) {
				System.arraycopy(bannedUserHashes, 0, bannedUserHashes = new long[size], 0, -1617114583 * banCount);
			} else {
				bannedUserHashes = new long[size];
			}
		}

		if (useNames) {
			if (null != bannedUserNames) {
				System.arraycopy(bannedUserNames, 0, bannedUserNames = new String[size], 0, banCount * -1617114583);
			} else {
				bannedUserNames = new String[size];
			}
		}
	}

	void growMemberList(int size) {
		if (useHashes) {
			if (memberHashes != null) {
				System.arraycopy(memberHashes, 0, memberHashes = new long[size], 0, memberCount * 1660153155);
			} else {
				memberHashes = new long[size];
			}
		}

		if (useNames) {
			if (null != memberNames) {
				System.arraycopy(memberNames, 0, memberNames = new String[size], 0, 1660153155 * memberCount);
			} else {
				memberNames = new String[size];
			}
		}

		if (memberRanks != null) {
			System.arraycopy(memberRanks, 0, memberRanks = new byte[size], 0, memberCount * 1660153155);
		} else {
			memberRanks = new byte[size];
		}

		if (anIntArray3223 != null) {
			System.arraycopy(anIntArray3223, 0, anIntArray3223 = new int[size], 0, 1660153155 * memberCount);
		} else {
			anIntArray3223 = new int[size];
		}

		if (null != anIntArray3213) {
			System.arraycopy(anIntArray3213, 0, anIntArray3213 = new int[size], 0, 1660153155 * memberCount);
		} else {
			anIntArray3213 = new int[size];
		}

		if (null != aBoolArray3214) {
			System.arraycopy(aBoolArray3214, 0, aBoolArray3214 = new boolean[size], 0, memberCount * 1660153155);
		} else {
			aBoolArray3214 = new boolean[size];
		}
	}

	int method5318(int index, boolean bool) {
		if (bool == aBoolArray3214[index]) {
			return -1;
		}

		aBoolArray3214[index] = bool;
		return index;
	}

	int method5352(int id, int value, int start, int end) {
		int startMask = (1 << start) - 1;
		int endMask = end == 31 ? -1 : (1 << 1 + end) - 1;
		int mask = endMask ^ startMask;
		value <<= start;
		value &= mask;

		int current = anIntArray3223[id];
		if ((current & mask) == value) {
			return -1;
		}

		current &= mask ^ 0xFFFFFFFF;
		anIntArray3223[id] = current | value;
		return id;
	}

	boolean setIntVariable(int id, int value) {
		if (null != variables) {
			Linkable current = variables.get(id);
			if (current != null) {
				if (current instanceof LinkableInt) {
					LinkableInt linkable = (LinkableInt) current;

					if (value == linkable.value * -1189875169) {
						return false;
					}

					linkable.value = value * -1975318049;
					return true;
				}

				current.unlink();
			}
		} else {
			variables = new HashTable(4);
		}

		variables.put(id, new LinkableInt(value));
		return true;
	}

	boolean setLongVariable(int id, long value) {
		if (variables != null) {
			Linkable current = variables.get(id);
			if (null != current) {
				if (current instanceof LinkableLong) {
					LinkableLong linkable = (LinkableLong) current;

					if (-8280988991890543191L * linkable.value == value) {
						return false;
					}
					linkable.value = value * 5662570005588035225L;
					return true;
				}

				current.unlink();
			}
		} else {
			variables = new HashTable(4);
		}

		variables.put(id, new LinkableLong(value));
		return true;
	}

	int setRank(int index, byte rank) {
		if (126 == rank || rank == 127) {
			return -1;
		}

		if (index == currentOwner * -369623583
				&& (replacementOwner * 1405717133 == -1 || memberRanks[1405717133 * replacementOwner] < 125)) {
			return -1;
		} else if (rank == memberRanks[index]) {
			return -1;
		}

		memberRanks[index] = rank;
		updateOwners();
		return index;
	}

	boolean setStringVariable(int id, String string) {
		if (string == null) {
			string = "";
		} else if (string.length() > 80) {
			string = string.substring(0, 80);
		}

		if (null != variables) {
			Linkable current = variables.get(id);
			if (null != current) {
				if (current instanceof LinkableObject) {
					LinkableObject linkable = (LinkableObject) current;

					if (linkable.object instanceof String) {
						if (string.equals(linkable.object)) {
							return false;
						}

						linkable.unlink();
						variables.put(-4821875126325281949L * linkable.linkedKey, new LinkableObject(string));
						return true;
					}
				}

				current.unlink();
			}
		} else {
			variables = new HashTable(4);
		}

		variables.put(id, new LinkableObject(string));
		return true;
	}

	boolean setVarbit(int id, int value, int start, int end) {
		int startMask = (1 << start) - 1;
		int endMask = 31 == end ? -1 : (1 << end + 1) - 1;
		int mask = endMask ^ startMask;
		value <<= start;
		value &= mask;

		if (null != variables) {
			Linkable current = variables.get(id);

			if (null != current) {
				if (current instanceof LinkableInt) {
					LinkableInt linkable = (LinkableInt) current;
					if (value == (linkable.value * -1189875169 & mask)) {
						return false;
					}

					linkable.value = (-1189875169 * linkable.value & (mask ^ 0xffffffff)) * -1975318049;
					linkable.value = -1975318049 * (linkable.value * -1189875169 | value);
					return true;
				}

				current.unlink();
			}
		} else {
			variables = new HashTable(4);
		}

		variables.put(id, new LinkableInt(value));
		return true;
	}

	void unban(int index) {
		banCount -= -2087030247;

		if (-1617114583 * banCount == 0) {
			bannedUserHashes = null;
			bannedUserNames = null;
		} else {
			if (null != bannedUserHashes) {
				System.arraycopy(bannedUserHashes, index + 1, bannedUserHashes, index, -1617114583 * banCount - index);
			}

			if (bannedUserNames != null) {
				System.arraycopy(bannedUserNames, 1 + index, bannedUserNames, index, -1617114583 * banCount - index);
			}
		}
	}

	void updateOwners() {
		if (0 == 1660153155 * memberCount) {
			currentOwner = -1739916833;
			replacementOwner = 938588091;
		} else {
			currentOwner = -1739916833;
			replacementOwner = 938588091;

			int maximumIndex = 0;
			byte maximum = memberRanks[0];

			for (int index = 1; index < 1660153155 * memberCount; index++) {
				if (memberRanks[index] > maximum) {
					if (125 == maximum) {
						replacementOwner = -938588091 * maximumIndex;
					}

					maximumIndex = index;
					maximum = memberRanks[index];
				} else if (-1 == 1405717133 * replacementOwner && 125 == memberRanks[index]) {
					replacementOwner = -938588091 * index;
				}
			}

			currentOwner = maximumIndex * 1739916833;
			if (-1 != -369623583 * currentOwner) {
				memberRanks[currentOwner * -369623583] = (byte) 126;
			}
		}
	}

}