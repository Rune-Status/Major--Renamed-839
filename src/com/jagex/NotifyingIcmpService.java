package com.jagex;

import jaclib.ping.IcmpService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotifyingIcmpService extends IcmpService {

	static volatile NotifyingIcmpService service;

	public static boolean start() {
		try {
			if (!IcmpService.available()) {
				return false;
			}
		} catch (Throwable throwable) {
			return false;
		}

		if (service != null) {
			throw new IllegalStateException("");
		}

		service = new NotifyingIcmpService();
		Thread thread = new Thread(new IcmpServiceRunnable());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	List<IcmpServiceListener> listeners = new ArrayList<IcmpServiceListener>();

	@Override
	protected void notify(int dummy) {
		Iterator<IcmpServiceListener> iterator = listeners.iterator();

		while (iterator.hasNext()) {
			IcmpServiceListener listener = iterator.next();
			listener.notify(0 == dummy);
		}
	}

	@Override
	protected void notify(int point, int type, int flags) {
		Iterator<IcmpServiceListener> iterator = listeners.iterator();

		while (iterator.hasNext()) {
			IcmpServiceListener listener = iterator.next();
			listener.notify(point, type, flags);
		}
	}

}