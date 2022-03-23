import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class435 {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)[Lql;",
		garbageValue = "3"
	)
	static SpritePixels[] method7695() {
		SpritePixels[] var0 = new SpritePixels[class451.SpriteBuffer_spriteCount]; // L: 119

		for (int var1 = 0; var1 < class451.SpriteBuffer_spriteCount; ++var1) { // L: 120
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 121
			var2.width = class451.SpriteBuffer_spriteWidth; // L: 122
			var2.height = class451.SpriteBuffer_spriteHeight; // L: 123
			var2.xOffset = class451.SpriteBuffer_xOffsets[var1]; // L: 124
			var2.yOffset = class451.SpriteBuffer_yOffsets[var1]; // L: 125
			var2.subWidth = class451.SpriteBuffer_spriteWidths[var1]; // L: 126
			var2.subHeight = class451.SpriteBuffer_spriteHeights[var1]; // L: 127
			int var3 = var2.subWidth * var2.subHeight; // L: 128
			byte[] var4 = class460.SpriteBuffer_pixels[var1]; // L: 129
			var2.pixels = new int[var3]; // L: 130

			for (int var5 = 0; var5 < var3; ++var5) { // L: 131
				var2.pixels[var5] = GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		RouteStrategy.method3872(); // L: 133
		return var0; // L: 134
	}
}
