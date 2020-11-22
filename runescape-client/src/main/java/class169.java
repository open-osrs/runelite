import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fz")
public enum class169 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	field2033(2, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	field2029(0, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	field2028(1, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	field2034(3, 3);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1161977131
	)
	static int field2035;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1105831857
	)
	public final int field2032;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1075265281
	)
	@Export("id")
	final int id;

	class169(int var3, int var4) {
		this.field2032 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "19136995"
	)
	public static void method3571(int var0, int var1) {
		VarbitDefinition var3 = (VarbitDefinition)VarbitDefinition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitDefinition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitDefinition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitDefinition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitDefinition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "-118"
	)
	static int method3572(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3153
			MilliClock.Interpreter_intStackSize -= 2; // L: 3154
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3155
			int var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3156
			if (!Client.isCameraLocked) { // L: 3157
				Client.camAngleX = var3; // L: 3158
				Client.camAngleY = var4; // L: 3159
			}

			return 1; // L: 3161
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3163
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3164
			return 1; // L: 3165
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3167
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3168
			return 1; // L: 3169
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3171
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3172
			if (var3 < 0) { // L: 3173
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3174
			return 1; // L: 3175
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3177
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3178
			return 1; // L: 3179
		} else {
			return 2; // L: 3181
		}
	}
}
