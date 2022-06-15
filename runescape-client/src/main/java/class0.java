import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class0 implements class3 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;)Lqt;"
	)
	public Buffer vmethod10(Buffer var1) {
		Buffer var2 = new Buffer(100); // L: 10
		this.method1(var1, var2); // L: 11
		return var2; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lqt;)V"
	)
	void method1(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1); // L: 16
		class5 var4 = new class5(var3); // L: 17

		long var5;
		for (var5 = 0L; !var4.method20(var3.method55(), var3.method57(), var5); ++var5) { // L: 18 19 20
		}

		var2.writeLong(var5); // L: 22
	} // L: 23
}
