import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		longValue = 8670349305611552211L
	)
	static long field2244;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1769768495
	)
	static int field2243;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1593426589
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -631100007
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -990530771
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -5203954899972942883L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 581220091
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("i")
	public static boolean method4106(long var0) {
		boolean var2 = 0L != var0; // L: 44
		if (var2) { // L: 45
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 48
			var2 = !var3; // L: 50
		}

		return var2; // L: 52
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljy;B)V",
		garbageValue = "22"
	)
	public static void method4108(Huffman var0) {
		class264.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Low;",
		garbageValue = "1"
	)
	static SpritePixels method4107() {
		SpritePixels var0 = new SpritePixels(); // L: 192
		var0.width = class414.SpriteBuffer_spriteWidth; // L: 193
		var0.height = class414.SpriteBuffer_spriteHeight; // L: 194
		var0.xOffset = class414.SpriteBuffer_xOffsets[0]; // L: 195
		var0.yOffset = class414.SpriteBuffer_yOffsets[0]; // L: 196
		var0.subWidth = UrlRequester.SpriteBuffer_spriteWidths[0]; // L: 197
		var0.subHeight = class414.SpriteBuffer_spriteHeights[0]; // L: 198
		int var1 = var0.subWidth * var0.subHeight; // L: 199
		byte[] var2 = class295.SpriteBuffer_pixels[0]; // L: 200
		var0.pixels = new int[var1]; // L: 201

		for (int var3 = 0; var3 < var1; ++var3) { // L: 202
			var0.pixels[var3] = HitSplatDefinition.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		PacketBuffer.method6913(); // L: 203
		return var0; // L: 204
	}
}
