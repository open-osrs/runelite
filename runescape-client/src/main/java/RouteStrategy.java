import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1113352723
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1931856815
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2132337773
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 203403193
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 308023697
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILfz;I)Z",
		garbageValue = "496202097"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
