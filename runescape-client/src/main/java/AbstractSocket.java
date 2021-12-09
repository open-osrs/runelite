import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class404 HitSplatDefinition_cachedSprites;

	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2099219864"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1579083707"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1654551476"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "909"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1320460000"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;
}
