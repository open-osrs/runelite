import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class220 {
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1440657841"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 134

		try {
			var0 = class67.getPreferencesFile("", class285.field3313.name, true); // L: 136
			Buffer var1 = class19.clientPreferences.toBuffer(); // L: 137
			var0.write(var1.array, 0, var1.offset); // L: 138
		} catch (Exception var3) { // L: 140
		}

		try {
			if (var0 != null) { // L: 142
				var0.closeSync(true); // L: 143
			}
		} catch (Exception var2) { // L: 146
		}

	} // L: 147

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1567739451"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5432
			int var3 = SceneTilePaint.getTileHeight(var0, var1, PacketWriter.Client_plane) - var2; // L: 5437
			var0 -= class18.cameraX; // L: 5438
			var3 -= class16.cameraY; // L: 5439
			var1 -= class228.cameraZ; // L: 5440
			int var4 = Rasterizer3D.Rasterizer3D_sine[ViewportMouse.cameraPitch]; // L: 5441
			int var5 = Rasterizer3D.Rasterizer3D_cosine[ViewportMouse.cameraPitch]; // L: 5442
			int var6 = Rasterizer3D.Rasterizer3D_sine[SoundCache.cameraYaw]; // L: 5443
			int var7 = Rasterizer3D.Rasterizer3D_cosine[SoundCache.cameraYaw]; // L: 5444
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5445
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5446
			var0 = var8; // L: 5447
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5448
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 5449
			if (var1 >= 50) { // L: 5451
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5452
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5453
			} else {
				Client.viewportTempX = -1; // L: 5456
				Client.viewportTempY = -1; // L: 5457
			}

		} else {
			Client.viewportTempX = -1; // L: 5433
			Client.viewportTempY = -1; // L: 5434
		}
	} // L: 5435 5459
}
