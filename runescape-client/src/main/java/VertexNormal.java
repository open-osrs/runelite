import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("l")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -359767671
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 396508261
	)
	@Export("y")
	int y;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -194088213
	)
	@Export("z")
	int z;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1595742309
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljx;",
		garbageValue = "-37714344"
	)
	static LoginPacket[] method4495() {
		return new LoginPacket[]{LoginPacket.field3133, LoginPacket.field3134, LoginPacket.field3135, LoginPacket.field3137, LoginPacket.field3132, LoginPacket.field3136}; // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "-338837319"
	)
	public static void method4496(Huffman var0) {
		class282.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	static void method4498() {
		if (Client.renderSelf) { // L: 4288
			class166.addPlayerToScene(class19.localPlayer, false); // L: 4289
		}

	} // L: 4291

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "11"
	)
	static void method4497(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9001
		int[] var3 = Players.Players_indices; // L: 9002
		boolean var4 = false; // L: 9003
		Username var5 = new Username(var1, class83.loginType); // L: 9004

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9005
			Player var7 = Client.players[var3[var6]]; // L: 9006
			if (var7 != null && var7 != class19.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9007
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9008
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher); // L: 9010
					var8.packetBuffer.method7795(var3[var6]); // L: 9011
					var8.packetBuffer.method7786(0); // L: 9012
					Client.packetWriter.addNode(var8); // L: 9013
				} else if (var0 == 4) { // L: 9015
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher); // L: 9017
					var8.packetBuffer.method7787(0); // L: 9018
					var8.packetBuffer.writeShort(var3[var6]); // L: 9019
					Client.packetWriter.addNode(var8); // L: 9020
				} else if (var0 == 6) { // L: 9022
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2903, Client.packetWriter.isaacCipher); // L: 9024
					var8.packetBuffer.method7791(var3[var6]); // L: 9025
					var8.packetBuffer.writeByte(0); // L: 9026
					Client.packetWriter.addNode(var8); // L: 9027
				} else if (var0 == 7) { // L: 9029
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher); // L: 9031
					var8.packetBuffer.writeShort(var3[var6]); // L: 9032
					var8.packetBuffer.method7786(0); // L: 9033
					Client.packetWriter.addNode(var8); // L: 9034
				}

				var4 = true; // L: 9036
				break;
			}
		}

		if (!var4) { // L: 9040
			Login.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9041
}
