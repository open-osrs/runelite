import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class21 extends class14 {
	@ObfuscatedName("qi")
	static boolean field190;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1525573159
	)
	int field192;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1941525271
	)
	int field185;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -948599653
	)
	int field186;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -461559247
	)
	int field187;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class21(class2 var1) {
		this.this$0 = var1;
		this.field192 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field192 = var1.readUnsignedShort(); // L: 166
		this.field185 = var1.readInt(); // L: 167
		this.field186 = var1.readUnsignedByte(); // L: 168
		this.field187 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method126(this.field192, this.field185, this.field186, this.field187); // L: 173
	} // L: 174

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhs;Loy;B)Lhq;",
		garbageValue = "8"
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
		} else if (var2.clientPacketLength <= 18) { // L: 35
			var2.packetBuffer = new PacketBuffer(20);
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

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "993410393"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (Clock.loadInterface(var0)) { // L: 10825
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 10826

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 10827
				Widget var3 = var1[var2]; // L: 10828
				if (var3 != null) { // L: 10829
					var3.modelFrame = 0; // L: 10830
					var3.modelFrameCycle = 0; // L: 10831
				}
			}

		}
	} // L: 10833

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)I",
		garbageValue = "2132424043"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 11357
		return var1 != null ? var1.integer : var0.flags; // L: 11358 11359
	}
}
