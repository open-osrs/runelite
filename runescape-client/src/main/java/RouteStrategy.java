import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -974244269
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 755634313
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2083846945
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1000276989
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILfy;I)Z",
		garbageValue = "-1237332144"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
