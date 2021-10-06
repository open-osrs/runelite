import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
final class class393 implements class388 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "804166773"
	)
	public void vmethod6815(Object var1, Buffer var2) {
		this.method6814((String)var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Ljava/lang/Object;",
		garbageValue = "1421946597"
	)
	public Object vmethod6822(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lot;I)V",
		garbageValue = "1290124778"
	)
	void method6814(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
