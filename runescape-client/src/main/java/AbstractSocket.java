import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 352918735
	)
	static int field3874;

	protected AbstractSocket() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-27454"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1311148246"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "88"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-60"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1814286008"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-30"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	static void method5924() {
		Login.loginIndex = 24;
		Client.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
