import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public enum class7 implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	field41(0, 0);

	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 324550527
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 501713391
	)
	static int field35;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -997715077
	)
	public final int field36;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1130896925
	)
	final int field37;

	class7(int var3, int var4) {
		this.field36 = var3; // L: 16
		this.field37 = var4;
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field37; // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgs;",
		garbageValue = "2004297055"
	)
	public static class194[] method85() {
		return new class194[]{class194.field2348, class194.field2354, class194.field2347, class194.field2356, class194.field2350, class194.field2351, class194.field2352, class194.field2353, class194.field2346, class194.field2355}; // L: 17
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-63"
	)
	static void method83(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8818
		int[] var3 = Players.Players_indices; // L: 8819
		boolean var4 = false; // L: 8820
		Username var5 = new Username(var1, Message.loginType); // L: 8821

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8822
			Player var7 = Client.players[var3[var6]]; // L: 8823
			if (var7 != null && var7 != UserComparator9.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8824
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8825
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 8827
					var8.packetBuffer.writeShortLE(var3[var6]); // L: 8828
					var8.packetBuffer.method5931(0); // L: 8829
					Client.packetWriter.addNode(var8); // L: 8830
				} else if (var0 == 4) { // L: 8832
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher); // L: 8834
					var8.packetBuffer.writeShortLE(var3[var6]); // L: 8835
					var8.packetBuffer.method5931(0); // L: 8836
					Client.packetWriter.addNode(var8); // L: 8837
				} else if (var0 == 6) { // L: 8839
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher); // L: 8841
					var8.packetBuffer.writeShort(var3[var6]); // L: 8842
					var8.packetBuffer.writeByte(0); // L: 8843
					Client.packetWriter.addNode(var8); // L: 8844
				} else if (var0 == 7) { // L: 8846
					var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher); // L: 8848
					var8.packetBuffer.method5883(0); // L: 8849
					var8.packetBuffer.writeIntME(var3[var6]); // L: 8850
					Client.packetWriter.addNode(var8); // L: 8851
				}

				var4 = true; // L: 8853
				break;
			}
		}

		if (!var4) { // L: 8857
			AbstractWorldMapData.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8858
}
