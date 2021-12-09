import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class370 implements class375 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public final class397 field4221;

	@ObfuscatedSignature(
		descriptor = "(Lom;)V"
	)
	class370(class398 var1) {
		this.field4221 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnl;)V"
	)
	public class370(class371 var1) {
		this(new class398(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2038166552"
	)
	public int method6757(int var1) {
		return this.field4221.vmethod7128(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;S)I",
		garbageValue = "267"
	)
	public static int method6755(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		byte[] var3 = class194.method3933(var1); // L: 15
		var0.writeSmartByteShort(var3.length); // L: 16
		var0.offset += class410.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 17
		return var0.offset - var2; // L: 18
	}
}
