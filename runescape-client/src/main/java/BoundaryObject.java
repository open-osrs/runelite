import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1657313425
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1880399519
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1024241781
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 291661833
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -40246503
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 5476522096528305987L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -214248861
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
