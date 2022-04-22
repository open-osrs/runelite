import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dh")
public class class127 extends class128 {
	@ObfuscatedName("as")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1073843279
	)
	int field1518;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class127(class131 var1) {
		this.this$0 = var1;
		this.field1518 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1518 = var1.readUnsignedShort();
	} // L: 120

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2960(this.field1518); // L: 123
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljv;",
		garbageValue = "-78"
	)
	static LoginPacket[] method2836() {
		return new LoginPacket[]{LoginPacket.field3137, LoginPacket.field3132, LoginPacket.field3134, LoginPacket.field3131, LoginPacket.field3133, LoginPacket.field3130}; // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "-1735575897"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 229
		int var2 = var0 & 65535; // L: 230
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 231
			boolean var3 = class155.loadInterface(var1); // L: 232
			if (!var3) { // L: 233
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 235
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Lbb;II[I[IB)V",
		garbageValue = "-21"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var12 != var11) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var11 != var12) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "451726103"
	)
	static int method2840(int var0, Script var1, boolean var2) {
		Widget var3 = getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1449
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1450
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var3)); // L: 1451
			return 1; // L: 1452
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1454
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1461
				if (var3.dataText == null) { // L: 1462
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1463
				}

				return 1; // L: 1464
			} else {
				return 2; // L: 1466
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1455
			--var4; // L: 1456
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1457
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1458
			} else {
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1459
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "799305208"
	)
	static final void method2830(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12036
		class131.clientPreferences.method2244(var0); // L: 12037
	} // L: 12038
}
