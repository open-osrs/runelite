import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
final class class389 implements class388 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "804166773"
	)
	public void vmethod6815(Object var1, Buffer var2) {
		this.method6770((Integer)var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "1421946597"
	)
	public Object vmethod6822(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lot;I)V",
		garbageValue = "1391168197"
	)
	void method6770(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
