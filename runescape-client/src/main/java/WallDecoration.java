import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2070337173
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -303392399
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1106759041
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -220475681
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -954278973
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 249572435
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -354762285
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 1545388647907384621L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 423325183
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("f")
	static double method4429(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}
}
