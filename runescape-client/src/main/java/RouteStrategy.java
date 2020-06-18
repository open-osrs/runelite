import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 193339833
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -508607035
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1154057799
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1924382877
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 399050389
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIILfz;I)Z",
		garbageValue = "-1966963917"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
