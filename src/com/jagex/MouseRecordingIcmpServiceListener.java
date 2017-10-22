package com.jagex;

final class MouseRecordingIcmpServiceListener implements IcmpServiceListener {

	@Override
	public void notify(int point, int type, int flags) {
		int x = point >> 16;
		int y = point & 0xffff;

		synchronized (NativeMouseRecord.records) {
			NativeMouseRecord.records.add(NativeMouseRecord.create(x, y, type, flags));
		}
	}

	@Override
	public void notify(boolean bool) {

	}

}