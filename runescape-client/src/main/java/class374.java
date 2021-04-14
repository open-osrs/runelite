import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
final class class374 implements class369 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnu;B)V",
		garbageValue = "32"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6496((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)Ljava/lang/Object;",
		garbageValue = "-2127791785"
	)
	public Object vmethod6492(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnu;B)V",
		garbageValue = "-29"
	)
	void method6496(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39
}
