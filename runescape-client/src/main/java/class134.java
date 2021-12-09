import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ef")
public class class134 extends class142 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 642006289
	)
	int field1552;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	class134(class143 var1) {
		this.this$0 = var1;
		this.field1552 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		this.field1552 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		var1.removeMember(this.field1552); // L: 96
	} // L: 97

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "1"
	)
	static int method2824(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3533
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class143.getWindowedMode(); // L: 3534
			return 1; // L: 3535
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3537
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3538
				if (var3 == 1 || var3 == 2) { // L: 3539
					Occluder.setWindowedMode(var3);
				}

				return 1; // L: 3540
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3542
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.windowMode; // L: 3543
				return 1; // L: 3544
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3546
				if (var0 == 5310) { // L: 3554
					--IsaacCipher.Interpreter_intStackSize; // L: 3555
					return 1; // L: 3556
				} else if (var0 == 5311) { // L: 3558
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 3559
					return 1; // L: 3560
				} else if (var0 == 5312) { // L: 3562
					--IsaacCipher.Interpreter_intStackSize; // L: 3563
					return 1; // L: 3564
				} else if (var0 == 5350) { // L: 3566
					class13.Interpreter_stringStackSize -= 2; // L: 3567
					--IsaacCipher.Interpreter_intStackSize; // L: 3568
					return 1; // L: 3569
				} else if (var0 == 5351) { // L: 3571
					--class13.Interpreter_stringStackSize; // L: 3572
					return 1; // L: 3573
				} else {
					return 2; // L: 3575
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3547
				if (var3 == 1 || var3 == 2) { // L: 3548
					SecureRandomFuture.clientPreferences.windowMode = var3; // L: 3549
					class127.savePreferences(); // L: 3550
				}

				return 1; // L: 3552
			}
		}
	}
}
