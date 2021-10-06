import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 1113835115
	)
	static int field1313;
	@ObfuscatedName("l")
	@Export("url")
	final URL url;
	@ObfuscatedName("q")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("f")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-713550106"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-490432666"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-1"
	)
	public static void method2386(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2750, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method7026(var2);
		var4.packetBuffer.writeInt(var3 ? Client.field572 * -1959883561 * -20896025 : 0);
		var4.packetBuffer.method6931(var1);
		var4.packetBuffer.method6931(var0);
		Client.packetWriter.addNode(var4);
	}
}
