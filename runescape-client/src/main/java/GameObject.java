import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public final class GameObject {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public Entity entity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1221048069
	)
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -530812325
	)
	int height;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1973574069
	)
	int centerX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 589322861
	)
	int centerY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2067900831
	)
	int orientation;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -37489551
	)
	int startX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 694891885
	)
	int endX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 977899527
	)
	int startY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 523071703
	)
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
	int lastDrawn;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 6418610507484255719L
	)
	public long tag;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1693237637
	)
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
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (WorldMapSprite.loadInterface(var0)) { // L: 9643
			WorldMapSection1.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 9644
		}
	} // L: 9645
}
