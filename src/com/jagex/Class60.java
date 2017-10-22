package com.jagex;

import com.jagex.twitch.TwitchEvent;

public class Class60 {
	public final static String COMMA = ",";
	public final static String RIGHT_PARENTHESIS = ")";
	public final static String LEFT_PARENTHESIS = " (";
	public final static String TRUE = "true";
	public final static String aString677 = "->";
	public final static String LOCALHOST = "127.0.0.1";
	public final static String LINE_BREAK = "<br>";
	public final static String CLOSING_COLOUR_TAG = "</col>";
	static String USER_HOME;
	public static Toolkit activeToolkit;

	public static void method1369(int i, TwitchEvent event) {
		Script script = Script.lookup(Class520.aClass520_7180, i, -1);
		if (null != script) {
			ScriptExecutionContext context = ScriptExecutionContext.method9584();
			if (script.longVariables * -422003431 != 0) {
				context.longVariables = new long[script.longVariables * -422003431];
			}

			if (0 != script.intVariableCount * 58870653) {
				context.intVariables = new int[script.intVariableCount * 58870653];
			}

			if (0 != script.stringVariableCount * -515357437) {
				context.stringVariables = new String[script.stringVariableCount * -515357437];
			}

			event.method6186(context.intVariables, context.longVariables, context.stringVariables);
			ScriptExecutionContext.execute(script, 200000, context);
		}
	}

	public static void method1371() {
		synchronized (Class38.aClass168_538) {
			Class38.aClass168_538.clear();
		}
	}

	Class60() throws Throwable {
		throw new Error();
	}

}