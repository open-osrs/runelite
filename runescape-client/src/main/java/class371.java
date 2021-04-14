import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class371 {
	@ObfuscatedName("f")
	static final int[] field4124;

	static {
		field4124 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, -1, 1, -1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 3}; // L: 4
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIILoh;Lhh;I)V",
		garbageValue = "1024019958"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11453
		if (var6 > 4225 && var6 < 90000) { // L: 11454
			int var7 = Client.camAngleY & 2047; // L: 11455
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11456
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11457
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11458
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11459
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11460
			int var14 = var5.width / 2 - 25; // L: 11461
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11462
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11463
			byte var17 = 20; // L: 11464
			class32.redHintArrowSprite.method6999(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11465
		} else {
			WorldMapCacheName.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11467
		}

	} // L: 11468
}
