import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("m")
	byte[] field2424;
	@ObfuscatedName("o")
	byte[] field2429;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2005334705
	)
	int field2426;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1648638881
	)
	int field2427;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 905436641
	)
	int field2428;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 759232079
	)
	int field2435;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -154479383
	)
	int field2430;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 566366641
	)
	int field2431;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1910724783
	)
	int field2425;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "4"
	)
	static int method3820() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field945;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		signature = "(Lbt;I)V",
		garbageValue = "486554393"
	)
	static final void method3819(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = UserComparator3.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = UserComparator3.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = UserComparator3.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = UserComparator3.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = UserComparator3.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = Language.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field957 = var4;
		var0.field956 = var5;
	}
}
