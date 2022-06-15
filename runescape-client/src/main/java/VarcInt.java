import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fg")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("fg")
	static String field1851;
	@ObfuscatedName("q")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-101"
	)
	public void method3400(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 20
			if (var2 == 0) { // L: 21
				return; // L: 24
			}

			this.method3402(var1, var2); // L: 22
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "2067647577"
	)
	void method3402(Buffer var1, int var2) {
		if (var2 == 2) { // L: 27
			this.persist = true; // L: 28
		}

	} // L: 31

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "81"
	)
	static int method3411(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3754
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class9.getWindowedMode(); // L: 3755
			return 1; // L: 3756
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3758
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3759
				if (var3 == 1 || var3 == 2) { // L: 3760
					WorldMapLabelSize.setWindowedMode(var3);
				}

				return 1; // L: 3761
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3763
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class19.clientPreferences.method2268(); // L: 3764
				return 1; // L: 3765
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3767
				if (var0 == 5310) { // L: 3774
					--class446.Interpreter_intStackSize; // L: 3775
					return 1; // L: 3776
				} else if (var0 == 5311) { // L: 3778
					class446.Interpreter_intStackSize -= 2; // L: 3779
					return 1; // L: 3780
				} else if (var0 == 5312) { // L: 3782
					--class446.Interpreter_intStackSize; // L: 3783
					return 1; // L: 3784
				} else if (var0 == 5350) { // L: 3786
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3787
					--class446.Interpreter_intStackSize; // L: 3788
					return 1; // L: 3789
				} else if (var0 == 5351) { // L: 3791
					--Interpreter.Interpreter_stringStackSize; // L: 3792
					return 1; // L: 3793
				} else {
					return 2; // L: 3795
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3768
				if (var3 == 1 || var3 == 2) { // L: 3769
					class19.clientPreferences.method2280(var3); // L: 3770
				}

				return 1; // L: 3772
			}
		}
	}
}
