import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class345 {
	@ObfuscatedName("l")
	static final int[] field3941;
	@ObfuscatedName("n")
	static final int[] field3945;

	static {
		field3941 = new int[16384];
		field3945 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field3941[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field3945[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIII)V",
		garbageValue = "-1671689416"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				ObjectSound.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
