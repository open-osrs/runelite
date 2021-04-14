import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 997501595
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -502030217
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1934250883
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1021808117
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILel;I)Z",
		garbageValue = "120127354"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "95"
	)
	static boolean method2653(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30; // L: 9045
	}
}
