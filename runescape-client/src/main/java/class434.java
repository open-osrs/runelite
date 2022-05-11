import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
final class class434 implements class429 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpx;I)V",
		garbageValue = "-2139027116"
	)
	public void vmethod7440(Object var1, Buffer var2) {
		this.method7435((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)Ljava/lang/Object;",
		garbageValue = "352015354"
	)
	public Object vmethod7436(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpx;I)V",
		garbageValue = "1690387944"
	)
	void method7435(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "284900734"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12509
	}
}
