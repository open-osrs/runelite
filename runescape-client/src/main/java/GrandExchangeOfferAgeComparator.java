import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 41408299
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("o")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("w")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ls;Ls;I)I",
		garbageValue = "-2089427647"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1928902850"
	)
	static final void method224(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var11 * var14 - var13 * var7 >> 16;
			var12 = var13 * var11 + var7 * var14 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var10 * var14 + var12 * var13 >> 16;
			var12 = var14 * var12 - var13 * var10 >> 16;
			var10 = var15;
		}

		MouseHandler.cameraX = var0 - var10;
		WorldMapSection3.cameraY = var1 - var11;
		ObjectSound.cameraZ = var2 - var12;
		TilePaint.cameraPitch = var3;
		Canvas.cameraYaw = var4;
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class225.oculusOrbFocalPointX >> 7 != class60.localPlayer.x >> 7 || HealthBarDefinition.oculusOrbFocalPointY >> 7 != class60.localPlayer.y >> 7)) {
			var13 = class60.localPlayer.plane;
			var14 = (class225.oculusOrbFocalPointX >> 7) + class182.baseX;
			var15 = (HealthBarDefinition.oculusOrbFocalPointY >> 7) + SecureRandomFuture.baseY;
			GrandExchangeOffer.method191(var14, var15, var13, true);
		}

	}
}
