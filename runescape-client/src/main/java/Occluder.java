import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1001038233
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -961555273
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -115587993
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2031501137
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2011315243
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1543277097
	)
	@Export("type")
	int type;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1717742133
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -274411845
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -698195239
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1418804225
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1159677951
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 253591851
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1918923367
	)
	int field1921;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1725164325
	)
	int field1925;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1353837759
	)
	int field1923;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1307252971
	)
	int field1924;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -164056125
	)
	int field1929;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 635255003
	)
	int field1926;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1055944847
	)
	int field1927;

	Occluder() {
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lig;",
		garbageValue = "79"
	)
	static class238[] method3377() {
		return new class238[]{class238.field3111, class238.field3114}; // L: 35
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1625020333"
	)
	public static int method3378() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 59
	}

	@ObfuscatedName("p")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 77
	}
}
