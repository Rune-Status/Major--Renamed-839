package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class552 implements Interface66 {

	int anInt7486;
	Class563 aClass563_7487 = Class563.aClass563_7557;
	int id;
	Archive sounds;
	Interface63 anInterface63_7490;
	byte[] data;
	ReferenceCache aClass168_7492;
	Class343 aClass343_7493;
	boolean aBool7494;
	boolean aBool7495;

	public Class552(Archive soundEffects, int id, Class343 class343, Interface63 interface63, ReferenceCache class168) {
		sounds = soundEffects;
		this.id = 551208251 * id;
		aClass343_7493 = class343;
		anInterface63_7490 = interface63;
		aClass168_7492 = class168;
		aBool7494 = aClass168_7492 != null;
		aClass563_7487 = Class563.aClass563_7558;
	}

	@Override
	public void method172() {
		if (Class563.aClass563_7558 == aClass563_7487) {
			byte[] data = sounds.get(-1362899981 * id);
			if (data != null) {
				this.data = data;
				aClass563_7487 = Class563.aClass563_7559;

				if (anInterface63_7490 != null) {
					anInterface63_7490.method401(this, data.length, -1362899981 * id, false);
				}
			}
		}
	}

	@Override
	public void method331() {
		if (Class563.aClass563_7558 == aClass563_7487) {
			byte[] data = sounds.get(-1362899981 * id);

			if (data != null) {
				this.data = data;
				aClass563_7487 = Class563.aClass563_7559;

				if (anInterface63_7490 != null) {
					anInterface63_7490.method401(this, data.length, -1362899981 * id, false);
				}
			}
		}
	}

	@Override
	public void method412(Buffer buffer) {
		if (null != aClass168_7492) {
			if (anInterface63_7490 != null) {
				anInterface63_7490.method404(this);
			}

			if (aBool7495) {
				throw new RuntimeException("");
			}

			synchronized (aClass168_7492) {
				List<Buffer> list = method9343();
				if (list != null) {
					list.add(buffer);
					anInt7486 += buffer.payload.length * 379837451;
					method9342(list, anInt7486 * 486199203);
				}
			}
		}
	}

	@Override
	public Class563 method413() {
		return aClass563_7487;
	}

	@Override
	public boolean method414() {
		return false;
	}

	@Override
	public byte[] get(int id) {
		if (null != anInterface63_7490) {
			anInterface63_7490.method404(this);
		}

		return data;
	}

	@Override
	public Class456 method416() {
		Class456 class456 = new Class456(aClass343_7493);
		class456.method7427(this);
		return class456;
	}

	@Override
	public Class457 method417() {
		return Class457.aClass457_5141;
	}

	@Override
	public int getId() {
		return id * -1362899981;
	}

	@Override
	public Buffer method420(int i) {
		if (aClass168_7492 == null) {
			return null;
		}

		Buffer buffer = null;
		if (anInterface63_7490 != null) {
			anInterface63_7490.method404(this);
		}

		synchronized (aClass168_7492) {
			List list = method9343();
			if (list.size() > i) {
				buffer = (Buffer) list.get(i);
			}
		}

		return buffer;
	}

	@Override
	public boolean method422(int i) {
		if (null == aClass168_7492) {
			return false;
		}

		boolean bool = false;
		synchronized (aClass168_7492) {
			List list = method9343();
			if (null != list && list.size() > i) {
				bool = list.get(i) != null;
			}
		}

		return bool;
	}

	@Override
	public int method429(int i) {
		if (aClass168_7492 == null) {
			return 0;
		}

		int i_1_ = 0;
		synchronized (aClass168_7492) {
			List list = method9343();
			if (list != null) {
				i_1_ = list.size();
			}
		}

		return i_1_;
	}

	@Override
	public boolean method442() {
		return aClass168_7492 != null && aBool7494;
	}

	@Override
	public int method445() {
		if (data != null) {
			return data.length;
		}
		return 0;
	}

	@Override
	public void method447(boolean bool) {
		if (anInterface63_7490 != null) {
			anInterface63_7490.method404(this);
		}
		aBool7495 = bool;
	}

	@Override
	public boolean method450() {
		if (null == aClass168_7492) {
			return false;
		}

		List list = method9343();
		if (null == list || list.size() <= 0) {
			aBool7495 = false;
		}

		return aBool7495;
	}

	void method9342(List list, int i) {
		if (aClass168_7492 != null && null != list && i >= 0) {
			synchronized (aClass168_7492) {
				aClass168_7492.remove(-1362899981 * id);

				if (i <= aClass168_7492.capacity()) {
					aClass168_7492.put(id * -1362899981, list, i);
				} else {
					aBool7494 = false;
					aBool7495 = false;
					anInt7486 = 0;
				}
			}
		}
	}

	List method9343() {
		if (aClass168_7492 == null || false == aBool7494) {
			return null;
		}

		List list;
		synchronized (aClass168_7492) {
			list = (List) aClass168_7492.get(-1362899981 * id);
			if (null == list && aBool7494) {
				list = new ArrayList();
				aClass168_7492.put(-1362899981 * id, list, 0);
			}
		}

		return list;
	}

}