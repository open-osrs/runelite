import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static Bounds field643;
	@ObfuscatedName("h")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 11252

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(La;La;B)I",
		garbageValue = "-7"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 11255
			return 0;
		} else {
			if (this.filterWorlds) { // L: 11256
				if (Client.worldId == var1.world) { // L: 11257
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 11258
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 11260
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 11264
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 11268
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-812111829"
	)
	static final void method1359(String var0, int var1) {
		PacketBufferNode var2 = ItemContainer.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher); // L: 252
		var2.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 253
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 254
		var2.packetBuffer.method5569(var1); // L: 255
		Client.packetWriter.addNode(var2); // L: 256
	} // L: 257
}
