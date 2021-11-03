import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 12457579
	)
	public static int field1979;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static StudioGame field1986;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -116469837
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1807509661
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -655785289
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1106041025
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILfq;I)Z",
		garbageValue = "-526381699"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
