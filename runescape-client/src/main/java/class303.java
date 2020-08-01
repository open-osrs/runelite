import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class303 {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1926493501"
	)
	static final void method5528(boolean var0) {
		Timer.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field722 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = UserComparator4.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field722 = true;
				}
			}

		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method5525() {
		if (class278.field3585 != null) {
			Client.field942 = Client.cycle;
			class278.field3585.method4489();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class278.field3585.method4504((Client.players[var0].x >> 7) + class182.baseX, (Client.players[var0].y >> 7) + SecureRandomFuture.baseY);
				}
			}
		}

	}
}
