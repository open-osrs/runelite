import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("n")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("v")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -968243809
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("c")
	static byte[][][] field517;
	@ObfuscatedName("h")
	static byte[][][] field530;
	@ObfuscatedName("s")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("g")
	static final int[] field521;
	@ObfuscatedName("u")
	static final int[] field514;
	@ObfuscatedName("t")
	static final int[] field523;
	@ObfuscatedName("p")
	static final int[] field527;
	@ObfuscatedName("m")
	static final int[] field525;
	@ObfuscatedName("r")
	static final int[] field526;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1953607333
	)
	static int field518;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2108936291
	)
	static int field528;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive14")
	static Archive archive14;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99;
		field521 = new int[]{1, 2, 4, 8};
		field514 = new int[]{16, 32, 64, 128}; // L: 35
		field523 = new int[]{1, 0, -1, 0}; // L: 36
		field527 = new int[]{0, -1, 0, 1};
		field525 = new int[]{1, -1, -1, 1}; // L: 38
		field526 = new int[]{-1, -1, 1, 1}; // L: 39
		field518 = (int)(Math.random() * 17.0D) - 8; // L: 40
		field528 = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1552906826"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class307.field3734) { // L: 15
			class307.field3735 += class307.field3734 - var0; // L: 16
		}

		class307.field3734 = var0;
		return class307.field3735 + var0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lih;",
		garbageValue = "-2101793788"
	)
	public static VarbitComposition method1219(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILlu;Liy;B)V",
		garbageValue = "1"
	)
	static void method1218(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3187 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3187 = 600; // L: 34
		}
	} // L: 37

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgv;",
		garbageValue = "-2100535609"
	)
	static LoginPacket[] method1217() {
		return new LoginPacket[]{LoginPacket.field2340, LoginPacket.field2339, LoginPacket.field2342, LoginPacket.field2338, LoginPacket.field2336, LoginPacket.field2337}; // L: 22
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1993341504"
	)
	static final void method1209(String var0) {
		class300.method5473("Please remove " + var0 + " from your friend list first"); // L: 158
	} // L: 159

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1872094164"
	)
	static int method1215(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 2808
			var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2809
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class281.ItemDefinition_get(var6).name; // L: 2810
			return 1; // L: 2811
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 2813
				Interpreter.Interpreter_intStackSize -= 2; // L: 2814
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2815
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2816
				var5 = class281.ItemDefinition_get(var6); // L: 2817
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 2818
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2819
				}

				return 1; // L: 2820
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 2822
				Interpreter.Interpreter_intStackSize -= 2; // L: 2823
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2824
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2825
				var5 = class281.ItemDefinition_get(var6); // L: 2826
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 2827
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2828
				}

				return 1; // L: 2829
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 2831
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2832
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var6).price; // L: 2833
				return 1; // L: 2834
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 2836
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2837
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 2838
				return 1; // L: 2839
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 2841
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2842
					var7 = class281.ItemDefinition_get(var6); // L: 2843
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 2844
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2845
					}

					return 1; // L: 2846
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 2848
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2849
					var7 = class281.ItemDefinition_get(var6); // L: 2850
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 2851
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2852
					}

					return 1; // L: 2853
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 2855
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2856
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class281.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 2857
					return 1; // L: 2858
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 2860
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2861
					var7 = class281.ItemDefinition_get(var6); // L: 2862
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 2863
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2864
					}

					return 1; // L: 2865
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 2867
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2868
					var7 = class281.ItemDefinition_get(var6); // L: 2869
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 2870
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 2871
					}

					return 1; // L: 2872
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 2874
					String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2875
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2876
					PendingSpawn.findItemDefinitions(var3, var4 == 1); // L: 2877
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NPC.foundItemIdCount; // L: 2878
					return 1; // L: 2879
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 2881
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 2886
						WorldMapLabelSize.foundItemIndex = 0; // L: 2887
						return 1; // L: 2888
					} else {
						return 2; // L: 2890
					}
				} else {
					if (class52.foundItemIds != null && WorldMapLabelSize.foundItemIndex < NPC.foundItemIdCount) { // L: 2882
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class52.foundItemIds[++WorldMapLabelSize.foundItemIndex - 1] & '\uffff'; // L: 2883
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 2884
				}
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "739507935"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10361
	} // L: 10362
}
