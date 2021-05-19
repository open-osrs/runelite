import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2027143758"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-640327653"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1880004365"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1936066161"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1752522959"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2658, Client.packetWriter.isaacCipher); // L: 11545
		var0.packetBuffer.writeByte(0); // L: 11546
		Client.packetWriter.addNode(var0); // L: 11547
	} // L: 11548
}
