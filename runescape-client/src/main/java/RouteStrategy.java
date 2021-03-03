import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1648093549
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 845943469
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1266527917
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1498688541
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILfe;I)Z",
		garbageValue = "1148121553"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	static void method3795() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 50

		while (var0.hasNext()) { // L: 55
			Message var1 = (Message)var0.next(); // L: 51
			var1.clearIsFromFriend(); // L: 53
		}

	} // L: 56

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1059430259"
	)
	static void method3794() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4258
			WorldMapScaleHandler.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4259
		}

	} // L: 4261
}
