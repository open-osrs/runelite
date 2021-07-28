import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
final class class375 implements class372 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnv;I)V",
		garbageValue = "120437007"
	)
	public void vmethod6563(Object var1, Buffer var2) {
		this.method6546((Long)var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)Ljava/lang/Object;",
		garbageValue = "-189621438"
	)
	public Object vmethod6565(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lnv;I)V",
		garbageValue = "-1485708968"
	)
	void method6546(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
