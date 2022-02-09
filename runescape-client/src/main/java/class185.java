import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gl")
public enum class185 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	field2137((byte)-1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	field2133((byte)0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	field2135((byte)1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	field2132((byte)2);

	@ObfuscatedName("r")
	public byte field2136;

	class185(byte var3) {
		this.field2136 = var3; // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2136; // L: 23
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "0"
	)
	static int method3686(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3586
			Interpreter.Interpreter_intStackSize -= 2; // L: 3587
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3588
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3589
			if (!Client.isCameraLocked) { // L: 3590
				Client.camAngleX = var3; // L: 3591
				Client.camAngleY = var4; // L: 3592
			}

			return 1; // L: 3594
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3596
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3597
			return 1; // L: 3598
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3600
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3601
			return 1; // L: 3602
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3604
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3605
			if (var3 < 0) { // L: 3606
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3607
			return 1; // L: 3608
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3610
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3611
			return 1; // L: 3612
		} else {
			return 2; // L: 3614
		}
	}
}
