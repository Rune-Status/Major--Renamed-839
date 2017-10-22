package com.jagex;

import java.util.Comparator;

class KeyValuePairComparator implements Comparator<KeyValuePair> {

	@Override
	public int compare(KeyValuePair o1, KeyValuePair o2) {
		if (3520321301416274265L * o1.updateTime > o2.updateTime * 3520321301416274265L) {
			return 1;
		} else if (3520321301416274265L * o1.updateTime < 3520321301416274265L * o2.updateTime) {
			return -1;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		return super.equals(object);
	}

}