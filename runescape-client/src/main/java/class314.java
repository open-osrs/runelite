import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class314 {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BB)Lkt;",
		garbageValue = "53"
	)
	static Font method5680(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class398.SpriteBuffer_xOffsets, class398.SpriteBuffer_yOffsets, ClanChannelMember.SpriteBuffer_spriteWidths, class374.SpriteBuffer_spriteHeights, class118.SpriteBuffer_spritePalette, class398.SpriteBuffer_pixels);
			class398.SpriteBuffer_xOffsets = null;
			class398.SpriteBuffer_yOffsets = null;
			ClanChannelMember.SpriteBuffer_spriteWidths = null;
			class374.SpriteBuffer_spriteHeights = null;
			class118.SpriteBuffer_spritePalette = null;
			class398.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
