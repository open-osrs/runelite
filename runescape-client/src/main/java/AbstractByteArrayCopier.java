import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	static World[] World_worlds;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static IndexedSprite logoSprite;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1021172953"
	)
	abstract byte[] get();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1366071744"
	)
	abstract void set(byte[] var1);

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lhq;I)Ljava/lang/String;",
		garbageValue = "506679014"
	)
	static String method4028(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9162
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9163
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9165
					if (var3 == -1) { // L: 9166
						break;
					}

					var0 = var0.substring(0, var3) + ArchiveDiskActionHandler.method4338(GrandExchangeOfferNameComparator.method230(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 9167
				}
			}
		}

		return var0; // L: 9171
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1068531314"
	)
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = Client.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher); // L: 10705
		var0.packetBuffer.writeByte(0); // L: 10706
		Client.packetWriter.addNode(var0); // L: 10707
	} // L: 10708
}
