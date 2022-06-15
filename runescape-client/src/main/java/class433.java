import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
final class class433 implements class428 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqt;B)V",
		garbageValue = "-51"
	)
	public void vmethod7583(Object var1, Buffer var2) {
		this.method7586((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Ljava/lang/Object;",
		garbageValue = "-261873850"
	)
	public Object vmethod7580(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lqt;B)V",
		garbageValue = "0"
	)
	void method7586(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41
}
