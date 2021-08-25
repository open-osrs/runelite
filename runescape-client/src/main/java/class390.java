import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
final class class390 implements class387 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "-231265174"
	)
	public void vmethod6721(Object var1, Buffer var2) {
		this.method6701((Long)var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "103901566"
	)
	public Object vmethod6724(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lot;I)V",
		garbageValue = "-781779725"
	)
	void method6701(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
