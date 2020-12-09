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
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class336.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class336.SpriteBuffer_spriteHeights, class336.SpriteBuffer_spritePalette, GrandExchangeEvents.SpriteBuffer_pixels);
			class336.SpriteBuffer_xOffsets = null;
			class336.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			class336.SpriteBuffer_spritePalette = null;
			GrandExchangeEvents.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
