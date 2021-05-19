import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class28 implements class31 {
	class28() {
	} // L: 8

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;)Lnk;"
	)
	public Buffer vmethod358(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 11
		this.method350(var1, var2); // L: 12
		return var2; // L: 13
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;)V"
	)
	void method350(Buffer var1, Buffer var2) {
		class36 var3 = new class36(var1); // L: 17
		class33 var4 = new class33(var3); // L: 18

		long var5;
		for (var5 = 0L; !var4.method370(var3.method417(), var3.method411(), var5); ++var5) { // L: 19 20 21
		}

		var2.writeLong(var5); // L: 23
	} // L: 24
}
