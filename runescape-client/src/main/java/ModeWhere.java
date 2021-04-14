import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jb")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3373("", 0, new class264[]{class264.field3339}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3361("", 1, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3362("", 2, new class264[]{class264.field3340, class264.field3341, class264.field3339}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3363("", 3, new class264[]{class264.field3340}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3360("", 4),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3365("", 5, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3366("", 6, new class264[]{class264.field3339}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3367("", 8, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3364("", 9, new class264[]{class264.field3340, class264.field3341}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3369("", 10, new class264[]{class264.field3340}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3376("", 11, new class264[]{class264.field3340}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3374("", 12, new class264[]{class264.field3340, class264.field3339}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field3372("", 13, new class264[]{class264.field3340});

	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 351433671
	)
	static int field3368;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static Bounds field3378;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 243649969
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2114323867
	)
	@Export("id")
	final int id;
	@ObfuscatedName("j")
	final Set field3371;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Ljj;)V"
	)
	ModeWhere(String var3, int var4, class264[] var5) {
		this.field3371 = new HashSet();
		this.id = var4; // L: 39
		class264[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class264 var8 = var6[var7]; // L: 43
			this.field3371.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field3371 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 50
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1792039900"
	)
	static int method4705(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 833
		Widget var4;
		if (var0 >= 2000) { // L: 835
			var0 -= 1000; // L: 836
			var4 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 837
			var3 = false; // L: 838
		} else {
			var4 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 840
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 841
			var11 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] - 1; // L: 842
			if (var11 >= 0 && var11 <= 9) { // L: 843
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 847
				return 1; // L: 848
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 844
				return 1; // L: 845
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 850
				class16.Interpreter_intStackSize -= 2; // L: 851
				var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 852
				var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 853
				var4.parent = class231.getWidgetChild(var11, var6); // L: 854
				return 1; // L: 855
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 857
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 858
				return 1; // L: 859
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 861
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 862
				return 1; // L: 863
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 865
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 866
				return 1; // L: 867
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 869
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 870
				return 1; // L: 871
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 873
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 874
				return 1; // L: 875
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 877
				var4.actions = null; // L: 878
				return 1; // L: 879
			} else if (var0 == 1308) { // L: 881
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 882
				return 1; // L: 883
			} else if (var0 == 1309) { // L: 885
				--class16.Interpreter_intStackSize; // L: 886
				return 1; // L: 887
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 889
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 919
						class16.Interpreter_intStackSize -= 2; // L: 920
						var5 = 10; // L: 921
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]}; // L: 922
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]}; // L: 923
						ApproximateRouteStrategy.Widget_setKey(var4, var5, var8, var9); // L: 924
						return 1; // L: 925
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 927
						class16.Interpreter_intStackSize -= 3; // L: 928
						var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] - 1; // L: 929
						var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 930
						var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 931
						if (var11 >= 0 && var11 <= 9) { // L: 932
							class2.Widget_setKeyRate(var4, var11, var6, var7); // L: 935
							return 1; // L: 936
						} else {
							throw new RuntimeException(); // L: 933
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 938
						var5 = 10; // L: 939
						var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 940
						var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 941
						class2.Widget_setKeyRate(var4, var5, var6, var7); // L: 942
						return 1; // L: 943
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 945
						--class16.Interpreter_intStackSize; // L: 946
						var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] - 1; // L: 947
						if (var11 >= 0 && var11 <= 9) { // L: 948
							class244.Widget_setKeyIgnoreHeld(var4, var11); // L: 951
							return 1; // L: 952
						} else {
							throw new RuntimeException(); // L: 949
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 954
						var5 = 10; // L: 955
						class244.Widget_setKeyIgnoreHeld(var4, var5); // L: 956
						return 1; // L: 957
					} else {
						return 2; // L: 959
					}
				} else {
					byte[] var10 = null; // L: 890
					var8 = null; // L: 891
					if (var3) { // L: 892
						class16.Interpreter_intStackSize -= 10; // L: 893

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class16.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 895 896
						}

						if (var7 > 0) { // L: 898
							var10 = new byte[var7 / 2]; // L: 899
							var8 = new byte[var7 / 2]; // L: 900

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 901
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class16.Interpreter_intStackSize]; // L: 902
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class16.Interpreter_intStackSize + 1]; // L: 903
							}
						}
					} else {
						class16.Interpreter_intStackSize -= 2; // L: 908
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]}; // L: 909
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]}; // L: 910
					}

					var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] - 1; // L: 912
					if (var7 >= 0 && var7 <= 9) { // L: 913
						ApproximateRouteStrategy.Widget_setKey(var4, var7, var10, var8); // L: 916
						return 1; // L: 917
					} else {
						throw new RuntimeException(); // L: 914
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1545527286"
	)
	static final boolean method4704(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 131
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 132
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 133
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 134
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 135
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 136
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 137
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 138
				}
			}
		}
	}
}
