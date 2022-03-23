import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gm")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 448351015
	)
	@Export("z")
	int z;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 8654035
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1684642379
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -8144761561564310625L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -87595469
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1559907984"
	)
	static int method3896(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 858
		Widget var4;
		if (var0 >= 2000) { // L: 860
			var0 -= 1000; // L: 861
			var4 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 862
			var3 = false; // L: 863
		} else {
			var4 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 865
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 866
			var11 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] - 1; // L: 867
			if (var11 >= 0 && var11 <= 9) { // L: 868
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]); // L: 872
				return 1; // L: 873
			} else {
				--ChatChannel.Interpreter_stringStackSize; // L: 869
				return 1; // L: 870
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 875
				class295.Interpreter_intStackSize -= 2; // L: 876
				var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 877
				var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 878
				var4.parent = class143.getWidgetChild(var11, var6); // L: 879
				return 1; // L: 880
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 882
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 883
				return 1; // L: 884
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 886
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 887
				return 1; // L: 888
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 890
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 891
				return 1; // L: 892
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 894
				var4.dataText = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 895
				return 1; // L: 896
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 898
				var4.spellActionName = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 899
				return 1; // L: 900
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 902
				var4.actions = null; // L: 903
				return 1; // L: 904
			} else if (var0 == 1308) { // L: 906
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 907
				return 1; // L: 908
			} else if (var0 == 1309) { // L: 910
				--class295.Interpreter_intStackSize; // L: 911
				return 1; // L: 912
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 914
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 944
						class295.Interpreter_intStackSize -= 2; // L: 945
						var5 = 10; // L: 946
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]}; // L: 947
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]}; // L: 948
						class400.Widget_setKey(var4, var5, var8, var9); // L: 949
						return 1; // L: 950
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 952
						class295.Interpreter_intStackSize -= 3; // L: 953
						var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] - 1; // L: 954
						var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 955
						var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 956
						if (var11 >= 0 && var11 <= 9) { // L: 957
							class268.Widget_setKeyRate(var4, var11, var6, var7); // L: 960
							return 1; // L: 961
						} else {
							throw new RuntimeException(); // L: 958
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 963
						var5 = 10; // L: 964
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 965
						var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 966
						class268.Widget_setKeyRate(var4, var5, var6, var7); // L: 967
						return 1; // L: 968
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 970
						--class295.Interpreter_intStackSize; // L: 971
						var11 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] - 1; // L: 972
						if (var11 >= 0 && var11 <= 9) { // L: 973
							Client.Widget_setKeyIgnoreHeld(var4, var11); // L: 976
							return 1; // L: 977
						} else {
							throw new RuntimeException(); // L: 974
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 979
						var5 = 10; // L: 980
						Client.Widget_setKeyIgnoreHeld(var4, var5); // L: 981
						return 1; // L: 982
					} else {
						return 2; // L: 984
					}
				} else {
					byte[] var10 = null; // L: 915
					var8 = null; // L: 916
					if (var3) { // L: 917
						class295.Interpreter_intStackSize -= 10; // L: 918

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class295.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 920 921
						}

						if (var7 > 0) { // L: 923
							var10 = new byte[var7 / 2]; // L: 924
							var8 = new byte[var7 / 2]; // L: 925

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 926
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class295.Interpreter_intStackSize]; // L: 927
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class295.Interpreter_intStackSize + 1]; // L: 928
							}
						}
					} else {
						class295.Interpreter_intStackSize -= 2; // L: 933
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]}; // L: 934
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]}; // L: 935
					}

					var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] - 1; // L: 937
					if (var7 >= 0 && var7 <= 9) { // L: 938
						class400.Widget_setKey(var4, var7, var10, var8); // L: 941
						return 1; // L: 942
					} else {
						throw new RuntimeException(); // L: 939
					}
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-24"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 117
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;I)V",
		garbageValue = "-139407558"
	)
	static void method3895(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1352
		Client.archiveLoaders.add(var2); // L: 1353
		Client.field767 += var2.groupCount; // L: 1354
	} // L: 1355
}
