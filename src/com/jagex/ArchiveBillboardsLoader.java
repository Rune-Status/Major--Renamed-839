package com.jagex;

public class ArchiveBillboardsLoader implements BillboardLoader {

	public static void method6008() {
		synchronized (PlayerAppearance.aClass168_7723) {
			PlayerAppearance.aClass168_7723.clear();
		}

		synchronized (PlayerAppearance.models) {
			PlayerAppearance.models.clear();
		}
	}

	public static boolean method6015(int i) {
		return i >= ObjectCategory.aClass541_7351.type * -1050493863 && i <= -1050493863 * ObjectCategory.aClass541_7354.type;
	}

	Archive billboards;
	ReferenceCache cache = new ReferenceCache(64);
	public static ArchiveBillboardsLoader instance;

	public ArchiveBillboardsLoader(Archive billboards) {
		this.billboards = billboards;
	}

	@Override
	public Billboard load(int id) {
		Billboard billboard = (Billboard) cache.get(id);
		if (null != billboard) {
			return billboard;
		}

		byte[] data = billboards.get(0, id);
		billboard = new Billboard();
		if (data != null) {
			billboard.decode(new Buffer(data));
		}

		cache.put(id, billboard);
		return billboard;
	}

}