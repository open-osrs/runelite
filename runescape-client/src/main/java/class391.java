import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
final class class391 implements class388 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lop;B)V",
		garbageValue = "59"
	)
	public void vmethod6878(Object var1, Buffer var2) {
		this.method6845((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)Ljava/lang/Object;",
		garbageValue = "-2140031619"
	)
	public Object vmethod6883(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lop;I)V",
		garbageValue = "-1424253261"
	)
	void method6845(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26
}
