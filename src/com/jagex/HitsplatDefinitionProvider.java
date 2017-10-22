package com.jagex;

import java.io.DataInputStream;
import java.net.URL;

public class HitsplatDefinitionProvider extends BaseHitsplatDefinitionProvider implements
		DefinitionProvider<HitsplatDefinition> {
	public static int anInt10464;

	public static void reportError(String string, Throwable throwable) {
		try {
			String string_1_ = "";
			if (throwable != null) {
				string_1_ = Client.throwableToString(throwable);
			}
			if (string != null) {
				if (null != throwable) {
					string_1_ = new StringBuilder().append(string_1_).append(" | ").toString();
				}
				string_1_ = new StringBuilder().append(string_1_).append(string).toString();
			}
			Client.printError(string_1_);
			string_1_ = SocketProvider.toUrlSafe(string_1_);
			if (null != ContainerDecodingException.anApplet11638) {
				String string_2_ = "Unknown";
				String string_3_ = "1.1";
				try {
					string_2_ = System.getProperty("java.vendor");
					string_3_ = System.getProperty("java.version");
				} catch (Exception exception) {

				}
				URL url = new URL(ContainerDecodingException.anApplet11638.getCodeBase(), new StringBuilder()
						.append("clienterror.ws?c=")
						.append(-579094205 * ContainerDecodingException.revision)
						.append("&cs=")
						.append(Class628.anInt8049 * -527518945)
						.append("&u=")
						.append(null != ContainerDecodingException.localDisplayName ? SocketProvider
								.toUrlSafe(ContainerDecodingException.localDisplayName) : new StringBuilder()
								.append("").append(ContainerDecodingException.aLong11643 * 5285550022229928747L)
								.toString()).append("&v1=").append(SocketProvider.toUrlSafe(string_2_)).append("&v2=")
						.append(SocketProvider.toUrlSafe(string_3_)).append("&e=").append(string_1_).toString());
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	HitsplatDefinitionProvider(Archive images) {
		super(images);
	}

	@Override
	public Class<HitsplatDefinition> getClassType() {
		return HitsplatDefinition.class;
	}

	@Override
	public HitsplatDefinition provide(int id, DefinitionLoader loader) {
		return new HitsplatDefinition(id, this, loader);
	}

}