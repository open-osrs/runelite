import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static StudioGame field58;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ly;Ly;B)I",
		garbageValue = "15"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-297483438"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5423
		int var4 = var1 >> 7; // L: 5424
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5425
			int var5 = var2; // L: 5426
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5427
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5428
			int var7 = var1 & 127; // L: 5429
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5430
			int var9 = Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5431
			return var8 * (128 - var7) + var7 * var9 >> 7; // L: 5432
		} else {
			return 0;
		}
	}
}
