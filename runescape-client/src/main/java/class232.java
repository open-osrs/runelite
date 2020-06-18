import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class232 {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)[Llh;",
		garbageValue = "-1121273391"
	)
	static IndexedSprite[] method4279() {
		IndexedSprite[] var0 = new IndexedSprite[class335.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class335.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = class335.SpriteBuffer_spriteWidth;
			var2.height = UserComparator8.SpriteBuffer_spriteHeight;
			var2.xOffset = class335.SpriteBuffer_xOffsets[var1];
			var2.yOffset = NPC.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class335.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class335.SpriteBuffer_spriteHeights[var1];
			var2.palette = class335.SpriteBuffer_spritePalette;
			var2.pixels = ItemDefinition.SpriteBuffer_pixels[var1];
		}

		GrandExchangeEvent.method158();
		return var0;
	}
}
