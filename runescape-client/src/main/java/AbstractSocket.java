import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-768493590"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-8"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1942767880"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1355091335"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "([BIIB)I",
		garbageValue = "37"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "([BIIB)V",
		garbageValue = "-105"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;
}
