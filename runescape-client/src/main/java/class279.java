import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class279 {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	static Sprite[] headIconPkSprites;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "71"
	)
	static final void method5092(String var0, int var1) {
		PacketBufferNode var2 = Client.getPacketBufferNode(ClientPacket.field2345, Client.packetWriter.isaacCipher); // L: 248
		var2.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 249
		var2.packetBuffer.writeByte(var1); // L: 250
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 251
		Client.packetWriter.addNode(var2); // L: 252
	} // L: 253

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1031149310"
	)
	static void method5091() {
		Client.menuOptionsCount = 0; // L: 7004
		Client.isMenuOpen = false; // L: 7005
	} // L: 7006
}
