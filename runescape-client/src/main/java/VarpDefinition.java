import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -426793897
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 830934537
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "19"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-2104841656"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1448622036"
	)
	static final void method3004() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5108 5109 5116
			if (var0.plane == GrandExchangeOfferTotalQuantityComparator.Client_plane && !var0.isFinished) { // L: 5110
				if (Client.cycle >= var0.cycleStart) { // L: 5111
					var0.advance(Client.field531); // L: 5112
					if (var0.isFinished) {
						var0.remove(); // L: 5113
					} else {
						GameBuild.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false); // L: 5114
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5118

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1840015615"
	)
	static final void method3003(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 11857
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2809()) { // L: 11858
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11859
				PacketWriter var4 = Client.packetWriter; // L: 11860
				PacketBufferNode var5 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2765, var4.isaacCipher); // L: 11861
				var5.packetBuffer.writeByte(4 + Client.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 11862
				var5.packetBuffer.writeByte(var0); // L: 11863
				var5.packetBuffer.writeShort(var1); // L: 11864
				var5.packetBuffer.writeBoolean(var2); // L: 11865
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 11866
				var4.addNode(var5); // L: 11867
			}
		}
	} // L: 11868
}
