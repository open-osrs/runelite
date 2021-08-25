import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("aw")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -320150853
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 180770347
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1338738523
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1860315469
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1852677063
	)
	@Export("type")
	int type;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -908029863
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 510909857
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 186412371
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1957631521
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1933521517
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1842578097
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 146752915
	)
	int field2450;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -220596823
	)
	int field2452;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 525415407
	)
	int field2453;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -985390885
	)
	int field2456;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -795788233
	)
	int field2440;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1447654559
	)
	int field2459;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 105190927
	)
	int field2451;

	Occluder() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "1"
	)
	public static final synchronized long method4335() {
		long var0 = System.currentTimeMillis();
		if (var0 < class396.field4262) {
			class396.field4261 += class396.field4262 - var0;
		}

		class396.field4262 = var0;
		return var0 + class396.field4261;
	}
}
