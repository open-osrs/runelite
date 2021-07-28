import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class0 implements class3 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;)Lnv;"
	)
	public Buffer vmethod15(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method7(var1, var2);
		return var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;)V"
	)
	void method7(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1);
		class5 var4 = new class5(var3);

		long var5;
		for (var5 = 0L; !var4.method23(var3.method67(), var3.method61(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
