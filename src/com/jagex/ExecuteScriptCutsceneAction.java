package com.jagex;

public class ExecuteScriptCutsceneAction extends CutsceneAction {
	String aString9533;
	int maximumOperations;

	ExecuteScriptCutsceneAction(Buffer buffer) {
		super(buffer);
		aString9533 = buffer.readString();
		maximumOperations = buffer.readUShort() * -1657788231;
	}

	@Override
	public void execute() {
		if (-1 != 1642530983 * Client.currentCutscene) {
			Script.executeScript(Client.currentCutscene * 1642530983, aString9533, maximumOperations * 6774153);
		}
	}

}