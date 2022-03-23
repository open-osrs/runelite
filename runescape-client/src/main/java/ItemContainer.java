import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -914971527
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("o")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("h")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lgg;",
		garbageValue = "-1935517540"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = class282.SequenceDefinition_archive.takeFile(12, var0); // L: 48
			var1 = new SequenceDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 51
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 52
			return var1; // L: 53
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljn;Lqo;I)Ljt;",
		garbageValue = "-1379221264"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class65.method1876(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lbr;I)V",
		garbageValue = "1885731217"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2045
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2046
			class125.method2803(var0.isMembersOnly()); // L: 2047
		}

		if (var0.properties != Client.worldProperties) { // L: 2049
			Archive var1 = WorldMapData_1.archive8; // L: 2050
			int var2 = var0.properties; // L: 2051
			if ((var2 & 536870912) != 0) { // L: 2053
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 2054
			} else if ((var2 & 1073741824) != 0) { // L: 2056
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 2057
			} else {
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 2060
			}
		}

		GrandExchangeOfferOwnWorldComparator.worldHost = var0.host; // L: 2064
		Client.worldId = var0.id; // L: 2065
		Client.worldProperties = var0.properties; // L: 2066
		class101.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2067
		BuddyRankComparator.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2068
		currentPort = class101.worldPort; // L: 2069
	} // L: 2070

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2121906754"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4332
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4333
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4334
				int var3 = var2.x >> 7; // L: 4335
				int var4 = var2.y >> 7; // L: 4336
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4337
					if (var2.field1145 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4338
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4339
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4340
					}

					long var5 = MilliClock.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4342
					var2.playerCycle = Client.cycle; // L: 4343
					FriendSystem.scene.drawEntity(class160.Client_plane, var2.x, var2.y, Archive.getTileHeight(var2.field1145 * 64 - 64 + var2.x, var2.field1145 * 64 - 64 + var2.y, class160.Client_plane), var2.field1145 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4344
				}
			}
		}

	} // L: 4348
}
