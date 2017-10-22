package com.jagex;

public class LoadingRequirement {
	public static LoadingRequirement animations = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement billboards = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement config = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement defaults = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement enumerations = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement fonts = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement graphics = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement huffman = new LoadingRequirement(LoadingRequirementType.ARCHIVE_FILE);
	public static LoadingRequirement hw3d = new LoadingRequirement(LoadingRequirementType.LIBRARY);
	public static LoadingRequirement items = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement jaclib = new LoadingRequirement(LoadingRequirementType.LIBRARY);
	public static LoadingRequirement jagdx = new LoadingRequirement(LoadingRequirementType.LIBRARY);
	public static LoadingRequirement jaggl = new LoadingRequirement(LoadingRequirementType.LIBRARY);
	public static LoadingRequirement npcs = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement objects = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement particles = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement quickChat = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement restrictedQuickChat;
	public static LoadingRequirement scripts = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement shaders = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement sw3d = new LoadingRequirement(LoadingRequirementType.LIBRARY);
	public static LoadingRequirement textureDefs = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement varbits = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement widgets = new LoadingRequirement(LoadingRequirementType.ARCHIVE);
	public static LoadingRequirement worldMap = new LoadingRequirement(LoadingRequirementType.ARCHIVE_CHILDREN);
	static int anInt223;

	public static int method582(int i, int i_2_, byte i_3_) {
		int i_4_ = i_2_ >>> 24;
		int i_5_ = 255 - i_4_;
		i_2_ = (i_4_ * (i_2_ & 0xff00ff) & ~0xff00ff | i_4_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
		return i_2_ + ((i_5_ * (i & 0xff00ff) & ~0xff00ff | (i & 0xff00) * i_5_ & 0xff0000) >>> 8);
	}

	public static LoadingRequirement[] values() {
		return new LoadingRequirement[] { defaults, jaclib, jaggl, jagdx, sw3d, hw3d, shaders, textureDefs, config,
				objects, enumerations, npcs, items, animations, graphics, varbits, quickChat, restrictedQuickChat,
				particles, billboards, huffman, widgets, scripts, fonts, worldMap };
	}

	Loader loader;
	int size = 387061317;
	LoadingRequirementType type;

	LoadingRequirement(LoadingRequirementType type) {
		this.type = type;
	}

	public Loader getLoader() {
		return loader;
	}

	public int getSize() {
		return size * -148075379;
	}

	public void setLoader(Loader loader) {
		if (loader.type() != type) {
			throw new IllegalArgumentException();
		}

		this.loader = loader;
	}

	public void setSize(int size) {
		this.size = size * 387061317;
	}

}