import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class5 implements class12 {
	class5() {
	} // L: 8

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;)Lkb;"
	)
	public Buffer vmethod145(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 11
		this.method84(var1, var2); // L: 12
		return var2; // L: 13
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lkb;)V"
	)
	void method84(Buffer var1, Buffer var2) {
		class10 var3 = new class10(var1); // L: 17
		class6 var4 = new class6(var3); // L: 18

		long var5;
		for (var5 = 0L; !var4.method89(var3.method135(), var3.method134(), var5); ++var5) { // L: 19 20 21
		}

		var2.writeLong(var5); // L: 23
	} // L: 24
}
