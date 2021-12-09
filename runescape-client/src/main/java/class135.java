import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class135 extends class126 {
	@ObfuscatedName("c")
	String field1555;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class135(class129 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1555 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.name = this.field1555; // L: 237
	} // L: 238

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-877203069"
	)
	public static final void method2832() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 95
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 96
	} // L: 97

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1487689727"
	)
	static final void method2831(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : UserComparator5.guestClanChannel; // L: 12510
		if (var2 != null && var1 >= 0 && var1 < var2.method2990()) { // L: 12511
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12512
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12514
				PacketWriter var5 = Client.packetWriter; // L: 12515
				PacketBufferNode var6 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2875, var5.isaacCipher); // L: 12516
				var6.packetBuffer.writeByte(3 + class116.stringCp1252NullTerminatedByteSize(var4)); // L: 12517
				var6.packetBuffer.writeByte(var0); // L: 12518
				var6.packetBuffer.writeShort(var1); // L: 12519
				var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12520
				var5.addNode(var6); // L: 12521
			}
		}
	} // L: 12513 12522
}
