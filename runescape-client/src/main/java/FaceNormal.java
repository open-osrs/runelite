import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static GameBuild field2349;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1621904451
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1108401493
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -78767847
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "([Lio;IIIZI)V",
		garbageValue = "-1098219782"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				GrandExchangeOfferUnitPriceComparator.alignWidgetSize(var6, var2, var3, var4);
				SoundCache.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					AttackOption.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
