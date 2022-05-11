import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
final class class432 implements class429 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpx;I)V",
		garbageValue = "-2139027116"
	)
	public void vmethod7440(Object var1, Buffer var2) {
		this.method7409((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)Ljava/lang/Object;",
		garbageValue = "352015354"
	)
	public Object vmethod7436(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lpx;I)V",
		garbageValue = "1601706825"
	)
	void method7409(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
