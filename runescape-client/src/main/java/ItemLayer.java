import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1420989371
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -488248925
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -984495605
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -8281197282247893905L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -415134249
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-22"
	)
	static void method3715(int var0, int var1) {
		MenuAction var2 = class9.tempMenuAction; // L: 11069
		HorizontalAlignment.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1); // L: 11071
		class9.tempMenuAction = null; // L: 11073
	} // L: 11074
}
