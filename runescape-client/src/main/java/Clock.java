import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -1841661257
	)
	static int field2079;

	Clock() {
	} // L: 4

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1861957348"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Ljava/lang/String;B)I",
		garbageValue = "-59"
	)
	public static int method3721(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		byte[] var3 = class3.method40(var1); // L: 15
		var0.writeSmartByteShort(var3.length); // L: 16
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 17
		return var0.offset - var2; // L: 18
	}
}
