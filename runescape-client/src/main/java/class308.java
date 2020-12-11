import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class308 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BI)Lku;",
		garbageValue = "-1217906561"
	)
	static Font method5482(byte[] var0) {
		if (var0 == null) { // L: 187
			return null;
		} else {
			Font var1 = new Font(var0, class336.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class336.SpriteBuffer_spriteHeights, class336.SpriteBuffer_spritePalette, GrandExchangeEvents.SpriteBuffer_pixels); // L: 188
			class336.SpriteBuffer_xOffsets = null; // L: 190
			class336.SpriteBuffer_yOffsets = null; // L: 191
			class336.SpriteBuffer_spriteWidths = null; // L: 192
			class336.SpriteBuffer_spriteHeights = null; // L: 193
			class336.SpriteBuffer_spritePalette = null; // L: 194
			GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 195
			return var1; // L: 197
		}
	}
}
