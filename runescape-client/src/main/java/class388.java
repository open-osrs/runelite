import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public enum class388 implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	field4230(4, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	field4231(5, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	field4232(0, 5),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	field4233(2, 6),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	field4234(1, 7),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	field4235(3, 8);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2082679817
	)
	final int field4236;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 113615845
	)
	final int field4237;

	class388(int var3, int var4) {
		this.field4236 = var3;
		this.field4237 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4237;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "7"
	)
	static final void method6942(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2520()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2664, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				var4.addNode(var5);
			}
		}
	}
}
