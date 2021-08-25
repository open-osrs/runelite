import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
public class class328 {
	@ObfuscatedName("bj")
	static String field3915;

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1519387336"
	)
	static void method5845(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, SoundCache.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class129.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6841(0);
					var8.packetBuffer.method6851(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2715, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6851(var3[var6]);
					var8.packetBuffer.method6819(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.method6841(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = FriendSystem.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6951(var3[var6]);
					var8.packetBuffer.method6819(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			SecureRandomCallable.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
