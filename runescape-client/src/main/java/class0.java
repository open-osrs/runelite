import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class0 implements class3 {
	class0() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;)Lot;"
	)
	public Buffer vmethod15(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method3(var1, var2);
		return var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lot;)V"
	)
	void method3(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1);
		class5 var4 = new class5(var3);

		long var5;
		for (var5 = 0L; !var4.method25(var3.method68(), var3.method67(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
