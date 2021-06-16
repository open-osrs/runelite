import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class5 extends class16 {
	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static Widget field42;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 835981453
	)
	int field43;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field43 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		this.field43 = var1.readUnsignedShort(); // L: 86
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong(); // L: 90
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		var1.removeMember(this.field43);
	} // L: 96

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2066845091"
	)
	public static boolean method73(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-217249908"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 74
		if (var0 < 0 || var0 >= 65536) { // L: 75
			var0 >>>= 16; // L: 76
			var1 += 16; // L: 77
		}

		if (var0 >= 256) { // L: 79
			var0 >>>= 8; // L: 80
			var1 += 8; // L: 81
		}

		if (var0 >= 16) { // L: 83
			var0 >>>= 4; // L: 84
			var1 += 4; // L: 85
		}

		if (var0 >= 4) { // L: 87
			var0 >>>= 2; // L: 88
			var1 += 2; // L: 89
		}

		if (var0 >= 1) { // L: 91
			var0 >>>= 1; // L: 92
			++var1; // L: 93
		}

		return var0 + var1; // L: 95
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-72"
	)
	static int method72(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4237
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 4238
			return 1; // L: 4239
		} else if (var0 != 6801 && var0 != 6802) { // L: 4241
			if (var0 == 6850) { // L: 4245
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 4246
				return 1; // L: 4247
			} else if (var0 != 6851 && var0 != 6852) { // L: 4249
				if (var0 == 6853) { // L: 4253
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 4254
					return 1; // L: 4255
				} else {
					return 2; // L: 4257
				}
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4250
				return 1; // L: 4251
			}
		} else {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4242
			return 1; // L: 4243
		}
	}
}
