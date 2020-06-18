import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class5 implements class12 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkn;)Lkn;"
	)
	public Buffer vmethod133(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method65(var1, var2);
		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;Lkn;)V"
	)
	void method65(Buffer var1, Buffer var2) {
		class10 var3 = new class10(var1);
		class6 var4 = new class6(var3);

		long var5;
		for (var5 = 0L; !var4.method83(var3.method123(), var3.method126(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
