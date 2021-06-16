import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
final class class376 implements class371 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnt;I)V",
		garbageValue = "1796019185"
	)
	public void vmethod6536(Object var1, Buffer var2) {
		this.method6534((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)Ljava/lang/Object;",
		garbageValue = "-46"
	)
	public Object vmethod6533(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnt;B)V",
		garbageValue = "123"
	)
	void method6534(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39
}
