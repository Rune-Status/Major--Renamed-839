package com.jagex;

final class IcmpServiceRunnable implements Runnable {

	@Override
	public void run() {
		try {
			NotifyingIcmpService.service.run();
		} catch (Throwable throwable) {

		}

		NotifyingIcmpService.service = null;
	}

}