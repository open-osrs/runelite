import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -370976069
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILie;Lie;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "3"
	)
	static int method4105(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 845
		Widget var4;
		if (var0 >= 2000) { // L: 847
			var0 -= 1000; // L: 848
			var4 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 849
			var3 = false; // L: 850
		} else {
			var4 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 852
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 853
			var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] - 1; // L: 854
			if (var11 >= 0 && var11 <= 9) { // L: 855
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]); // L: 859
				return 1; // L: 860
			} else {
				--class295.Interpreter_stringStackSize; // L: 856
				return 1; // L: 857
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 862
				class14.Interpreter_intStackSize -= 2; // L: 863
				var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 864
				var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 865
				var4.parent = ItemContainer.getWidgetChild(var11, var6); // L: 866
				return 1; // L: 867
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 869
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 870
				return 1; // L: 871
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 873
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 874
				return 1; // L: 875
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 877
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 878
				return 1; // L: 879
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 881
				var4.dataText = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 882
				return 1; // L: 883
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 885
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 886
				return 1; // L: 887
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 889
				var4.actions = null; // L: 890
				return 1; // L: 891
			} else if (var0 == 1308) { // L: 893
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 894
				return 1; // L: 895
			} else if (var0 == 1309) { // L: 897
				--class14.Interpreter_intStackSize; // L: 898
				return 1; // L: 899
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 901
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 931
						class14.Interpreter_intStackSize -= 2; // L: 932
						var5 = 10; // L: 933
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]}; // L: 934
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]}; // L: 935
						Varps.Widget_setKey(var4, var5, var8, var9); // L: 936
						return 1; // L: 937
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 939
						class14.Interpreter_intStackSize -= 3; // L: 940
						var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] - 1; // L: 941
						var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 942
						var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 943
						if (var11 >= 0 && var11 <= 9) { // L: 944
							Interpreter.Widget_setKeyRate(var4, var11, var6, var7); // L: 947
							return 1; // L: 948
						} else {
							throw new RuntimeException(); // L: 945
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 950
						var5 = 10; // L: 951
						var6 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 952
						var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 953
						Interpreter.Widget_setKeyRate(var4, var5, var6, var7); // L: 954
						return 1; // L: 955
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 957
						--class14.Interpreter_intStackSize; // L: 958
						var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] - 1; // L: 959
						if (var11 >= 0 && var11 <= 9) { // L: 960
							class1.Widget_setKeyIgnoreHeld(var4, var11); // L: 963
							return 1; // L: 964
						} else {
							throw new RuntimeException(); // L: 961
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 966
						var5 = 10; // L: 967
						class1.Widget_setKeyIgnoreHeld(var4, var5); // L: 968
						return 1; // L: 969
					} else {
						return 2; // L: 971
					}
				} else {
					byte[] var10 = null; // L: 902
					var8 = null; // L: 903
					if (var3) { // L: 904
						class14.Interpreter_intStackSize -= 10; // L: 905

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class14.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 907 908
						}

						if (var7 > 0) { // L: 910
							var10 = new byte[var7 / 2]; // L: 911
							var8 = new byte[var7 / 2]; // L: 912

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 913
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class14.Interpreter_intStackSize]; // L: 914
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class14.Interpreter_intStackSize + 1]; // L: 915
							}
						}
					} else {
						class14.Interpreter_intStackSize -= 2; // L: 920
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]}; // L: 921
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]}; // L: 922
					}

					var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] - 1; // L: 924
					if (var7 >= 0 && var7 <= 9) { // L: 925
						Varps.Widget_setKey(var4, var7, var10, var8); // L: 928
						return 1; // L: 929
					} else {
						throw new RuntimeException(); // L: 926
					}
				}
			}
		}
	}
}
