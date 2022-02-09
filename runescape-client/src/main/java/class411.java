import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
final class class411 implements class410 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;B)V",
		garbageValue = "0"
	)
	public void vmethod7280(Object var1, Buffer var2) {
		this.method7230((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	public Object vmethod7281(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lpi;I)V",
		garbageValue = "1498076670"
	)
	void method7230(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
