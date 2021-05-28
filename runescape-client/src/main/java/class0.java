import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class0 extends class14 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1588156263
	)
	int field3;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2287605941349640037L
	)
	long field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field3 = var1.readInt(); // L: 310
		this.field0 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method122(this.field3, this.field0); // L: 315
	} // L: 316

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "1784663758"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1619
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1620
			WorldMapDecorationType.method4834(var0.isMembersOnly()); // L: 1621
		}

		if (var0.properties != Client.worldProperties) { // L: 1623
			GrandExchangeOfferAgeComparator.method5068(GrandExchangeOfferAgeComparator.archive8, var0.properties); // L: 1624
		}

		class80.worldHost = var0.host; // L: 1626
		Client.worldId = var0.id; // L: 1627
		Client.worldProperties = var0.properties; // L: 1628
		WorldMapLabelSize.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1629
		GrandExchangeOfferTotalQuantityComparator.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1630
		DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort; // L: 1631
	} // L: 1632
}
