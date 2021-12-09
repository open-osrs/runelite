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
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2583 = var1; // L: 19
		this.field2578 = var2; // L: 20
		this.field2579 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "714158034"
	)
	boolean method4370(float var1) {
		return var1 >= (float)this.field2579; // L: 25
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhh;",
		garbageValue = "1279044140"
	)
	static WorldMapLabelSize[] method4357() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small}; // L: 15
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lfi;",
		garbageValue = "-661734359"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 62
		if (var1 != null) { // L: 63
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 64
			var1 = new NPCComposition(); // L: 65
			var1.id = var0; // L: 66
			if (var2 != null) { // L: 67
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 68
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 69
			return var1; // L: 70
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "-1103968142"
	)
	static WorldMapLabelSize method4362(int var0) {
		WorldMapLabelSize[] var1 = method4357(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field2578) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "0"
	)
	static int method4359(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4382
			++IsaacCipher.Interpreter_intStackSize; // L: 4383
			return 1; // L: 4384
		} else if (var0 == 7101) { // L: 4386
			class13.Interpreter_stringStackSize += 2; // L: 4387
			return 1; // L: 4388
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4390
			if (var0 == 7106) { // L: 4394
				++IsaacCipher.Interpreter_intStackSize; // L: 4395
				return 1; // L: 4396
			} else if (var0 == 7107) { // L: 4398
				++IsaacCipher.Interpreter_intStackSize; // L: 4399
				return 1; // L: 4400
			} else if (var0 == 7108) { // L: 4402
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class14.method204() ? 1 : 0; // L: 4403
				return 1; // L: 4404
			} else if (var0 == 7110) { // L: 4406
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 4407
				return 1; // L: 4408
			} else if (var0 == 7120) { // L: 4410
				--IsaacCipher.Interpreter_intStackSize; // L: 4411
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 4412
				return 1; // L: 4413
			} else if (var0 == 7121) { // L: 4415
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 4416
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4417
				return 1; // L: 4418
			} else if (var0 == 7122) { // L: 4420
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 4421
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 4422
				return 1; // L: 4423
			} else {
				return 2; // L: 4425
			}
		} else {
			++IsaacCipher.Interpreter_intStackSize; // L: 4391
			return 1; // L: 4392
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1715943871"
	)
	static void method4358() {
		if (Varcs.worldMap != null) { // L: 4939
			Varcs.worldMap.method6870(class20.Client_plane, (class340.localPlayer.x >> 7) + class131.baseX, (class340.localPlayer.y >> 7) + TileItem.baseY, false); // L: 4940
			Varcs.worldMap.loadCache(); // L: 4941
		}

	} // L: 4943

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static void method4373() {
		if (Messages.field1273 != null) { // L: 12712
			Client.field559 = Client.cycle; // L: 12713
			Messages.field1273.method5795(); // L: 12714

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12715
				if (Client.players[var0] != null) { // L: 12716
					Messages.field1273.method5806((Client.players[var0].x >> 7) + class131.baseX, (Client.players[var0].y >> 7) + TileItem.baseY); // L: 12717
				}
			}
		}

	} // L: 12721
}
