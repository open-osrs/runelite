import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1648462545
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -235998971
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2103328385
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 738835935
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILgv;I)Z",
		garbageValue = "1278947831"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
