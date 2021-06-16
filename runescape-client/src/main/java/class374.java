import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
final class class374 implements class371 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnt;I)V",
		garbageValue = "1796019185"
	)
	public void vmethod6536(Object var1, Buffer var2) {
		this.method6502((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)Ljava/lang/Object;",
		garbageValue = "-46"
	)
	public Object vmethod6533(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lnt;B)V",
		garbageValue = "1"
	)
	void method6502(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26
}
