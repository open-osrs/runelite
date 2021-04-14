import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class28 implements class31 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;)Lnu;"
	)
	public Buffer vmethod389(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 9
		this.method384(var1, var2); // L: 10
		return var2; // L: 11
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;)V"
	)
	void method384(Buffer var1, Buffer var2) {
		class36 var3 = new class36(var1); // L: 15
		class33 var4 = new class33(var3); // L: 16

		long var5;
		for (var5 = 0L; !var4.method396(var3.method436(), var3.method437(), var5); ++var5) { // L: 17 18 19
		}

		var2.writeLong(var5); // L: 21
	} // L: 22
}
