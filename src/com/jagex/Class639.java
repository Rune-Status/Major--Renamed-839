package com.jagex;

public abstract class Class639 {

	static void method13200(Widget widget, int i, int i_0_) {
		if (Client.widgetSelected) {
			ParameterDefinition parameter = -410965469 * LookupTable.anInt2647 != -1 ? ParameterDefinition.loader
					.get(-410965469 * LookupTable.anInt2647) : null;
			if (Client.method17050(widget).method15636((byte) -68)
					&& 0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x20)
					&& (parameter == null || widget.method4238(LookupTable.anInt2647 * -410965469, -125275839
							* parameter.defaultInt, -1905042373) != parameter.defaultInt * -125275839)) {
				MenuOption.add(Client.selectedWidgetAction, new StringBuilder().append(Client.aString10789).append(" ")
						.append(Class60.aString677).append(" ").append(widget.aString2473).toString(), -29134223
						* Class166_Sub8.anInt9550, 58, 1391525437 * widget.item, 0L, widget.component * -592186295,
						widget.id * 1857819631, true, false, -592186295 * widget.component << 32 | 1857819631
								* widget.id, false);
			}
		}
		for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
			String string = Class335.method5818(widget, i_2_);
			if (null != string) {
				MenuOption.add(string, widget.aString2473, Class166_Sub21.method15136(widget, i_2_), 1007,
						1391525437 * widget.item, i_2_ + 1, widget.component * -592186295, 1857819631 * widget.id,
						true, false, widget.component * -592186295 << 32 | 1857819631 * widget.id, false);
			}
		}
		String string = Class341.method5865(widget);
		if (string != null) {
			MenuOption.add(string, widget.aString2473, -858628785 * widget.anInt2524, 25, 1391525437 * widget.item, 0L,
					widget.component * -592186295, 1857819631 * widget.id, true, false,
					widget.component * -592186295 << 32 | 1857819631 * widget.id, false);
		}
		for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
			String string_4_ = Class335.method5818(widget, i_3_);
			if (null != string_4_) {
				MenuOption.add(string_4_, widget.aString2473, Class166_Sub21.method15136(widget, i_3_), 57,
						widget.item * 1391525437, 1 + i_3_, -592186295 * widget.component, 1857819631 * widget.id,
						true, false, -592186295 * widget.component << 32 | widget.id * 1857819631, false);
			}
		}
		if (Client.method17050(widget).method15631((short) -8268)) {
			if (null != widget.aString2368) {
				MenuOption.add(widget.aString2368, "", -1, 30, 1391525437 * widget.item, 0L, -592186295
						* widget.component, widget.id * 1857819631, true, false, widget.component * -592186295 << 32
						| 1857819631 * widget.id, false);
			} else {
				MenuOption.add(TranslatableString.CONTINUE.translate(Client.currentLanguage), "", -1, 30,
						1391525437 * widget.item, 0L, widget.component * -592186295, widget.id * 1857819631, true,
						false, widget.component * -592186295 << 32 | widget.id * 1857819631, false);
			}
		}
	}

	Class639() throws Throwable {
		throw new Error();
	}
}
