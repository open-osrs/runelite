import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -695987835
	)
	@Export("z")
	int z;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1300612235
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -190485209
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 810073207
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1356551947
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -7729917977965778771L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 318935705
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;B)V",
		garbageValue = "119"
	)
	static void method4277(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 265
			Buffer var3 = new Buffer(500); // L: 266
			var3.writeByte(3); // L: 267
			var3.writeByte(var1 != null ? 1 : 0); // L: 268
			var3.writeCESU8(var0.getPath()); // L: 269
			if (var1 != null) {
				var3.writeCESU8(""); // L: 270
			}

			var2.write(var3.array, 0, var3.offset); // L: 271
			var2.close(); // L: 272
		} catch (IOException var4) { // L: 274
			var4.printStackTrace(); // L: 275
		}

	} // L: 277

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "602248811"
	)
	public static int method4275(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 17
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1941182040"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class33.World_worlds[var6]; // L: 180
			class33.World_worlds[var6] = class33.World_worlds[var1]; // L: 181
			class33.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = class33.World_worlds[var9]; // L: 185
				int var12 = LoginScreenAnimation.compareWorlds(var11, var8, var2, var3); // L: 187
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
					int var13 = LoginScreenAnimation.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = class33.World_worlds[var9]; // L: 207
					class33.World_worlds[var9] = class33.World_worlds[var7]; // L: 208
					class33.World_worlds[var7++] = var14; // L: 209
				}
			}

			class33.World_worlds[var1] = class33.World_worlds[var7]; // L: 213
			class33.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjd;ZI)V",
		garbageValue = "1668611134"
	)
	static void method4276(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = WorldMapEvent.getWorldMap().getMapArea(var0); // L: 4534
		int var4 = WorldMapSprite.localPlayer.plane; // L: 4535
		int var5 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX; // L: 4536
		int var6 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY; // L: 4537
		Coord var7 = new Coord(var4, var5, var6); // L: 4538
		WorldMapEvent.getWorldMap().method7006(var3, var7, var1, var2); // L: 4539
	} // L: 4540
}
