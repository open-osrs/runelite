import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class142 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 12867453
	)
	int field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1676 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1676 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2892(this.field1676); // L: 222
	} // L: 223

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1893570048"
	)
	static final void method2967(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12477
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3005()) { // L: 12478
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12479
				if (var2.rank == -1) { // L: 12480
					PacketBufferNode var3 = WallDecoration.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher); // L: 12481
					var3.packetBuffer.writeByte(3 + class392.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12482
					var3.packetBuffer.writeByte(var0); // L: 12483
					var3.packetBuffer.writeShort(var1); // L: 12484
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12485
					Client.packetWriter.addNode(var3); // L: 12486
				}
			}
		}
	} // L: 12487
}
