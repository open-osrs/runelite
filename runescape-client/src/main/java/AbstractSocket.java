import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("scene")
	static Scene scene;

	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1654713390"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "479468921"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1659206769"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-211935081"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2041736219"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "263213011"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1943221493"
	)
	static int method5901() {
		return 12;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;Ljava/lang/String;Ljava/lang/String;B)Lkt;",
		garbageValue = "88"
	)
	public static Font method5900(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 121
		int var5 = var0.getFileId(var4, var3); // L: 122
		return AbstractArchive.method5018(var0, var1, var4, var5); // L: 123
	}
}
