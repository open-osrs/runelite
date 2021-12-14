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
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1555 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.name = this.field1555;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-877203069"
	)
	public static final void method2832() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1487689727"
	)
	static final void method2831(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : UserComparator5.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method2990()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2875, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + class116.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}
}
