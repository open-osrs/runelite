import java.io.IOException;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-147773206"
	)
	public abstract void close();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-99"
	)
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	public abstract int available() throws IOException;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-78"
	)
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1533815985"
	)
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "52"
	)
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1292618906"
	)
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = Client.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher); // L: 8130
		var2.packetBuffer.method5654(var1); // L: 8131
		var2.packetBuffer.method5663(var0); // L: 8132
		Client.packetWriter.addNode(var2); // L: 8133
	} // L: 8134
}
