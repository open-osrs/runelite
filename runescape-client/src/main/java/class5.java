import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class5 implements class12 {
	class5() {
	} // L: 8

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Lkj;"
	)
	public Buffer vmethod123(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 11
		this.method61(var1, var2); // L: 12
		return var2; // L: 13
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;)V"
	)
	void method61(Buffer var1, Buffer var2) {
		class10 var3 = new class10(var1); // L: 17
		class6 var4 = new class6(var3); // L: 18

		long var5;
		for (var5 = 0L; !var4.method64(var3.method114(), var3.method121(), var5); ++var5) { // L: 19 20 21
		}

		var2.writeLong(var5); // L: 23
	} // L: 24
}
