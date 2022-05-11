import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public final class class4 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2109768845"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 64
		if (var1 == null) { // L: 65
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 66 67
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-57"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (WorldMapDecoration.loadInterface(var0)) { // L: 11204
			WorldMapRegion.updateInterface(NetSocket.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11205
		}
	} // L: 11206

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-924904180"
	)
	static void method22() {
		Client.packetWriter.addNode(WallDecoration.getPacketBufferNode(ClientPacket.field3020, Client.packetWriter.isaacCipher)); // L: 12669
		Client.oculusOrbState = 0; // L: 12670
	} // L: 12671
}
