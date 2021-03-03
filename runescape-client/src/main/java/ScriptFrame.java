import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1121255489
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("d")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("c")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljz;",
		garbageValue = "0"
	)
	public static HitSplatDefinition method1222(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "461265882"
	)
	static int method1221(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3196
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BoundaryObject.getWindowedMode(); // L: 3197
			return 1; // L: 3198
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3200
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3201
				if (var3 == 1 || var3 == 2) { // L: 3202
					GameBuild.setWindowedMode(var3);
				}

				return 1; // L: 3203
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3205
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.windowMode; // L: 3206
				return 1; // L: 3207
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3209
				if (var0 == 5310) { // L: 3217
					--Interpreter.Interpreter_intStackSize; // L: 3218
					return 1; // L: 3219
				} else {
					return 2; // L: 3221
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3210
				if (var3 == 1 || var3 == 2) { // L: 3211
					WorldMapSectionType.clientPreferences.windowMode = var3; // L: 3212
					class23.savePreferences(); // L: 3213
				}

				return 1; // L: 3215
			}
		}
	}
}
