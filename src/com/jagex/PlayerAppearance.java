package com.jagex;

public class PlayerAppearance {
	public static final int anInt7713 = 1073741824;
	public static final int anInt7716 = -2147483648;
	static ReferenceCache aClass168_7723 = new ReferenceCache(260);
	static ReferenceCache models = new ReferenceCache(5);
	static final int anInt7712 = 1073741823;
	static int anInt7725;
	static int[] IDENTIKIT_EQUIPMENT_SLOTS = { 8, 11, 4, 6, 9, 7, 10, 0 };

	static final void method9805(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		class226.anInt2382 = 1537419193 * class613.anIntArray7942[class613.anInt7924 * 1841827045];
		if (class226.anInt2382 * -1909412215 > class226.scrollWidth * 731337999 - 688089097 * class226.width) {
			class226.anInt2382 = class226.scrollWidth * 199147735 - class226.width * -1727361663;
		}
		if (-1909412215 * class226.anInt2382 < 0) {
			class226.anInt2382 = 0;
		}
		class226.scrollPosition = 1223217383 * class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		if (-1881455913 * class226.scrollPosition > -184691147 * class226.scrollHeight - 1362321717 * class226.height) {
			class226.scrollPosition = 1461672403 * class226.scrollHeight - 73385683 * class226.height;
		}
		if (-1881455913 * class226.scrollPosition < 0) {
			class226.scrollPosition = 0;
		}
		Widget.redraw(class226);
		if (class226.component * -592186295 == -1 && !class221.aBool2278) {
			PulseEvent.resetWidgetScrollPosition(1857819631 * class226.id);
		}
	}

	static final void method9806(ScriptExecutionContext class613, int i) {
		class613.anInt7924 -= -2049596966;
		int i_78_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_79_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		if (i_78_ >= 0 && i_78_ < 2) {
			Client.anIntArrayArrayArray10720[i_78_] = new int[i_79_ << 1][4];
		}
	}

	static DefaultHashMap method9807(Buffer buffer, DefaultProvidingVarpLoader varpLoader) {
		DefaultHashMap defaults = new DefaultHashMap(varpLoader);
		for (;;) {
			int i_80_ = buffer.readUByte();
			if (255 == i_80_) {
				break;
			}

			ValueType type = (ValueType) Class608.method15335(ValueType.class, i_80_);
			for (;;) {
				int i_81_ = buffer.readUByte();
				if (i_81_ == 255) {
					break;
				}

				buffer.offset -= 1258142129;
				DefaultMapEntry entry = varpLoader.method13919(buffer, type);
				if (entry != null) {
					defaults.put(1960527763 * entry.key, entry.value);
				}
			}
		}
		return defaults;
	}

	public int npc = 256357699;
	public int[] bodyColours;
	public boolean male;
	long aLong7721;
	int anInt7714;
	CustomisedItem[] customs;
	int[] equipment;
	long hash;

	public void setMale(boolean male) {
		this.male = male;
		computeHash();
	}

	public void update(int i, int[] equipment, CustomisedItem[] customs, int[] colours, boolean male, int npc) {
		if (-1424351959 * anInt7714 != i) {
			anInt7714 = i * -1295528167;
		}

		this.equipment = equipment;
		this.customs = customs;
		bodyColours = colours;
		this.male = male;
		this.npc = npc * -256357699;
		computeHash();
	}

	public void setKit(IdentikitDefinitionLoader loader, int id, int slot) {
		int index = IDENTIKIT_EQUIPMENT_SLOTS[slot];
		if (loader.get(id) != null) {
			equipment[index] = id | ~0x7fffffff;
			computeHash();
		}
	}

	public void setColour(int index, int colour) {
		bodyColours[index] = colour;
		computeHash();
	}

	public void equip(ItemDefinitionLoader loader, int id, int slot) {
		if (id == -1) {
			equipment[slot] = 0;
		} else if (loader.get(id) != null) {
			equipment[slot] = id | 0x40000000;
			computeHash();
		}
	}

