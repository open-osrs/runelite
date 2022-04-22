import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("g")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1523942229
	)
	@Export("z")
	int z;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -361735633
	)
	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 436509427
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1245875017
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1804141061
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -3781054410051402755L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2053587143
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
