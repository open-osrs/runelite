import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
final class class428 implements class427 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "-700069158"
	)
	public void vmethod7597(Object var1, Buffer var2) {
		this.method7561((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Ljava/lang/Object;",
		garbageValue = "-1640188252"
	)
	public Object vmethod7598(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lpi;B)V",
		garbageValue = "1"
	)
	void method7561(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13
}
