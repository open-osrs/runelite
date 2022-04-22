import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class389 {
	@ObfuscatedName("v")
	float[] field4364;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1953516053
	)
	int field4363;

	class389(float[] var1, int var2) {
		this.field4364 = var1; // L: 10
		this.field4363 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "82"
	)
	static final void method7094(boolean var0) {
		class116.playPcmPlayers(); // L: 5631
		++Client.packetWriter.pendingWrites; // L: 5632
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5633
			Client.packetWriter.pendingWrites = 0; // L: 5634
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5635
				PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher); // L: 5637
				Client.packetWriter.addNode(var1); // L: 5638

				try {
					Client.packetWriter.flush(); // L: 5640
				} catch (IOException var3) { // L: 5642
					Client.hadNetworkError = true; // L: 5643
				}
			}

		}
	} // L: 5646
}
