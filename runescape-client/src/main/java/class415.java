import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
final class class415 implements class410 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;B)V",
		garbageValue = "0"
	)
	public void vmethod7280(Object var1, Buffer var2) {
		this.method7282((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	public Object vmethod7281(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpi;I)V",
		garbageValue = "2036524718"
	)
	void method7282(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41
}
