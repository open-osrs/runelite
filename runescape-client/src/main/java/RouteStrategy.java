import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -917143075
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 939054465
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2136918663
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2032814193
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILfa;B)Z",
		garbageValue = "2"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "8"
	)
	static void method3134(Buffer var0, int var1) {
		VarbitComposition.method2818(var0.array, var1); // L: 11719
		if (JagexCache.JagexCache_randomDat != null) { // L: 11721
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11723
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11724
			} catch (Exception var3) { // L: 11726
			}
		}

	} // L: 11729
}
