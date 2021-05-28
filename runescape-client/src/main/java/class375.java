import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
final class class375 implements class370 {
	@ObfuscatedName("q")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnd;I)V",
		garbageValue = "510448708"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6491((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Ljava/lang/Object;",
		garbageValue = "-1954872085"
	)
	public Object vmethod6500(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnd;B)V",
		garbageValue = "-43"
	)
	void method6491(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39
}
