import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1818161665
	)
	@Export("z")
	int z;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -394717143
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -732373363
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -568181089
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1054718707
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1599500981
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1858126929
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 1587928550129983111L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1186627599
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "106"
	)
	public static boolean method4551(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 29
	}
}
