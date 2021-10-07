import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1344462217
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1263236151
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 213463867
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -384519969
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1744940785
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIILfy;I)Z",
		garbageValue = "1728008342"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
