import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("s")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -495301739
	)
	static int field1110;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1182640923
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 81
	} // L: 84

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbi;",
		garbageValue = "437343873"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 87

		for (int var6 = this.count; var6 > 0; --var6) { // L: 88
			if (var6 != 100) { // L: 89
				this.messages[var6] = this.messages[var6 - 1]; // L: 90
			}
		}

		if (var5 == null) { // L: 92
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 94
			var5.removeDual(); // L: 95
			var5.set(var1, var2, var4, var3); // L: 96
		}

		this.messages[0] = var5; // L: 98
		if (this.count < 100) { // L: 99
			++this.count;
		}

		return var5; // L: 100
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lbi;",
		garbageValue = "-94614591"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 104 105
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-36"
	)
	@Export("size")
	int size() {
		return this.count; // L: 109
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;I)V",
		garbageValue = "-1209366980"
	)
	public static void method2012(AbstractArchive var0, AbstractArchive var1) {
		class404.KitDefinition_archive = var0; // L: 27
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 28
		ModelData0.KitDefinition_fileCount = class404.KitDefinition_archive.getGroupFileCount(3); // L: 29
	} // L: 30

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "-652699785"
	)
	public static void method2013(String[] var0, int[] var1) {
		TaskHandler.method2518(var0, var1, 0, var0.length - 1); // L: 39
	} // L: 40

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-84"
	)
	static int method2009(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 834
		Widget var4;
		if (var0 >= 2000) { // L: 836
			var0 -= 1000; // L: 837
			var4 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 838
			var3 = false; // L: 839
		} else {
			var4 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 841
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 842
			var11 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] - 1; // L: 843
			if (var11 >= 0 && var11 <= 9) { // L: 844
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 848
				return 1; // L: 849
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 845
				return 1; // L: 846
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 851
				class44.Interpreter_intStackSize -= 2; // L: 852
				var11 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 853
				var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 854
				var4.parent = ModeWhere.getWidgetChild(var11, var6); // L: 855
				return 1; // L: 856
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 858
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 859
				return 1; // L: 860
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 862
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 863
				return 1; // L: 864
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 866
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 867
				return 1; // L: 868
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 870
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 871
				return 1; // L: 872
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 874
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 875
				return 1; // L: 876
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 878
				var4.actions = null; // L: 879
				return 1; // L: 880
			} else if (var0 == 1308) { // L: 882
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 883
				return 1; // L: 884
			} else if (var0 == 1309) { // L: 886
				--class44.Interpreter_intStackSize; // L: 887
				return 1; // L: 888
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 890
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 920
						class44.Interpreter_intStackSize -= 2; // L: 921
						var5 = 10; // L: 922
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]}; // L: 923
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]}; // L: 924
						class253.Widget_setKey(var4, var5, var8, var9); // L: 925
						return 1; // L: 926
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 928
						class44.Interpreter_intStackSize -= 3; // L: 929
						var11 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] - 1; // L: 930
						var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 931
						var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 932
						if (var11 >= 0 && var11 <= 9) { // L: 933
							IsaacCipher.Widget_setKeyRate(var4, var11, var6, var7); // L: 936
							return 1; // L: 937
						} else {
							throw new RuntimeException(); // L: 934
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 939
						var5 = 10; // L: 940
						var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 941
						var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 942
						IsaacCipher.Widget_setKeyRate(var4, var5, var6, var7); // L: 943
						return 1; // L: 944
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 946
						--class44.Interpreter_intStackSize; // L: 947
						var11 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] - 1; // L: 948
						if (var11 >= 0 && var11 <= 9) { // L: 949
							class23.Widget_setKeyIgnoreHeld(var4, var11); // L: 952
							return 1; // L: 953
						} else {
							throw new RuntimeException(); // L: 950
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 955
						var5 = 10; // L: 956
						class23.Widget_setKeyIgnoreHeld(var4, var5); // L: 957
						return 1; // L: 958
					} else {
						return 2; // L: 960
					}
				} else {
					byte[] var10 = null; // L: 891
					var8 = null; // L: 892
					if (var3) { // L: 893
						class44.Interpreter_intStackSize -= 10; // L: 894

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class44.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 896 897
						}

						if (var7 > 0) { // L: 899
							var10 = new byte[var7 / 2]; // L: 900
							var8 = new byte[var7 / 2]; // L: 901

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 902
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class44.Interpreter_intStackSize]; // L: 903
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class44.Interpreter_intStackSize + 1]; // L: 904
							}
						}
					} else {
						class44.Interpreter_intStackSize -= 2; // L: 909
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]}; // L: 910
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]}; // L: 911
					}

					var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] - 1; // L: 913
					if (var7 >= 0 && var7 <= 9) { // L: 914
						class253.Widget_setKey(var4, var7, var10, var8); // L: 917
						return 1; // L: 918
					} else {
						throw new RuntimeException(); // L: 915
					}
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1145228216"
	)
	public static void method2015() {
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 279
	} // L: 280

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "694193640"
	)
	static final void method2014(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4416
			GrandExchangeEvents.worldToScreen((Client.hintArrowX - VertexNormal.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - SoundSystem.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4417
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4418
				PacketBufferNode.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4419
}
