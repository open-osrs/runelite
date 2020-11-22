import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public enum class7 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	field26(0, 0);

	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2134453371
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 655499637
	)
	final int field23;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 299082675
	)
	final int field24;

	class7(int var3, int var4) {
		this.field23 = var3; // L: 12
		this.field24 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field24; // L: 17
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1670201823"
	)
	public static boolean method108(int var0) {
		return var0 == WorldMapDecorationType.field2768.id; // L: 50
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1921843394"
	)
	static final void method112(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = HorizontalAlignment.method4876(var5, var6); // L: 5444
		int var7 = 2048 - var3 & 2047; // L: 5445
		int var8 = 2048 - var4 & 2047; // L: 5446
		int var9 = 0; // L: 5447
		int var10 = 0; // L: 5448
		int var11 = var5; // L: 5449
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5450
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5451
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5452
			var14 = var13 * var10 - var5 * var12 >> 16; // L: 5453
			var11 = var13 * var5 + var12 * var10 >> 16; // L: 5454
			var10 = var14; // L: 5455
		}

		if (var8 != 0) { // L: 5457
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5458
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5459
			var14 = var11 * var12 + var13 * var9 >> 16; // L: 5460
			var11 = var13 * var11 - var9 * var12 >> 16; // L: 5461
			var9 = var14; // L: 5462
		}

		ItemContainer.cameraX = var0 - var9; // L: 5464
		ChatChannel.cameraY = var1 - var10; // L: 5465
		WorldMapManager.cameraZ = var2 - var11; // L: 5466
		World.cameraPitch = var3; // L: 5467
		ViewportMouse.cameraYaw = var4; // L: 5468
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (TileItem.oculusOrbFocalPointX >> 7 != PlayerType.localPlayer.x >> 7 || Interpreter.oculusOrbFocalPointY >> 7 != PlayerType.localPlayer.y >> 7)) { // L: 5469 5470
			var12 = PlayerType.localPlayer.plane; // L: 5471
			var13 = (TileItem.oculusOrbFocalPointX >> 7) + FloorDecoration.baseX; // L: 5472
			var14 = (Interpreter.oculusOrbFocalPointY >> 7) + WorldMapData_0.baseY; // L: 5473
			class2.method42(var13, var14, var12, true); // L: 5474
		}

	} // L: 5477
}
