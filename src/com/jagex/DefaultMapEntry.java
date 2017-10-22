package com.jagex;

public class DefaultMapEntry {
	public static void addChatMessage(String string) {
		Class176.addChatMessage(0, 0, "", "", "", string, null);
	}

	static boolean method6279() {
		Class31.loginType = 472539564;
		Class31.activeConnection = Client.lobbyConnection;
		return Class110.method2024(-3559573875977646889L * Class31.accountName == -1L, true, "", "",
				-3559573875977646889L * Class31.accountName);
	}

	public Object value;
	public int key;

	public DefaultMapEntry(int id) {
		key = id * 1328279195;
	}

	public DefaultMapEntry(int key, Object value) {
		this.key = key * 1328279195;
		this.value = value;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DefaultMapEntry)) {
			return false;
		}

		DefaultMapEntry other = (DefaultMapEntry) object;
		if (other.value == null && null != value) {
			return false;
		} else if (value == null && null != other.value) {
			return false;
		}

		return 1960527763 * other.key == 1960527763 * key && other.value.equals(value);
	}

}