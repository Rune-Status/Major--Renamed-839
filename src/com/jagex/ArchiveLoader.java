package com.jagex;

public class ArchiveLoader implements Loader {
	public static Class622 aClass622_4521;
	public static ResourceManager aClass402_4522;

	Archive archive;

	ArchiveLoader(Archive archive) {
		this.archive = archive;
	}

	@Override
	public int completion() {
		if (archive.complete()) {
			return 100;
		}
		return archive.percentComplete();
	}

	@Override
	public LoadingRequirementType type() {
		return LoadingRequirementType.ARCHIVE;
	}

}