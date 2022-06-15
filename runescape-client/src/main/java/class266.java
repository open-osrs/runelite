import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
public class class266 {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[Lqe;",
		garbageValue = "22"
	)
	static SpritePixels[] method5212() {
		SpritePixels[] var0 = new SpritePixels[class456.SpriteBuffer_spriteCount]; // L: 157

		for (int var1 = 0; var1 < class456.SpriteBuffer_spriteCount; ++var1) { // L: 158
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 159
			var2.width = ModelData0.SpriteBuffer_spriteWidth; // L: 160
			var2.height = class456.SpriteBuffer_spriteHeight; // L: 161
			var2.xOffset = class426.SpriteBuffer_xOffsets[var1]; // L: 162
			var2.yOffset = class142.SpriteBuffer_yOffsets[var1]; // L: 163
			var2.subWidth = class359.SpriteBuffer_spriteWidths[var1]; // L: 164
			var2.subHeight = class456.SpriteBuffer_spriteHeights[var1]; // L: 165
			int var3 = var2.subHeight * var2.subWidth; // L: 166
			byte[] var4 = class421.SpriteBuffer_pixels[var1]; // L: 167
			var2.pixels = new int[var3]; // L: 168

			for (int var5 = 0; var5 < var3; ++var5) { // L: 169
				var2.pixels[var5] = class13.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		SoundCache.method766(); // L: 171
		return var0; // L: 172
	}
}
