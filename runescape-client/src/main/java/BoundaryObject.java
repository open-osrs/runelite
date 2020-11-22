import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 24178129
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 840836709
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 511451679
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1059090271
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 237050093
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("entity1")
	public Entity entity1;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("entity2")
	public Entity entity2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -3078711070799260957L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -810696597
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
