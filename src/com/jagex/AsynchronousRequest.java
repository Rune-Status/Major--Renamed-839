package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousRequest extends ResourceRequest {
	Future future;
	int padding;

	AsynchronousRequest(int i) {
		padding = i * -1884899963;
	}

	@Override
	int complete() {
		if (null == future) {
			return 0;
		}
		return future.isDone() ? 100 : 0;
	}

	@Override
	byte[] getData() {
		do {
			if (future.isDone()) {
				byte[] data;
				try {
					data = ((AsynchronousStreamRequest) future.get()).getData();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return data;
			}
		} while (false);
		return null;
	}

	void setFuture(Future future) {
		this.future = future;
	}
}
