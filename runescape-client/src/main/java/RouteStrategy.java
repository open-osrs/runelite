import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -280287093
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -436525857
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1188944539
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 865807579
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILgv;I)Z",
		garbageValue = "773884525"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
