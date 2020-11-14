import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive14")
	static Archive archive14;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-47"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "1848040279"
	)
	public static Object method4069(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 25
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcf;B)V",
		garbageValue = "2"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1538
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1539
			boolean var1 = var0.isMembersOnly(); // L: 1540
			if (var1 != SoundCache.ItemDefinition_inMembersWorld) { // L: 1542
				class200.method3803(); // L: 1543
				SoundCache.ItemDefinition_inMembersWorld = var1; // L: 1544
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1548
			AbstractArchive.method4386(GrandExchangeOffer.archive8, var0.properties); // L: 1549
		}

		UserComparator6.worldHost = var0.host; // L: 1551
		Client.worldId = var0.id; // L: 1552
		Client.worldProperties = var0.properties; // L: 1553
		Coord.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1554
		Coord.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1555
		class41.port3 = Coord.port1; // L: 1556
	} // L: 1557

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "407362763"
	)
	static void method4087(int var0) {
		GrandExchangeOffer.tempMenuAction = new MenuAction(); // L: 11020
		GrandExchangeOffer.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11021
		GrandExchangeOffer.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11022
		GrandExchangeOffer.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11023
		GrandExchangeOffer.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11024
		GrandExchangeOffer.tempMenuAction.action = Client.menuActions[var0]; // L: 11025
	} // L: 11026
}
