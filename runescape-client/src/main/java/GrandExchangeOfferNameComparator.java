import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(La;La;I)I",
		garbageValue = "1347597174"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method201() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1343430336"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-369903170"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 191
			if (KeyHandler.field415 == KeyHandler.field417) { // L: 192
				return false;
			} else {
				StudioGame.field3135 = KeyHandler.field412[KeyHandler.field415]; // L: 193
				WorldMapIcon_1.field200 = KeyHandler.field409[KeyHandler.field415]; // L: 194
				KeyHandler.field415 = KeyHandler.field415 + 1 & 127; // L: 195
				return true; // L: 196
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 566
		if (class25.garbageCollector == null || !class25.garbageCollector.isValid()) { // L: 567
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 569

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 570
					if (var2.isValid()) { // L: 572
						class25.garbageCollector = var2; // L: 573
						GameShell.garbageCollectorLastCheckTimeMs = -1L; // L: 574
						GameShell.garbageCollectorLastCollectionTime = -1L; // L: 575
					}
				}
			} catch (Throwable var11) { // L: 580
			}
		}

		if (class25.garbageCollector != null) { // L: 582
			long var9 = class298.currentTimeMillis(); // L: 583
			long var3 = class25.garbageCollector.getCollectionTime(); // L: 584
			if (-1L != GameShell.garbageCollectorLastCollectionTime) { // L: 585
				long var5 = var3 - GameShell.garbageCollectorLastCollectionTime; // L: 586
				long var7 = var9 - GameShell.garbageCollectorLastCheckTimeMs; // L: 587
				if (var7 != 0L) { // L: 588
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameShell.garbageCollectorLastCollectionTime = var3; // L: 590
			GameShell.garbageCollectorLastCheckTimeMs = var9; // L: 591
		}

		return var0; // L: 593
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "112778991"
	)
	static final void method209() {
		if (WorldMapIcon_1.ClanChat_inClanChat) { // L: 3725
			if (WorldMapArea.clanChat != null) { // L: 3726
				WorldMapArea.clanChat.sort(); // L: 3727
			}

			SecureRandomCallable.method1217(); // L: 3729
			WorldMapIcon_1.ClanChat_inClanChat = false; // L: 3730
		}

	} // L: 3732
}
