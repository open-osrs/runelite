import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bk")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1247485995
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 555040569
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("x")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("w")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "259452362"
	)
	static int method1213(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 774
		Widget var4;
		if (var0 >= 2000) { // L: 776
			var0 -= 1000; // L: 777
			var4 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 778
			var3 = false; // L: 779
		} else {
			var4 = var2 ? PlayerComposition.scriptDotWidget : VarcInt.scriptActiveWidget; // L: 781
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 782
			var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] - 1; // L: 783
			if (var11 >= 0 && var11 <= 9) { // L: 784
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 788
				return 1; // L: 789
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 785
				return 1; // L: 786
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 791
				VarcInt.Interpreter_intStackSize -= 2; // L: 792
				var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 793
				var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 794
				var4.parent = class92.getWidgetChild(var11, var6); // L: 795
				return 1; // L: 796
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 798
				var4.isScrollBar = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 799
				return 1; // L: 800
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 802
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 803
				return 1; // L: 804
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 806
				var4.dragThreshold = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 807
				return 1; // L: 808
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 810
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 811
				return 1; // L: 812
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 814
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 815
				return 1; // L: 816
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 818
				var4.actions = null; // L: 819
				return 1; // L: 820
			} else if (var0 == 1308) { // L: 822
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 823
				return 1; // L: 824
			} else if (var0 == 1309) { // L: 826
				--VarcInt.Interpreter_intStackSize; // L: 827
				return 1; // L: 828
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 830
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 860
						VarcInt.Interpreter_intStackSize -= 2; // L: 861
						var5 = 10; // L: 862
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]}; // L: 863
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]}; // L: 864
						ItemContainer.Widget_setKey(var4, var5, var8, var9); // L: 865
						return 1; // L: 866
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 868
						VarcInt.Interpreter_intStackSize -= 3; // L: 869
						var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] - 1; // L: 870
						var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 871
						var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 872
						if (var11 >= 0 && var11 <= 9) { // L: 873
							Player.Widget_setKeyRate(var4, var11, var6, var7); // L: 876
							return 1; // L: 877
						} else {
							throw new RuntimeException(); // L: 874
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 879
						var5 = 10; // L: 880
						var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 881
						var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 882
						Player.Widget_setKeyRate(var4, var5, var6, var7); // L: 883
						return 1; // L: 884
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 886
						--VarcInt.Interpreter_intStackSize; // L: 887
						var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] - 1; // L: 888
						if (var11 >= 0 && var11 <= 9) { // L: 889
							GrandExchangeOfferUnitPriceComparator.Widget_setKeyIgnoreHeld(var4, var11); // L: 892
							return 1; // L: 893
						} else {
							throw new RuntimeException(); // L: 890
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 895
						var5 = 10; // L: 896
						GrandExchangeOfferUnitPriceComparator.Widget_setKeyIgnoreHeld(var4, var5); // L: 897
						return 1; // L: 898
					} else {
						return 2; // L: 900
					}
				} else {
					byte[] var10 = null; // L: 831
					var8 = null; // L: 832
					if (var3) { // L: 833
						VarcInt.Interpreter_intStackSize -= 10; // L: 834

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + VarcInt.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 836 837
						}

						if (var7 > 0) { // L: 839
							var10 = new byte[var7 / 2]; // L: 840
							var8 = new byte[var7 / 2]; // L: 841

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 842
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + VarcInt.Interpreter_intStackSize]; // L: 843
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + VarcInt.Interpreter_intStackSize + 1]; // L: 844
							}
						}
					} else {
						VarcInt.Interpreter_intStackSize -= 2; // L: 849
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]}; // L: 850
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]}; // L: 851
					}

					var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] - 1; // L: 853
					if (var7 >= 0 && var7 <= 9) { // L: 854
						ItemContainer.Widget_setKey(var4, var7, var10, var8); // L: 857
						return 1; // L: 858
					} else {
						throw new RuntimeException(); // L: 855
					}
				}
			}
		}
	}
}
