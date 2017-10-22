package com.jagex;

import java.util.zip.CRC32;

public class ArchiveResourceProvider extends ResourceProvider {
	static final byte aByte9869 = -1;
	static final byte aByte9875 = 0;
	static final byte aByte9881 = 1;
	static final int anInt9871 = 250;
	static final int anInt9893 = 2;
	static final int anInt9894 = 1000;
	static final int anInt9897 = 0;
	static final int anInt9899 = 1;
	static CRC32 crc32 = new CRC32();

	static boolean method15392(int i, int i_29_) {
		return i == 0 || i == 8 || i == 11 || 16 == i;
	}

	static final void method15393(ScriptExecutionContext class613) {
		int i_30_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class611 class611;
		if (class613.aBool7932) {
			class611 = class613.aClass611_7945;
		} else {
			class611 = class613.aClass611_7931;
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class611.method10315(i_30_, -1,
				689595847) ? 1 : 0;
	}

	boolean aBool9885;
	boolean aBool9886;
	ResourceCache archives;
	CacheResourceWorker cacheWorker;
	boolean clearIdle;
	int current;
	Deque<Linkable> extras;
	byte[] fileStatuses;
	int loaded = 0;
	Deque<Linkable> mandatory = new Deque<Linkable>();
	ResourceCache meta;
	long nextSweep;
	ParallelHttpProvider parallelProvider;
	PaddedResourceWorker serialProvider;
	ReferenceTable table;
	int tableChecksum;
	byte[] tableHash;
	ResourceRequest tableRequest;
	int tableVersion;
	int type;
	boolean updateOutdated;
	HashTable<ResourceRequest> waiting = new HashTable<ResourceRequest>(16);

	ArchiveResourceProvider(int type, ResourceCache archives, ResourceCache meta, PaddedResourceWorker net,
			ParallelHttpProvider provider, CacheResourceWorker cache, int tableChecksum, byte[] tableHash,
			int tableVersion, boolean clearIdle) {
		this.type = -1226497139 * type;
		this.archives = archives;

		if (null == archives) {
			updateOutdated = false;
		} else {
			updateOutdated = true;
			extras = new Deque();
		}

		this.meta = meta;
		serialProvider = net;
		parallelProvider = provider;
		cacheWorker = cache;
		this.tableChecksum = -754462269 * tableChecksum;
		this.tableHash = tableHash;
		this.tableVersion = tableVersion * -858540813;
		this.clearIdle = clearIdle;

		if (meta != null) {
			tableRequest = cacheWorker.priorityRead(meta, 2003490629 * type);
		}
	}

	public int entryCount() {
		if (null == table) {
			return 0;
		}

		return table.entryCount * -824064343;
	}

	public int extrasCount() {
		if (table == null) {
			return 0;
		} else if (!updateOutdated) {
			return -824064343 * table.entryCount;
		}

		Linkable linkable = extras.head();
		if (null == linkable) {
			return 0;
		}

		return (int) (linkable.linkedKey * -4821875126325281949L);
	}

	public int getLoaded() {
		return -939564931 * loaded;
	}

	public void method15362() {
		if (null == parallelProvider && null != archives) {
			aBool9886 = true;
			aBool9885 = true;

			if (null == extras) {
				extras = new Deque();
			}
		}
	}

	public boolean method15370() {
		return aBool9885;
	}

	public int tablePercentage() {
		if (getTable() == null) {
			if (null == tableRequest) {
				return 0;
			}

			return tableRequest.complete();
		}

		return 100;
	}

	void enableParalell(boolean enabled) {
		parallelProvider.setEnabled(enabled);
	}

	@Override
	byte[] get(int file) {
		ResourceRequest request = load(0, file);
		if (request == null) {
			return null;
		}

		byte[] data = request.getData();
		request.unlink();
		return data;
	}

	@Override
	ReferenceTable getTable() {
		if (null != table) {
			return table;
		}

		if (tableRequest == null) {
			if (serialProvider.priorityUnavailable()) {
				return null;
			}

			tableRequest = serialProvider.request(255, 2003490629 * type, (byte) 0, true);
		}

		if (tableRequest.waiting) {
			return null;
		}
		byte[] data = tableRequest.getData();

		if (tableRequest instanceof CacheRequest) {
			try {
				if (data == null) {
					throw new RuntimeException();
				}

				table = new ReferenceTable(data, -132471061 * tableChecksum, tableHash);
				if (table.version * 82755467 != tableVersion * -260537285) {
					throw new RuntimeException();
				}
			} catch (RuntimeException ex) {
				table = null;
				if (serialProvider.priorityUnavailable()) {
					tableRequest = null;
				} else {
					tableRequest = serialProvider.request(255, 2003490629 * type, (byte) 0, true);
				}

				return null;
			}
		} else {
			try {
				if (null == data) {
					throw new RuntimeException();
				}

				table = new ReferenceTable(data, tableChecksum * -132471061, tableHash);
			} catch (RuntimeException runtimeexception) {
				serialProvider.reset(255, type * 2003490629);
				table = null;

				if (serialProvider.priorityUnavailable()) {
					tableRequest = null;
				} else {
					tableRequest = serialProvider.request(255, 2003490629 * type, (byte) 0, true);
				}

				return null;
			}

			if (meta != null) {
				cacheWorker.requestWrite(meta, data, 2003490629 * type);
			}
		}
		tableRequest = null;

		if (null != archives) {
			fileStatuses = new byte[1448439579 * table.entrySize];
			loaded = 0;
		}

		return table;
	}

	boolean hasParallelProvider() {
		return null != parallelProvider;
	}

	ResourceRequest load(int type, int file) {
		ResourceRequest request = waiting.get(file);
		if (null != request && type == 0 && !request.highPriority && request.waiting) {
			request.unlink();
			request = null;
		}

		if (request == null) {
			if (type == 0) {
				if (archives != null && fileStatuses[file] != -1) {
					request = cacheWorker.priorityRead(archives, file);
				} else if (null != parallelProvider) {
					request = parallelProvider.request(2003490629 * type, file, (byte) 2, true, table.entryCrcs[file],
							table.entryVersions[file]);
					if (null == request) {
						return null;
					}
				} else if (!serialProvider.priorityUnavailable()) {
					request = serialProvider.request(type * 2003490629, file, (byte) 2, true);
				} else {
					return null;
				}
			} else if (1 == type) {
				if (null == archives) {
					throw new RuntimeException();
				}

				request = cacheWorker.requestRead(archives, file);
			} else if (type == 2) {
				if (null == archives) {
					throw new RuntimeException();
				} else if (-1 != fileStatuses[file]) {
					throw new RuntimeException();
				} else if (null != parallelProvider) {
					return null;
				} else if (!serialProvider.extraUnavailable()) {
					request = serialProvider.request(2003490629 * type, file, (byte) 2, false);
				} else {
					return null;
				}
			} else {
				throw new RuntimeException();
			}

			waiting.put(file, request);
		}

		if (request.waiting) {
			return null;
		}

		byte[] data = request.getData();
		if (request instanceof CacheRequest) {
			ResourceRequest completed;

			try {
				if (data == null || data.length <= 2) {
					throw new RuntimeException();
				}
				crc32.reset();
				crc32.update(data, 0, data.length - 2);

				int crc = (int) crc32.getValue();
				if (crc != table.entryCrcs[file]) {
					throw new RuntimeException();
				}

				if (null != table.entryHashes && null != table.entryHashes[file]) {
					byte[] expectedHash = table.entryHashes[file];
					byte[] hash = Class24.whirlpool(data, 0, data.length - 2);

					for (int index = 0; index < 64; index++) {
						if (hash[index] != expectedHash[index]) {
							throw new RuntimeException();
						}
					}
				}

				int version = (data[data.length - 1] & 0xff) + ((data[data.length - 2] & 0xff) << 8);
				if (version != (table.entryVersions[file] & 0xffff)) {
					throw new RuntimeException();
				}

				if (fileStatuses[file] != 1) {
					if (0 != fileStatuses[file]) {

					}

					loaded += -1347610411;
					fileStatuses[file] = (byte) 1;
				}

				if (!request.highPriority) {
					request.unlink();
				}

				completed = request;
			} catch (Exception exception) {
				fileStatuses[file] = (byte) -1;
				request.unlink();

				if (request.highPriority) {
					if (parallelProvider != null) {
						if (!parallelProvider.unavailable()) {
							AsynchronousRequest async = parallelProvider.request(type * 2003490629, file, (byte) 2,
									true, table.entryCrcs[file], table.entryVersions[file]);
							if (null != async) {
								waiting.put(file, async);
							}
						}
					} else if (!serialProvider.priorityUnavailable()) {
						PaddedResourceRequest net = serialProvider.request(type * 2003490629, file, (byte) 2, true);
						waiting.put(file, net);
					}
				}

				return null;
			}

			return completed;
		}

		try {
			if (null == data || data.length <= 2) {
				if (parallelProvider != null) {
					request.unlink();
					return null;
				}
				throw new RuntimeException();
			}

			crc32.reset();
			crc32.update(data, 0, data.length - 2);

			int crc = (int) crc32.getValue();
			if (crc != table.entryCrcs[file]) {
				throw new RuntimeException();
			}

			if (table.entryHashes != null && table.entryHashes[file] != null) {
				byte[] expectedHash = table.entryHashes[file];
				byte[] hash = Class24.whirlpool(data, 0, data.length - 2);

				for (int index = 0; index < 64; index++) {
					if (expectedHash[index] != hash[index]) {
						throw new RuntimeException();
					}
				}
			}

			if (parallelProvider != null) {
				serialProvider.errors = 0;
				serialProvider.status = 0;
			}
		} catch (RuntimeException ex) {
			serialProvider.reset(2003490629 * type, file);
			request.unlink();

			if (request.highPriority) {
				if (parallelProvider != null) {
					if (!parallelProvider.unavailable()) {
						AsynchronousRequest async = parallelProvider.request(2003490629 * type, file, (byte) 2, true,
								table.entryCrcs[file], table.entryVersions[file]);
						if (async != null) {
							waiting.put(file, async);
						}
					}
				} else if (!serialProvider.priorityUnavailable()) {
					PaddedResourceRequest serial = serialProvider.request(type * 2003490629, file, (byte) 2, true);
					waiting.put(file, serial);
				}
			}

			return null;
		}

		data[data.length - 2] = (byte) (table.entryVersions[file] >>> 8);
		data[data.length - 1] = (byte) table.entryVersions[file];

		if (archives != null) {
			cacheWorker.requestWrite(archives, data, file);

			if (1 != fileStatuses[file]) {
				loaded += -1347610411;
				fileStatuses[file] = (byte) 1;
			}
		}

		if (!request.highPriority) {
			request.unlink();
		}

		return request;
	}

	void loadExtras() {
		if (extras != null) {
			if (getTable() == null) {
				return;
			}
			if (updateOutdated) {
				boolean finished = true;
				for (Linkable linkable = extras.head(); linkable != null; linkable = extras.next()) {
					int index = (int) (-4821875126325281949L * linkable.linkedKey);
					if (fileStatuses[index] == 0) {
						load(1, index);
					}

					if (fileStatuses[index] != 0) {
						linkable.unlink();
					} else {
						finished = false;
					}
				}

				while (current * 1426010641 < table.childCounts.length) {
					if (table.childCounts[current * 1426010641] == 0) {
						current += 835059441;
					} else {
						if (cacheWorker.remaining * -704160219 >= 250) {
							finished = false;
							break;
						}
						if (0 == fileStatuses[current * 1426010641]) {
							load(1, 1426010641 * current);
						}
						if (0 == fileStatuses[current * 1426010641]) {
							Linkable linkable = new Linkable();
							linkable.linkedKey = 4405590682838231291L * current;
							extras.pushBack(linkable);
							finished = false;
						}
						current += 835059441;
					}
				}
				if (finished) {
					updateOutdated = false;
					current = 0;
				}
			} else if (aBool9886) {
				boolean bool = true;
				for (Linkable linkable = extras.head(); null != linkable; linkable = extras.next()) {
					int index = (int) (linkable.linkedKey * -4821875126325281949L);
					if (fileStatuses[index] != 1) {
						load(2, index);
					}
					if (fileStatuses[index] == 1) {
						linkable.unlink();
					} else {
						bool = false;
					}
				}
				while (1426010641 * current < table.childCounts.length) {
					if (table.childCounts[1426010641 * current] == 0) {
						current += 835059441;
					} else {
						if (serialProvider.extraUnavailable()) {
							bool = false;
							break;
						}
						if (1 != fileStatuses[1426010641 * current]) {
							load(2, 1426010641 * current);
						}
						if (1 != fileStatuses[current * 1426010641]) {
							Linkable class480 = new Linkable();
							class480.linkedKey = current * 4405590682838231291L;
							extras.pushBack(class480);
							bool = false;
						}
						current += 835059441;
					}
				}
				if (bool) {
					aBool9886 = false;
					current = 0;
				}
			} else {
				extras = null;
			}
		}

		if (clearIdle && TimeUtil.time() >= nextSweep * -7125249238927829539L) {
			for (ResourceRequest request = waiting.first(); request != null; request = waiting
					.next()) {
				if (!request.waiting) {
					if (request.old) {
						if (!request.highPriority) {
							throw new RuntimeException();
						}

						request.unlink();
					} else {
						request.old = true;
					}
				}
			}
			nextSweep = (TimeUtil.time() + 1000L) * 6149836865522985589L;
		}
	}

	@Override
	int percentComplete(int file) {
		ResourceRequest request = waiting.get(file);
		if (null != request) {
			return request.complete();
		}

		return 0;
	}

	@Override
	void request(int file) {
		if (null != archives) {
			for (Linkable linkable = mandatory.head(); null != linkable; linkable = mandatory.next()) {
				if (-4821875126325281949L * linkable.linkedKey == file) {
					return;
				}
			}

			Linkable request = new Linkable();
			request.linkedKey = file * -7096345066895942069L;
			mandatory.pushBack(request);
		}
	}

	void requestTable(int checksum, byte[] hash, int version) {
		if (!validTable(hash, checksum, version)) {
			tableChecksum = -754462269 * checksum;
			tableHash = hash;
			tableVersion = -858540813 * version;
			table = null;
			tableRequest = null;

			if (!serialProvider.priorityUnavailable()) {
				tableRequest = serialProvider.request(255, 2003490629 * type, (byte) 0, true);
			}
		}
	}

	void serveRequests() {
		if (extras != null && getTable() != null) {
			for (Linkable linkable = mandatory.head(); linkable != null; linkable = mandatory.next()) {
				int child = (int) (-4821875126325281949L * linkable.linkedKey);

				if (child < 0 || child >= 1448439579 * table.entrySize || 0 == table.childCounts[child]) {
					linkable.unlink();
				} else {
					if (fileStatuses[child] == 0) {
						load(1, child);
					} else if (-1 == fileStatuses[child]) {
						load(2, child);
					} else if (1 == fileStatuses[child]) {
						linkable.unlink();
					}
				}
			}
		}
	}

	boolean validTable(byte[] data, int checksum, int version) {
		if (-132471061 * tableChecksum == checksum && version == -260537285 * tableVersion) {
			boolean valid = true;

			for (int index = 0; index < tableHash.length; index++) {
				if (tableHash[index] != data[index]) {
					valid = false;
					break;
				}
			}

			if (valid) {
				return true;
			}
		}

		return false;
	}

}