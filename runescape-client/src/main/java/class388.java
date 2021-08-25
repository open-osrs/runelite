import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
final class class388 implements class387 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "-231265174"
	)
	public void vmethod6721(Object var1, Buffer var2) {
		this.method6695((Integer)var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "103901566"
	)
	public Object vmethod6724(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lot;B)V",
		garbageValue = "-11"
	)
	void method6695(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
