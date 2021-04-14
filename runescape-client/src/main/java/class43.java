import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class43 {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1704226507"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8855
		var2.packetBuffer.method6625(var0); // L: 8856
		var2.packetBuffer.writeIntME(var1); // L: 8857
		Client.packetWriter.addNode(var2); // L: 8858
	} // L: 8859
}
