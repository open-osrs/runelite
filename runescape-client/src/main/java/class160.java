import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fu")
public class class160 {
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	public UrlRequest field1737;
	@ObfuscatedName("c")
	public float[] field1735;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1735 = new float[4]; // L: 326
	} // L: 328

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1437558717"
	)
	static int method3279(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3744
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.getWindowedMode(); // L: 3745
			return 1; // L: 3746
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3748
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3749
				if (var3 == 1 || var3 == 2) { // L: 3750
					class131.setWindowedMode(var3);
				}

				return 1; // L: 3751
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3753
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2251(); // L: 3754
				return 1; // L: 3755
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3757
				if (var0 == 5310) { // L: 3764
					--Interpreter.Interpreter_intStackSize; // L: 3765
					return 1; // L: 3766
				} else if (var0 == 5311) { // L: 3768
					Interpreter.Interpreter_intStackSize -= 2; // L: 3769
					return 1; // L: 3770
				} else if (var0 == 5312) { // L: 3772
					--Interpreter.Interpreter_intStackSize; // L: 3773
					return 1; // L: 3774
				} else if (var0 == 5350) { // L: 3776
					class122.Interpreter_stringStackSize -= 2; // L: 3777
					--Interpreter.Interpreter_intStackSize; // L: 3778
					return 1; // L: 3779
				} else if (var0 == 5351) { // L: 3781
					--class122.Interpreter_stringStackSize; // L: 3782
					return 1; // L: 3783
				} else {
					return 2; // L: 3785
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3758
				if (var3 == 1 || var3 == 2) { // L: 3759
					class131.clientPreferences.method2250(var3); // L: 3760
				}

				return 1; // L: 3762
			}
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	static String method3280(String var0) {
		PlayerType[] var1 = WorldMapManager.PlayerType_values(); // L: 12632

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12633
			PlayerType var3 = var1[var2]; // L: 12634
			if (var3.modIcon != -1 && var0.startsWith(Script.method1990(var3.modIcon))) { // L: 12636 12637
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12638
				break;
			}
		}

		return var0; // L: 12645
	}
}
