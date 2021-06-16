import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;B)I",
		garbageValue = "1"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "1304582630"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1497
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1498
			boolean var1 = var0.isMembersOnly(); // L: 1499
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) { // L: 1501
				Projectile.method2075(); // L: 1502
				ItemComposition.ItemDefinition_inMembersWorld = var1; // L: 1503
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1507
			class27.method364(ModeWhere.archive8, var0.properties); // L: 1508
		}

		Client.worldHost = var0.host; // L: 1510
		Client.worldId = var0.id; // L: 1511
		Client.worldProperties = var0.properties; // L: 1512
		UserComparator7.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1513
		MouseRecorder.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1514
		UserComparator2.currentPort = UserComparator7.worldPort; // L: 1515
	} // L: 1516

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-56"
	)
	static final void method5203(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 11524
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method49()) { // L: 11525
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11526
				PacketWriter var4 = Client.packetWriter; // L: 11527
				PacketBufferNode var5 = InterfaceParent.getPacketBufferNode(ClientPacket.field2675, var4.isaacCipher); // L: 11528
				var5.packetBuffer.writeByte(4 + class44.stringCp1252NullTerminatedByteSize(var3.name)); // L: 11529
				var5.packetBuffer.writeByte(var0); // L: 11530
				var5.packetBuffer.writeShort(var1); // L: 11531
				var5.packetBuffer.writeBoolean(var2); // L: 11532
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.name); // L: 11533
				var4.addNode(var5); // L: 11534
			}
		}
	} // L: 11535
}
