package com.jagex;

public class ArchiveChildLoader implements Loader {

	int id;
	Archive archive;

	ArchiveChildLoader(Archive archive, int id) {
		this.archive = archive;
		this.id = id * 2048201067;
	}

	@Override
	public int completion() {
		if (archive.loadEntry(-311127229 * id)) {
			return 100;
		}

		return archive.percentComplete(-311127229 * id);
	}

	@Override
	public LoadingRequirementType type() {
		return LoadingRequirementType.ARCHIVE_CHILDREN;
	}

}