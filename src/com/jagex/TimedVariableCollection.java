package com.jagex;

public final class TimedVariableCollection implements VariableCollection {
	static final long aLong7458 = 4611686018427387904L;
	static final long aLong7459 = 1L;
	static final long aLong7460 = 500L;
	static final long aLong7462 = 4611686018427387903L;

	int[] updatedVarps;
	int[] varps;
	HashTable<LinkableLong> updates = new HashTable<LinkableLong>(128);

	public TimedVariableCollection() {
		updatedVarps = new int[BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.count()];
		varps = new int[BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.count()];
	}

	@Override
	public int getVarp(BaseVariableParameterDefinition parameter) {
		return varps[parameter.id * 169834903];
	}

	@Override
	public int getVarbit(VariableBitsDefinition varbit) {
		return varbit.getValue(varps[169834903 * varbit.varp.id]);
	}

	@Override
	public long getLongVarp(BaseVariableParameterDefinition parameter) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setIntVarp(BaseVariableParameterDefinition parameter, int value) {
		varps[parameter.id * 169834903] = value;
		LinkableLong linkable = updates.get(parameter.id * 169834903);

		if (linkable != null) {
			linkable.value = (TimeUtil.time() + 500L) * 5662570005588035225L;
		} else {
			linkable = new LinkableLong(TimeUtil.time() + 500L);
			updates.put(169834903 * parameter.id, linkable);
		}
	}

	public void updateVariableParameter(BaseVariableParameterDefinition parameter, int value) {
		updatedVarps[169834903 * parameter.id] = value;
		LinkableLong linkable = updates.get(169834903 * parameter.id);

		if (null != linkable) {
			if (4611686018427387905L != linkable.value * -8280988991890543191L) {
				linkable.value = (TimeUtil.time() + 500L | 0x4000000000000000L) * 5662570005588035225L;
			}
		} else {
			linkable = new LinkableLong(4611686018427387905L);
			updates.put(169834903 * parameter.id, linkable);
		}
	}

	@Override
	public Object getStringVarp(BaseVariableParameterDefinition parameter) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setStringVarp(BaseVariableParameterDefinition parameter, Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setVarbit(VariableBitsDefinition varbit, int i) throws VarbitException {
		int value = varbit.method5462(varps[169834903 * varbit.varp.id], i);
		setIntVarp(varbit.varp, value);
	}

	@Override
	public void setLongVarp(BaseVariableParameterDefinition parameter, long l) {
		throw new UnsupportedOperationException();
	}

	public int poll(boolean first) {
		long time = TimeUtil.time();
		for (LinkableLong linkable = first ? updates.first() : updates.next(); null != linkable; linkable = updates
				.next()) {
			if ((linkable.value * -8280988991890543191L & 0x3fffffffffffffffL) < time) {
				if ((-8280988991890543191L * linkable.value & 0x4000000000000000L) != 0L) {
					int index = (int) (linkable.linkedKey * -4821875126325281949L);
					varps[index] = updatedVarps[index];

					linkable.unlink();
					return index;
				}

				linkable.unlink();
			}
		}

		return -1;
	}

	public void reset() {
		for (int index = 0; index < BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.count(); index++) {
			PlayerVariableParameterDefinition class131_sub2 = BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726
					.get(index);
			if (null != class131_sub2) {
				updatedVarps[index] = 0;
				varps[index] = 0;
			}
		}

		updates = new HashTable(128);
	}

	public void method9308(VariableBitsDefinition varbit, int i) {
		try {
			int value = varbit.method5462(updatedVarps[varbit.varp.id * 169834903], i);
			updateVariableParameter(varbit.varp, value);
		} catch (VarbitException exception) {

		}
	}

}