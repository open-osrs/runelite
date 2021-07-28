import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
final class class373 implements class372 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnv;I)V",
		garbageValue = "120437007"
	)
	public void vmethod6563(Object var1, Buffer var2) {
		this.method6533((Integer)var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)Ljava/lang/Object;",
		garbageValue = "-189621438"
	)
	public Object vmethod6565(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lnv;I)V",
		garbageValue = "-703381671"
	)
	void method6533(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
