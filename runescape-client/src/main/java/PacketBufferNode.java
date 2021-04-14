import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lgy;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1286692403
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 2196332218574994447L
	)
	static long field2348;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1793898605
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 356559831
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-546801970"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 58
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 59
		}
	} // L: 60

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;IIIZI)V",
		garbageValue = "-1085289699"
	)
	public static void method3898(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class210.musicPlayerStatus = 1; // L: 26
		class210.musicTrackArchive = var0; // L: 27
		FaceNormal.musicTrackGroupId = var1; // L: 28
		WorldMapID.musicTrackFileId = var2; // L: 29
		class375.musicTrackVolume = var3; // L: 30
		class210.musicTrackBoolean = var4; // L: 31
		class1.pcmSampleLength = 10000; // L: 32
	} // L: 33

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "1"
	)
	public static int method3896(boolean var0, boolean var1) {
		byte var2 = 0; // L: 264
		int var3 = var2 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 265
		return var3; // L: 266
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "387339011"
	)
	static final void method3888() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6848 6849 6892
			if (var0.hitpoints > 0) { // L: 6850
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 6851
				if (var0.objectId >= 0) { // L: 6853
					var2 = var0.objectId; // L: 6855
					var3 = var0.field1203; // L: 6856
					var4 = class19.getObjectDefinition(var2); // L: 6858
					if (var3 == 11) { // L: 6859
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 6860
						var3 = 4;
					}

					var1 = var4.method5173(var3); // L: 6861
					if (!var1) { // L: 6863
						continue;
					}
				}

				class7.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1199, var0.field1203); // L: 6865
				var0.remove(); // L: 6866
			} else {
				if (var0.delay > 0) { // L: 6870
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 6871
					if (var0.id >= 0) { // L: 6873
						var2 = var0.id; // L: 6875
						var3 = var0.field1196; // L: 6876
						var4 = class19.getObjectDefinition(var2); // L: 6878
						if (var3 == 11) { // L: 6879
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 6880
							var3 = 4;
						}

						var1 = var4.method5173(var3); // L: 6881
						if (!var1) { // L: 6883
							continue;
						}
					}

					class7.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1196); // L: 6885
					var0.delay = -1; // L: 6886
					if (var0.objectId == var0.id && var0.objectId == -1) { // L: 6887
						var0.remove();
					} else if (var0.id == var0.objectId && var0.orientation == var0.field1199 && var0.field1196 == var0.field1203) { // L: 6888
						var0.remove();
					}
				}
			}
		}

	} // L: 6894
}
