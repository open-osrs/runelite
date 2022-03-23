import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1669312252"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1264669351"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "396806768"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "52142940"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-57"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;Ljava/lang/String;Ljava/lang/String;I)Lmr;",
		garbageValue = "1832446298"
	)
	public static Font method6899(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 94
		int var5 = var0.getFileId(var4, var3); // L: 95
		return class19.method319(var0, var1, var4, var5); // L: 96
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1681140308"
	)
	static final int method6884(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 1006
		var2 ^= var2 << 13; // L: 1007
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 1008
		return var3 >> 19 & 255; // L: 1009
	}
}
