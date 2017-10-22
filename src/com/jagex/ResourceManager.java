package com.jagex;

import java.math.BigInteger;

public class ResourceManager {
	public static final void method6709(int i, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
		Class282.anInt3162 = -1244013069 * i;
		VoiceOverVolumeNormaliser.anInt1993 = 1045555115 * i_13_;
		Class166_Sub6.anInt9539 = 507936697 * i_14_;
		Class122.anInt1471 = i_15_ * -1011267305;
		MobShadowsPreference.anInt10475 = 1922250511 * i_16_;

		if (3 == Connection.anInt7170 * 1212513917) {
			Class660.method13657();
		}

		if (bool && 1972295663 * MobShadowsPreference.anInt10475 >= 100) {
			Client.cameraX = Class282.anInt3162 * 805643776 + -1638364928;
			Wall.cameraZ = -866217728 + -666016256 * VoiceOverVolumeNormaliser.anInt1993;
			Class268.cameraY = (Class279.getAverageHeight(Client.cameraX * 2006359481, Wall.cameraZ * 1829446257,
					1611577177 * ProxyingVariableLoader.localPlane) - Class166_Sub6.anInt9539 * 1611257481)
					* -1128143643;
		}

		Connection.anInt7170 = -2080369111;
		TurnMobCutsceneAction.anInt9433 = -1490979241;
		Class156.anInt1886 = -1672889529;
	}

	boolean aBool4545 = false;
	AsynchronousRequest asyncMetaRequest;
	ChecksumTable asyncTable;
	CacheResourceWorker cacheWorker;
	BigInteger exponent;
	PaddedResourceWorker netWorker;
	ParallelHttpProvider parallelProvider;
	ArchiveResourceProvider[] providers;
	BigInteger publicKey;
	ChecksumTable table;
	PaddedResourceRequest tableRequest;

	public ResourceManager(PaddedResourceWorker netWorker, ParallelHttpProvider parallelProvider,
			CacheResourceWorker cacheWorker, BigInteger exponent, BigInteger modulus) {
		this.netWorker = netWorker;
		this.parallelProvider = parallelProvider;
		this.cacheWorker = cacheWorker;

		this.exponent = exponent;
		publicKey = modulus;

		if (!netWorker.priorityUnavailable()) {
			tableRequest = netWorker.request(255, 255, (byte) 0, true);
		}

		if (null != parallelProvider) {
			asyncMetaRequest = parallelProvider.requestReferenceTable();
		}
	}

	public ArchiveResourceProvider getProvider(int type, ResourceCache archives, ResourceCache meta, boolean async) {
		return getProvider(type, archives, meta, true, async);
	}

	public boolean init() {
		if (null != table) {
			return true;
		} else if (null == tableRequest) {
			if (netWorker.priorityUnavailable()) {
				return false;
			}

			tableRequest = netWorker.request(255, 255, (byte) 0, true);
		}

		if (tableRequest.waiting) {
			return false;
		}

		Buffer buffer = new Buffer(tableRequest.getData());
		table = new ChecksumTable(buffer, exponent, publicKey);

		if (providers == null) {
			providers = new ArchiveResourceProvider[table.entries.length];
		} else {
			for (int index = 0; index < providers.length; index++) {
				if (providers[index] != null) {
					ChecksumTableEntry entry = table.entries[index];
					providers[index].requestTable(-907913147 * entry.checksum, entry.hash,
							entry.version * 459084521);

					if (providers[index].hasParallelProvider()) {
						providers[index].enableParalell(false);
					}
				}
			}
		}

		aBool4545 = false;
		return true;
	}

	public void pulse() {
		if (null != providers) {
			for (ArchiveResourceProvider element : providers) {
				if (null != element) {
					element.serveRequests();
				}
			}

			for (ArchiveResourceProvider element : providers) {
				if (element != null) {
					element.loadExtras();
				}
			}

			if (table == null) {
				init();
			} else if (parallelProvider != null && !aBool4545) {
				if (null == asyncMetaRequest) {
					asyncMetaRequest = parallelProvider.requestReferenceTable();
				} else if (!asyncMetaRequest.waiting) {
					byte[] data = asyncMetaRequest.getData();

					try {
						asyncTable = new ChecksumTable(new Buffer(data), exponent, publicKey);
						for (int index = 0; index < providers.length; index++) {
							if (providers[index] != null && providers[index].hasParallelProvider()) {
								ChecksumTableEntry entry = asyncTable.entries[index];

								providers[index].enableParalell(providers[index].validTable(entry.hash,
										entry.checksum * -907913147, 459084521 * entry.version));
							}
						}
					} catch (Exception exception) {
						for (int index = 0; index < providers.length; index++) {
							if (null != providers[index] && providers[index].hasParallelProvider()) {
								providers[index].enableParalell(false);
							}
						}
					}

					asyncMetaRequest = null;
					aBool4545 = true;
				}
			}
		}
	}

	public void reset() {
		table = null;
		tableRequest = null;
		asyncMetaRequest = null;
		aBool4545 = false;

		if (!netWorker.priorityUnavailable()) {
			tableRequest = netWorker.request(255, 255, (byte) 0, true);
		}
	}

	ArchiveResourceProvider getProvider(int type, ResourceCache archives, ResourceCache meta, boolean clearIdle,
			boolean async) {
		if (null == table) {
			throw new RuntimeException();
		} else if (type < 0 || type >= providers.length) {
			throw new RuntimeException();
		} else if (providers[type] != null) {
			return providers[type];
		}

		ChecksumTableEntry entry = table.entries[type];
		ArchiveResourceProvider provider = new ArchiveResourceProvider(type, archives, meta, netWorker,
				async ? parallelProvider : null, cacheWorker, entry.checksum * -907913147, entry.hash,
				entry.version * 459084521, clearIdle);

		providers[type] = provider;
		if (null != asyncTable && async) {
			ChecksumTableEntry asyncEntry = asyncTable.entries[type];
			providers[type].enableParalell(providers[type].validTable(asyncEntry.hash, asyncEntry.checksum
					* -907913147, asyncEntry.version * 459084521));
		}

		return provider;
	}

}