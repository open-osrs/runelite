import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
final class class430 implements class427 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpd;B)V",
		garbageValue = "25"
	)
	public void vmethod7681(Object var1, Buffer var2) {
		this.method7661((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)Ljava/lang/Object;",
		garbageValue = "1821026092"
	)
	public Object vmethod7683(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lpd;B)V",
		garbageValue = "22"
	)
	void method7661(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
