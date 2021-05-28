import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
final class class371 implements class370 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnd;I)V",
		garbageValue = "510448708"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6452((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Ljava/lang/Object;",
		garbageValue = "-1954872085"
	)
	public Object vmethod6500(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lnd;B)V",
		garbageValue = "105"
	)
	void method6452(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
