import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 606603159
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 532342923
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -690165039
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1831799327"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081926235"
	)
	static void method3768() {
		class248.field3216 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = Player.method1325((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F)); // L: 30
			class248.field3216[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < class248.field3216.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = Player.method1325((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class248.field3216.length; ++var0) { // L: 37 38
				class248.field3216[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIIIIIB)V",
		garbageValue = "19"
	)
	static final void method3759(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field690) { // L: 9940
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 9941
		}

		Client.field690 = false; // L: 9942
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 9943
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 9944
				var0.scrollY -= 4; // L: 9945
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0); // L: 9946
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 9948
				var0.scrollY += 4; // L: 9949
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0); // L: 9950
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 9952
				var7 = var3 * (var3 - 32) / var4; // L: 9953
				if (var7 < 8) { // L: 9954
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 9955
				int var9 = var3 - 32 - var7; // L: 9956
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 9957
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0); // L: 9958
				Client.field690 = true; // L: 9959
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 9962
			var7 = var0.width; // L: 9963
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 9964
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 9965
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0); // L: 9966
			}
		}

	} // L: 9969
}
