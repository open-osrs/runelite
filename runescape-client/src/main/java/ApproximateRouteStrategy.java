import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("de")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1994087319
	)
	@Export("worldPort")
	static int worldPort;

	ApproximateRouteStrategy() {
	} // L: 12118

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIILfq;I)Z",
		garbageValue = "-526381699"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12121
	}
}
