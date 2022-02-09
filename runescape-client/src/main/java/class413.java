import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
final class class413 implements class410 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;B)V",
		garbageValue = "0"
	)
	public void vmethod7280(Object var1, Buffer var2) {
		this.method7244((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	public Object vmethod7281(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lpi;I)V",
		garbageValue = "117738037"
	)
	void method7244(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