	public Model method9773(Toolkit toolkit, int initialMask, Class678_Sub6 class678_sub6,
			IdentikitDefinitionLoader kitLoader, NpcDefinitionLoader npcLoader, ItemDefinitionLoader itemLoader,
			VariableLoader interface14, VariableProvider interface12, Class650 class650, Class650 class650_10_,
			Class650[] class650s, int[] is, int i_11_, boolean bool, EquipmentDefaults class561) {
		if (-1 != npc * 1639350421) {
			return npcLoader.get(1639350421 * npc).method5103(toolkit, initialMask, class678_sub6, interface14,
					interface12, class650, class650_10_, class650s, is, i_11_, null);
		}

		int functionMask = initialMask;
		long l = hash * -5936278970608059915L;
		int[] usedEquipment = equipment;
		boolean bool_15_ = false;
		boolean bool_16_ = false;

		if (null != class650) {
			AnimationDefinition animation = class650.getAnimation();

			if (null != animation && (animation.offhand * -1962776339 >= 0 || -1861529809 * animation.mainhand >= 0)) {
				usedEquipment = new int[equipment.length];
				for (int part = 0; part < usedEquipment.length; part++) {
					usedEquipment[part] = equipment[part];
				}

				if (animation.offhand * -1962776339 >= 0 && -1 != -1187728569 * class561.offhandSlot) {
					bool_15_ = true;

					if (65535 == -1962776339 * animation.offhand) {
						usedEquipment[class561.offhandSlot * -1187728569] = 0;

						for (int i_18_ = 0; i_18_ < class561.hiddenAnimationOffhandSlots.length; i_18_++) {
							usedEquipment[class561.hiddenAnimationOffhandSlots[i_18_]] = 0;
						}

						l ^= ~0xffffffffL;
					} else {
						usedEquipment[class561.offhandSlot * -1187728569] = animation.offhand * -1962776339
								| 0x40000000;

						for (int i_19_ = 0; i_19_ < class561.hiddenAnimationOffhandSlots.length; i_19_++) {
							usedEquipment[class561.hiddenAnimationOffhandSlots[i_19_]] = 0;
						}

						l ^= (long) usedEquipment[class561.offhandSlot * -1187728569] << 32;
					}
				}

				if (animation.mainhand * -1861529809 >= 0 && -1 != 617598299 * class561.weaponSlot) {
					bool_16_ = true;

					if (-1861529809 * animation.mainhand == 65535) {
						usedEquipment[617598299 * class561.weaponSlot] = 0;
						for (int i_20_ = 0; i_20_ < class561.hiddenAnimationWeaponSlots.length; i_20_++) {
							usedEquipment[class561.hiddenAnimationWeaponSlots[i_20_]] = 0;
						}

						l ^= 0xffffffffL;
					} else {
						usedEquipment[617598299 * class561.weaponSlot] = animation.mainhand * -1861529809 | 0x40000000;
						for (int i_21_ = 0; i_21_ < class561.hiddenAnimationWeaponSlots.length; i_21_++) {
							usedEquipment[class561.hiddenAnimationWeaponSlots[i_21_]] = 0;
						}

						l ^= usedEquipment[class561.weaponSlot * 617598299];
					}
				}
			}
		}

		boolean bool_22_ = false;
		int i_23_ = class650s != null ? class650s.length : 0;
		for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
			if (class650s[i_24_] != null) {
				functionMask |= class650s[i_24_].method13457();
				bool_22_ = true;
			}
		}
		if (null != class650) {
			functionMask |= class650.method13457();
			bool_22_ = true;
		}
		if (null != class650_10_) {
			functionMask |= class650_10_.method13457();
			bool_22_ = true;
		}
		boolean bool_25_ = false;
		if (is != null) {
			for (int element : is) {
				if (element != -1) {
					functionMask |= 0x20;
					bool_25_ = true;
				}
			}
		}
		Model class143;
		synchronized (aClass168_7723) {
			class143 = (Model) aClass168_7723.get(l);
		}
		Class515 class515 = null;
		if (-1 != -1424351959 * anInt7714) {
			class515 = class678_sub6.get(anInt7714 * -1424351959);
		}
		if (class143 == null || toolkit.method2637(class143.functionMask(), functionMask) != 0) {
			if (class143 != null) {
				functionMask = toolkit.mergeFunctionMasks(functionMask, class143.functionMask());
			}
			int i_27_ = functionMask;
			boolean bool_28_ = false;
			for (int i_29_ = 0; i_29_ < usedEquipment.length; i_29_++) {
				int i_30_ = usedEquipment[i_29_];
				CustomisedItem class676 = null;
				boolean bool_31_ = false;
				if (bool_15_) {
					if (i_29_ == class561.offhandSlot * -1187728569) {
						bool_31_ = true;
					} else {
						for (int element : class561.hiddenAnimationOffhandSlots) {
							if (element == i_29_) {
								bool_31_ = true;
								break;
							}
						}
					}
				}
				if (bool_16_) {
					if (i_29_ == class561.weaponSlot * 617598299) {
						bool_31_ = true;
					} else {
						for (int element : class561.hiddenAnimationWeaponSlots) {
							if (element == i_29_) {
								bool_31_ = true;
								break;
							}
						}
					}
				}
				if (0 != (i_30_ & 0x40000000)) {
					if (!bool_31_ && customs != null && customs[i_29_] != null) {
						class676 = customs[i_29_];
					}
					if (!itemLoader.get(i_30_ & 0x3fffffff).modelsLoaded(male, class676)) {
						bool_28_ = true;
					}
				} else if ((i_30_ & ~0x7fffffff) != 0 && !kitLoader.get(i_30_ & 0x3fffffff).modelsLoaded()) {
					bool_28_ = true;
				}
			}
			if (bool_28_) {
				if (8459110858179248923L * aLong7721 != -1L) {
					synchronized (aClass168_7723) {
						class143 = (Model) aClass168_7723.get(8459110858179248923L * aLong7721);
					}
				}
				if (class143 == null || toolkit.method2637(class143.functionMask(), functionMask) != 0) {
					return null;
				}
			} else {
				BaseModel[] class144s = new BaseModel[usedEquipment.length];
				for (int i_34_ = 0; i_34_ < usedEquipment.length; i_34_++) {
					int i_35_ = usedEquipment[i_34_];
					CustomisedItem class676 = null;
					boolean bool_36_ = i_34_ == 5 && bool_15_ || i_34_ == 3 && bool_16_;
					if ((i_35_ & 0x40000000) != 0) {
						if (!bool_36_ && customs != null && customs[i_34_] != null) {
							class676 = customs[i_34_];
						}
						BaseModel class144 = itemLoader.get(i_35_ & 0x3fffffff).getModel(male, class676);
						if (null != class144) {
							class144s[i_34_] = class144;
						}
					} else if ((i_35_ & ~0x7fffffff) != 0) {
						BaseModel class144 = kitLoader.get(i_35_ & 0x3fffffff).getModel();
						if (null != class144) {
							class144s[i_34_] = class144;
						}
					}
				}
				if (class515 != null && class515.anIntArrayArray7043 != null) {
					for (int i_37_ = 0; i_37_ < class515.anIntArrayArray7043.length; i_37_++) {
						if (class144s[i_37_] != null) {
							int i_38_ = 0;
							int i_39_ = 0;
							int i_40_ = 0;
							int i_41_ = 0;
							int i_42_ = 0;
							int i_43_ = 0;
							if (null != class515.anIntArrayArray7043[i_37_]) {
								i_38_ = class515.anIntArrayArray7043[i_37_][0];
								i_39_ = class515.anIntArrayArray7043[i_37_][1];
								i_40_ = class515.anIntArrayArray7043[i_37_][2];
								i_41_ = class515.anIntArrayArray7043[i_37_][3] << 3;
								i_42_ = class515.anIntArrayArray7043[i_37_][4] << 3;
								i_43_ = class515.anIntArrayArray7043[i_37_][5] << 3;
							}
							if (0 != i_41_ || i_42_ != 0 || i_43_ != 0) {
								class144s[i_37_].method3102(i_41_, i_42_, i_43_);
							}
							if (0 != i_38_ || 0 != i_39_ || i_40_ != 0) {
								class144s[i_37_].translate(i_38_, i_39_, i_40_);
							}
						}
					}
				}
				BaseModel class144 = new BaseModel(class144s, class144s.length);
				i_27_ |= 0x4000;
				class143 = toolkit.createModel(class144, i_27_, -10000529 * anInt7725, 64, 850);
				for (int i_44_ = 0; i_44_ < 10; i_44_++) {
					for (int i_45_ = 0; i_45_ < UnboundedDefinitionLoader.originalBodyColours[i_44_].length; i_45_++) {
						if (bodyColours[i_44_] < HuffmanCodec.replacementBodyColours[i_44_][i_45_].length) {
							class143.recolour(UnboundedDefinitionLoader.originalBodyColours[i_44_][i_45_],
									HuffmanCodec.replacementBodyColours[i_44_][i_45_][bodyColours[i_44_]]);
						}
					}
				}
				class143.method2962();
				if (bool) {
					class143.updateFunctionMask(functionMask);
					synchronized (aClass168_7723) {
						aClass168_7723.put(l, class143);
					}
					aLong7721 = -3582180180391223533L * l;
				}
			}
		}
		Model class143_46_ = class143.method2890((byte) 4, functionMask, true);
		if (!bool_22_ && !bool_25_) {
			return class143_46_;
		}
		Class405[] class405s = null;
		if (class515 != null) {
			class405s = class515.method8826();
		}
		if (bool_25_ && null != class405s) {
			for (int i_47_ = 0; i_47_ < is.length; i_47_++) {
				if (class405s[i_47_] != null) {
					class143_46_.transform(class405s[i_47_], 1 << i_47_, true);
				}
			}
		}
		int i_48_ = 0;
		int i_49_ = 1;
		while (i_48_ < i_23_) {
			if (null != class650s[i_48_]) {
				class650s[i_48_].method13459(class143_46_, 0, i_49_, 1386035661);
			}
			i_48_++;
			i_49_ <<= 1;
		}
		if (bool_25_) {
			for (i_48_ = 0; i_48_ < is.length; i_48_++) {
				if (-1 != is[i_48_]) {
					i_49_ = is[i_48_] - i_11_;
					i_49_ &= 0x3fff;
					Class405 class405 = new Class405();
					class405.method6758(0.0F, 1.0F, 0.0F, Class373.method6114(i_49_));
					class143_46_.transform(class405, 1 << i_48_, false);
				}
			}
		}
		if (bool_25_ && class405s != null) {
			for (i_48_ = 0; i_48_ < is.length; i_48_++) {
				if (class405s[i_48_] != null) {
					class143_46_.transform(class405s[i_48_], 1 << i_48_, false);
				}
			}
		}
		if (class650 != null && null != class650_10_) {
			QuestDefinitionProvider.method4610(class143_46_, class650, class650_10_);
		} else if (null != class650) {
			class650.method13458(class143_46_, 0);
		} else if (null != class650_10_) {
			class650_10_.method13458(class143_46_, 0);
		}
		return class143_46_;
	}

	public Model createHeadModel(Toolkit toolkit, int i, IdentikitDefinitionLoader kitLoader,
			NpcDefinitionLoader npcLoader, ItemDefinitionLoader itemLoader, VariableLoader interface14,
			VariableProvider interface12, Class650 class650) {
		if (-1 != 1639350421 * npc) {
			return npcLoader.get(npc * 1639350421).method5105(toolkit, i, interface14, interface12, class650, null);
		}

		int i_51_ = null != class650 ? i | class650.method13457() : i;
		Model cached;
		synchronized (models) {
			cached = (Model) models.get(-5936278970608059915L * hash);
		}

		if (null == cached || toolkit.method2637(cached.functionMask(), i_51_) != 0) {
			if (null != cached) {
				i_51_ = toolkit.mergeFunctionMasks(i_51_, cached.functionMask());
			}

			int i_52_ = i_51_;
			boolean invalid = false;

			for (int part = 0; part < equipment.length; part++) {
				int id = equipment[part];
				CustomisedItem customised = null;

				if ((id & 0x40000000) != 0) {
					if (null != customs && null != customs[part]) {
						customised = customs[part];
					}

					if (!itemLoader.get(id & 0x3fffffff).headLoaded(male, customised)) {
						invalid = true;
					}
				} else if (0 != (id & ~0x7fffffff) && !kitLoader.get(id & 0x3fffffff).headLoaded()) {
					invalid = true;
				}
			}

			if (invalid) {
				return null;
			}

			BaseModel[] heads = new BaseModel[equipment.length];
			int modelCount = 0;

			for (int part = 0; part < equipment.length; part++) {
				int id = equipment[part];
				CustomisedItem customised = null;

				if ((id & 0x40000000) != 0) {
					if (customs != null && null != customs[part]) {
						customised = customs[part];
					}

					BaseModel head = itemLoader.get(id & 0x3fffffff).getHeadModel(male, customised);

					if (head != null) {
						heads[modelCount++] = head;
					}
				} else if (0 != (id & ~0x7fffffff)) {
					BaseModel head = kitLoader.get(id & 0x3fffffff).getHeadModel();
					if (null != head) {
						heads[modelCount++] = head;
					}
				}
			}

			BaseModel head = new BaseModel(heads, modelCount);
			i_52_ |= 0x4000;
			cached = toolkit.createModel(head, i_52_, -10000529 * anInt7725, 64, 768);

			for (int part = 0; part < 10; part++) {
				for (int index = 0; index < UnboundedDefinitionLoader.originalBodyColours[part].length; index++) {
					if (bodyColours[part] < HuffmanCodec.replacementBodyColours[part][index].length) {
						cached.recolour(UnboundedDefinitionLoader.originalBodyColours[part][index],
								HuffmanCodec.replacementBodyColours[part][index][bodyColours[part]]);
					}
				}
			}

			cached.updateFunctionMask(i_51_);
			synchronized (models) {
				models.put(hash * -5936278970608059915L, cached);
			}
		}

		if (null == class650) {
			return cached;
		}

		Model model = cached.method2890((byte) 4, i_51_, true);
		class650.method13458(model, 0);
		return model;
	}

	public Model createHeadModel(Toolkit toolkit, int i, IdentikitDefinitionLoader kitLoader,
			AnimationDefinitionLoader class678_sub10, Class650 class650, int i_61_, int i_62_, int i_63_, int i_64_) {
		int i_65_ = null != class650 ? i | class650.method13457() : i;
		long modelId = (long) i_63_ << 32 | i_62_ << 16 | i_61_;
		Model model;
		synchronized (models) {
			model = (Model) models.get(modelId);
		}

		if (null == model || toolkit.method2637(model.functionMask(), i_65_) != 0) {
			if (model != null) {
				i_65_ = toolkit.mergeFunctionMasks(i_65_, model.functionMask());
			}

			int i_66_ = i_65_;
			BaseModel[] models = new BaseModel[3];

			int modelCount = 0;
			if (kitLoader.get(i_61_).headLoaded() && kitLoader.get(i_62_).headLoaded()
					&& kitLoader.get(i_63_).headLoaded()) {
				BaseModel head = kitLoader.get(i_61_).getHeadModel();
				if (head != null) {
					models[modelCount++] = head;
				}

				head = kitLoader.get(i_62_).getHeadModel();
				if (null != head) {
					models[modelCount++] = head;
				}

				head = kitLoader.get(i_63_).getHeadModel();
				if (null != head) {
					models[modelCount++] = head;
				}

				head = new BaseModel(models, modelCount);
				i_66_ |= 0x4000;
				model = toolkit.createModel(head, i_66_, -10000529 * anInt7725, 64, 768);

				for (int part = 0; part < 10; part++) {
					for (int index = 0; index < UnboundedDefinitionLoader.originalBodyColours[part].length; index++) {
						if (bodyColours[part] < HuffmanCodec.replacementBodyColours[part][index].length) {
							model.recolour(UnboundedDefinitionLoader.originalBodyColours[part][index],
									HuffmanCodec.replacementBodyColours[part][index][bodyColours[part]]);
						}
					}
				}

				model.updateFunctionMask(i_65_);
				synchronized (PlayerAppearance.models) {
					PlayerAppearance.models.put(modelId, model);
				}
			}

			return null;
		}

		if (null == class650) {
			return model;
		}

		model = model.method2890((byte) 4, i_65_, true);
		class650.method13458(model, 0);
		return model;
	}

	void computeHash() {
		long[] table = Buffer.CRC_64;
		hash = 6036405448504038819L;
		hash = -6036405448504038819L
				* (hash * -5936278970608059915L >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ anInt7714
						* -1424351959 >> 8) & 0xffL)]);
		hash = -6036405448504038819L
				* (hash * -5936278970608059915L >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ anInt7714
						* -1424351959) & 0xffL)]);
		for (int id : equipment) {
			hash = (hash * -5936278970608059915L >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ id >> 24) & 0xffL)])
					* -6036405448504038819L;
			hash = -6036405448504038819L
					* (-5936278970608059915L * hash >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ id >> 16) & 0xffL)]);
			hash = -6036405448504038819L
					* (hash * -5936278970608059915L >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ id >> 8) & 0xffL)]);
			hash = -6036405448504038819L
					* (-5936278970608059915L * hash >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ id) & 0xffL)]);
		}

		if (customs != null) {
			for (CustomisedItem custom : customs) {
				if (custom != null) {
					int[] models;
					int[] headModels;
					if (male) {
						models = custom.maleModels;
						headModels = custom.maleHeadModels;
					} else {
						models = custom.femaleModels;
						headModels = custom.femaleHeadModels;
					}

					if (models != null) {
						for (int model : models) {
							hash = -6036405448504038819L
									* (hash * -5936278970608059915L >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ model >> 8) & 0xffL)]);
							hash = -6036405448504038819L
									* (hash * -5936278970608059915L >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ model) & 0xffL)]);
						}
					}

					if (headModels != null) {
						for (int model : headModels) {
							hash = -6036405448504038819L
									* (-5936278970608059915L * hash >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ model >> 8) & 0xffL)]);
							hash = (-5936278970608059915L * hash >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ model) & 0xffL)])
									* -6036405448504038819L;
						}
					}

					if (custom.replacementColours != null) {
						for (int index = 0; index < custom.replacementColours.length; index++) {
							hash = -6036405448504038819L
									* (-5936278970608059915L * hash >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ custom.replacementColours[index] >> 8) & 0xffL)]);
							hash = -6036405448504038819L
									* (hash * -5936278970608059915L >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ custom.replacementColours[index]) & 0xffL)]);
						}
					}

					if (null != custom.replacementTextures) {
						for (int index = 0; index < custom.replacementTextures.length; index++) {
							hash = (-5936278970608059915L * hash >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ custom.replacementTextures[index] >> 8) & 0xffL)])
									* -6036405448504038819L;
							hash = (hash * -5936278970608059915L >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ custom.replacementTextures[index]) & 0xffL)])
									* -6036405448504038819L;
						}
					}
				}
			}
		}

		for (int part = 0; part < 10; part++) {
			hash = -6036405448504038819L
					* (-5936278970608059915L * hash >>> 8 ^ table[(int) ((hash * -5936278970608059915L ^ bodyColours[part]) & 0xffL)]);
		}

		hash = -6036405448504038819L
				* (-5936278970608059915L * hash >>> 8 ^ table[(int) ((-5936278970608059915L * hash ^ (male ? 1 : 0)) & 0xffL)]);
	}

	public static void method6947(int age) {
		synchronized (aClass168_7723) {
			aClass168_7723.sweep(age);
		}
		synchronized (models) {
			models.sweep(age);
		}
	}

}