import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("m")
	public static short[][] field2021;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("z")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)I",
		garbageValue = "1614336230"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BS)Lcy;",
		garbageValue = "-15973"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 111
		Buffer var2 = new Buffer(var0); // L: 112
		var2.offset = var2.array.length - 2; // L: 113
		int var3 = var2.readUnsignedShort(); // L: 114
		int var4 = var2.array.length - 2 - var3 - 12; // L: 115
		var2.offset = var4; // L: 116
		int var5 = var2.readInt(); // L: 117
		var1.localIntCount = var2.readUnsignedShort(); // L: 118
		var1.localStringCount = var2.readUnsignedShort(); // L: 119
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 120
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 121
		int var6 = var2.readUnsignedByte(); // L: 122
		int var7;
		int var8;
		if (var6 > 0) { // L: 123
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 124

			for (var7 = 0; var7 < var6; ++var7) { // L: 125
				var8 = var2.readUnsignedShort(); // L: 126
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class297.method5378(var8) : 1); // L: 127
				var1.switches[var7] = var9; // L: 128

				while (var8-- > 0) { // L: 129
					int var10 = var2.readInt(); // L: 130
					int var11 = var2.readInt(); // L: 131
					var9.put(new IntegerNode(var11), (long)var10); // L: 132
				}
			}
		}

		var2.offset = 0; // L: 136
		var2.readStringCp1252NullTerminatedOrNull(); // L: 137
		var1.opcodes = new int[var5]; // L: 138
		var1.intOperands = new int[var5]; // L: 139
		var1.stringOperands = new String[var5]; // L: 140

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 141 142 147
			var8 = var2.readUnsignedShort(); // L: 143
			if (var8 == 3) { // L: 144
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) { // L: 145
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 146
			}
		}

		return var1; // L: 149
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-1793488116"
	)
	@Export("parseIntCustomRadix")
	static int parseIntCustomRadix(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 75
			boolean var3 = false; // L: 76
			boolean var4 = false; // L: 77
			int var5 = 0; // L: 78
			int var6 = var0.length(); // L: 79

			for (int var7 = 0; var7 < var6; ++var7) { // L: 80
				char var8 = var0.charAt(var7); // L: 81
				if (var7 == 0) { // L: 82
					if (var8 == '-') { // L: 83
						var3 = true; // L: 84
						continue;
					}

					if (var8 == '+') { // L: 87
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 89
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 90
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 91
						throw new NumberFormatException(); // L: 92
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 93
					throw new NumberFormatException();
				}

				if (var3) { // L: 94
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 95
				if (var9 / var1 != var5) { // L: 96
					throw new NumberFormatException();
				}

				var5 = var9; // L: 97
				var4 = true; // L: 98
			}

			if (!var4) { // L: 100
				throw new NumberFormatException();
			} else {
				return var5; // L: 101
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "54"
	)
	static int method3513(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3124
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class39.getWindowedMode(); // L: 3125
			return 1; // L: 3126
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3128
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3129
				if (var3 == 1 || var3 == 2) { // L: 3130
					FontName.setWindowedMode(var3);
				}

				return 1; // L: 3131
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3133
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Tile.clientPreferences.windowMode; // L: 3134
				return 1; // L: 3135
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3137
				if (var0 == 5310) { // L: 3145
					--Interpreter.Interpreter_intStackSize; // L: 3146
					return 1; // L: 3147
				} else {
					return 2; // L: 3149
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3138
				if (var3 == 1 || var3 == 2) { // L: 3139
					Tile.clientPreferences.windowMode = var3; // L: 3140
					WorldMapData_1.savePreferences(); // L: 3141
				}

				return 1; // L: 3143
			}
		}
	}
}
