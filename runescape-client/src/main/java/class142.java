import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class142 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)[Loh;",
		garbageValue = "61"
	)
	static SpritePixels[] method2739() {
		SpritePixels[] var0 = new SpritePixels[class396.SpriteBuffer_spriteCount]; // L: 163

		for (int var1 = 0; var1 < class396.SpriteBuffer_spriteCount; ++var1) { // L: 164
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 165
			var2.width = class396.SpriteBuffer_spriteWidth; // L: 166
			var2.height = UserComparator2.SpriteBuffer_spriteHeight; // L: 167
			var2.xOffset = WorldMapDecoration.SpriteBuffer_xOffsets[var1]; // L: 168
			var2.yOffset = Calendar.SpriteBuffer_yOffsets[var1]; // L: 169
			var2.subWidth = class396.SpriteBuffer_spriteWidths[var1]; // L: 170
			var2.subHeight = class302.SpriteBuffer_spriteHeights[var1]; // L: 171
			int var3 = var2.subWidth * var2.subHeight; // L: 172
			byte[] var4 = class396.SpriteBuffer_pixels[var1]; // L: 173
			var2.pixels = new int[var3]; // L: 174

			for (int var5 = 0; var5 < var3; ++var5) { // L: 175
				var2.pixels[var5] = MilliClock.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		MilliClock.method2587(); // L: 177
		return var0; // L: 178
	}
}
