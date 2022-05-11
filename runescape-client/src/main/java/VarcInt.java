import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("l")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-2122743256"
	)
	public void method3315(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 16
			if (var2 == 0) { // L: 17
				return; // L: 20
			}

			this.method3316(var1, var2); // L: 18
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IS)V",
		garbageValue = "223"
	)
	void method3316(Buffer var1, int var2) {
		if (var2 == 2) { // L: 23
			this.persist = true; // L: 24
		}

	} // L: 27

	@ObfuscatedName("q")
	static boolean method3323(long var0) {
		return class357.method6392(var0) == 2; // L: 48
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1980570860"
	)
	public static int method3324(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 53
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 54
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 55
		var0 += var0 >>> 8; // L: 56
		var0 += var0 >>> 16; // L: 57
		return var0 & 255; // L: 58
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "447479880"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = World.World_worlds[var9]; // L: 185
				int var12 = KeyHandler.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = KeyHandler.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = World.World_worlds[var9]; // L: 207
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 208
					World.World_worlds[var7++] = var14; // L: 209
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 213
			World.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1070094417"
	)
	public static void method3321() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 82
	} // L: 83

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-396189333"
	)
	public static void method3325() {
		class453.SpriteBuffer_xOffsets = null; // L: 223
		class453.SpriteBuffer_yOffsets = null; // L: 224
		ScriptFrame.SpriteBuffer_spriteWidths = null; // L: 225
		class453.SpriteBuffer_spriteHeights = null; // L: 226
		Decimator.SpriteBuffer_spritePalette = null; // L: 227
		class127.SpriteBuffer_pixels = null; // L: 228
	} // L: 229

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIILqr;Lka;B)V",
		garbageValue = "-10"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12380
		if (var6 > 4225 && var6 < 90000) { // L: 12381
			int var7 = Client.camAngleY & 2047; // L: 12382
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12383
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12384
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12385
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12386
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12387
			int var14 = var5.width / 2 - 25; // L: 12388
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12389
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12390
			byte var17 = 20; // L: 12391
			class344.redHintArrowSprite.method7992(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12392
		} else {
			PcmPlayer.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12394
		}

	} // L: 12395
}
