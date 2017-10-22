package com.jagex;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class NativeMouseRecord extends MouseRecord {

	static final int anInt11369 = 170;
	static NativeMouseRecord[] cache = new NativeMouseRecord[0];
	static int cacheSize;
	static int maximumCacheSize;

	static final int WM_LBUTTONDBLCLK = 515;
	static final int WM_LBUTTONDOWN = 513;
	static final int WM_LBUTTONUP = 514;
	static final int WM_MBUTTONDBLCLK = 521;
	static final int WM_MBUTTONDOWN = 519;
	static final int WM_MBUTTONUP = 520;
	static final int WM_MOUSEMOVE = 512;
	static final int WM_MOUSEWHEEL = 522;
	static final int WM_NCLBUTTONDBLCLK = 163;
	static final int WM_NCLBUTTONDOWN = 161;
	static final int WM_NCLBUTTONUP = 162;
	static final int WM_NCMBUTTONDBLCLK = 169;
	static final int WM_NCMBUTTONDOWN = 167;
	static final int WM_NCMBUTTONUP = 168;
	static final int WM_NCMOUSEHOVER = 672;
	static final int WM_NCMOUSELEAVE = 674;
	static final int WM_NCMOUSEMOVE = 160;
	static final int WM_NCRBUTTONDBLCLK = 166;
	static final int WM_NCRBUTTONDOWN = 164;
	static final int WM_NCRBUTTONUP = 165;
	static final int WM_NCUAHDRAWCAPTION = 174;
	static final int WM_NCXBUTTONDBLCLK = 173;
	static final int WM_NCXBUTTONDOWN = 171;
	static final int WM_NCXBUTTONUP = 172;
	static final int WM_RBUTTONDBLCLK = 518;
	static final int WM_RBUTTONDOWN = 516;
	static final int WM_RBUTTONUP = 517;
	static final int WM_XBUTTONDBLCLK = 525;

	public static NativeMouseRecord create(int x, int y, int identifier, int flags) {
		synchronized (cache) {
			NativeMouseRecord record;
			if (cacheSize * 200754573 == 0) {
				record = new NativeMouseRecord();
			} else {
				record = cache[(cacheSize -= 1914209605) * 200754573];
			}

			record.x = 618333013 * x;
			record.y = -300302803 * y;
			record.identifier = 541041501 * identifier;
			record.flags = flags * -942751235;
			record.time = TimeUtil.time() * 8703402675496313867L;
			return record;
		}
	}

	int flags;
	int identifier;
	long time;
	int x;
	int y;
	static Queue<NativeMouseRecord> records = new LinkedList();
	static NativeMouseRecordEncoder encoder = new NativeMouseRecordEncoder();

	@Override
	public void cache() {
		synchronized (cache) {
			if (cacheSize * 200754573 < 1693261151 * NativeMouseRecord.maximumCacheSize - 1) {
				cache[(cacheSize += 1914209605) * 200754573 - 1] = this;
			}
		}
	}

	@Override
	public int getClickType() {
		switch (-1713846027 * identifier) {
			case 170:
			case WM_MOUSEWHEEL:
				return WHEEL_TYPE;
			case WM_NCLBUTTONDOWN:
			case WM_NCLBUTTONDBLCLK:
			case WM_LBUTTONDOWN:
			case WM_LBUTTONDBLCLK:
				return LEFT_BUTTON_DOWN_TYPE;
			case WM_NCRBUTTONDOWN:
			case WM_NCRBUTTONDBLCLK:
			case WM_RBUTTONDOWN:
			case WM_RBUTTONDBLCLK:
				return RIGHT_BUTTON_DOWN_TYPE;
			case WM_NCMBUTTONUP:
			case WM_MBUTTONUP:
				return MIDDLE_BUTTON_UP_TYPE;
			case WM_NCMOUSEMOVE:
			case WM_MOUSEMOVE:
				return MOVE_TYPE;
			case WM_NCMBUTTONDOWN:
			case WM_NCMBUTTONDBLCLK:
			case WM_MBUTTONDOWN:
			case WM_MBUTTONDBLCLK:
				return MIDDLE_BUTTON_DOWN_TYPE;
			case WM_NCRBUTTONUP:
			case WM_RBUTTONUP:
				return RIGHT_BUTTON_UP_TYPE;
			case WM_NCLBUTTONUP:
			case WM_LBUTTONUP:
				return LEFT_BUTTON_UP_TYPE;
		}

		return -2;
	}

	public int getFlags() {
		return flags * 560210773;
	}

	public int getMessageIdentifier() {
		return identifier * -1713846027;
	}

	@Override
	public int getMeta() {
		switch (-1713846027 * identifier) {
			case WM_NCLBUTTONDBLCLK:
			case WM_NCRBUTTONDBLCLK:
			case WM_NCMBUTTONDBLCLK:
			case WM_NCXBUTTONDBLCLK:
			case WM_LBUTTONDBLCLK:
			case WM_RBUTTONDBLCLK:
			case WM_MBUTTONDBLCLK:
			case WM_XBUTTONDBLCLK:
				return 2;
			case WM_NCMOUSEMOVE:
			case WM_MOUSEMOVE:
				return 0;
		}

		return 1;
	}

	@Override
	public long getTime() {
		return 4441775900937684899L * time;
	}

	@Override
	public int getX() {
		return x * -14622211;
	}

	@Override
	public int getY() {
		return y * -218414683;
	}

	public boolean isNonClient() {
		switch (identifier * -1713846027) {
			case WM_NCMOUSEMOVE:
			case WM_NCLBUTTONDOWN:
			case WM_NCLBUTTONUP:
			case WM_NCLBUTTONDBLCLK:
			case WM_NCRBUTTONDOWN:
			case WM_NCRBUTTONUP:
			case WM_NCRBUTTONDBLCLK:
			case WM_NCMBUTTONDOWN:
			case WM_NCMBUTTONUP:
			case WM_NCMBUTTONDBLCLK:
			case 170:
			case WM_NCXBUTTONDOWN:
			case WM_NCXBUTTONUP:
			case WM_NCXBUTTONDBLCLK:
			case WM_NCUAHDRAWCAPTION:
			case WM_NCMOUSEHOVER:
			case WM_NCMOUSELEAVE:
				return true;
		}

		return false;
	}

	public void offset(Point point) {
		x -= 618333013 * point.x;
		y -= -300302803 * point.y;
	}

	public static void cacheAll() {
		synchronized (records) {
			for (;;) {
				NativeMouseRecord next = records.poll();
				if (null == next) {
					break;
				}

				next.cache();
			}
		}
	}

	public static void init(int size) {
		maximumCacheSize = -2089124193 * size;
		cache = new NativeMouseRecord[size];
		cacheSize = 0;
	}

	static void method3315() {
		synchronized (NativeMouseRecord.records) {
			Point location = null;
			if (Engine.aCanvas6501.isShowing()) {
				location = Engine.aCanvas6501.getLocationOnScreen();
			}

			for (;;) {
				NativeMouseRecord record = NativeMouseRecord.records.poll();
				if (record == null) {
					break;
				}

				if (null == location || !Engine.aCanvas6501.isShowing() || !HashedVariableCollection.aBool1483) {
					record.cache();
				} else {
					record.offset(location);
					if (!record.isNonClient() && record.getX() < Engine.screenWidth * 1319181337
							&& record.getY() < Engine.screenHeight * -551672947 && record.getX() >= 0
							&& record.getY() >= 0) {
						int i_4_ = record.getClickType();
						if (record.getClickType() == -1) {
							NativeMouseRecord.encoder.enqueue(record);
						} else if (Deque.method13350(i_4_)) {
							NativeMouseRecord.encoder.recordClick(record);
						}
					}
				}
			}
		}
	}

}