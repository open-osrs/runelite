import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 750514091
	)
	static int field2147;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1258904937
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1834078105
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -903792953
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -4106970907068788613L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -366968213
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "5000"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1741190967"
	)
	static final int method3791() {
		if (Decimator.clientPreferences.roofsHidden) {
			return GrandExchangeEvent.Client_plane;
		} else {
			int var0 = class122.getTileHeight(ItemContainer.cameraX, WorldMapArchiveLoader.cameraZ, GrandExchangeEvent.Client_plane);
			return var0 - Bounds.cameraY < 800 && (Tiles.Tiles_renderFlags[GrandExchangeEvent.Client_plane][ItemContainer.cameraX >> 7][WorldMapArchiveLoader.cameraZ >> 7] & 4) != 0 ? GrandExchangeEvent.Client_plane : 3;
		}
	}
}
