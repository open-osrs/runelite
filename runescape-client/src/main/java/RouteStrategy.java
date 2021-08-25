import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1629612849
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1029926403
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1686095429
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -208649847
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILfk;S)Z",
		garbageValue = "13398"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("c")
	public static boolean method3352(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}
}
