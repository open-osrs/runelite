import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 156821715
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 81410901
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1731477927
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 828570099
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2004551277
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1692741097
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -5701861202645263443L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1847127539
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
