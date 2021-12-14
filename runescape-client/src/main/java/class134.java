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
		this.field1552 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		this.field1552 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		var1.removeMember(this.field1552);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "1"
	)
	static int method2824(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class143.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					Occluder.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = SecureRandomFuture.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--IsaacCipher.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--IsaacCipher.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					class13.Interpreter_stringStackSize -= 2;
					--IsaacCipher.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--class13.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					SecureRandomFuture.clientPreferences.windowMode = var3;
					class127.savePreferences();
				}

				return 1;
			}
		}
	}
}
