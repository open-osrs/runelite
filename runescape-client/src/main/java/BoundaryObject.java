import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1837784551
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 324986435
	)
	@Export("x")
	int x;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 392241551
	)
	@Export("y")
	int y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1347087127
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1198661661
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -5322685038188485543L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 898643669
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;IIB)[Lly;",
		garbageValue = "0"
	)
	public static IndexedSprite[] method3420(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			GrandExchangeOfferNameComparator.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount]; // L: 36

			for (int var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) { // L: 37
				IndexedSprite var7 = var5[var6] = new IndexedSprite(); // L: 38
				var7.width = class336.SpriteBuffer_spriteWidth; // L: 39
				var7.height = class336.SpriteBuffer_spriteHeight; // L: 40
				var7.xOffset = class105.SpriteBuffer_xOffsets[var6]; // L: 41
				var7.yOffset = class336.SpriteBuffer_yOffsets[var6]; // L: 42
				var7.subWidth = class336.SpriteBuffer_spriteWidths[var6]; // L: 43
				var7.subHeight = class225.SpriteBuffer_spriteHeights[var6]; // L: 44
				var7.palette = HorizontalAlignment.SpriteBuffer_spritePalette; // L: 45
				var7.pixels = class2.SpriteBuffer_pixels[var6]; // L: 46
			}

			class105.SpriteBuffer_xOffsets = null; // L: 49
			class336.SpriteBuffer_yOffsets = null; // L: 50
			class336.SpriteBuffer_spriteWidths = null; // L: 51
			class225.SpriteBuffer_spriteHeights = null; // L: 52
			HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 53
			class2.SpriteBuffer_pixels = null; // L: 54
			return var5; // L: 58
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 3807
	}
}
