import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1689903637
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1260940049
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -117710629
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1407439953
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2009142717
	)
	@Export("type")
	int type;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1177929287
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1697237449
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1873689371
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 20317203
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1660830247
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1623185181
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1102414179
	)
	int field2374;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1992323793
	)
	int field2380;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1961407493
	)
	int field2376;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1190526879
	)
	int field2377;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 897436961
	)
	int field2368;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1480308041
	)
	int field2378;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1837563395
	)
	int field2363;

	Occluder() {
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Ljava/lang/String;I)I",
		garbageValue = "1064465292"
	)
	public static int method4089(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = Language.method5070(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class377.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "281084501"
	)
	static void method4090() {
		Client.menuOptionsCount = 0; // L: 7822
		Client.isMenuOpen = false; // L: 7823
	} // L: 7824

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-128058403"
	)
	static final void method4088(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11209
		class12.clientPreferences.areaSoundEffectsVolume = var0; // L: 11210
		KeyHandler.savePreferences(); // L: 11211
	} // L: 11212
}
