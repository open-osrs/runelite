import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("c")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "921646370"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljl;Lqv;I)Ljd;",
		garbageValue = "-2117269105"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20); // L: 35
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	static void method4351() {
		if (Login.clearLoginScreen) { // L: 249
			Login.titleboxSprite = null; // L: 250
			Login.titlebuttonSprite = null; // L: 251
			Login.runesSprite = null; // L: 252
			class17.leftTitleSprite = null; // L: 253
			ViewportMouse.rightTitleSprite = null; // L: 254
			Decimator.logoSprite = null; // L: 255
			class92.title_muteSprite = null; // L: 256
			WorldMapSection2.options_buttons_0Sprite = null; // L: 257
			class54.options_buttons_2Sprite = null; // L: 258
			class393.worldSelectBackSprites = null; // L: 259
			class400.worldSelectFlagSprites = null; // L: 260
			class126.worldSelectArrows = null; // L: 261
			TileItem.worldSelectStars = null; // L: 262
			class135.field1569 = null; // L: 263
			class341.loginScreenRunesAnimation.method2193(); // L: 264
			Actor.method2183(2); // L: 265
			if (NetCache.NetCache_socket != null) { // L: 267
				try {
					Buffer var0 = new Buffer(4); // L: 269
					var0.writeByte(2); // L: 270
					var0.writeMedium(0); // L: 271
					NetCache.NetCache_socket.write(var0.array, 0, 4); // L: 272
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close(); // L: 276
					} catch (Exception var2) { // L: 278
					}

					++NetCache.NetCache_ioExceptions; // L: 279
					NetCache.NetCache_socket = null; // L: 280
				}
			}

			Login.clearLoginScreen = false; // L: 283
		}
	} // L: 284

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1972677763"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = getPacketBufferNode(ClientPacket.field2986, Client.packetWriter.isaacCipher); // L: 12403
		var0.packetBuffer.writeByte(0); // L: 12404
		Client.packetWriter.addNode(var0); // L: 12405
	} // L: 12406
}
