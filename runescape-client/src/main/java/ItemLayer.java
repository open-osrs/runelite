import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2143367533
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -832066785
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -677632279
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 2913572583481576221L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 30907343
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13
}
