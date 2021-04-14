import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("o")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("u")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "-116"
	)
	static final boolean method2092(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 181
		Buffer var4 = new Buffer(var0); // L: 182
		int var5 = -1; // L: 183

		label72:
		while (true) {
			int var6 = var4.method6595(); // L: 185
			if (var6 == 0) { // L: 186
				return var3; // L: 217
			}

			var5 += var6; // L: 187
			int var7 = 0; // L: 188
			boolean var8 = false; // L: 189

			while (true) {
				int var9;
				while (!var8) { // L: 191
					var9 = var4.readUShortSmart(); // L: 197
					if (var9 == 0) { // L: 198
						continue label72;
					}

					var7 += var9 - 1; // L: 199
					int var10 = var7 & 63; // L: 200
					int var11 = var7 >> 6 & 63; // L: 201
					int var12 = var4.readUnsignedByte() >> 2; // L: 202
					int var13 = var11 + var1; // L: 203
					int var14 = var10 + var2; // L: 204
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 205
						ObjectComposition var15 = class19.getObjectDefinition(var5); // L: 206
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 207
							if (!var15.needsModelFiles()) { // L: 208
								++Client.field657; // L: 209
								var3 = false; // L: 210
							}

							var8 = true; // L: 212
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 192
				if (var9 == 0) { // L: 193
					break;
				}

				var4.readUnsignedByte(); // L: 194
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "87"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class23.logOut(); // L: 2365
		switch(var0) { // L: 2366
		case 1:
			Login.loginIndex = 24; // L: 2370
			class9.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2371
			break;
		case 2:
			class10.method129(); // L: 2377
		}

	} // L: 2381

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-217021781"
	)
	static void method2093() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher); // L: 3613
		var0.packetBuffer.writeByte(WorldMapScaleHandler.getWindowedMode()); // L: 3614
		var0.packetBuffer.writeShort(InterfaceParent.canvasWidth); // L: 3615
		var0.packetBuffer.writeShort(GameEngine.canvasHeight); // L: 3616
		Client.packetWriter.addNode(var0); // L: 3617
	} // L: 3618
}
