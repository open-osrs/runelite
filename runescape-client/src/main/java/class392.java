import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
final class class392 implements class387 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "-231265174"
	)
	public void vmethod6721(Object var1, Buffer var2) {
		this.method6722((String)var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "103901566"
	)
	public Object vmethod6724(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lot;I)V",
		garbageValue = "1729210108"
	)
	void method6722(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
