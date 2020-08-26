import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("entity")
	public Entity entity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1221048069
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -530812325
	)
	@Export("height")
	int height;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1973574069
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 589322861
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2067900831
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -37489551
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 694891885
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 977899527
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 523071703
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1389208075
	)
	int field1974;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2140125731
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 6418610507484255719L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1693237637
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "723631912"
	)
	public static void method3411() {
		if (NetCache.NetCache_socket != null) { // L: 319
			NetCache.NetCache_socket.close();
		}

	} // L: 320

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1910859364"
	)
	public static void method3412() {
		ItemDefinition.ItemDefinition_cached.clear(); // L: 551
		ItemDefinition.ItemDefinition_cachedModels.clear(); // L: 552
		ItemDefinition.ItemDefinition_cachedSprites.clear(); // L: 553
	} // L: 554

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-58"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (WorldMapSprite.loadInterface(var0)) { // L: 9643
			WorldMapSection1.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 9644
		}
	} // L: 9645
}
