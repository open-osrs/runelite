import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("j")
	static byte[][][] field2580;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1838818577
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -606313299
	)
	final int field2583;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -330742685
	)
	final int field2578;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -586299201
	)
	final int field2579;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2583 = var1;
		this.field2578 = var2;
		this.field2579 = var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "714158034"
	)
	boolean method4370(float var1) {
		return var1 >= (float)this.field2579;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhh;",
		garbageValue = "1279044140"
	)
	static WorldMapLabelSize[] method4357() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lfi;",
		garbageValue = "-661734359"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "-1103968142"
	)
	static WorldMapLabelSize method4362(int var0) {
		WorldMapLabelSize[] var1 = method4357();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			WorldMapLabelSize var3 = var1[var2];
			if (var0 == var3.field2578) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "0"
	)
	static int method4359(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++IsaacCipher.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			class13.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++IsaacCipher.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++IsaacCipher.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class14.method204() ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--IsaacCipher.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++IsaacCipher.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1715943871"
	)
	static void method4358() {
		if (Varcs.worldMap != null) {
			Varcs.worldMap.method6870(class20.Client_plane, (class340.localPlayer.x >> 7) + class131.baseX, (class340.localPlayer.y >> 7) + TileItem.baseY, false);
			Varcs.worldMap.loadCache();
		}

	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static void method4373() {
		if (Messages.field1273 != null) {
			Client.field559 = Client.cycle;
			Messages.field1273.method5795();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					Messages.field1273.method5806((Client.players[var0].x >> 7) + class131.baseX, (Client.players[var0].y >> 7) + TileItem.baseY);
				}
			}
		}

	}
}
