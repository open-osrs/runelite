import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class163 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	static AbstractArchive field1913;
	@ObfuscatedName("a")
	static int[][][] field1914;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lom;",
		garbageValue = "1426518701"
	)
	static SpritePixels[] method3229() {
		SpritePixels[] var0 = new SpritePixels[class398.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class398.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = class398.SpriteBuffer_spriteWidth;
			var2.height = class398.SpriteBuffer_spriteHeight;
			var2.xOffset = class398.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class398.SpriteBuffer_yOffsets[var1];
			var2.subWidth = ClanChannelMember.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class374.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class398.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = class118.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class398.SpriteBuffer_xOffsets = null;
		class398.SpriteBuffer_yOffsets = null;
		ClanChannelMember.SpriteBuffer_spriteWidths = null;
		class374.SpriteBuffer_spriteHeights = null;
		class118.SpriteBuffer_spritePalette = null;
		class398.SpriteBuffer_pixels = null;
		return var0;
	}
}
