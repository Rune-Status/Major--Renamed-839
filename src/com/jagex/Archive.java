package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class Archive {
	public static final int anInt4571 = 1;
	public static ArchiveResourceProvider[] providers;
	static boolean aBool4572;
	static final int anInt4573 = 0;
	static final int anInt4575 = 2;
	static GzipDecompressor GZIP_DECOMPRESSOR = new GzipDecompressor();
	static int maximumContainerSize;

	public static Archive create(ArchiveType type, boolean discardPacked, int discardUnpacked, boolean bool_9_) {
		if (null == providers) {
			providers = new ArchiveResourceProvider[EquipmentDefaults.method9463()];
		}

		ResourceCache cache = null;
		int id = type.toInteger();

		if (Engine.dataFile != null && !Class640.aBool8160) {
			cache = new ResourceCache(id, Engine.dataFile, Client.indexFiles[id],
					id == ArchiveType.NATIVES.toInteger() ? 8000000 : 2000000);
		}

		providers[id] = ArchiveLoader.aClass402_4522.getProvider(id, cache, Class575.aClass507_7710,
				type.serveAsynchronously());
		if (bool_9_) {
			providers[id].method15362();
		}

		return new Archive(providers[id], discardPacked, discardUnpacked);
	}

	public static int hash(CharSequence sequence) {
		int length = sequence.length();
		int hash = 0;

		for (int index = 0; index < length; index++) {
			hash = (hash << 5) - hash + Class483.charToByte(sequence.charAt(index));
		}

		return hash;
	}

	public static byte[] unwrap(Object object, boolean copy) {
		if (null == object) {
			return null;
		}
		if (object instanceof byte[]) {
			byte[] data = (byte[]) object;
			if (copy) {
				return Arrays.copyOf(data, data.length);
			}
			return data;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer buffer = (ByteBuffer) object;
			byte[] data = new byte[buffer.capacity()];
			buffer.position(0);
			buffer.get(data);
			return data;
		}
		throw new IllegalArgumentException();
	}

	public static Object wrap(byte[] data, boolean copy) {
		if (data == null) {
			return null;
		}

		if (data.length > 136) {
			ByteBuffer buffer = ByteBuffer.allocateDirect(data.length);
			buffer.position(0);
			buffer.put(data);
			return buffer;
		}

		if (copy) {
			return Arrays.copyOf(data, data.length);
		}

		return data;
	}

	static boolean validUrl(String string) {
		if (null == string) {
			return false;
		}

		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	boolean discardPacked;
	int discardUnpacked;
	Object[] packed;
	ResourceProvider provider;
	ReferenceTable table = null;

	Object[][] unpacked;

	public Archive(ResourceProvider provider, boolean discardPacked, int discardUnpacked) {
		if (discardUnpacked < 0 || discardUnpacked > 2) {
			throw new IllegalArgumentException("");
		}

		this.provider = provider;
		this.discardPacked = discardPacked;
		this.discardUnpacked = discardUnpacked * -876590267;
	}

	public synchronized int[] childIndices(int entry) {
		if (!validEntry(entry)) {
			return null;
		}

		int[] indices = table.childIndices[entry];
		if (indices == null) {
			indices = new int[table.childCounts[entry]];

			for (int index = 0; index < indices.length; index++) {
				indices[index] = index;
			}
		}

		return indices;
	}

	public int childSize(int entry) {
		if (!validEntry(entry)) {
			return 0;
		}

		return table.childSizes[entry];
	}

	public void clearNames(boolean entries, boolean children) {
		if (ready()) {
			if (entries) {
				table.entryNames = null;
				table.entries = null;
			}
			if (children) {
				table.childNames = null;
				table.children = null;
			}
		}
	}

	public synchronized void clearUnpacked(int entry) {
		if (validEntry(entry)) {
			if (unpacked != null) {
				unpacked[entry] = null;
			}
		}
	}

	public synchronized boolean complete() {
		if (!ready()) {
			return false;
		}

		boolean finished = true;
		for (int entry = 0; entry < table.entryIndices.length; entry++) {
			int index = table.entryIndices[entry];
			if (packed[index] == null) {
				load(index);
				if (null == packed[index]) {
					finished = false;
				}
			}
		}

		return finished;
	}

	public int entryCount() {
		if (!ready()) {
			return -1;
		}

		return table.childSizes.length;
	}

	public synchronized boolean fileLoaded(int file) {
		if (!ready()) {
			return false;
		} else if (table.childSizes.length == 1) {
			return loaded(0, file);
		} else if (!validEntry(file)) {
			return false;
		} else if (table.childSizes[file] == 1) {
			return loaded(file, 0);
		}

		throw new RuntimeException();
	}

	public boolean fileLoaded(String string) {
		int index = index("");
		if (index != -1) {
			return loaded("", string);
		}

		return loaded(string, "");
	}

	public synchronized byte[] get(int file) {
		if (!ready()) {
			return null;
		} else if (1 == table.childSizes.length) {
			return get(0, file);
		} else if (!validEntry(file)) {
			return null;
		} else if (table.childSizes[file] == 1) {
			return get(file, 0);
		}

		throw new RuntimeException();
	}

	public byte[] get(int type, int file) {
		return get(type, file, null);
	}

	public synchronized byte[] get(int type, int file, int[] key) {
		if (!validChild(type, file)) {
			return null;
		}

		byte[] data = null;
		if (unpacked[type] == null || null == unpacked[type][file]) {
			boolean loaded = unpack(type, file, key);

			if (!loaded) {
				load(type);
				loaded = unpack(type, file, key);

				if (!loaded) {
					return null;
				}
			}
		}

		if (null == unpacked[type]) {
			throw new RuntimeException("");
		}

		if (unpacked[type][file] != null) {
			data = Archive.unwrap(unpacked[type][file], false);
			if (data == null) {
				throw new RuntimeException("");
			}
		}

		if (null != data) {
			if (1 == 1678741389 * discardUnpacked) {
				unpacked[type][file] = null;

				if (1 == table.childSizes[type]) {
					unpacked[type] = null;
				}
			} else if (1678741389 * discardUnpacked == 2) {
				unpacked[type] = null;
			}
		}

		return data;
	}

	public synchronized byte[] get(String entry, String child) {
		if (!ready()) {
			return null;
		}

		entry = entry.toLowerCase();
		child = child.toLowerCase();
		int entryIndex = table.entries.get(Archive.hash(entry));

		if (!validEntry(entryIndex)) {
			return null;
		}

		int childIndex = table.children[entryIndex].get(Archive.hash(child));
		return get(entryIndex, childIndex);
	}

	public int getTableChecksum() {
		if (!ready()) {
			throw new IllegalStateException("");
		}

		return -239286763 * table.checksum;
	}

	public int index(int entry) {
		if (!ready()) {
			return -1;
		}

		int index = table.entries.get(entry);
		if (!validEntry(index)) {
			return -1;
		}

		return index;
	}

	public int index(String entry) {
		if (!ready()) {
			return -1;
		}

		entry = entry.toLowerCase();
		int index = table.entries.get(Archive.hash(entry));
		if (!validEntry(index)) {
			return -1;
		}

		return index;
	}

	public synchronized boolean loaded(int entry, int child) {
		if (!validChild(entry, child)) {
			return false;
		} else if (null != unpacked[entry] && unpacked[entry][child] != null) {
			return true;
		} else if (null != packed[entry]) {
			return true;
		} else

			load(entry);
		return null != packed[entry];
	}

	public synchronized boolean loadEntry(int entry) {
		if (!validEntry(entry)) {
			return false;
		} else if (packed[entry] != null) {
			return true;
		}

		load(entry);
		return packed[entry] != null;
	}

	public boolean loadEntry(String entry) {
		if (!ready()) {
			return false;
		}

		entry = entry.toLowerCase();
		int index = table.entries.get(Archive.hash(entry));
		return loadEntry(index);
	}

	public synchronized int percentComplete() {
		if (!ready()) {
			return 0;
		}

		int total = 0;
		int completed = 0;
		for (int index = 0; index < packed.length; index++) {
			if (table.childCounts[index] > 0) {
				total += 100;
				completed += percentComplete(index);
			}
		}

		if (0 == total) {
			return 100;
		}

		return completed * 100 / total;
	}

	public synchronized int percentComplete(int entry) {
		if (!validEntry(entry)) {
			return 0;
		} else if (null != packed[entry]) {
			return 100;
		}
		return provider.percentComplete(entry);
	}

	public int percentComplete(String entry) {
		if (!ready()) {
			return 0;
		}

		entry = entry.toLowerCase();
		int index = table.entries.get(Archive.hash(entry));
		return percentComplete(index);
	}

	public void request(int i) {
		provider.request(i);
	}

	public synchronized boolean validChild(int entry, int child) {
		if (!ready()) {
			return false;
		}

		if (entry < 0 || child < 0 || entry >= table.childSizes.length || child >= table.childSizes[entry]) {
			if (aBool4572) {
				throw new IllegalArgumentException(new StringBuilder().append(entry).append(" ").append(child)
						.toString());
			}
			return false;
		}

		return true;
	}

	public boolean validFile(int file) {
		if (!ready()) {
			return false;
		} else if (1 == table.childSizes.length) {
			return validChild(0, file);
		} else if (!validEntry(file)) {
			return false;
		} else if (1 == table.childSizes[file]) {
			return validChild(file, 0);
		}

		throw new RuntimeException();
	}

	public boolean validFile(String entry) {
		if (!ready()) {
			return false;
		}

		entry = entry.toLowerCase();
		int index = table.entries.get(Archive.hash(entry));
		return index >= 0;
	}

	public boolean validFile(String entry, String child) {
		if (!ready()) {
			return false;
		}

		entry = entry.toLowerCase();
		child = child.toLowerCase();
		int entryIndex = table.entries.get(Archive.hash(entry));
		if (entryIndex < 0) {
			return false;
		}

		int childIndex = table.children[entryIndex].get(Archive.hash(child));
		return childIndex >= 0;
	}

	synchronized void load(int file) {
		if (discardPacked) {
			packed[file] = provider.get(file);
		} else {
			packed[file] = Archive.wrap(provider.get(file), false);
		}
	}

	boolean loaded(String entry, String child) {
		if (!ready()) {
			return false;
		}

		entry = entry.toLowerCase();
		child = child.toLowerCase();
		int entryIndex = table.entries.get(Archive.hash(entry));
		if (!validEntry(entryIndex)) {
			return false;
		}

		int childIndex = table.children[entryIndex].get(Archive.hash(child));
		return loaded(entryIndex, childIndex);
	}

	synchronized boolean ready() {
		if (null == table) {
			table = provider.getTable();
			if (null == table) {
				return false;
			}

			packed = new Object[table.entrySize * 1448439579];
			unpacked = new Object[1448439579 * table.entrySize][];
		}
		return true;
	}

	synchronized boolean unpack(int entry, int child, int[] key) {
		if (!validEntry(entry)) {
			return false;
		}
		if (null == packed[entry]) {
			return false;
		}
		int count = table.childCounts[entry];
		int[] indices = table.childIndices[entry];
		if (unpacked[entry] == null) {
			unpacked[entry] = new Object[table.childSizes[entry]];
		}
		Object[] objects = unpacked[entry];
		boolean finished = true;

		for (int index = 0; index < count; index++) {
			int childIndex;
			if (indices == null) {
				childIndex = index;
			} else {
				childIndex = indices[index];
			}

			if (objects[childIndex] == null) {
				finished = false;
				break;
			}
		}

		if (finished) {
			return true;
		}

		byte[] unpacked;
		if (null != key && (0 != key[0] || key[1] != 0 || 0 != key[2] || key[3] != 0)) {
			unpacked = unwrap(packed[entry], true);
			Buffer buffer = new Buffer(unpacked);
			int compression = buffer.readUByte();
			int size = buffer.readInt();
			int length = (compression == CompressionType.UNCOMPRESSED.getId() ? 5 : 9) + size;
			buffer.decodeXtea(key, 5, length);
		} else {
			unpacked = Archive.unwrap(packed[entry], false);
		}

		byte[] decoded;
		try {
			decoded = ReferenceTable.decodeContainer(unpacked);
		} catch (RuntimeException runtimeexception) {
			throw ContainerDecodingException.wrap(
					runtimeexception,
					new StringBuilder().append(null != key).append(" ").append(entry).append(" ")
							.append(unpacked.length).append(" ").append(BufferedFile.crc32(unpacked, unpacked.length))
							.append(" ").append(BufferedFile.crc32(unpacked, unpacked.length - 2)).append(" ")
							.append(table.entryCrcs[entry]).append(" ").append(-239286763 * table.checksum)
							.toString());
		}
		if (discardPacked) {
			packed[entry] = null;
		}
		if (count > 1) {
			if (1678741389 * discardUnpacked != 2) {
				int start = decoded.length;
				int blockCount = decoded[--start] & 0xff;
				start -= count * blockCount * 4;
				Buffer buffer = new Buffer(decoded);
				int[] sizes = new int[count];

				buffer.offset = 1258142129 * start;
				for (int block = 0; block < blockCount; block++) {
					int size = 0;
					for (int index = 0; index < count; index++) {
						size += buffer.readInt();
						sizes[index] += size;
					}
				}

				byte[][] files = new byte[count][];
				for (int index = 0; index < count; index++) {
					files[index] = new byte[sizes[index]];
					sizes[index] = 0;
				}

				buffer.offset = start * 1258142129;
				int read = 0;
				for (int block = 0; block < blockCount; block++) {
					int size = 0;
					for (int index = 0; index < count; index++) {
						size += buffer.readInt();
						System.arraycopy(decoded, read, files[index], sizes[index], size);
						sizes[index] += size;
						read += size;
					}
				}

				for (int index = 0; index < count; index++) {
					int childIndex;
					if (null == indices) {
						childIndex = index;
					} else {
						childIndex = indices[index];
					}
					if (1678741389 * discardUnpacked == 0) {
						objects[childIndex] = Archive.wrap(files[index], false);
					} else {
						objects[childIndex] = files[index];
					}
				}
			} else {
				int start = decoded.length;
				int blockCount = decoded[--start] & 0xff;
				start -= 4 * count * blockCount;
				Buffer buffer = new Buffer(decoded);
				int size = 0;
				int target = 0;
				buffer.offset = 1258142129 * start;

				for (int block = 0; block < blockCount; block++) {
					int offset = 0;
					for (int index = 0; index < count; index++) {
						offset += buffer.readInt();
						int childIndex;
						if (indices == null) {
							childIndex = index;
						} else {
							childIndex = indices[index];
						}

						if (child == childIndex) {
							size += offset;
							target = childIndex;
						}
					}
				}

				if (size == 0) {
					return true;
				}

				byte[] data = new byte[size];
				size = 0;
				buffer.offset = start * 1258142129;
				int offset = 0;

				for (int block = 0; block < blockCount; block++) {
					int length = 0;

					for (int index = 0; index < count; index++) {
						length += buffer.readInt();
						int childIndex_;

						if (null == indices) {
							childIndex_ = index;
						} else {
							childIndex_ = indices[index];
						}

						if (childIndex_ == child) {
							System.arraycopy(decoded, offset, data, size, length);
							size += length;
						}

						offset += length;
					}
				}

				objects[target] = data;
			}
		} else {
			int index;
			if (indices == null) {
				index = 0;
			} else {
				index = indices[0];
			}

			if (0 == discardUnpacked * 1678741389) {
				objects[index] = Archive.wrap(decoded, false);
			} else {
				objects[index] = decoded;
			}
		}

		return true;
	}

	synchronized boolean validEntry(int entry) {
		if (!ready()) {
			return false;
		}
		if (entry < 0 || entry >= table.childSizes.length || 0 == table.childSizes[entry]) {
			if (aBool4572) {
				throw new IllegalArgumentException(Integer.toString(entry));
			}
			return false;
		}
		return true;
	}

	public static byte[] unwrap(Object object, int i, int i_4_) {
		if (object == null) {
			return null;
		}
	
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_4_ + i);
		}
	
		if (object instanceof ByteBuffer) {
			ByteBuffer buffer = (ByteBuffer) object;
			byte[] is = new byte[i_4_];
			buffer.position(i);
			buffer.get(is, 0, i_4_);
			return is;
		}
	
		throw new IllegalArgumentException();
	}

	static void addTableChecksums(FrameBuffer buffer) {
		buffer.writeInt(Deque.frames.getTableChecksum());
		buffer.writeInt(Class340_Sub3.frameBases.getTableChecksum());
		buffer.writeInt(Class350.config.getTableChecksum());
		buffer.writeInt(Class671.widgets.getTableChecksum());
		buffer.writeInt(BufferedConnectionContext.maps.getTableChecksum());
		buffer.writeInt(Class436.models.getTableChecksum());
		buffer.writeInt(DequeIterator.images.getTableChecksum());
		buffer.writeInt(ClientVarpType.huffman.getTableChecksum());
		buffer.writeInt(Script.scripts.getTableChecksum());
		buffer.writeInt(Class80.fonts.getTableChecksum());

		if (!Class252.aBool2693) {
			buffer.writeInt(Class480_Sub21_Sub3.soundEffects.getTableChecksum());
		}

		buffer.writeInt(Class51.objects.getTableChecksum());
		buffer.writeInt(Class285.enumerations.getTableChecksum());
		buffer.writeInt(ResourceProvider.npcs.getTableChecksum());
		buffer.writeInt(Class215.items.getTableChecksum());
		buffer.writeInt(TranslatableString.animations.getTableChecksum());
		buffer.writeInt(Ground.graphics.getTableChecksum());
		buffer.writeInt(Class501.varbits.getTableChecksum());
		buffer.writeInt(DequeIterator.worldMapInfo.getTableChecksum());
		buffer.writeInt(Client.quickChat.getTableChecksum());
		buffer.writeInt(Class337.restrictedQuickChat.getTableChecksum());
		buffer.writeInt(ValueType.textureDefinitions.getTableChecksum());
		buffer.writeInt(Class23.particles.getTableChecksum());
		buffer.writeInt(Class22.defaults.getTableChecksum());
		buffer.writeInt(Billboard.billboards.getTableChecksum());
		buffer.writeInt(Class580.natives.getTableChecksum());
		buffer.writeInt(Class54.shaders.getTableChecksum());
		buffer.writeInt(Class337.method5829());
		buffer.writeInt(Class611.method10320());
		buffer.writeInt(Class140.cutscenes.getTableChecksum());

		if (!Class252.aBool2693) {
			buffer.writeInt(Class614.music.getTableChecksum());
		}

		buffer.writeInt(SetMemberRankChannelUpdate.worldMap.getTableChecksum());
		buffer.writeInt(0);
		buffer.writeInt(Class51.textures.getTableChecksum());
		buffer.writeInt(Class467.materials.getTableChecksum());
	}

}