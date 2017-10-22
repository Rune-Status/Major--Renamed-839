package com.jagex;

public class ArchiveFileLoader implements Loader {

	static void method6965(Class506 class506) {
		class506.aClass600_Sub1_6962 = null;
		synchronized (Class506.aStack6961) {
			if (Class506.aStack6961.size() < 200) {
				Class506.aStack6961.push(class506);
			}
		}
	}

	String name;
	Archive archive;

	ArchiveFileLoader(Archive archive, String string) {
		this.archive = archive;
		name = string;
	}

	@Override
	public int completion() {
		if (archive.fileLoaded(name)) {
			return 100;
		}
		return 0;
	}

	@Override
	public LoadingRequirementType type() {
		return LoadingRequirementType.ARCHIVE_FILE;
	}

}