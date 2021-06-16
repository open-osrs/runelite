import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1552806681
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 846668797
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1111067733
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1521438593
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 33814439
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -5150257183506372715L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1106373897
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14
}
