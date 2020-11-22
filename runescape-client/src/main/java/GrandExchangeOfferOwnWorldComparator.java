import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("t")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	static Widget field677;
	@ObfuscatedName("f")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 11739

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ly;Ly;B)I",
		garbageValue = "22"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 11742
			return 0;
		} else {
			if (this.filterWorlds) { // L: 11743
				if (Client.worldId == var1.world) { // L: 11744
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 11745
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 11747
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 11755
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 11751
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "14"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 72
		if (var3) { // L: 73
			var5 |= 65536L;
		}

		return var5; // L: 74
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1071185333"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field748) { // L: 11029
			Client.field834[var0.rootIndex] = true; // L: 11030
		}

	} // L: 11032
}
