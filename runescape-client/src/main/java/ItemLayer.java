import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1934498293
	)
	@Export("z")
	int z;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1682915239
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1807904991
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 8574022312496801161L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -420916721
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13
}
