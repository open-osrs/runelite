import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "99"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-48"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIIBZS)V",
		garbageValue = "-20064"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 108
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 109
		if (var8 == null) { // L: 110
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 111
			if (var8 == null) { // L: 112
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 113
				if (var8 != null) { // L: 114
					if (var5) { // L: 115
						var8.removeDual(); // L: 116
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 117
						--NetCache.NetCache_pendingWritesCount; // L: 118
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 119
					}

				} else {
					if (!var5) { // L: 123
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 124
						if (var8 != null) { // L: 125
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 127
					var8.archive = var0; // L: 128
					var8.crc = var3; // L: 129
					var8.padding = var4; // L: 130
					if (var5) { // L: 131
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 132
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 133
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 136
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 137
						++NetCache.NetCache_pendingWritesCount; // L: 138
					}

				}
			}
		}
	} // L: 121 140

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	static void method5169(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9075
		int[] var3 = Players.Players_indices; // L: 9076
		boolean var4 = false; // L: 9077
		Username var5 = new Username(var1, GrandExchangeOfferUnitPriceComparator.loginType); // L: 9078

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9079
			Player var7 = Client.players[var3[var6]]; // L: 9080
			if (var7 != null && var7 != HealthBarDefinition.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9081
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9082
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2733, Client.packetWriter.isaacCipher); // L: 9084
					var8.packetBuffer.writeShort(var3[var6]); // L: 9085
					var8.packetBuffer.writeByte(0); // L: 9086
					Client.packetWriter.addNode(var8); // L: 9087
				} else if (var0 == 4) { // L: 9089
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2769, Client.packetWriter.isaacCipher); // L: 9091
					var8.packetBuffer.method6962(var3[var6]); // L: 9092
					var8.packetBuffer.method7171(0); // L: 9093
					Client.packetWriter.addNode(var8); // L: 9094
				} else if (var0 == 6) { // L: 9096
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2714, Client.packetWriter.isaacCipher); // L: 9098
					var8.packetBuffer.method7001(var3[var6]); // L: 9099
					var8.packetBuffer.method6993(0); // L: 9100
					Client.packetWriter.addNode(var8); // L: 9101
				} else if (var0 == 7) { // L: 9103
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher); // L: 9105
					var8.packetBuffer.writeShort(var3[var6]); // L: 9106
					var8.packetBuffer.method7171(0); // L: 9107
					Client.packetWriter.addNode(var8); // L: 9108
				}

				var4 = true; // L: 9110
				break;
			}
		}

		if (!var4) { // L: 9114
			class397.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9115
}
