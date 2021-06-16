import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1188565001
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1313768427
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1783285633
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1287011473
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1737527969
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -134760601
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1472974577
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1609596079
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -338099237
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1143338287
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1870122495
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2114600339
	)
	int field2378;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -183900019
	)
	int field2370;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -685155783
	)
	int field2380;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 204431275
	)
	int field2383;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -78782023
	)
	int field2382;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1929660861
	)
	int field2385;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2103719141
	)
	int field2384;

	Occluder() {
	} // L: 23

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "0"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 57
	}
}
