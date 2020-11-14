import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 963104289
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1923677397
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1292742065
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1447501741
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILfh;I)Z",
		garbageValue = "-1510519179"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
