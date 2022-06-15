import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 941516663
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 79
	} // L: 82

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbr;",
		garbageValue = "-1607330830"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 85

		for (int var6 = this.count; var6 > 0; --var6) { // L: 86
			if (var6 != 100) { // L: 87
				this.messages[var6] = this.messages[var6 - 1]; // L: 88
			}
		}

		if (var5 == null) { // L: 90
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 92
			var5.removeDual(); // L: 93
			var5.set(var1, var2, var4, var3); // L: 94
		}

		this.messages[0] = var5; // L: 96
		if (this.count < 100) { // L: 97
			++this.count;
		}

		return var5; // L: 98
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lbr;",
		garbageValue = "-2069744784"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 102 103
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "164096866"
	)
	@Export("size")
	int size() {
		return this.count; // L: 107
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZS)I",
		garbageValue = "1700"
	)
	static int method2003(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 868
		Widget var4;
		if (var0 >= 2000) { // L: 870
			var0 -= 1000; // L: 871
			var4 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 872
			var3 = false; // L: 873
		} else {
			var4 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 875
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 876
			var11 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] - 1; // L: 877
			if (var11 >= 0 && var11 <= 9) { // L: 878
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 882
				return 1; // L: 883
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 879
				return 1; // L: 880
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 885
				class446.Interpreter_intStackSize -= 2; // L: 886
				var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 887
				var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 888
				var4.parent = ScriptFrame.getWidgetChild(var11, var6); // L: 889
				return 1; // L: 890
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 892
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 893
				return 1; // L: 894
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 896
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 897
				return 1; // L: 898
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 900
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 901
				return 1; // L: 902
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 904
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 905
				return 1; // L: 906
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 908
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 909
				return 1; // L: 910
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 912
				var4.actions = null; // L: 913
				return 1; // L: 914
			} else if (var0 == 1308) { // L: 916
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 917
				return 1; // L: 918
			} else if (var0 == 1309) { // L: 920
				--class446.Interpreter_intStackSize; // L: 921
				return 1; // L: 922
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 924
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 954
						class446.Interpreter_intStackSize -= 2; // L: 955
						var5 = 10; // L: 956
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]}; // L: 957
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]}; // L: 958
						class340.Widget_setKey(var4, var5, var8, var9); // L: 959
						return 1; // L: 960
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 962
						class446.Interpreter_intStackSize -= 3; // L: 963
						var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] - 1; // L: 964
						var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 965
						var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 966
						if (var11 >= 0 && var11 <= 9) { // L: 967
							class346.Widget_setKeyRate(var4, var11, var6, var7); // L: 970
							return 1; // L: 971
						} else {
							throw new RuntimeException(); // L: 968
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 973
						var5 = 10; // L: 974
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 975
						var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 976
						class346.Widget_setKeyRate(var4, var5, var6, var7); // L: 977
						return 1; // L: 978
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 980
						--class446.Interpreter_intStackSize; // L: 981
						var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize] - 1; // L: 982
						if (var11 >= 0 && var11 <= 9) { // L: 983
							class145.Widget_setKeyIgnoreHeld(var4, var11); // L: 986
							return 1; // L: 987
						} else {
							throw new RuntimeException(); // L: 984
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 989
						var5 = 10; // L: 990
						class145.Widget_setKeyIgnoreHeld(var4, var5); // L: 991
						return 1; // L: 992
					} else {
						return 2; // L: 994
					}
				} else {
					byte[] var10 = null; // L: 925
					var8 = null; // L: 926
					if (var3) { // L: 927
						class446.Interpreter_intStackSize -= 10; // L: 928

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class446.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 930 931
						}

						if (var7 > 0) { // L: 933
							var10 = new byte[var7 / 2]; // L: 934
							var8 = new byte[var7 / 2]; // L: 935

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 936
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class446.Interpreter_intStackSize]; // L: 937
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class446.Interpreter_intStackSize + 1]; // L: 938
							}
						}
					} else {
						class446.Interpreter_intStackSize -= 2; // L: 943
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]}; // L: 944
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]}; // L: 945
					}

					var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] - 1; // L: 947
					if (var7 >= 0 && var7 <= 9) { // L: 948
						class340.Widget_setKey(var4, var7, var10, var8); // L: 951
						return 1; // L: 952
					} else {
						throw new RuntimeException(); // L: 949
					}
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1956135788"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 190
		var1.offset = var0.length - 2; // L: 191
		class456.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 192
		class426.SpriteBuffer_xOffsets = new int[class456.SpriteBuffer_spriteCount]; // L: 193
		class142.SpriteBuffer_yOffsets = new int[class456.SpriteBuffer_spriteCount]; // L: 194
		class359.SpriteBuffer_spriteWidths = new int[class456.SpriteBuffer_spriteCount]; // L: 195
		class456.SpriteBuffer_spriteHeights = new int[class456.SpriteBuffer_spriteCount]; // L: 196
		class421.SpriteBuffer_pixels = new byte[class456.SpriteBuffer_spriteCount][]; // L: 197
		var1.offset = var0.length - 7 - class456.SpriteBuffer_spriteCount * 8; // L: 198
		ModelData0.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 199
		class456.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 200
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 201

		int var3;
		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) { // L: 202
			class426.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) { // L: 203
			class142.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) { // L: 204
			class359.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) { // L: 205
			class456.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class456.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 206
		class13.SpriteBuffer_spritePalette = new int[var2]; // L: 207

		for (var3 = 1; var3 < var2; ++var3) { // L: 208
			class13.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 209
			if (class13.SpriteBuffer_spritePalette[var3] == 0) { // L: 210
				class13.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 212

		for (var3 = 0; var3 < class456.SpriteBuffer_spriteCount; ++var3) { // L: 213
			int var4 = class359.SpriteBuffer_spriteWidths[var3]; // L: 214
			int var5 = class456.SpriteBuffer_spriteHeights[var3]; // L: 215
			int var6 = var4 * var5; // L: 216
			byte[] var7 = new byte[var6]; // L: 217
			class421.SpriteBuffer_pixels[var3] = var7; // L: 218
			int var8 = var1.readUnsignedByte(); // L: 219
			int var9;
			if (var8 == 0) { // L: 220
				for (var9 = 0; var9 < var6; ++var9) { // L: 221
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 223
				for (var9 = 0; var9 < var4; ++var9) { // L: 224
					for (int var10 = 0; var10 < var5; ++var10) { // L: 225
						var7[var9 + var4 * var10] = var1.readByte(); // L: 226
					}
				}
			}
		}

	} // L: 231

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-720762696"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field702) { // L: 11733
			Client.field703[var0.rootIndex] = true; // L: 11734
		}

	} // L: 11736
}
