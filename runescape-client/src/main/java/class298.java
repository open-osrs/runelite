import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class298 {
	@ObfuscatedName("f")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Liw;II)Lle;",
		garbageValue = "852535134"
	)
	public static IndexedSprite method5411(AbstractArchive var0, int var1) {
		if (!WorldMapAreaData.method787(var0, var1)) { // L: 190
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite(); // L: 193
			var3.width = class336.SpriteBuffer_spriteWidth; // L: 194
			var3.height = class336.SpriteBuffer_spriteHeight; // L: 195
			var3.xOffset = class336.SpriteBuffer_xOffsets[0]; // L: 196
			var3.yOffset = class225.SpriteBuffer_yOffsets[0]; // L: 197
			var3.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 198
			var3.subHeight = class336.SpriteBuffer_spriteHeights[0]; // L: 199
			var3.palette = WorldMapID.SpriteBuffer_spritePalette; // L: 200
			var3.pixels = class13.SpriteBuffer_pixels[0]; // L: 201
			class336.SpriteBuffer_xOffsets = null; // L: 203
			class225.SpriteBuffer_yOffsets = null; // L: 204
			class336.SpriteBuffer_spriteWidths = null; // L: 205
			class336.SpriteBuffer_spriteHeights = null; // L: 206
			WorldMapID.SpriteBuffer_spritePalette = null; // L: 207
			class13.SpriteBuffer_pixels = null; // L: 208
			return var3; // L: 212
		}
	}
}
