import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2400("", 0, new class200[]{class200.field2392}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2396("", 1, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2395("", 2, new class200[]{class200.field2390, class200.field2391, class200.field2392}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2398("", 3, new class200[]{class200.field2390}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2397("", 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2405("", 5, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2402("", 6, new class200[]{class200.field2392}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2401("", 8, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2403("", 9, new class200[]{class200.field2390, class200.field2391}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2404("", 10, new class200[]{class200.field2390}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2409("", 11, new class200[]{class200.field2390}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2406("", 12, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	field2407("", 13, new class200[]{class200.field2390});

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 797439581
	)
	@Export("id")
	final int id;
	@ObfuscatedName("p")
	final Set field2399;

	static {
		method3813(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lgj;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2399 = new HashSet();
		this.id = var4; // L: 43
		class200[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class200 var8 = var6[var7];
			this.field2399.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field2399 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgc;",
		garbageValue = "52"
	)
	static ModeWhere[] method3813() {
		return new ModeWhere[]{field2404, field2409, field2396, field2403, field2401, field2406, field2395, field2400, field2402, field2397, field2405, field2398, field2407}; // L: 35
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llc;IIII)V",
		garbageValue = "13725684"
	)
	static void method3814(Sprite var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, class8.method117(var1, var2, var3), var0.pixels.length * 4); // L: 46
	} // L: 47

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([Lcf;II[I[IB)V",
		garbageValue = "48"
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
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Leh;IIIB)Z",
		garbageValue = "127"
	)
	static final boolean method3818(Model var0, int var1, int var2, int var3) {
		if (!WorldMapSection2.method425()) { // L: 131
			return false;
		} else {
			class238.method4271(); // L: 132
			int var4 = var0.xMid + var1; // L: 133
			int var5 = var2 + var0.yMid; // L: 134
			int var6 = var3 + var0.zMid; // L: 135
			int var7 = var0.xMidOffset; // L: 136
			int var8 = var0.yMidOffset; // L: 137
			int var9 = var0.zMidOffset; // L: 138
			int var10 = ViewportMouse.field1770 - var4; // L: 139
			int var11 = WorldMapEvent.field377 - var5; // L: 140
			int var12 = ViewportMouse.field1768 - var6; // L: 141
			if (Math.abs(var10) > var7 + class1.field3) { // L: 142
				return false; // L: 143
			} else if (Math.abs(var11) > var8 + ItemContainer.field570) { // L: 145
				return false; // L: 146
			} else if (Math.abs(var12) > var9 + ViewportMouse.field1772) { // L: 148
				return false; // L: 149
			} else if (Math.abs(var12 * GrandExchangeOfferTotalQuantityComparator.field81 - var11 * SecureRandomCallable.field553) > var9 * ItemContainer.field570 + var8 * ViewportMouse.field1772) { // L: 151
				return false; // L: 152
			} else if (Math.abs(var10 * SecureRandomCallable.field553 - var12 * ViewportMouse.field1771) > var7 * ViewportMouse.field1772 + var9 * class1.field3) { // L: 154
				return false; // L: 155
			} else {
				return Math.abs(var11 * ViewportMouse.field1771 - var10 * GrandExchangeOfferTotalQuantityComparator.field81) <= var7 * ItemContainer.field570 + var8 * class1.field3; // L: 157
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "1986323726"
	)
	static int method3806(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 2736
			var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2737
			Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var6).name; // L: 2738
			return 1; // L: 2739
		} else {
			int var4;
			ItemDefinition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 2741
				MilliClock.Interpreter_intStackSize -= 2; // L: 2742
				var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2743
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2744
				var5 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 2745
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 2746
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2747
				}

				return 1; // L: 2748
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 2750
				MilliClock.Interpreter_intStackSize -= 2; // L: 2751
				var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2752
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2753
				var5 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 2754
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 2755
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2756
				}

				return 1; // L: 2757
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 2759
				var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2760
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var6).price; // L: 2761
				return 1; // L: 2762
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 2764
				var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2765
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 2766
				return 1; // L: 2767
			} else {
				ItemDefinition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 2769
					var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2770
					var7 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 2771
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 2772
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6; // L: 2773
					}

					return 1; // L: 2774
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 2776
					var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2777
					var7 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 2778
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 2779
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6; // L: 2780
					}

					return 1; // L: 2781
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 2783
					var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2784
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 2785
					return 1; // L: 2786
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 2788
					var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2789
					var7 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 2790
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 2791
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6; // L: 2792
					}

					return 1; // L: 2793
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 2795
					var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2796
					var7 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 2797
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 2798
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6; // L: 2799
					}

					return 1; // L: 2800
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 2802
					String var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2803
					var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2804
					class22.findItemDefinitions(var3, var4 == 1); // L: 2805
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = PendingSpawn.foundItemIdCount; // L: 2806
					return 1; // L: 2807
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 2809
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 2814
						AbstractWorldMapIcon.foundItemIndex = 0; // L: 2815
						return 1; // L: 2816
					} else {
						return 2; // L: 2818
					}
				} else {
					if (Message.foundItemIds != null && AbstractWorldMapIcon.foundItemIndex < PendingSpawn.foundItemIdCount) { // L: 2810
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Message.foundItemIds[++AbstractWorldMapIcon.foundItemIndex - 1] & '\uffff'; // L: 2811
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 2812
				}
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1868104521"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10338
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1392240516"
	)
	static final void method3815() {
		PacketBufferNode var0 = class4.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher); // L: 11249
		Client.packetWriter.addNode(var0); // L: 11250

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11251
			if (var1.type == 0 || var1.type == 3) { // L: 11252
				Player.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11254
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 11255
			Client.meslayerContinueWidget = null; // L: 11256
		}

	} // L: 11258
}
