import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 644965823
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -399304345
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 261644725
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 5860999633969021877L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1230601645
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
