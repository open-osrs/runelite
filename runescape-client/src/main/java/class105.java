import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class105 {
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -2115685501
	)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1492762721"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5027
		int var4 = var1 >> 7; // L: 5028
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5029
			int var5 = var2; // L: 5030
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5031
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5032
			int var7 = var1 & 127; // L: 5033
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5034
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 5035
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5036
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1444494320"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (WorldMapRegion.friendsChat != null) { // L: 11290
			PacketBufferNode var1 = class21.getPacketBufferNode(ClientPacket.field2665, Client.packetWriter.isaacCipher); // L: 11291
			var1.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var0)); // L: 11292
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11293
			Client.packetWriter.addNode(var1); // L: 11294
		}
	} // L: 11295
}
