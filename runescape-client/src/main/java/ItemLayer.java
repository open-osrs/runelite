import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1950267115
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -840082071
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1958043433
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 8707211480451132889L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1688818251
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-830600929"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 76
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 77
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 80
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 81
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 84
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 85
		} else {
			if (class20.ByteArrayPool_arrays != null) { // L: 88
				for (int var1 = 0; var1 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 89
					if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < class20.ByteArrayPool_arrays[var1].length) { // L: 90
						class20.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 91
						return; // L: 92
					}
				}
			}

		}
	} // L: 78 82 86 96

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 196
		var1.offset = var0.length - 2; // L: 197
		class396.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 198
		WorldMapDecoration.SpriteBuffer_xOffsets = new int[class396.SpriteBuffer_spriteCount]; // L: 199
		Calendar.SpriteBuffer_yOffsets = new int[class396.SpriteBuffer_spriteCount]; // L: 200
		class396.SpriteBuffer_spriteWidths = new int[class396.SpriteBuffer_spriteCount]; // L: 201
		class302.SpriteBuffer_spriteHeights = new int[class396.SpriteBuffer_spriteCount]; // L: 202
		class396.SpriteBuffer_pixels = new byte[class396.SpriteBuffer_spriteCount][]; // L: 203
		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8; // L: 204
		class396.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 205
		UserComparator2.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 206
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 207

		int var3;
		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 208
			WorldMapDecoration.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 209
			Calendar.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 210
			class396.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 211
			class302.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 212
		MilliClock.SpriteBuffer_spritePalette = new int[var2]; // L: 213

		for (var3 = 1; var3 < var2; ++var3) { // L: 214
			MilliClock.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 215
			if (MilliClock.SpriteBuffer_spritePalette[var3] == 0) { // L: 216
				MilliClock.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 218

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 219
			int var4 = class396.SpriteBuffer_spriteWidths[var3]; // L: 220
			int var5 = class302.SpriteBuffer_spriteHeights[var3]; // L: 221
			int var6 = var4 * var5; // L: 222
			byte[] var7 = new byte[var6]; // L: 223
			class396.SpriteBuffer_pixels[var3] = var7; // L: 224
			int var8 = var1.readUnsignedByte(); // L: 225
			int var9;
			if (var8 == 0) { // L: 226
				for (var9 = 0; var9 < var6; ++var9) { // L: 227
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 229
				for (var9 = 0; var9 < var4; ++var9) { // L: 230
					for (int var10 = 0; var10 < var5; ++var10) { // L: 231
						var7[var9 + var4 * var10] = var1.readByte(); // L: 232
					}
				}
			}
		}

	} // L: 237
}
