import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lii;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2107144477
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 159088945
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -15994369
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-801745913"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 45
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 46
		}
	} // L: 47

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "585881106"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4687
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4688
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4689
				int var3 = var2.x >> 7; // L: 4690
				int var4 = var2.y >> 7; // L: 4691
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4692
					if (var2.field1113 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4693
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4694
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4695
					}

					long var5 = ScriptEvent.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4697
					var2.playerCycle = Client.cycle; // L: 4698
					Decimator.scene.drawEntity(SoundSystem.Client_plane, var2.x, var2.y, class92.getTileHeight(var2.field1113 * 64 - 64 + var2.x, var2.field1113 * 64 - 64 + var2.y, SoundSystem.Client_plane), var2.field1113 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4699
				}
			}
		}

	} // L: 4703
}
