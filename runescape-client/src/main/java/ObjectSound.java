import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 501440191
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 179593907
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 724214627
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 775363577
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1416185027
	)
	int field937;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 50432371
	)
	int field944;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -663897917
	)
	int field939;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -709047569
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1448686013
	)
	int field941;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1441209589
	)
	int field943;
	@ObfuscatedName("i")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1984833823
	)
	int field945;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 36
		ObjectComposition var2 = this.obj.transform(); // L: 37
		if (var2 != null) { // L: 38
			this.soundEffectId = var2.ambientSoundId; // L: 39
			this.field939 = var2.field1801 * 128; // L: 40
			this.field941 = var2.int5; // L: 41
			this.field943 = var2.int6; // L: 42
			this.soundEffectIds = var2.soundEffectIds; // L: 43
		} else {
			this.soundEffectId = -1; // L: 46
			this.field939 = 0; // L: 47
			this.field941 = 0; // L: 48
			this.field943 = 0; // L: 49
			this.soundEffectIds = null; // L: 50
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 52
			UserComparator7.pcmStreamMixer.removeSubStream(this.stream1); // L: 53
			this.stream1 = null; // L: 54
		}

	} // L: 56

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "706769109"
	)
	static int method1889(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 844
		Widget var4;
		if (var0 >= 2000) { // L: 846
			var0 -= 1000; // L: 847
			var4 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 848
			var3 = false; // L: 849
		} else {
			var4 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 851
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 852
			var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] - 1; // L: 853
			if (var11 >= 0 && var11 <= 9) { // L: 854
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]); // L: 858
				return 1; // L: 859
			} else {
				--UserComparator9.Interpreter_stringStackSize; // L: 855
				return 1; // L: 856
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 861
				ChatChannel.Interpreter_intStackSize -= 2; // L: 862
				var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 863
				var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 864
				var4.parent = class17.getWidgetChild(var11, var6); // L: 865
				return 1; // L: 866
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 868
				var4.isScrollBar = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 869
				return 1; // L: 870
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 872
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 873
				return 1; // L: 874
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 876
				var4.dragThreshold = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 877
				return 1; // L: 878
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 880
				var4.dataText = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 881
				return 1; // L: 882
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 884
				var4.spellActionName = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 885
				return 1; // L: 886
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 888
				var4.actions = null; // L: 889
				return 1; // L: 890
			} else if (var0 == 1308) { // L: 892
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 893
				return 1; // L: 894
			} else if (var0 == 1309) { // L: 896
				--ChatChannel.Interpreter_intStackSize; // L: 897
				return 1; // L: 898
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 900
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 930
						ChatChannel.Interpreter_intStackSize -= 2; // L: 931
						var5 = 10; // L: 932
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]}; // L: 933
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]}; // L: 934
						UserComparator8.Widget_setKey(var4, var5, var8, var9); // L: 935
						return 1; // L: 936
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 938
						ChatChannel.Interpreter_intStackSize -= 3; // L: 939
						var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] - 1; // L: 940
						var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 941
						var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 942
						if (var11 >= 0 && var11 <= 9) { // L: 943
							FileSystem.Widget_setKeyRate(var4, var11, var6, var7); // L: 946
							return 1; // L: 947
						} else {
							throw new RuntimeException(); // L: 944
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 949
						var5 = 10; // L: 950
						var6 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 951
						var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 952
						FileSystem.Widget_setKeyRate(var4, var5, var6, var7); // L: 953
						return 1; // L: 954
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 956
						--ChatChannel.Interpreter_intStackSize; // L: 957
						var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] - 1; // L: 958
						if (var11 >= 0 && var11 <= 9) { // L: 959
							class25.Widget_setKeyIgnoreHeld(var4, var11); // L: 962
							return 1; // L: 963
						} else {
							throw new RuntimeException(); // L: 960
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 965
						var5 = 10; // L: 966
						class25.Widget_setKeyIgnoreHeld(var4, var5); // L: 967
						return 1; // L: 968
					} else {
						return 2; // L: 970
					}
				} else {
					byte[] var10 = null; // L: 901
					var8 = null; // L: 902
					if (var3) { // L: 903
						ChatChannel.Interpreter_intStackSize -= 10; // L: 904

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + ChatChannel.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 906 907
						}

						if (var7 > 0) { // L: 909
							var10 = new byte[var7 / 2]; // L: 910
							var8 = new byte[var7 / 2]; // L: 911

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 912
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + ChatChannel.Interpreter_intStackSize]; // L: 913
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + ChatChannel.Interpreter_intStackSize + 1]; // L: 914
							}
						}
					} else {
						ChatChannel.Interpreter_intStackSize -= 2; // L: 919
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]}; // L: 920
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]}; // L: 921
					}

					var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] - 1; // L: 923
					if (var7 >= 0 && var7 <= 9) { // L: 924
						UserComparator8.Widget_setKey(var4, var7, var10, var8); // L: 927
						return 1; // L: 928
					} else {
						throw new RuntimeException(); // L: 925
					}
				}
			}
		}
	}
}
