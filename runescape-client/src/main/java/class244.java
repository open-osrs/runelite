import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class244 {
	@ObfuscatedName("bo")
	static String field2909;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class239[] var2 = new class239[]{class239.field2869, class239.field2867}; // L: 14
		class239[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class239 var5 = var3[var4]; // L: 18
			if (var5.field2868 > var0) { // L: 20
				var0 = var5.field2868;
			}

			if (var5.field2870 > var1) { // L: 21
				var1 = var5.field2870;
			}
		}

	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1279711513"
	)
	public static boolean method4402(int var0) {
		return var0 == WorldMapDecorationType.field2837.id; // L: 46
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-16"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 217
		var1.offset = var0.length - 2; // L: 218
		class124.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 219
		class0.SpriteBuffer_xOffsets = new int[class124.SpriteBuffer_spriteCount]; // L: 220
		Interpreter.SpriteBuffer_yOffsets = new int[class124.SpriteBuffer_spriteCount]; // L: 221
		class395.SpriteBuffer_spriteWidths = new int[class124.SpriteBuffer_spriteCount]; // L: 222
		class157.SpriteBuffer_spriteHeights = new int[class124.SpriteBuffer_spriteCount]; // L: 223
		class223.SpriteBuffer_pixels = new byte[class124.SpriteBuffer_spriteCount][]; // L: 224
		var1.offset = var0.length - 7 - class124.SpriteBuffer_spriteCount * 8; // L: 225
		class395.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 226
		class395.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 227
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 228

		int var3;
		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) { // L: 229
			class0.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) { // L: 230
			Interpreter.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) { // L: 231
			class395.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) { // L: 232
			class157.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class124.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 233
		Varps.SpriteBuffer_spritePalette = new int[var2]; // L: 234

		for (var3 = 1; var3 < var2; ++var3) { // L: 235
			Varps.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 236
			if (Varps.SpriteBuffer_spritePalette[var3] == 0) { // L: 237
				Varps.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 239

		for (var3 = 0; var3 < class124.SpriteBuffer_spriteCount; ++var3) { // L: 240
			int var4 = class395.SpriteBuffer_spriteWidths[var3]; // L: 241
			int var5 = class157.SpriteBuffer_spriteHeights[var3]; // L: 242
			int var6 = var5 * var4; // L: 243
			byte[] var7 = new byte[var6]; // L: 244
			class223.SpriteBuffer_pixels[var3] = var7; // L: 245
			int var8 = var1.readUnsignedByte(); // L: 246
			int var9;
			if (var8 == 0) { // L: 247
				for (var9 = 0; var9 < var6; ++var9) { // L: 248
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 250
				for (var9 = 0; var9 < var4; ++var9) { // L: 251
					for (int var10 = 0; var10 < var5; ++var10) { // L: 252
						var7[var9 + var10 * var4] = var1.readByte(); // L: 253
					}
				}
			}
		}

	} // L: 258

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhu;II)V",
		garbageValue = "-1802681685"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2699 == null) { // L: 995
			throw new RuntimeException(); // L: 996
		} else {
			if (var0.field2653 == null) { // L: 998
				var0.field2653 = new int[var0.field2699.length]; // L: 999
			}

			var0.field2653[var1] = Integer.MAX_VALUE; // L: 1001
		}
	} // L: 1002
}
