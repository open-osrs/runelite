import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("n")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -174867873
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1503136055
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("c")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1632949407
	)
	static int field1757;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1445923815
	)
	static int field1758;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -822732275
	)
	static int field1759;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1825654461
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("k")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive9")
	static Archive archive9;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "598296470"
	)
	static int method3161() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1399
			int var0 = 0; // L: 1400

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1401
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1402
			}

			return var0 * 10000 / Client.field934; // L: 1404
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Liy;",
		garbageValue = "1822401208"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 1789
		if (JagexCache.JagexCache_dat2File != null) { // L: 1790
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, WorldMapEvent.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, WorldMapScaleHandler.masterDisk, var0, var1, var2, var3); // L: 1791
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1069741089"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapCacheName.loadInterface(var0)) { // L: 9381
			WorldMapAreaData.field362 = null; // L: 9388
			class41.drawInterface(DefaultsGroup.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9389
			if (WorldMapAreaData.field362 != null) { // L: 9390
				class41.drawInterface(WorldMapAreaData.field362, -1412584499, var1, var2, var3, var4, WorldMapIcon_1.field218, GrandExchangeOfferOwnWorldComparator.field656, var7); // L: 9391
				WorldMapAreaData.field362 = null; // L: 9392
			}

		} else {
			if (var7 != -1) { // L: 9382
				Client.field816[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9384
					Client.field816[var8] = true;
				}
			}

		}
	} // L: 9386 9394
}
