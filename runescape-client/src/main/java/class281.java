import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class281 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive10")
	static Archive archive10;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1924580283"
	)
	static Sprite method5132() {
		Sprite var0 = new Sprite(); // L: 216
		var0.width = class336.SpriteBuffer_spriteWidth; // L: 217
		var0.height = class336.SpriteBuffer_spriteHeight; // L: 218
		var0.xOffset = class336.SpriteBuffer_xOffsets[0]; // L: 219
		var0.yOffset = class225.SpriteBuffer_yOffsets[0]; // L: 220
		var0.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 221
		var0.subHeight = class336.SpriteBuffer_spriteHeights[0]; // L: 222
		int var1 = var0.subHeight * var0.subWidth; // L: 223
		byte[] var2 = class13.SpriteBuffer_pixels[0]; // L: 224
		var0.pixels = new int[var1]; // L: 225

		for (int var3 = 0; var3 < var1; ++var3) { // L: 226
			var0.pixels[var3] = WorldMapID.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class336.SpriteBuffer_xOffsets = null; // L: 228
		class225.SpriteBuffer_yOffsets = null; // L: 229
		class336.SpriteBuffer_spriteWidths = null; // L: 230
		class336.SpriteBuffer_spriteHeights = null; // L: 231
		WorldMapID.SpriteBuffer_spritePalette = null; // L: 232
		class13.SpriteBuffer_pixels = null; // L: 233
		return var0; // L: 235
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Lbi;IIBB)V",
		garbageValue = "1"
	)
	static final void method5133(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0]; // L: 7707
		int var5 = var0.pathY[0]; // L: 7708
		int var6 = var0.transformedSize(); // L: 7709
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 7710
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 7711
				int var9 = var0.transformedSize(); // L: 7714
				Client.field877.approxDestinationX = var1; // L: 7717
				Client.field877.approxDestinationY = var2; // L: 7718
				Client.field877.approxDestinationSizeX = 1; // L: 7719
				Client.field877.approxDestinationSizeY = 1; // L: 7720
				ApproximateRouteStrategy var10 = Client.field877; // L: 7721
				int var11 = ApproximateRouteStrategy.method1321(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field695, Client.field956); // L: 7723
				if (var11 >= 1) { // L: 7724
					for (int var12 = 0; var12 < var11 - 1; ++var12) { // L: 7725
						var0.method1337(Client.field695[var12], Client.field956[var12], var3);
					}

				}
			}
		}
	} // L: 7726
}
