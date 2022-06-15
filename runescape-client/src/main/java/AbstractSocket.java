import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-439883726"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1889844897"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "695516749"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1416716039"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-17278531"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llh;IB)Lqu;",
		garbageValue = "-106"
	)
	public static IndexedSprite method6819(AbstractArchive var0, int var1) {
		return !class431.method7559(var0, var1) ? null : class390.method7053(); // L: 131 132
	}
}
