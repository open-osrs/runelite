import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class398 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class414.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class135.SpriteBuffer_xOffsets = new int[class414.SpriteBuffer_spriteCount];
		class131.SpriteBuffer_yOffsets = new int[class414.SpriteBuffer_spriteCount];
		class414.SpriteBuffer_spriteWidths = new int[class414.SpriteBuffer_spriteCount];
		class16.SpriteBuffer_spriteHeights = new int[class414.SpriteBuffer_spriteCount];
		class414.SpriteBuffer_pixels = new byte[class414.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class414.SpriteBuffer_spriteCount * 8;
		class414.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class408.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class135.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class131.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class414.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			class16.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class414.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class351.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class351.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class351.SpriteBuffer_spritePalette[var3] == 0) {
				class351.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class414.SpriteBuffer_spriteWidths[var3];
			int var5 = class16.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class414.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}
}
