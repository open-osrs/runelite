import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -117135279
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -193579243
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2117060031
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -26030581
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIB)[Lof;",
		garbageValue = "43"
	)
	public static IndexedSprite[] method3571(AbstractArchive var0, int var1, int var2) {
		if (!Username.method5711(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class396.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class396.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = class396.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class396.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class243.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class396.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class372.SpriteBuffer_spriteHeights[var5]; // L: 34
				var6.palette = AccessFile.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class396.SpriteBuffer_pixels[var5]; // L: 36
			}

			class243.SpriteBuffer_xOffsets = null; // L: 39
			class396.SpriteBuffer_yOffsets = null; // L: 40
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null; // L: 41
			class372.SpriteBuffer_spriteHeights = null; // L: 42
			AccessFile.SpriteBuffer_spritePalette = null; // L: 43
			class396.SpriteBuffer_pixels = null; // L: 44
			return var4; // L: 48
		}
	}
}
