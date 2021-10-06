import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class111 implements class110 {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "27"
	)
	static final void method2467(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2729()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2696, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + class113.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				var4.addNode(var5);
			}
		}
	}
}
