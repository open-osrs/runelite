import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;I)I",
		garbageValue = "1171495407"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "9125"
	)
	static void method3522(int var0, int var1) {
		int var2 = GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(ArchiveLoader.method1230(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var2 + var4 > IgnoreList.canvasWidth) {
			var4 = IgnoreList.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > ModelData0.canvasHeight) {
			var5 = ModelData0.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		AbstractUserComparator.menuX = var4;
		DynamicObject.menuY = var5;
		Occluder.menuWidth = var2;
		class182.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
