import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "947451014"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-932830121"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "-102"
	)
	public static int method3322(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 22
			int var6 = var3; // L: 23
			var3 = var4; // L: 24
			var4 = var6; // L: 25
		}

		var2 &= 3; // L: 27
		if (var2 == 0) { // L: 28
			return var1;
		} else if (var2 == 1) { // L: 29
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 30
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lqx;",
		garbageValue = "-183389771"
	)
	static IndexedSprite method3323() {
		IndexedSprite var0 = new IndexedSprite(); // L: 105
		var0.width = class451.SpriteBuffer_spriteWidth; // L: 106
		var0.height = class451.SpriteBuffer_spriteHeight; // L: 107
		var0.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 108
		var0.yOffset = class451.SpriteBuffer_yOffsets[0]; // L: 109
		var0.subWidth = class451.SpriteBuffer_spriteWidths[0]; // L: 110
		var0.subHeight = class451.SpriteBuffer_spriteHeights[0]; // L: 111
		var0.palette = GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette; // L: 112
		var0.pixels = class460.SpriteBuffer_pixels[0]; // L: 113
		RouteStrategy.method3872(); // L: 114
		return var0; // L: 115
	}
}
