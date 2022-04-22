import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 770576215
	)
	static int field4275;

	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13138"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-891040314"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-118"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1359342670"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;Ljava/lang/String;B)Lqq;",
		garbageValue = "3"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 125
		int var4 = var0.getFileId(var3, var2); // L: 126
		byte[] var7 = var0.takeFile(var3, var4); // L: 131
		boolean var6;
		if (var7 == null) { // L: 132
			var6 = false; // L: 133
		} else {
			WorldMapArea.SpriteBuffer_decode(var7); // L: 136
			var6 = true; // L: 137
		}

		IndexedSprite var5;
		if (!var6) { // L: 139
			var5 = null; // L: 140
		} else {
			var5 = HorizontalAlignment.method3492(); // L: 143
		}

		return var5; // L: 145
	}
}
