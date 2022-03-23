import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1952135175
	)
	@Export("z")
	int z;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1874922275
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1796467831
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1898535773
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -398764443
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -689013995
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1862395077
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 3480899029470944713L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -454015765
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;III)[Lqx;",
		garbageValue = "1626861036"
	)
	public static IndexedSprite[] method4516(AbstractArchive var0, int var1, int var2) {
		if (!GrandExchangeEvent.method6045(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class451.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class451.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = class451.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class451.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class451.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class451.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = class451.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class451.SpriteBuffer_spriteHeights[var5]; // L: 34
				var6.palette = GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class460.SpriteBuffer_pixels[var5]; // L: 36
			}

			RouteStrategy.method3872(); // L: 38
			return var4; // L: 41
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "104"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}
}
