import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class5 implements class12 {
	class5() {
	} // L: 8

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;)Lkf;"
	)
	public Buffer vmethod127(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 11
		this.method78(var1, var2); // L: 12
		return var2; // L: 13
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Lkf;)V"
	)
	void method78(Buffer var1, Buffer var2) {
		class10 var3 = new class10(var1); // L: 17
		class6 var4 = new class6(var3); // L: 18

		long var5;
		for (var5 = 0L; !var4.method80(var3.method125(), var3.method126(), var5); ++var5) { // L: 19 20 21
		}

		var2.writeLong(var5); // L: 23
	} // L: 24
}
