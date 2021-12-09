import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1159040081
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -342962923
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1018728031
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -303087101
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1878203499
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1169287087
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1004767669
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -596343551
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1032991231
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 973854413
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 613174517
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2116164351
	)
	int field2378;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -824345461
	)
	int field2369;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1750638079
	)
	int field2380;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 72228107
	)
	int field2381;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1522475315
	)
	int field2368;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1800993445
	)
	int field2383;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 269877121
	)
	int field2367;

	Occluder() {
	} // L: 23

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-69"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field514 = 0L; // L: 4973
		if (var0 >= 2) { // L: 4974
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4975
		}

		if (class143.getWindowedMode() == 1) { // L: 4976
			class295.client.setMaxCanvasSize(765, 503); // L: 4977
		} else {
			class295.client.setMaxCanvasSize(7680, 2160); // L: 4980
		}

		if (Client.gameState >= 25) { // L: 4982
			PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2824, Client.packetWriter.isaacCipher); // L: 4984
			var1.packetBuffer.writeByte(class143.getWindowedMode()); // L: 4985
			var1.packetBuffer.writeShort(class186.canvasWidth); // L: 4986
			var1.packetBuffer.writeShort(BoundaryObject.canvasHeight); // L: 4987
			Client.packetWriter.addNode(var1); // L: 4988
		}

	} // L: 4990
}
