import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1197653211
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1466372567
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1276630481
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIILow;Liw;B)V",
		garbageValue = "-5"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11738
			int var6 = Client.camAngleY & 2047; // L: 11739
			int var7 = var3 * var3 + var2 * var2; // L: 11740
			if (var7 <= 6400) { // L: 11741
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11742
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11743
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11744
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11745
				if (var7 > 2500) {
					var4.method7410(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11746
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11747
				}

			}
		}
	} // L: 11748
}
