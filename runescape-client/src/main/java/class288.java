import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class288 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class288 field3436;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static final class288 field3438;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1235911729
	)
	final int field3435;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -901346455
	)
	final int field3437;

	static {
		field3436 = new class288(51, 27, 800, 0, 16, 16); // L: 29
		field3438 = new class288(25, 28, 800, 656, 40, 40); // L: 30
	}

	class288(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3435 = var5; // L: 39
		this.field3437 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1635698499"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2873, Client.packetWriter.isaacCipher); // L: 9896
		var2.packetBuffer.method7349(var1); // L: 9897
		var2.packetBuffer.method7407(var0); // L: 9898
		Client.packetWriter.addNode(var2); // L: 9899
	} // L: 9900
}
